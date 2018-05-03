package com.codido.hodor.ord.service;

import com.github.binarywang.wxpay.bean.order.WxPayMpOrderResult;
import com.github.binarywang.wxpay.bean.request.WxPayRefundRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayRefundQueryResult;
import com.github.binarywang.wxpay.bean.result.WxPayRefundResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.codido.hodor.bean.vo.ChooseMatchVo;
import com.codido.hodor.bo.AccountBo;
import com.codido.hodor.bo.BaseBo;
import com.codido.hodor.bo.dto.OrderBonusReturnDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.CaseComputUtils;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.common.util.OrderNoGeneratorUtil;
import com.codido.hodor.job.bean.dto.BaseRetDto;
import com.codido.hodor.job.config.EvnConfig;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.weixin.config.WxPayConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单BO
 */
@Service
public class OrderService {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(OrderService.class);

    /**
     * 订单选号列表DAO
     */
    @Autowired
    private OrdBettingInstMapper ordBettingInstMapper;

    /**
     * 彩种实例
     */
    @Autowired
    private LotInstOPMapper lotInstOPMapper;

    /**
     * 彩种中奖实例
     */
    @Autowired
    private LotInstBonusOPMapper lotInstBonusOPMapper;

    /**
     * 订单处理mapper
     */
    @Autowired
    private OrdOrderOPMapper ordOrderOPMapper;

    /**
     * 比赛信息mapper
     */
    @Autowired
    private MatchInfoMapper matchInfoMapper;

    /**
     * 用户openId的mapper
     */
    @Autowired
    private UsrOpenIdOPMapper usrOpenIdOPMapper;

    /**
     * 订单退款mapper
     */
    @Autowired
    private OrdRefundMapper ordRefundMapper;

    /**
     * 账户bo
     */
    @Autowired
    private AccountBo accountBo;

    /**
     * 微信支付参数配置
     */
    @Autowired
    private WxPayConfig payConfig;

    /**
     * 微信支付服务
     */
    @Autowired
    private WxPayService wxPayService;

    /**
     * 微信支付配置定义
     */
    @Autowired
    private WxPayConfiguration wxPayConfiguration;

    /**
     * 环境参数
     */
    @Autowired
    private EvnConfig evnConfig;

    /**
     * 发消息处理
     */
    @Autowired
    private SendMessageService sendMessageService;

    /**
     * 判断数字彩订单是否中奖
     *
     * @param ordOrder
     * @return
     */
    public OrderBonusReturnDto checkNumberLottoOrderBonus(OrdOrderOP ordOrder) {
        OrderBonusReturnDto returnDto = new OrderBonusReturnDto();
        //获取彩种
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        if (CommonConstans.LOTTO_ID_SSQ.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_DLT.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_3D.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_PL3.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_PL5.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_7L.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_7X.equals(lotInstWithLotto.getLottoId().toString())) {
            //目前彩种包括 双色球、大乐透、福彩3D、排列3、排列5、七星彩、七乐彩
            //取爬取到的彩种的期数的中奖详情列表
            List<LotInstBonus> lotInstBonusList = lotInstBonusOPMapper.selectByLottoInstId(lotInstWithLotto.getLottoInstId());
            //获取订单的每一笔选号实例
            OrdBettingInstExample ordBettingInstExample = new OrdBettingInstExample();
            ordBettingInstExample.createCriteria().andOrderNoEqualTo(ordOrder.getOrderNo()).andBettingInstStsEqualTo(CommonConstans.COMMON_STS_VALID);
            List<OrdBettingInst> ordBettingInstList = ordBettingInstMapper.selectByExample(ordBettingInstExample);
            if (!JBUtil.isListEmpty(ordBettingInstList)) {
                int totalBettingInstBonusAmt = 0;//总中奖金额
                int ordBettingInstListSize = ordBettingInstList.size();
                for (int j = 0; j < ordBettingInstListSize; j++) {
                    //单条选号复式数据处理
                    OrdBettingInst ordBettingInst = ordBettingInstList.get(j);
                    String chooseNumberStr = ordBettingInst.getChooseNumber();//号码
                    //分彩种做拆分判断中奖
                    if (CommonConstans.LOTTO_ID_SSQ.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_DLT.equals(lotInstWithLotto.getLottoId().toString())) {
                        //双色球和大乐透，分红区蓝区的彩种的处理模式
                        String[] chooseNumberArray = chooseNumberStr.split(":");
                        String[] chooseRedNumberArray = chooseNumberArray[0].split(" ");
                        String[] chooseBlueNumberArray = chooseNumberArray[1].split(" ");
                        int[] redBallArray = new int[chooseRedNumberArray.length];
                        int[] blueBallArray = new int[chooseBlueNumberArray.length];
                        //红球数组
                        if (chooseRedNumberArray.length > 0) {
                            for (int x = 0; x < chooseRedNumberArray.length; x++) {
                                redBallArray[x] = Integer.valueOf(chooseRedNumberArray[x]);
                            }
                        }
                        //蓝球数组
                        if (chooseBlueNumberArray.length > 0) {
                            for (int x = 0; x < chooseBlueNumberArray.length; x++) {
                                blueBallArray[x] = Integer.valueOf(chooseBlueNumberArray[x]);
                            }
                        }
                        //拼装红球蓝球
                        int redBallCount = 0;
                        int blueBallCount = 0;
                        if (CommonConstans.LOTTO_ID_SSQ.equals(lotInstWithLotto.getLottoId().toString())) {
                            //双色球
                            redBallCount = CommonConstans.LOTTO_RULE_SSQ_REDCOUNT;
                            blueBallCount = CommonConstans.LOTTO_RULE_SSQ_BLUECOUNT;
                        } else if (CommonConstans.LOTTO_ID_DLT.equals(lotInstWithLotto.getLottoId().toString())) {
                            //大乐透
                            redBallCount = CommonConstans.LOTTO_RULE_DLT_REDCOUNT;
                            blueBallCount = CommonConstans.LOTTO_RULE_DLT_BLUECOUNT;
                        }

                        //处理拆分的单注列表
                        List<String> redBallsList = CaseComputUtils.combinationStr("", redBallArray, redBallCount);
                        List<String> blueBallsList = CaseComputUtils.combinationStr("", blueBallArray, blueBallCount);
                        Integer currentInstBonus = 0;//该复式注最终的中奖金额
                        for (String redBalls : redBallsList) {
                            for (String blueBalls : blueBallsList) {
                                logger.debug("处理单注拆分后的原子注中奖情况，订单号:" + ordOrder.getOrderNo() + "-----红球:" + redBalls + ",蓝球:" + blueBalls);
                                int singleBettingInstBonus = checkSingleNumberOrderBonus(redBalls, blueBalls, lotInstWithLotto.getLottoId().toString(), lotInstWithLotto.getPeriodBonusNumber());
                                if (singleBettingInstBonus > 0) {
                                    //该单注已中奖，就去判断取奖项
                                    if (!JBUtil.isListEmpty(lotInstBonusList)) {
                                        int lotInstBonusListSize = lotInstBonusList.size();
                                        for (int k = 0; k < lotInstBonusListSize; k++) {
                                            LotInstBonus lotInstBonus = lotInstBonusList.get(k);
                                            if (lotInstBonus.getBonusLevel().equals(singleBettingInstBonus + "")) {
                                                //对比数据库的数据，找到了奖金等级
                                                if (!JBUtil.isStrEmpty(lotInstBonus.getBonusPreAmt())) {
                                                    //已中奖且有中奖金额
                                                    currentInstBonus = currentInstBonus + JBUtil.stringToInt(lotInstBonus.getBonusPreAmt()) * ordOrder.getBetTimes();//该单注中奖金额
                                                    //currentInstBonus = currentInstBonus + Double.valueOf(lotInstBonus.getBonusPreAmt()).intValue() * ordOrder.getBetTimes();//该单注中奖金额
                                                    break;
                                                } else {
                                                    //这一波还没有这个奖的金额，退出，返回错误，下次再弄
                                                    returnDto.setRetResult(false);
                                                    return returnDto;
                                                }
                                            }
                                            //最后还判断一下是否是一圈下来还是没找到奖项
                                            if (k == (lotInstBonusListSize - 1)) {
                                                //如果运行到这里，这个情况是:数据库奖项循环完了，还是没找到这个中奖等级对应的开奖的奖项等级，此时返回错误，下次再弄
                                                //TODO Junjie.Lai 这里还可能可以优化，小奖是固定的，能手工给个奖
                                                returnDto.setRetResult(false);
                                                return returnDto;
                                            }
                                        }
                                    } else {
                                        //没取到奖项，退出，返回错误，等下一波
                                        returnDto.setRetResult(false);
                                        return returnDto;
                                    }
                                }
                            }
                        }
                        //总中奖金额计算及入库
                        if (currentInstBonus > 0) {
                            //该一总注已中奖
                            ordBettingInst.setBettingInstAmt(currentInstBonus.longValue());
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_B);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                            totalBettingInstBonusAmt = totalBettingInstBonusAmt + currentInstBonus;
                        } else {
                            //该一总注未中奖
                            ordBettingInst.setBettingInstAmt(0L);
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_N);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                        }
                    } else if (CommonConstans.LOTTO_ID_7L.equals(lotInstWithLotto.getLottoId().toString())) {
                        //七乐彩
                        String[] chooseNumberArray = chooseNumberStr.split(" ");
                        int[] redBallArray = new int[chooseNumberArray.length];
                        //红球数组
                        if (chooseNumberArray.length > 0) {
                            for (int x = 0; x < chooseNumberArray.length; x++) {
                                redBallArray[x] = Integer.valueOf(chooseNumberArray[x]);
                            }
                        }
                        //处理拆分的单注列表
                        List<String> redBallsList = CaseComputUtils.combinationStr("", redBallArray, 7);
                        Integer currentInstBonus = 0;//该复式注最终的中奖金额
                        for (String redBalls : redBallsList) {
                            logger.debug("处理单注拆分后的原子注中奖情况，订单号:" + ordOrder.getOrderNo() + "-----所选择的球:" + redBalls);
                            int singleBettingInstBonus = check7LSingleNumberOrderBonus(redBalls, lotInstWithLotto.getLottoId().toString(), lotInstWithLotto.getPeriodBonusNumber());
                            if (singleBettingInstBonus > 0) {
                                //该单注已中奖，就去判断取奖项
                                if (!JBUtil.isListEmpty(lotInstBonusList)) {
                                    int lotInstBonusListSize = lotInstBonusList.size();
                                    for (int k = 0; k < lotInstBonusListSize; k++) {
                                        LotInstBonus lotInstBonus = lotInstBonusList.get(k);
                                        if (lotInstBonus.getBonusLevel().equals(singleBettingInstBonus + "")) {
                                            //对比数据库的数据，找到了奖金等级
                                            if (JBUtil.isStrEmpty(lotInstBonus.getBonusPreAmt())) {
                                                //已中奖且有中奖金额
                                                currentInstBonus = currentInstBonus + Integer.valueOf(lotInstBonus.getBonusPreAmt()) * ordOrder.getBetTimes();//该单注中奖金额
                                                break;
                                            } else {
                                                //这一波还没有这个奖的金额，退出，返回错误，下次再弄
                                                returnDto.setRetResult(false);
                                                return returnDto;
                                            }
                                        }
                                        //最后还判断一下是否是一圈下来还是没找到奖项
                                        if (k == (lotInstBonusListSize - 1)) {
                                            //如果运行到这里，这个情况是:数据库奖项循环完了，还是没找到这个中奖等级对应的开奖的奖项等级，此时返回错误，下次再弄
                                            //TODO Junjie.Lai 这里还可能可以优化，小奖是固定的，能手工给个奖
                                            returnDto.setRetResult(false);
                                            return returnDto;
                                        }
                                    }
                                } else {
                                    //没取到奖项，退出，返回错误，等下一波
                                    returnDto.setRetResult(false);
                                    return returnDto;
                                }
                            }
                        }
                        //总中奖金额计算及入库
                        if (currentInstBonus > 0) {
                            //该一总注已中奖
                            ordBettingInst.setBettingInstAmt(currentInstBonus.longValue());
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_B);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                            totalBettingInstBonusAmt = totalBettingInstBonusAmt + currentInstBonus;
                        } else {
                            //该一总注未中奖
                            ordBettingInst.setBettingInstAmt(0L);
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_N);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                        }
                    } else if (CommonConstans.LOTTO_ID_7X.equals(lotInstWithLotto.getLottoId().toString())) {
                        //七星彩
                        List<String> numberList = CaseComputUtils.buildPLLottoNumbers(chooseNumberStr);
                        Integer currentInstBonus = 0;//该复式注最终的中奖金额
                        if (!JBUtil.isListEmpty(numberList)) {
                            //处理拆分的单注列表
                            for (String ballItem : numberList) {
                                logger.debug("处理单注拆分后的原子注中奖情况，订单号:" + ordOrder.getOrderNo() + "-----投注号码:" + ballItem);
                                int singleBettingInstBonus = check7XSingleNumberOrderBonus(ballItem, lotInstWithLotto.getLottoId().toString(), lotInstWithLotto.getPeriodBonusNumber());
                                if (singleBettingInstBonus > 0) {
                                    //该单注已中奖，就去判断取奖项
                                    if (!JBUtil.isListEmpty(lotInstBonusList)) {
                                        int lotInstBonusListSize = lotInstBonusList.size();
                                        for (int k = 0; k < lotInstBonusListSize; k++) {
                                            LotInstBonus lotInstBonus = lotInstBonusList.get(k);
                                            if (lotInstBonus.getBonusLevel().equals(singleBettingInstBonus + "")) {
                                                //对比数据库的数据，找到了奖金等级
                                                if (JBUtil.isStrEmpty(lotInstBonus.getBonusPreAmt())) {
                                                    //已中奖且有中奖金额
                                                    currentInstBonus = currentInstBonus + Integer.valueOf(lotInstBonus.getBonusPreAmt()) * ordOrder.getBetTimes();//该单注中奖金额
                                                    break;
                                                } else {
                                                    //这一波还没有这个奖的金额，退出，返回错误，下次再弄
                                                    returnDto.setRetResult(false);
                                                    return returnDto;
                                                }
                                            }
                                            //最后还判断一下是否是一圈下来还是没找到奖项
                                            if (k == (lotInstBonusListSize - 1)) {
                                                //如果运行到这里，这个情况是:数据库奖项循环完了，还是没找到这个中奖等级对应的开奖的奖项等级，此时返回错误，下次再弄
                                                //TODO Junjie.Lai 这里还可能可以优化，小奖是固定的，能手工给个奖
                                                returnDto.setRetResult(false);
                                                return returnDto;
                                            }
                                        }
                                    } else {
                                        //没取到奖项，退出，返回错误，等下一波
                                        returnDto.setRetResult(false);
                                        return returnDto;
                                    }
                                }
                            }
                        }
                        //总中奖金额计算及入库
                        if (currentInstBonus > 0) {
                            //该一总注已中奖
                            ordBettingInst.setBettingInstAmt(currentInstBonus.longValue());
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_B);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                            totalBettingInstBonusAmt = totalBettingInstBonusAmt + currentInstBonus;
                        } else {
                            //该一总注未中奖
                            ordBettingInst.setBettingInstAmt(0L);
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_N);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                        }
                    } else if (CommonConstans.LOTTO_ID_3D.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_PL3.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_PL5.equals(lotInstWithLotto.getLottoId().toString())) {
                        //福彩3D、排列3、排列5分多个区判断组合和有顺序控制的模式
                        List<String> numberList = CaseComputUtils.buildPLLottoNumbers(chooseNumberStr);
                        Integer currentInstBonus = 0;//该复式注最终的中奖金额
                        if (!JBUtil.isListEmpty(numberList)) {
                            //处理拆分的单注列表
                            for (String ballItem : numberList) {
                                logger.debug("处理单注拆分后的原子注中奖情况，订单号:" + ordOrder.getOrderNo() + "-----投注号码:" + ballItem);
                                int singleBettingInstBonus = checkPLSingleNumberOrderBonus(ballItem, lotInstWithLotto.getLottoId().toString(), lotInstWithLotto.getPeriodBonusNumber());
                                if (singleBettingInstBonus > 0) {
                                    //该单注已中奖，就去判断取奖项
                                    if (!JBUtil.isListEmpty(lotInstBonusList)) {
                                        int lotInstBonusListSize = lotInstBonusList.size();
                                        for (int k = 0; k < lotInstBonusListSize; k++) {
                                            LotInstBonus lotInstBonus = lotInstBonusList.get(k);
                                            if (lotInstBonus.getBonusLevel().equals(singleBettingInstBonus + "")) {
                                                //对比数据库的数据，找到了奖金等级
                                                if (JBUtil.isStrEmpty(lotInstBonus.getBonusPreAmt())) {
                                                    //已中奖且有中奖金额
                                                    currentInstBonus = currentInstBonus + Integer.valueOf(lotInstBonus.getBonusPreAmt()) * ordOrder.getBetTimes();//该单注中奖金额
                                                    break;
                                                } else {
                                                    //这一波还没有这个奖的金额，退出，返回错误，下次再弄
                                                    returnDto.setRetResult(false);
                                                    return returnDto;
                                                }
                                            }
                                            //最后还判断一下是否是一圈下来还是没找到奖项
                                            if (k == (lotInstBonusListSize - 1)) {
                                                //如果运行到这里，这个情况是:数据库奖项循环完了，还是没找到这个中奖等级对应的开奖的奖项等级，此时返回错误，下次再弄
                                                //TODO Junjie.Lai 这里还可能可以优化，小奖是固定的，能手工给个奖
                                                returnDto.setRetResult(false);
                                                return returnDto;
                                            }
                                        }
                                    } else {
                                        //没取到奖项，退出，返回错误，等下一波
                                        returnDto.setRetResult(false);
                                        return returnDto;
                                    }
                                }
                            }
                        }
                        //总中奖金额计算及入库
                        if (currentInstBonus > 0) {
                            //该一总注已中奖
                            ordBettingInst.setBettingInstAmt(currentInstBonus.longValue());
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_B);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                            totalBettingInstBonusAmt = totalBettingInstBonusAmt + currentInstBonus;
                        } else {
                            //该一总注未中奖
                            ordBettingInst.setBettingInstAmt(0L);
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_N);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                        }
                    }
                }
                if (totalBettingInstBonusAmt > 0) {
                    //所有注里面至少有一注中奖
                    returnDto.setRetResult(true);
                    returnDto.setBonusAmt((long) totalBettingInstBonusAmt);//总中奖金额
                    returnDto.setBonusSts(CommonConstans.ORDER_BONUS_STS_B);//已中奖
                } else {
                    //所有注都未中奖
                    returnDto.setRetResult(true);
                    returnDto.setBonusAmt(0L);//总中奖金额
                    returnDto.setBonusSts(CommonConstans.ORDER_BONUS_STS_N);//未中奖
                }
                return returnDto;
            } else {
                //订单选号为空，有订单没有所选号码，这是有问题的
                returnDto.setRetResult(false);
                return returnDto;
            }
        } else {
            //不是双色球或者大乐透，不做处理
            returnDto.setRetResult(false);
            return returnDto;
        }
    }


    /**
     * 检查双色球/大乐透单注是否中奖，返回0未中奖，返回-1失败，大于0的结果表示中的是几等奖
     *
     * @param redBalls
     * @param blueBalls
     * @param lottoId
     * @return
     */
    private int checkSingleNumberOrderBonus(String redBalls, String blueBalls, String lottoId, String bonusNumber) {
        String[] redBallArray = redBalls.split(" ");//红球拆分成数组
        String[] blueBallArray = blueBalls.split(" ");//蓝球拆分成数组
        String[] bonusRedAndBlueBalls = bonusNumber.split(":");//开奖的正确号码数组
        String bonusRedBalls = bonusRedAndBlueBalls[0];//正确号码的红球string
        String bonusBlueBalls = bonusRedAndBlueBalls[1];//正确号码的蓝球string
        int bonusBallInRed = 0;//红球正确个数
        int bonusBallInBlue = 0;//蓝球正确个数
        //计算红球中奖个数
        for (int i = 0; i < redBallArray.length; i++) {
            String currentRedBall = redBallArray[i];
            if (bonusRedBalls.contains(currentRedBall)) {
                bonusBallInRed++;
            }
        }
        //计算蓝球中奖个数
        for (int j = 0; j < blueBallArray.length; j++) {
            String currentRedBall = blueBallArray[j];
            if (bonusBlueBalls.contains(currentRedBall)) {
                bonusBallInBlue++;
            }
        }
        //根据红球正确个数和蓝球正确个数判断是否中奖，中了几等奖
        if (CommonConstans.LOTTO_ID_SSQ.equals(lottoId)) {
            //双色球判断中奖
            if ((bonusBallInRed == 6) && (bonusBallInBlue == 1)) {
                return 1;
            } else if ((bonusBallInRed == 6) && (bonusBallInBlue == 0)) {
                return 2;
            } else if ((bonusBallInRed == 5) && (bonusBallInBlue == 1)) {
                return 3;
            } else if ((bonusBallInRed == 5 && bonusBallInBlue == 0) || (bonusBallInRed == 4 && bonusBallInBlue == 1)) {
                return 4;
            } else if ((bonusBallInRed == 4 && bonusBallInBlue == 0) || (bonusBallInRed == 3 && bonusBallInBlue == 1)) {
                return 5;
            } else if ((bonusBallInRed == 2 && bonusBallInBlue == 1) || (bonusBallInRed == 1 && bonusBallInBlue == 1) || (bonusBallInRed == 0 && bonusBallInBlue == 1)) {
                return 6;
            }
        } else if (CommonConstans.LOTTO_ID_DLT.equals(lottoId)) {
            //大乐透判断中奖
            if ((bonusBallInRed == 5) && (bonusBallInBlue == 2)) {
                return 1;
            } else if ((bonusBallInRed == 5) && (bonusBallInBlue == 1)) {
                return 2;
            } else if ((bonusBallInRed == 5) && (bonusBallInBlue == 0) || (bonusBallInRed == 4 && bonusBallInBlue == 2)) {
                return 3;
            } else if ((bonusBallInRed == 4 && bonusBallInBlue == 1) || (bonusBallInRed == 3 && bonusBallInBlue == 2)) {
                return 4;
            } else if ((bonusBallInRed == 4 && bonusBallInBlue == 0) || (bonusBallInRed == 3 && bonusBallInBlue == 1) || (bonusBallInRed == 2 && bonusBallInBlue == 2)) {
                return 5;
            } else if ((bonusBallInRed == 3 && bonusBallInBlue == 0) || (bonusBallInRed == 2 && bonusBallInBlue == 1) || (bonusBallInRed == 1 && bonusBallInBlue == 2) || (bonusBallInRed == 0 && bonusBallInBlue == 2)) {
                return 6;
            }
        }
        return 0;
    }


    /**
     * 检查排列的单注是否中奖，返回0未中奖，返回-1失败，大于0的结果表示中的是几等奖
     * 排列三，排列五，福彩3D
     *
     * @param numbers
     * @param lottoId
     * @param bonusNumber
     * @return
     */
    private int checkPLSingleNumberOrderBonus(String numbers, String lottoId, String bonusNumber) {
        int retLevel = 0;
        String[] chooseNumberArray = numbers.split(":");//单注拆分
        String[] bonusBalls = bonusNumber.split(" ");//开奖的正确号码数组(被爬虫坑了，爬虫这里是空格分隔)
        int rightCounts = 0;//正确个数
        //计算号码对应个数
        for (int i = 0; i < chooseNumberArray.length; i++) {
            String currentBall = chooseNumberArray[i];
            if (currentBall.equals(bonusBalls[i])) {
                rightCounts++;
            }
        }
        //根据红球正确个数和蓝球正确个数判断是否中奖，中了几等奖
        if (CommonConstans.LOTTO_ID_3D.equals(lottoId) || CommonConstans.LOTTO_ID_PL3.equals(lottoId)) {
            //福彩3D和排列3
            if (rightCounts == 3) {
                retLevel = 1;
            }
        } else if (CommonConstans.LOTTO_ID_PL5.equals(lottoId)) {
            //排列5
            if (rightCounts == 5) {
                retLevel = 1;
            }
        }
        return retLevel;
    }


    /**
     * 检查七星彩的单注是否中奖，返回0未中奖，返回-1失败，大于0的结果表示中的是几等奖
     *
     * @param numbers
     * @param lottoId
     * @param bonusNumber
     * @return
     */
    private int check7XSingleNumberOrderBonus(String numbers, String lottoId, String bonusNumber) {
        //七星彩中奖判断
        int retLevel = 0;
        String[] chooseNumberArray = numbers.split(":");//单注拆分
        String[] bonusBalls = bonusNumber.split(" ");//开奖的正确号码数组(被爬虫坑了，爬虫这里是空格分隔)
        StringBuffer rightStrs = new StringBuffer();//正确的字串
        //计算红球中奖个数
        for (int i = 0; i < chooseNumberArray.length; i++) {
            String currentBall = chooseNumberArray[i];
            if (currentBall.equals(bonusBalls[i])) {
                rightStrs.append("1");//对了是1
            } else {
                rightStrs.append("0");//没对是0
            }
        }
        //判断这个数组中
        String[] rightStrArray = rightStrs.toString().split("0");
        if (rightStrArray.length > 0) {
            int maxLength = 0;
            for (int j = 0; j < rightStrArray.length; j++) {
                if (rightStrArray[j] != null && rightStrArray[j].length() > maxLength) {
                    maxLength = rightStrArray[j].length();
                }
            }
            if (maxLength == 2) {
                retLevel = 6;
            } else if (maxLength == 3) {
                retLevel = 5;
            } else if (maxLength == 4) {
                retLevel = 4;
            } else if (maxLength == 5) {
                retLevel = 3;
            } else if (maxLength == 6) {
                retLevel = 2;
            } else if (maxLength == 7) {
                retLevel = 1;
            } else {
                retLevel = 0;
            }
        } else {
            retLevel = 0;
        }

        return retLevel;
    }

    /**
     * 检查七乐彩的单注是否中奖，返回0未中奖，返回-1失败，大于0的结果表示中的是几等奖
     *
     * @param numbers
     * @param lottoId
     * @param bonusNumber
     * @return
     */
    private int check7LSingleNumberOrderBonus(String numbers, String lottoId, String bonusNumber) {
        //七乐彩中奖判断
        int retLevel = 0;
        String[] chooseNumberArray = numbers.split(":");//单注拆分
        String[] bonusBalls = bonusNumber.split(":");//开奖的正确号码数组(被爬虫坑了，爬虫这里是空格分隔)
        String[] bonusBasicBalls = bonusBalls[0].split(" ");//基本号列表
        String supperBall = bonusBalls[1];//特殊号

        int basicRightCount = 0;//基本号正确个数
        int supperRightCount = 0;//特殊号正确个数

        //循环计算中奖个数
        for (int i = 0; i < chooseNumberArray.length; i++) {
            String currentNumber = chooseNumberArray[i];
            for (int j = 0; j < bonusBasicBalls.length; j++) {
                //计算基本号中奖个数
                String currentBall = bonusBasicBalls[j];
                if (currentNumber.equals(currentBall)) {
                    basicRightCount++;
                }
            }
            //计算特殊号中奖个数
            if (currentNumber.equals(supperBall)) {
                supperRightCount++;
            }
        }

        //计奖判断
        if (basicRightCount == 7) {
            retLevel = 1;
        } else if (basicRightCount == 6 && supperRightCount > 0) {
            retLevel = 2;
        } else if (basicRightCount == 6 && supperRightCount == 0) {
            retLevel = 3;
        } else if (basicRightCount == 5 && supperRightCount > 0) {
            retLevel = 4;
        } else if (basicRightCount == 5 && supperRightCount == 0) {
            retLevel = 5;
        } else if (basicRightCount == 4 && supperRightCount > 0) {
            retLevel = 6;
        } else if (basicRightCount == 4 && supperRightCount == 0) {
            retLevel = 7;
        }

        return retLevel;
    }


    /**
     * 判断传统足彩彩订单是否中奖
     *
     * @param ordOrder
     * @return
     */
    public OrderBonusReturnDto checkCtzcLottoOrderBonus(OrdOrderOP ordOrder) {
        OrderBonusReturnDto returnDto = new OrderBonusReturnDto();
        //获取彩种
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        if (CommonConstans.LOTTO_ID_ZCSF.equals(lotInstWithLotto.getLottoId().toString()) || CommonConstans.LOTTO_ID_ZCRJ.equals(lotInstWithLotto.getLottoId().toString())) {
            //TODO 是足彩任九或者胜负彩，做处理，其他未处理，如果需要扩充，则需要修改这里
            //取爬取到的彩种的期数的中奖详情列表
            List<LotInstBonus> lotInstBonusList = lotInstBonusOPMapper.selectByLottoInstId(lotInstWithLotto.getLottoInstId());
            //获取订单的每一笔选号实例
            OrdBettingInstExample ordBettingInstExample = new OrdBettingInstExample();
            ordBettingInstExample.createCriteria().andOrderNoEqualTo(ordOrder.getOrderNo()).andBettingInstStsEqualTo(CommonConstans.COMMON_STS_VALID);
            List<OrdBettingInst> ordBettingInstList = ordBettingInstMapper.selectByExample(ordBettingInstExample);
            if (!JBUtil.isListEmpty(ordBettingInstList)) {
                int totalBettingInstBonusAmt = 0;//总中奖金额
                int ordBettingInstListSize = ordBettingInstList.size();
                for (int j = 0; j < ordBettingInstListSize; j++) {
                    OrdBettingInst ordBettingInst = ordBettingInstList.get(j);
                    //足彩胜负彩和任九
                    String chooseNumberStrSrc = ordBettingInst.getChooseNumber();
                    List<String> numbersList = CaseComputUtils.buildZcStrList("", chooseNumberStrSrc);
                    if (!JBUtil.isListEmpty(numbersList)) {
                        Integer currentInstBonus = 0;//该复式注最终的中奖金额
                        for (String chooseNumber : numbersList) {
                            //单注的号码已经找到
                            logger.info("处理单注拆分后的原子注中奖情况，订单号:" + ordOrder.getOrderNo() + "-----用户选择的是:" + chooseNumber);
                            int singleBettingInstBonus = checkCtzcBonusLevel(chooseNumber, lotInstWithLotto.getLottoId().toString(), lotInstWithLotto.getPeriodBonusNumber());
                            if (singleBettingInstBonus > 0) {
                                //该原子注已中奖，就去判断取奖项
                                if (!JBUtil.isListEmpty(lotInstBonusList)) {
                                    int lotInstBonusListSize = lotInstBonusList.size();
                                    for (int k = 0; k < lotInstBonusListSize; k++) {
                                        LotInstBonus lotInstBonus = lotInstBonusList.get(k);
                                        if (lotInstBonus.getBonusLevel().equals(singleBettingInstBonus + "")) {
                                            //对比数据库的数据，找到了奖金等级
                                            if (JBUtil.isStrEmpty(lotInstBonus.getBonusPreAmt())) {
                                                //已中奖且有中奖金额
                                                currentInstBonus = currentInstBonus + Integer.valueOf(lotInstBonus.getBonusPreAmt()) * ordOrder.getBetTimes();//该单注中奖金额
                                                break;
                                            } else {
                                                //这一波还没有这个奖的金额，退出，返回错误，下次再弄
                                                returnDto.setRetResult(false);
                                                return returnDto;
                                            }
                                        }
                                        //最后还判断一下是否是一圈下来还是没找到奖项
                                        if (k == (lotInstBonusListSize - 1)) {
                                            //如果运行到这里，这个情况是:数据库奖项循环完了，还是没找到这个中奖等级对应的开奖的奖项等级，此时返回错误，下次再弄
                                            //TODO Junjie.Lai 这里还可能可以优化，小奖是固定的，能手工给个奖
                                            returnDto.setRetResult(false);
                                            return returnDto;
                                        }
                                    }
                                } else {
                                    //没取到奖项，退出，返回错误，等下一波
                                    returnDto.setRetResult(false);
                                    return returnDto;
                                }
                            }
                        }
                        //总中奖金额计算及入库
                        if (currentInstBonus > 0) {
                            //该一总注已中奖
                            ordBettingInst.setBettingInstAmt(currentInstBonus.longValue());
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_B);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                            totalBettingInstBonusAmt = totalBettingInstBonusAmt + currentInstBonus;
                        } else {
                            //该一总注未中奖
                            ordBettingInst.setBettingInstAmt(currentInstBonus.longValue());
                            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_N);
                            ordBettingInstMapper.updateByPrimaryKey(ordBettingInst);
                        }
                    }
                }
                if (totalBettingInstBonusAmt > 0) {
                    //所有注里面至少有一注中奖
                    returnDto.setRetResult(true);
                    returnDto.setBonusAmt((long) totalBettingInstBonusAmt);//总中奖金额
                    returnDto.setBonusSts(CommonConstans.ORDER_BONUS_STS_B);//已中奖
                } else {
                    //所有注都未中奖
                    returnDto.setRetResult(true);
                    returnDto.setBonusAmt((long) totalBettingInstBonusAmt);//总中奖金额
                    returnDto.setBonusSts(CommonConstans.ORDER_BONUS_STS_N);//未中奖
                }
                return returnDto;
            } else {
                //订单选号为空，有订单没有所选号码，这是有问题的
                returnDto.setRetResult(false);
                return returnDto;
            }
        } else {
            //不是传统足彩，不做处理
            returnDto.setRetResult(false);
            return returnDto;
        }
    }


    /**
     * 判断某一注传统足彩是否中奖
     *
     * @param chooseNumberStr
     * @param lottoId
     * @param bonusStr
     * @return
     */
    private int checkCtzcBonusLevel(String chooseNumberStr, String lottoId, String bonusStr) {
        int retVal = -1;
        bonusStr.replaceAll(" ", ":");//避免QuanSB的坑，把空格换成:
        String[] bonusArray = bonusStr.split(":");//取正确的每一场的中奖号的数组
        String[] chooseNmuberArray = chooseNumberStr.split(":");//取用户选择的号码的数组
        if (chooseNmuberArray.length >= bonusArray.length) {
            //所选号码数组的长度应该跟正确号码数组长度一致，不然就是错选，绝逼没中奖
            int wrongTime = 0;//错误次数
            for (int i = 0; i < bonusArray.length; i++) {
                String chooseNumberArrayValue = chooseNmuberArray[i];
                String bonusArrayValue = bonusArray[i];
                if (!("-1".equals(chooseNumberArrayValue)) && (!chooseNumberArrayValue.contains(bonusArrayValue))) {
                    wrongTime++;
                }
            }
            //全对是一等奖，错一场二等奖，任选九没有二等奖，错一场就挂了
            if (CommonConstans.LOTTO_ID_ZCSF.equals(lottoId)) {
                //足彩胜负彩
                //胜负彩
                if (wrongTime == 0) {
                    retVal = 1;
                } else if (wrongTime == 1) {
                    retVal = 2;
                }
            } else if (CommonConstans.LOTTO_ID_ZCRJ.equals(lottoId)) {
                //足彩任选9
                if (wrongTime == 0) {
                    retVal = 1;
                }
            }
        } else {
            retVal = -1;
        }
        return retVal;
    }

    /**
     * 轮训撤销订单
     *
     * @param ordOrderOP
     * @return
     */
    @Transactional
    public BaseRetDto rejectOrder(OrdOrderOP ordOrderOP) {
        BaseRetDto retDto = new BaseRetDto();
        if (CommonConstans.ORDER_STS_P.equals(ordOrderOP.getOrderSts())) {
            ordOrderOP.setOrderSts(CommonConstans.ORDER_STS_K);
            ordOrderOP.setOrderRejectTime(new Date());
            ordOrderOPMapper.updateByPrimaryKey(ordOrderOP);

            // 做退款处理
            orderRefund(ordOrderOP);

            //记账处理
            accountBo.orderRejectAccountFlow(ordOrderOP);

            //发消息处理
            sendMessageService.sendOrderRejectMsg(ordOrderOP);
            retDto.setHandlerResult(true);
        }
        return retDto;
    }

    /**
     * 针对支付订单进行退款
     *
     * @param ordOrder
     * @return
     */
    private BaseRetDto orderRefund(OrdOrderOP ordOrder) {
        BaseRetDto retDto = new BaseRetDto();
        Integer totalFee = ordOrder.getOrderPrice();
        if ("ptc".equals(evnConfig.getEvn())) {
            totalFee = ordOrder.getOrderPrice() * 100;
        }
        String refundOrderNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.REFUND_PRE_FLAG);
        WxPayRefundRequest refundRequest = WxPayRefundRequest.newBuilder()
                .transactionId(ordOrder.getPayOrderId())
                .totalFee(totalFee).refundFee(totalFee)
                .outRefundNo(refundOrderNo)
                .build();
        try {
            //调用微信接口申请退款
            WxPayRefundResult result = wxPayService.refund(refundRequest);
            logger.debug("微信退款返回对象:" + result.toString());
            OrdRefund ordRefund = new OrdRefund();
            ordRefund.setPayOrderNo(ordOrder.getOrderNo());
            ordRefund.setRefundNo(refundOrderNo);
            ordRefund.setRefundCreateTime(new Date());
            ordRefund.setRefundSts(CommonConstans.ORDER_STS_P);
            ordRefund.setPayRefundId(result.getRefundId());
            ordRefundMapper.insert(ordRefund);

            retDto.setHandlerResult(true);
            retDto.setHandlerMsg("处理成功");
        } catch (WxPayException e) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("处理失败");
            logger.error("调用微信支付异常:错误码:" + e.getReturnCode() + ",错误描述:" + e.getReturnMsg());
            logger.error("调用微信支付异常:结果码:" + e.getResultCode() + ",结果码描述:" + e.getResultCode());
            logger.error("调用微信支付异常:异常描述:" + e.getMessage() + ",失败码:" + e.getErrCode() + ",失败码描述:" + e.getErrCodeDes());
        }
        return retDto;
    }

    /**
     * 判断某一笔足彩/篮球竞技彩是否中奖
     *
     * @param ordOrder
     * @return
     */
    @Transactional
    public OrderBonusReturnDto checkCompeteLottoOrderBonus(OrdOrderOP ordOrder) {
        OrderBonusReturnDto returnDto = new OrderBonusReturnDto();
        //获取订单的每一场比赛的比赛情况及结果
        OrdBettingInstExample ordBettingInstExample = new OrdBettingInstExample();
        ordBettingInstExample.createCriteria().andOrderNoEqualTo(ordOrder.getOrderNo()).andBettingInstStsEqualTo(CommonConstans.COMMON_STS_VALID);
        List<OrdBettingInst> ordBettingInstList = ordBettingInstMapper.selectByExample(ordBettingInstExample);
        if (!JBUtil.isListEmpty(ordBettingInstList)) {
            List<MatchInfo> matchInfoList = new ArrayList<>();//数据库的比赛实例信息列表
            double totalBettingInstBonusAmt = 0;//总中奖金额
            int ordBettingInstListSize = ordBettingInstList.size();
            for (int j = 0; j < ordBettingInstListSize; j++) {
                //第一次遍历，遍历订单的选择场次的列表，将这个订单的所有场次的情况都查询出来，其中如果有未完成的比赛，直接返回false
                OrdBettingInst ordBettingInst = ordBettingInstList.get(j);
                MatchInfo matchInfo = matchInfoMapper.selectByPrimaryKey(ordBettingInst.getLottoInstId());
                if (CommonConstans.MATCH_INFO_STS_END.equals(matchInfo.getMatchInfoSts())) {
                    //结束、取消、的比赛就添加进去，如果遇到其他状态，就退出计算
                    matchInfoList.add(matchInfo);
                } else {
                    returnDto.setRetResult(false);
                    returnDto.setRetMessage("还有比赛未结束");
                    return returnDto;
                }
            }

            //组装拼装出所有的单注的选择
            List<List<ChooseMatchVo>> chooseMatchList = computMatchChooseNumbers(ordBettingInstList, ordOrder.getComGameStyle());
            for (int j = 0; j < chooseMatchList.size(); j++) {
                //第一层循环，获取所有串比赛的列表
                List<ChooseMatchVo> chooseMatchVos = chooseMatchList.get(j);
                if (!JBUtil.isListEmpty(chooseMatchVos)) {
                    double singleListBonusAmt = 0;
                    for (int x = 0; x < chooseMatchVos.size(); x++) {
                        //二层循环，分解出所有比赛
                        ChooseMatchVo chooseMatchVo = chooseMatchVos.get(x);
                        //判断单场比赛的选择是否正确
                        double singleBonusAmt = checkSingleBonus(chooseMatchVo, matchInfoList);
                        if (singleBonusAmt > 0) {
                            //如果中奖就计算赔率
                            singleListBonusAmt = singleListBonusAmt * singleBonusAmt;
                        } else {
                            break;
                        }
                    }
                    //最终的中奖金额
                    if (singleListBonusAmt > 0) {
                        totalBettingInstBonusAmt = totalBettingInstBonusAmt + singleListBonusAmt * 2;
                    }
                }
            }

            //计算中奖金额
            if (totalBettingInstBonusAmt > 0) {
                //所有注里面至少有一注中奖
                returnDto.setRetResult(true);
                returnDto.setBonusAmt((long) totalBettingInstBonusAmt);//总中奖金额
                returnDto.setBonusSts(CommonConstans.ORDER_BONUS_STS_B);//已中奖
            } else {
                //所有注都未中奖
                returnDto.setRetResult(true);
                returnDto.setBonusAmt((long) totalBettingInstBonusAmt);//总中奖金额
                returnDto.setBonusSts(CommonConstans.ORDER_BONUS_STS_N);//未中奖
            }
            return returnDto;
        } else {
            //订单选号为空，有订单没有所选号码，这是有问题的
            returnDto.setRetResult(false);
            return returnDto;
        }
    }

    /**
     * 检查单注是否中奖
     *
     * @return
     */
    private double checkSingleBonus(ChooseMatchVo chooseMatchVo, List<MatchInfo> matchInfoList) {
        double retVal = 0;
        if (!JBUtil.isListEmpty(matchInfoList)) {
            int matchInfoListSize = matchInfoList.size();
            for (int i = 0; i < matchInfoListSize; i++) {
                MatchInfo matchInfo = matchInfoList.get(i);
                if (chooseMatchVo.getMatchId().equals(matchInfo.getMatchInfoId().toString())) {
                    //找到比赛了，开始比结果，如果中了就计算中奖金额
                    retVal = checkSingleMatchResult(chooseMatchVo, matchInfo);
                }
            }
        }
        return retVal;
    }


    /**
     * 检查某一场比赛的结果
     *
     * @param chooseMatchVo
     * @param matchInfo
     * @return
     */
    private double checkSingleMatchResult(ChooseMatchVo chooseMatchVo, MatchInfo matchInfo) {
        double retVal = 0;
        String chooseNumberStr = chooseMatchVo.getChooseNumberStr();//整个选项内容
        String[] chooseValue = chooseNumberStr.split("@");
        String choosePlaysAndResultValue = chooseValue[0];//选项选择情况
        String chooseRateValue = chooseValue[1];//选择的赔率
        String[] choosePlayAndResultValueStrs = choosePlaysAndResultValue.split("_");//选择的玩法及结果的组合
        String choosePlayValue = choosePlayAndResultValueStrs[0];//选择的玩法
        Date chooseTime = chooseMatchVo.getChooseTime();//选择的时间，需要根据这个时间来回溯当时的选择的参数
        if (!JBUtil.isStrEmpty(chooseNumberStr)) {
            if (chooseNumberStr.startsWith("SPF_")) {
                //足彩胜平负判断
                String chooseResult = choosePlayAndResultValueStrs[1];
                if (matchInfo.getMatchInfoResult().equals(chooseResult)) {
                    //已中奖
                    retVal = new Double(chooseRateValue);
                }
            } else if (chooseNumberStr.startsWith("RSPF_")) {
                //足彩让球胜平负判断
                String chooseResult = choosePlayAndResultValueStrs[1];
                if (matchInfo.getMatchInfoResult().equals(chooseResult)) {
                    //已中奖
                    retVal = new Double(chooseRateValue);
                }
            } else if (chooseNumberStr.startsWith("SCORE_")) {
                //足彩比分判断
                String chooseHomeScore = choosePlayAndResultValueStrs[1];//主队得分
                String chooseGuestScore = choosePlayAndResultValueStrs[2];//客队得分
                if (!JBUtil.isStrEmpty(matchInfo.getMatchInfoScore()) && !":".equals(matchInfo.getMatchInfoResult())) {
                    String[] matchScoreStrs = matchInfo.getMatchInfoScore().split(":");
                    String resultHomeScore = matchScoreStrs[0];//主队比赛得分
                    String resultGuestScore = matchScoreStrs[1];//客队比赛得分
                    Integer resultHomeScoreIntValue = Integer.valueOf(resultHomeScore);
                    Integer resultGuestScoreIntValue = Integer.valueOf(resultGuestScore);
                    if (resultHomeScore.equals(chooseHomeScore) && resultGuestScore.equals(chooseGuestScore)) {
                        //肯定中奖了
                        retVal = new Double(chooseRateValue);
                    } else {
                        //根据情况判断
                        if (resultHomeScoreIntValue > resultGuestScoreIntValue) {
                            //胜其他就中奖，否则不中奖
                            if ("W".equals(chooseHomeScore) && "O".equals(chooseGuestScore)) {
                                retVal = new Double(chooseRateValue);
                            }
                        } else if (resultHomeScoreIntValue < resultGuestScoreIntValue) {
                            //负其他就中奖，否则不中奖
                            if ("L".equals(chooseHomeScore) && "O".equals(chooseGuestScore)) {
                                retVal = new Double(chooseRateValue);
                            }
                        } else if (resultHomeScoreIntValue == resultGuestScoreIntValue) {
                            //平其他就中奖，否则不中奖
                            if ("P".equals(chooseHomeScore) && "O".equals(chooseGuestScore)) {
                                retVal = new Double(chooseRateValue);
                            }
                        }
                    }


                }
            } else if (chooseNumberStr.startsWith("GOAL_")) {
                //足彩总进球数判断
                String chooseTotalScore = choosePlayAndResultValueStrs[1];//选择的总进球数
                if (!JBUtil.isStrEmpty(matchInfo.getMatchInfoScore()) && !":".equals(matchInfo.getMatchInfoResult())) {
                    String[] matchScoreStrs = matchInfo.getMatchInfoScore().split(":");
                    String resultHomeScore = matchScoreStrs[0];//主队比赛得分
                    String resultGuestScore = matchScoreStrs[1];//客队比赛得分
                    int resultTotalScore = Integer.valueOf(resultHomeScore) + Integer.valueOf(resultGuestScore);
                    if (resultTotalScore >= 7) {
                        //7个以上统一计算
                        resultTotalScore = 7;
                    }
                    if (chooseTotalScore.equals(resultTotalScore + "")) {
                        //已中奖
                        retVal = new Double(chooseRateValue);
                    }
                }
            } else if (chooseNumberStr.startsWith("HALF_")) {
                //足彩上下半场判断
                String chooseFirstHalfResult = choosePlayAndResultValueStrs[1];//上半场结果
                String chooseTotalResult = choosePlayAndResultValueStrs[2];//全场结果
                if (!JBUtil.isStrEmpty(matchInfo.getMatchInfoScore()) && !":".equals(matchInfo.getMatchInfoResult())) {
                    String[] matchScoreStrs = matchInfo.getMatchInfoScore().split(":");
                    String resultHomeScore = matchScoreStrs[0];//主队全场比赛得分
                    String resultGuestScore = matchScoreStrs[1];//客队全场比赛得分
                    Integer resultHomeScoreIntValue = Integer.valueOf(resultHomeScore);//全场比赛主队得分int值
                    Integer resultGuestScoreIntValue = Integer.valueOf(resultGuestScore);//全场比赛客队得分int值
                    String totalResult = null;
                    if (resultHomeScoreIntValue > resultGuestScoreIntValue) {
                        totalResult = "W";
                    } else if (resultHomeScoreIntValue < resultGuestScoreIntValue) {
                        totalResult = "L";
                    } else if (resultHomeScoreIntValue == resultGuestScoreIntValue) {
                        totalResult = "P";
                    }
                    String[] matchHalfTimeScoreStrs = matchInfo.getMatchInfoHalftimeScore().split(":");
                    String resultHalfTimeHomeScore = matchHalfTimeScoreStrs[0];//主队半场比赛得分
                    String resultHalfTimeGuestScore = matchHalfTimeScoreStrs[1];//客队半场比赛得分
                    Integer resultHalfTimeHomeScoreIntValue = Integer.valueOf(resultHalfTimeHomeScore);//半场比赛主队得分int值
                    Integer resultHalfTimeGuestScoreIntValue = Integer.valueOf(resultHalfTimeGuestScore);//半场比赛客队得分int值
                    String halfResult = null;
                    if (resultHalfTimeHomeScoreIntValue > resultHalfTimeGuestScoreIntValue) {
                        halfResult = "W";
                    } else if (resultHalfTimeHomeScoreIntValue < resultHalfTimeGuestScoreIntValue) {
                        halfResult = "L";
                    } else if (resultHalfTimeHomeScoreIntValue == resultHalfTimeGuestScoreIntValue) {
                        halfResult = "P";
                    }
                    //半场结果和全场结果都对，才中奖
                    if (chooseFirstHalfResult.equals(halfResult) && chooseTotalResult.equals(totalResult)) {
                        //已中奖
                        retVal = new Double(chooseRateValue);
                    }
                }
            } else if (chooseNumberStr.startsWith("SF_")) {
                //篮球胜负判断
                String chooseResult = choosePlayAndResultValueStrs[1];
                if (matchInfo.getMatchInfoResult().equals(chooseResult)) {
                    //已中奖
                    retVal = new Double(chooseRateValue);
                }
            } else if (chooseNumberStr.startsWith("RSF_")) {
                //篮球让球胜负判断
                //TODO Junjie.Lai 这里还需要优化，要根据购买时间来取当时的让分是多少
                String chooseResult = choosePlayAndResultValueStrs[1];
                if (matchInfo.getMatchInfoResult().equals(chooseResult)) {
                    //已中奖
                    retVal = new Double(chooseRateValue);
                }
            } else if (chooseNumberStr.startsWith("BIG_")) {
                //TODO Junjie.Lai 篮球大小分判断
                String chooseResult = choosePlayAndResultValueStrs[1];//B是大分,L是小分
                if (!JBUtil.isStrEmpty(matchInfo.getMatchInfoScore()) && !":".equals(matchInfo.getMatchInfoResult())) {
                    String[] matchScoreStrs = matchInfo.getMatchInfoScore().split(":");
                    String resultHomeScore = matchScoreStrs[0];//主队全场比赛得分
                    String resultGuestScore = matchScoreStrs[1];//客队全场比赛得分
                    Integer resultHomeScoreIntValue = Integer.valueOf(resultHomeScore);//全场比赛主队得分int值
                    Integer resultGuestScoreIntValue = Integer.valueOf(resultGuestScore);//全场比赛客队得分int值


                }
            } else if (chooseNumberStr.startsWith("GAP_")) {
                //篮球胜分差判断
                String chooseGameResult = choosePlayAndResultValueStrs[1];//比赛结果
                String chooseGameScoreGapMin = choosePlayAndResultValueStrs[2];//胜分差的下限
                String chooseGameScoreGapMax = choosePlayAndResultValueStrs[3];//胜分差的上限
                Integer chooseGameScoreGapMinIntValue = Integer.valueOf(StringUtils.isNumeric(chooseGameScoreGapMin) ? chooseGameScoreGapMin : "0");//选择的分差下限值
                Integer chooseGameScoreGapMaxIntValue = Integer.valueOf(StringUtils.isNumeric(chooseGameScoreGapMax) ? chooseGameScoreGapMax : "200");//选择的分差上限值
                if (!JBUtil.isStrEmpty(matchInfo.getMatchInfoScore()) && !":".equals(matchInfo.getMatchInfoResult())) {
                    String[] matchScoreStrs = matchInfo.getMatchInfoScore().split(":");
                    String resultHomeScore = matchScoreStrs[0];//主队全场比赛得分
                    String resultGuestScore = matchScoreStrs[1];//客队全场比赛得分
                    Integer resultHomeScoreIntValue = Integer.valueOf(resultHomeScore);//全场比赛主队得分int值
                    Integer resultGuestScoreIntValue = Integer.valueOf(resultGuestScore);//全场比赛客队得分int值
                    Integer resultGap = resultHomeScoreIntValue - resultGuestScoreIntValue;//最终结果分差


                    if (resultGap > 0) {
                        //主队胜
                        if ("W".equals(chooseGameResult)) {
                            if (resultGap >= 26) {
                                //分差26分以上
                                if ("26".equals(chooseGameScoreGapMin) && "O".equals(chooseGameScoreGapMax)) {
                                    //中奖了
                                    retVal = new Double(chooseRateValue);
                                }
                            } else {
                                //分差26分以内
                                if (resultGap >= chooseGameScoreGapMinIntValue && resultGap <= chooseGameScoreGapMaxIntValue) {
                                    //中奖了
                                    retVal = new Double(chooseRateValue);
                                }
                            }
                        }
                    } else if (resultGap < 0) {
                        //主队负
                        if ("L".equals(chooseGameResult)) {
                            if (resultGap <= -26) {
                                //分差26分以上
                                if ("26".equals(chooseGameScoreGapMin) && "O".equals(chooseGameScoreGapMax)) {
                                    //中奖了
                                    retVal = new Double(chooseRateValue);
                                }
                            } else {
                                //分差26分以内
                                if ((resultGap * (-1)) >= chooseGameScoreGapMinIntValue && resultGap <= chooseGameScoreGapMaxIntValue) {
                                    //中奖了
                                    retVal = new Double(chooseRateValue);
                                }
                            }
                        }
                    }
                }
            }
        }
        return retVal;
    }

    /**
     * 拆分出竞彩的单注
     * <p>
     * 根据选的比赛和串数计算
     *
     * @return
     */
    private List<List<ChooseMatchVo>> computMatchChooseNumbers(List<OrdBettingInst> list, String mixStr) {
        //先初始化参数，将数据库的选择的比赛信息转化为计算需要的比赛信息的列表
        List<ChooseMatchVo> paramList = new ArrayList<>();
        if (!JBUtil.isListEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                OrdBettingInst ordBettingInst = list.get(i);
                if (ordBettingInst != null) {
                    ChooseMatchVo chooseMatchVo = new ChooseMatchVo();
                    chooseMatchVo.setMatchId(ordBettingInst.getLottoInstId().toString());
                    chooseMatchVo.setChooseNumberStr(ordBettingInst.getChooseNumber());
                    chooseMatchVo.setChooseTime(ordBettingInst.getChooseTime());
                    paramList.add(chooseMatchVo);
                }
            }
        }
        //组装比赛信息列表
        List<List<ChooseMatchVo>> retList = new ArrayList<>();
        String[] mixStrArr = mixStr.split(" ");//空格分隔串数
        for (int i = 0; i < mixStrArr.length; i++) {
            //外层循环，循环串数
            String singleMix = mixStrArr[i];
            String singleMixNumber = singleMix.split("\\*")[0];
            int singleMixInt = Integer.valueOf(singleMixNumber);//得到串数(N串1，诸如此类)
            //根据单个串数，对所选场次进行组合
            List<List<ChooseMatchVo>> chooseNumberVoListInMix = combinationChooseNumberList(new ArrayList<>(), paramList, singleMixInt);//比赛场次在当前串数的情况下的组合
            //中层循环，把比赛按串来组合(选了4场比赛，玩法2串1，有6种组合)
            for (int j = 0; j < chooseNumberVoListInMix.size(); j++) {
                List<ChooseMatchVo> chooseNumberVoList = chooseNumberVoListInMix.get(j);
                List<ChooseMatchVo> singleChooseNumberVoList = new ArrayList<>();
                for (int k = 0; k < chooseNumberVoList.size(); k++) {
                    ChooseMatchVo chooseNumberVo = chooseNumberVoList.get(k);
                    String chooseNumber = chooseNumberVo.getChooseNumberStr();
                    String[] chooseNumberStr = chooseNumber.split(" ");//某一场比赛所选的玩法列表拆分
                    int chooseCount = chooseNumberStr.length;//共选了几个玩法
                    if (chooseCount > 0) {
                        for (int xx = 0; xx < chooseCount; xx++) {
                            String singleChooseNumberStr = chooseNumberStr[xx];
                            ChooseMatchVo chooseMatchVo = new ChooseMatchVo();
                            chooseMatchVo.setChooseNumberStr(singleChooseNumberStr);
                            chooseMatchVo.setMatchId(chooseNumberVo.getMatchId());
                            singleChooseNumberVoList.add(chooseMatchVo);
                        }
                    }
                }
                retList.add(singleChooseNumberVoList);
            }
        }
        return retList;
    }


    /**
     * 构建选择的比赛组合的列表
     *
     * @param srcChooseNumberList
     * @param n
     * @return
     */
    public static List<List<ChooseMatchVo>> combinationChooseNumberList(List<ChooseMatchVo> subchooseNumberList, List<ChooseMatchVo> srcChooseNumberList, int n) {
        List<List<ChooseMatchVo>> retList = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < srcChooseNumberList.size(); i++) {
                List<ChooseMatchVo> tempList = new ArrayList<>();
                tempList.addAll(subchooseNumberList);
                tempList.add(srcChooseNumberList.get(i));
                retList.add(tempList);
            }
        } else {
            for (int i = 0; i < srcChooseNumberList.size() - (n - 1); i++) {
                List<ChooseMatchVo> tempList = new ArrayList<>();
                tempList.addAll(subchooseNumberList);
                tempList.add(srcChooseNumberList.get(i));
                List<ChooseMatchVo> ss = tempList;
                // 建立从i开始的子数组
                List<ChooseMatchVo> ii = new ArrayList<>();
                for (int j = 0; j < srcChooseNumberList.size() - i - 1; j++) {
                    ii.add(srcChooseNumberList.get(i + j + 1));
                }
                retList.addAll(combinationChooseNumberList(ss, ii, n - 1));
            }
        }
        return retList;
    }

    /**
     * 同步微信的退款订单状态
     *
     * @param ordRefund
     * @return
     */
    public BaseRetDto syncWxRefundSts(OrdRefund ordRefund) {
        BaseRetDto baseRetDto = new BaseRetDto();
        try {
            WxPayRefundQueryResult wxPayRefundQueryResult = wxPayService.refundQuery(null, null, null, ordRefund.getPayRefundId());

            List<WxPayRefundQueryResult.RefundRecord> refundRecordList = wxPayRefundQueryResult.getRefundRecords();
            if (!JBUtil.isListEmpty(refundRecordList)) {
                WxPayRefundQueryResult.RefundRecord refundRecord = refundRecordList.get(0);
                if (CommonConstans.REFUND_RECORD_STATUS_SUCCESS.equals(refundRecord.getRefundStatus())) {
                    //退款成功
                    ordRefund.setRefundSts(CommonConstans.ORDER_STS_A);//退款成功
                } else if (CommonConstans.REFUND_RECORD_STATUS_SUCCESS.equals(refundRecord.getRefundStatus())) {
                    //退款失败
                    ordRefund.setRefundSts(CommonConstans.ORDER_STS_K);//TODO Junjie.Lai 退款失败，需重新处理
                } else {
                    //其他情况暂不处理

                }
                ordRefundMapper.updateByPrimaryKey(ordRefund);//更新支付订单状态
            }
        } catch (WxPayException e) {
            e.printStackTrace();
            logger.debug("订单号:" + ordRefund.getRefundNo() + "，查询微信退款情况发生异常，深感遗憾");
        }
        return baseRetDto;
    }
}
