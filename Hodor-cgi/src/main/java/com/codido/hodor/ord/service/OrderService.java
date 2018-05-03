package com.codido.hodor.ord.service;

import com.github.binarywang.wxpay.bean.request.WxPayRefundRequest;
import com.github.binarywang.wxpay.bean.result.WxPayRefundResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.google.gson.Gson;
import com.codido.hodor.bo.AccountBo;
import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.config.EvnConfig;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.common.util.OrderNoGeneratorUtil;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.ord.bean.vo.*;
import com.codido.hodor.ord.config.QiniuPicConfig;
import com.codido.hodor.usr.bean.vo.ShopVo;
import com.codido.hodor.usr.bean.vo.UserVo;
import com.codido.hodor.weixin.config.WxPayConfiguration;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 订单相关service
 */
@Service
public class OrderService {
    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(OrderService.class);

    /**
     * 订单mapper
     */
    @Autowired
    private OrdOrderOPMapper ordOrderOPMapper;
    /**
     * 订单mapper
     */
    @Autowired
    private OrdOrderMapper ordOrderMapper;

    /**
     * 号码mapper
     */
    @Autowired
    private OrdBettingInstOPMapper ordBettingInstMapper;

    /**
     * 订单退费记录mapper
     */
    @Autowired
    private OrdRefundMapper ordRefundMapper;


    @Autowired
    private WxPayConfig payConfig;

    @Autowired
    private WxPayService wxPayService;

    @Autowired
    private WxPayConfiguration wxPayConfiguration;

    /**
     * 商店
     */
    @Autowired
    private ShpShopMapper shopMapper;
    /**
     * 商店op
     */
    @Autowired
    private ShpShopOPMapper shopOPMapper;

    /**
     * 用户
     */
    @Autowired
    private UsrUserMapper usrUserMapper;
    /**
     * 彩种实例
     */
    @Autowired
    private LotInstMapper lotInstMapper;

    /**
     * 彩种实例自定义mapper
     */
    @Autowired
    private LotInstOPMapper lotInstOPMapper;
    /**
     * 彩种
     */
    @Autowired
    private LotLottoMapper lotLottoMapper;

    /**
     * 简单比赛信息查询mapper
     */
    @Autowired
    private LotMatchOPMapper lotMatchOPMapper;

    /**
     * 默认的比赛信息查询mapper
     */
    @Autowired
    private LotMatchMapper lotMatchMapper;

    /**
     * 微信公众号服务
     */
    @Autowired
    private WxMpEventService wxMpEventService;

    /**
     * 彩种对应的比赛的mapper
     */
    @Autowired
    private LotInstMatchOPMapper lotInstMatchOPMapper;

    /**
     * 账户对象
     */
    @Autowired
    private AccountBo accountBo;

    /**
     * 公共参数查询
     */
    @Autowired
    private PubParamMapper pubParamMapper;

    /**
     * 发消息处理
     */
    @Autowired
    private SendMessageService sendMessageService;

    /**
     * 环境信息
     */
    @Autowired
    private EvnConfig evnConfig;

    /**
     * 七牛图片地址配置
     */
    @Autowired
    private QiniuPicConfig qiniuPicConfig;

    /**
     * 新增订单
     *
     * @return
     */
    @Transactional
    public SaveOrdOrderVo saveOrdOrder(Long userId, SubmitOrderVo submitOrderVo, String channelFlag) {
        if (JBUtil.isStrEmpty(submitOrderVo.getOrderSource())) {
            submitOrderVo.setOrderSource(CommonConstans.ORDER_SOURCE_MANUAL);
        }
        SaveOrdOrderVo saveOrdOrderVo = new SaveOrdOrderVo();
        Date date = new Date();
        OrderVo orderVo = new OrderVo();
        String lottoId = submitOrderVo.getLottoId();
        String shopId = submitOrderVo.getShopId();//店铺ID
        String lottoInstId = submitOrderVo.getLottoInstId();//彩种实例ID
        if (JBUtil.isStrEmpty(lottoInstId)) {
            LotInstExample lotInstExample = new LotInstExample();
            lotInstExample.createCriteria().andLottoIdEqualTo(Long.valueOf(lottoId)).andPeriodStsEqualTo(CommonConstans.LOTTO_INST_STS_RECOMMOND);
            List<LotInst> lotinstList = lotInstMapper.selectByExample(lotInstExample);
            if (!JBUtil.isListEmpty(lotinstList)) {
                lottoInstId = lotinstList.get(0).getLottoInstId().toString();
            }
        }

        //做下单校验
        BaseRetDto retDto = saveOrderValid(submitOrderVo, channelFlag, shopId, lottoId, lottoInstId);
        if (retDto.isHandlerResult()) {
            //下单校验通过，新增订单
            OrdOrder ordOrder = new OrdOrder();
            if (!JBUtil.isStrEmpty(lottoInstId)) {
                ordOrder.setLottoInstId(Long.valueOf(lottoInstId));
            } else {
                //竞彩足球的特殊固定的彩种实例ID
                if (CommonConstans.LOTTO_ID_JCZQ.equals(lottoId)) {
                    //竞彩足球
                    ordOrder.setLottoInstId(CommonConstans.LOTTO_INST_ID_JCZQ);
                } else if (CommonConstans.LOTTO_ID_JCLQ.equals(lottoId)) {
                    //竞彩篮球
                    ordOrder.setLottoInstId(CommonConstans.LOTTO_INST_ID_JCLQ);
                }
            }
            ordOrder.setInitUserId(userId);
            ordOrder.setBetTimes(Integer.valueOf(submitOrderVo.getBetTimes()));
            ordOrder.setOrderSts(CommonConstans.ORDER_STS_I);
            ordOrder.setTicketUploadSts(CommonConstans.TICKET_UPLOAD_STS_N);
            ordOrder.setPaySts(CommonConstans.ORDER_PAY_STS_INIT);
            ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_I);
            ordOrder.setOrderPushmsgSts(CommonConstans.ORDER_PUSH_STS_INIT);//初始状态
            ordOrder.setOrderCreateTime(date);
            ordOrder.setOrderSource(submitOrderVo.getOrderSource());//订单来源
            ordOrder.setDealShopId(Long.valueOf(shopId));
            ordOrder.setOrderNo(OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.ORDER_PRE_FLAG));
            ordOrder.setOrderTicketReciveSts(CommonConstans.COMMON_STS_UNVALID);//默认是未取票
            //ordOrder.setOrderChannel(CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP);//下单渠道默认为彩士多公众号
            if (JBUtil.isStrEmpty(channelFlag)) {
                //默认是彩士多
                channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
            }
            ordOrder.setOrderChannel(channelFlag);//下单渠道从接口取默认为彩士多公众号
            ordOrder.setComGameStyle(submitOrderVo.getLottoMethod());//竞彩的串数字段，只有在竞彩的保存中才有
            saveOrdOrderVo.setHandlerResult(true);//默认是处理成功
            //下面是处理订单金额和总注数的地方
            if (CommonConstans.LOTTO_ID_SSQ.equals(lottoId)) {
                //双色球
                SaveOrderBettingInstRetDto saveRet = saveNumberOrdBettingInst(submitOrderVo, date, ordOrder.getOrderNo(), 6, 1, userId);
                ordOrder.setOrderTotalBetsCount(saveRet.getTotalCount());
                ordOrder.setOrderPrice(saveRet.getTotalAmt());
            } else if (CommonConstans.LOTTO_ID_DLT.equals(lottoId)) {
                //大乐透
                SaveOrderBettingInstRetDto saveRet = saveNumberOrdBettingInst(submitOrderVo, date, ordOrder.getOrderNo(), 5, 2, userId);
                ordOrder.setOrderTotalBetsCount(saveRet.getTotalCount());
                ordOrder.setOrderPrice(saveRet.getTotalAmt());
            } else if (CommonConstans.LOTTO_ID_ZCSF.equals(lottoId) || CommonConstans.LOTTO_ID_ZCRJ.equals(lottoId)) {
                //足彩胜负
                SaveOrderBettingInstRetDto saveRet = saveCTZCOrdBettingInst(submitOrderVo, date, ordOrder.getOrderNo(), userId);
                ordOrder.setOrderTotalBetsCount(saveRet.getTotalCount());
                ordOrder.setOrderPrice(saveRet.getTotalAmt());
            } else if (CommonConstans.LOTTO_ID_3D.equals(lottoId) || CommonConstans.LOTTO_ID_PL3.equals(lottoId) || CommonConstans.LOTTO_ID_PL5.equals(lottoId) || CommonConstans.LOTTO_ID_7X.equals(lottoId)) {
                //福彩3D，排列3，排列5，七星彩
                SaveOrderBettingInstRetDto saveRet = savePLLottoOrdBettingInst(submitOrderVo, date, ordOrder.getOrderNo(), userId);
                ordOrder.setOrderTotalBetsCount(saveRet.getTotalCount());
                ordOrder.setOrderPrice(saveRet.getTotalAmt());
            } else if (CommonConstans.LOTTO_ID_7L.equals(lottoId)) {
                //七乐彩
                SaveOrderBettingInstRetDto saveRet = save7LNumberOrdBettingInst(submitOrderVo, date, ordOrder.getOrderNo(), userId);
                ordOrder.setOrderTotalBetsCount(saveRet.getTotalCount());
                ordOrder.setOrderPrice(saveRet.getTotalAmt());
            } else if (CommonConstans.LOTTO_ID_JCZQ.equals(lottoId) || CommonConstans.LOTTO_ID_JCLQ.equals(lottoId)) {
                //竞彩足球和竞彩篮球
                SaveOrderBettingInstRetDto saveRet = saveMatchOrdBettingInst(submitOrderVo, date, ordOrder.getOrderNo(), userId);
                ordOrder.setOrderTotalBetsCount(saveRet.getTotalCount());
                ordOrder.setOrderPrice(saveRet.getTotalAmt());
            } else {
                saveOrdOrderVo.setHandlerResult(false);
                saveOrdOrderVo.setHandlerMsg("暂时不支持该彩票");
            }
            ordOrderMapper.insert(ordOrder);

            //返回参数组装
            orderVo.setOrderNo(ordOrder.getOrderNo());
            saveOrdOrderVo.setOrderVo(orderVo);
        } else {
            saveOrdOrderVo.setHandlerResult(false);
            saveOrdOrderVo.setHandlerMsg(retDto.getHandlerMsg());
        }
        return saveOrdOrderVo;
    }


    /**
     * 校验订单是否可以下单
     *
     * @param shopId
     * @param lottoId
     * @param lottoInstId
     * @return
     */
    private BaseRetDto saveOrderValid(SubmitOrderVo submitOrderVo, String channelFlag, String shopId, String lottoId, String lottoInstId) {
        BaseRetDto retDto = new BaseRetDto();
        retDto.setHandlerResult(true);
        //1.店铺营业情况校验
        ShpShop shpShop = shopMapper.selectByPrimaryKey(Long.valueOf(shopId));
        if (!"P".equals(shpShop.getShopTradSts())) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("很抱歉，店铺当前未在营业时间，不可下单");
        } else {
            if (!JBUtil.isStrEmpty(lottoInstId) && !CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag) && !CommonConstans.ORDER_SOURCE_AUTOTAKE.equals(submitOrderVo.getOrderSource())) {
                //中大奖了的订单并且是自动发送终端的订单，不做校验
                LotInst lotInst = lotInstMapper.selectByPrimaryKey(Long.valueOf(lottoInstId));
                Date lottoEndDate = lotInst.getPeriodEndTime();
                Date currentDate = new Date();
                if (currentDate.getTime() > (lottoEndDate.getTime() - 30 * 60000)) {
                    //2.彩票停售前30分钟平台不卖
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("当前彩票已经临近销售时间，为确保商户正常出票，请选择下一期彩票进行购买");
                }
            }
        }
        //2.订单的单式复式选择校验
        List<ChooseNumberVo> chooseNumberVoList = submitOrderVo.getChooseNumberVoList();
        boolean checkChooseTypeRes = checkChooseNumberListTypeValid(chooseNumberVoList, lottoId);
        if (!checkChooseTypeRes) {
            //单式复式选择校验未通过
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("您最多可以选择一注复式或者五注单式，单式复式不可同时选择，请确认投注选择正常后重新提交");
        }
        return retDto;
    }


    /**
     * 检查选择的号码列表是否合理
     *
     * @param chooseNumberVoList
     * @param lottoId
     * @return
     */
    private boolean checkChooseNumberListTypeValid(List<ChooseNumberVo> chooseNumberVoList, String lottoId) {
        boolean retBol = true;
        int singleCount = 0;
        int duplexCount = 0;
        if (!JBUtil.isListEmpty(chooseNumberVoList)) {
            for (ChooseNumberVo chooseNumberVo : chooseNumberVoList) {
                int checkTypeRes = checkChooseNumberType(chooseNumberVo, lottoId);
                if (checkTypeRes == 2) {
                    //复式
                    duplexCount++;
                } else if (checkTypeRes == 1) {
                    //单式
                    singleCount++;
                }
            }
            if (duplexCount > 0 && singleCount > 0) {
                //单式复式不可同时选择
                retBol = false;
            } else if (duplexCount == 0 && singleCount > 5) {
                //如果是单式，不可超过5条(待确认)
                retBol = false;
            } else if (duplexCount > 1 && singleCount == 0) {
                //如果有复式，则只能是一条
                retBol = false;
            } else {
                retBol = true;
            }
        } else {
            retBol = false;
        }
        return retBol;
    }


    /**
     * 根据所选的号码和彩种ID，判断这一注是单式还是复式
     * 返回1是单式，返回2是复式
     *
     * @param chooseNumberVo
     * @param lottoId
     * @return
     */
    private int checkChooseNumberType(ChooseNumberVo chooseNumberVo, String lottoId) {
        int retInt = 1;
        String[] chooseAreas = chooseNumberVo.getChooseNumberStr().split(":");
        if (CommonConstans.LOTTO_ID_SSQ.equals(lottoId)) {
            //双色球
            String chooseRedBallStr = chooseAreas[0];
            String chooseBlueBallStr = chooseAreas[1];
            String[] redBalls = chooseRedBallStr.split(" ");
            String[] blueBalls = chooseBlueBallStr.split(" ");
            if (redBalls.length == 6 && blueBalls.length == 1) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else if (CommonConstans.LOTTO_ID_DLT.equals(lottoId)) {
            //大乐透
            String chooseRedBallStr = chooseAreas[0];
            String chooseBlueBallStr = chooseAreas[1];
            String[] redBalls = chooseRedBallStr.split(" ");
            String[] blueBalls = chooseBlueBallStr.split(" ");
            if (redBalls.length == 5 && blueBalls.length == 2) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else if (CommonConstans.LOTTO_ID_3D.equals(lottoId)) {
            //福彩3D
            String firstBallStr = chooseAreas[0];
            String secondBallStr = chooseAreas[1];
            String thirdBallStr = chooseAreas[2];
            String[] firstBalls = firstBallStr.split(" ");
            String[] secondBalls = secondBallStr.split(" ");
            String[] thirdBalls = thirdBallStr.split(" ");
            if (firstBalls.length == 1 && secondBalls.length == 1 && thirdBalls.length == 1) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else if (CommonConstans.LOTTO_ID_PL3.equals(lottoId)) {
            //排列3
            String firstBallStr = chooseAreas[0];
            String secondBallStr = chooseAreas[1];
            String thirdBallStr = chooseAreas[2];
            String[] firstBalls = firstBallStr.split(" ");
            String[] secondBalls = secondBallStr.split(" ");
            String[] thirdBalls = thirdBallStr.split(" ");
            if (firstBalls.length == 1 && secondBalls.length == 1 && thirdBalls.length == 1) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else if (CommonConstans.LOTTO_ID_PL5.equals(lottoId)) {
            //排列5
            String firstBallStr = chooseAreas[0];
            String secondBallStr = chooseAreas[1];
            String thirdBallStr = chooseAreas[2];
            String forthBallStr = chooseAreas[3];
            String fifthBallStr = chooseAreas[4];
            String[] firstBalls = firstBallStr.split(" ");
            String[] secondBalls = secondBallStr.split(" ");
            String[] thirdBalls = thirdBallStr.split(" ");
            String[] forthBalls = forthBallStr.split(" ");
            String[] fifthBalls = fifthBallStr.split(" ");
            if (firstBalls.length == 1 && secondBalls.length == 1 && thirdBalls.length == 1 && forthBalls.length == 1 && fifthBalls.length == 1) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else if (CommonConstans.LOTTO_ID_7X.equals(lottoId)) {
            //七星彩
            String firstBallStr = chooseAreas[0];
            String secondBallStr = chooseAreas[1];
            String thirdBallStr = chooseAreas[2];
            String forthBallStr = chooseAreas[3];
            String fifthBallStr = chooseAreas[4];
            String sixthBallStr = chooseAreas[5];
            String seventhBallStr = chooseAreas[6];
            String[] firstBalls = firstBallStr.split(" ");
            String[] secondBalls = secondBallStr.split(" ");
            String[] thirdBalls = thirdBallStr.split(" ");
            String[] forthBalls = forthBallStr.split(" ");
            String[] fifthBalls = fifthBallStr.split(" ");
            String[] sixthBalls = sixthBallStr.split(" ");
            String[] seventhBalls = seventhBallStr.split(" ");
            if (firstBalls.length == 1 && secondBalls.length == 1 && thirdBalls.length == 1 && forthBalls.length == 1 && fifthBalls.length == 1 && sixthBalls.length == 1 && seventhBalls.length == 1) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else if (CommonConstans.LOTTO_ID_7L.equals(lottoId)) {
            //七乐彩
            if (chooseAreas.length == 7) {
                retInt = 1;
            } else {
                retInt = 2;
            }
        } else {
            retInt = 1;
        }
        return retInt;
    }

    /**
     * 保存数字彩的选号的具体号码
     *
     * @param submitOrderVo
     * @param date
     */
    private SaveOrderBettingInstRetDto saveNumberOrdBettingInst(SubmitOrderVo submitOrderVo, Date date, String orderNo, int redStandCount, int blueStandCount, Long userId) {
        List<ChooseNumberVo> chooseNumberVoList = submitOrderVo.getChooseNumberVoList();
        SaveOrderBettingInstRetDto retDto = new SaveOrderBettingInstRetDto();
        int totalCount = 0;
        for (ChooseNumberVo chooseNumberVo : chooseNumberVoList) {
            //新增所选号码
            OrdBettingInst ordBettingInst = new OrdBettingInst();
            String chooseNumber = chooseNumberVo.getChooseNumberStr();
            ordBettingInst.setChooseNumber(chooseNumber);
            int chooseCount = computChooseNumbers(chooseNumber, redStandCount, blueStandCount);
            ordBettingInst.setBettingCounts(chooseCount);//注数
            ordBettingInst.setNumberTimes(Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//倍数
            ordBettingInst.setBettingAmt(chooseCount * 2 * Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//金额
            //计算总注数
            totalCount = totalCount + chooseCount;
            ordBettingInst.setChooseTime(date);//选号时间
            ordBettingInst.setBettingType(CommonConstans.BETTING_TYPE_N);//普通投注
            ordBettingInst.setLottoInstId(Long.valueOf(submitOrderVo.getLottoInstId()));
            ordBettingInst.setBettingInstSts(CommonConstans.BETTING_INST_STS_A);//记录状态:有效
            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_I);//中奖状态:初始
            ordBettingInst.setUserId(userId);
            ordBettingInst.setOrderNo(orderNo);
            ordBettingInstMapper.insert(ordBettingInst);
        }
        int betTimes = Integer.valueOf(submitOrderVo.getBetTimes());
        retDto.setTotalCount(totalCount);
        retDto.setTotalAmt(betTimes * totalCount * 2);
        return retDto;
    }

    /**
     * 保存传统足彩的选号具体号码信息
     *
     * @param submitOrderVo
     * @param date
     * @param orderNo
     * @param userId
     * @return
     */
    private SaveOrderBettingInstRetDto saveCTZCOrdBettingInst(SubmitOrderVo submitOrderVo, Date date, String orderNo, Long userId) {
        // 足彩号码保存
        List<ChooseNumberVo> chooseNumberVoList = submitOrderVo.getChooseNumberVoList();
        SaveOrderBettingInstRetDto retDto = new SaveOrderBettingInstRetDto();
        int totalCount = 0;
        for (ChooseNumberVo chooseNumberVo : chooseNumberVoList) {
            //新增所选号码
            OrdBettingInst ordBettingInst = new OrdBettingInst();
            String chooseNumber = chooseNumberVo.getChooseNumberStr();
            ordBettingInst.setChooseNumber(chooseNumber);
            int chooseCount = zcComputChooseNumbers(chooseNumber);
            ordBettingInst.setBettingCounts(chooseCount);//注数
            ordBettingInst.setNumberTimes(Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//倍数
            ordBettingInst.setBettingAmt(chooseCount * 2 * Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//金额
            //计算总注数
            totalCount = totalCount + chooseCount;
            ordBettingInst.setChooseTime(date);//选号时间
            ordBettingInst.setBettingType(CommonConstans.BETTING_TYPE_N);//普通投注
            ordBettingInst.setLottoInstId(Long.valueOf(submitOrderVo.getLottoInstId()));
            ordBettingInst.setBettingInstSts(CommonConstans.BETTING_INST_STS_A);//记录状态:有效
            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_I);//中奖状态:初始
            ordBettingInst.setUserId(userId);
            ordBettingInst.setOrderNo(orderNo);
            ordBettingInstMapper.insert(ordBettingInst);
        }
        int betTimes = Integer.valueOf(submitOrderVo.getBetTimes());
        retDto.setTotalCount(totalCount);
        retDto.setTotalAmt(betTimes * totalCount * 2);
        return retDto;
    }


    /**
     * 排列3/排列5/福彩3D/七星彩的选号具体号码信息
     *
     * @param submitOrderVo
     * @param date
     * @param orderNo
     * @param userId
     * @return
     */
    private SaveOrderBettingInstRetDto savePLLottoOrdBettingInst(SubmitOrderVo submitOrderVo, Date date, String orderNo, Long userId) {
        // 足彩号码保存
        List<ChooseNumberVo> chooseNumberVoList = submitOrderVo.getChooseNumberVoList();
        SaveOrderBettingInstRetDto retDto = new SaveOrderBettingInstRetDto();
        int totalCount = 0;
        for (ChooseNumberVo chooseNumberVo : chooseNumberVoList) {
            //新增所选号码
            OrdBettingInst ordBettingInst = new OrdBettingInst();
            String chooseNumber = chooseNumberVo.getChooseNumberStr();
            ordBettingInst.setChooseNumber(chooseNumber);
            int chooseCount = computPLChooseNumbers(chooseNumber);
            ordBettingInst.setBettingCounts(chooseCount);//注数
            ordBettingInst.setNumberTimes(Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//倍数
            ordBettingInst.setBettingAmt(chooseCount * 2 * Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//金额
            //计算总注数
            totalCount = totalCount + chooseCount;
            ordBettingInst.setChooseTime(date);//选号时间
            ordBettingInst.setBettingType(CommonConstans.BETTING_TYPE_N);//普通投注
            ordBettingInst.setLottoInstId(Long.valueOf(submitOrderVo.getLottoInstId()));
            ordBettingInst.setBettingInstSts(CommonConstans.BETTING_INST_STS_A);//记录状态:有效
            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_I);//中奖状态:初始
            ordBettingInst.setUserId(userId);
            ordBettingInst.setOrderNo(orderNo);
            ordBettingInstMapper.insert(ordBettingInst);
        }
        int betTimes = Integer.valueOf(submitOrderVo.getBetTimes());
        retDto.setTotalCount(totalCount);
        retDto.setTotalAmt(betTimes * totalCount * 2);
        return retDto;
    }

    /**
     * 保存七乐彩的选号的具体号码
     *
     * @param submitOrderVo
     * @param date
     */
    private SaveOrderBettingInstRetDto save7LNumberOrdBettingInst(SubmitOrderVo submitOrderVo, Date date, String orderNo, Long userId) {
        List<ChooseNumberVo> chooseNumberVoList = submitOrderVo.getChooseNumberVoList();
        SaveOrderBettingInstRetDto retDto = new SaveOrderBettingInstRetDto();
        int totalCount = 0;
        for (ChooseNumberVo chooseNumberVo : chooseNumberVoList) {
            //新增所选号码
            OrdBettingInst ordBettingInst = new OrdBettingInst();
            String chooseNumber = chooseNumberVo.getChooseNumberStr();
            ordBettingInst.setChooseNumber(chooseNumber);
            int chooseCount = comput7LChooseNumbers(chooseNumber, 7);
            ordBettingInst.setBettingCounts(chooseCount);//注数
            ordBettingInst.setNumberTimes(Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//倍数
            ordBettingInst.setBettingAmt(chooseCount * 2 * Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//金额
            //计算总注数
            totalCount = totalCount + chooseCount;
            ordBettingInst.setChooseTime(date);//选号时间
            ordBettingInst.setBettingType(CommonConstans.BETTING_TYPE_N);//普通投注
            ordBettingInst.setLottoInstId(Long.valueOf(submitOrderVo.getLottoInstId()));
            ordBettingInst.setBettingInstSts(CommonConstans.BETTING_INST_STS_A);//记录状态:有效
            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_I);//中奖状态:初始
            ordBettingInst.setUserId(userId);
            ordBettingInst.setOrderNo(orderNo);
            ordBettingInstMapper.insert(ordBettingInst);
        }
        int betTimes = Integer.valueOf(submitOrderVo.getBetTimes());
        retDto.setTotalCount(totalCount);
        retDto.setTotalAmt(betTimes * totalCount * 2);
        return retDto;
    }


    /**
     * 保存竞彩足球和竞彩篮球的
     *
     * @param submitOrderVo
     * @param date
     */
    private SaveOrderBettingInstRetDto saveMatchOrdBettingInst(SubmitOrderVo submitOrderVo, Date date, String orderNo, Long userId) {
        List<ChooseNumberVo> chooseNumberVoList = submitOrderVo.getChooseNumberVoList();
        SaveOrderBettingInstRetDto retDto = new SaveOrderBettingInstRetDto();
        for (ChooseNumberVo chooseNumberVo : chooseNumberVoList) {
            //新增所选号码
            OrdBettingInst ordBettingInst = new OrdBettingInst();
            String chooseNumber = chooseNumberVo.getChooseNumberStr();
            ordBettingInst.setChooseNumber(chooseNumber);

            ordBettingInst.setBettingCounts(-1);//注数
            ordBettingInst.setNumberTimes(Integer.valueOf(submitOrderVo.getBetTimes() == null ? "1" : submitOrderVo.getBetTimes()));//倍数
            ordBettingInst.setBettingAmt(-1);//金额
            ordBettingInst.setChooseTime(date);//选号时间
            //保存竞彩的比赛信息和彩种实例信息，match_id保存为t_lot_match表的match_id，inst_id保存为t_match_info表的match_info_id
            if (!JBUtil.isStrEmpty(chooseNumberVo.getMatchId())) {
                long matchId = Long.valueOf(chooseNumberVo.getMatchId());
                ordBettingInst.setMatchId(matchId);
                LotMatch lotMatch = lotMatchMapper.selectByPrimaryKey(matchId);
                if (lotMatch != null && lotMatch.getMatchInfoId() != null) {
                    ordBettingInst.setLottoInstId(lotMatch.getMatchInfoId());
                } else {
                    ordBettingInst.setLottoInstId(matchId);
                }
            }
            ordBettingInst.setBettingType(CommonConstans.BETTING_TYPE_N);//普通投注
            ordBettingInst.setBettingInstSts(CommonConstans.BETTING_INST_STS_A);//记录状态:有效
            ordBettingInst.setBettingBonusSts(CommonConstans.BETTING_INST_BONUS_STS_I);//中奖状态:初始
            ordBettingInst.setUserId(userId);
            ordBettingInst.setOrderNo(orderNo);
            ordBettingInstMapper.insert(ordBettingInst);
        }
        //竞彩的需要单独计算总注数
        int totalCount = computMatchChooseNumbers(chooseNumberVoList, submitOrderVo.getLottoMethod());
        int betTimes = Integer.valueOf(submitOrderVo.getBetTimes());
        retDto.setTotalCount(totalCount);
        retDto.setTotalAmt(betTimes * totalCount * 2);
        return retDto;
    }

    /**
     * 保存订单选号实例处理的返回对象，包括总注数和总金额两个信息要返回
     */
    @Data
    @EqualsAndHashCode(callSuper = false)
    private class SaveOrderBettingInstRetDto implements Serializable {

        /**
         * 总注数
         */
        private Integer totalCount;

        /**
         * 总金额
         */
        private Integer totalAmt;
    }

    /**
     * 足彩计算选择号码的注数
     *
     * @param number
     * @return
     */
    private int zcComputChooseNumbers(String number) {
        String[] numbersArray = number.split(":");
        int totalCounts = 1;
        int choose2Counts = 0;//选择了两个号码的次数
        int choose3Counts = 0;//选择了三个号码的次数
        if (numbersArray != null) {
            for (int i = 0; i < numbersArray.length; i++) {
                String simpleNumber = numbersArray[i];
                String[] simpleNumberChooses = simpleNumber.split(" ");
                if (simpleNumberChooses.length == 2) {
                    choose2Counts++;
                } else if (simpleNumberChooses.length == 3) {
                    choose3Counts++;
                }
            }
            totalCounts = (int) (Math.pow(2, choose2Counts) * Math.pow(3, choose3Counts));
        }
        return totalCounts;
    }


    /**
     * 计算双色球/大乐透注数
     */
    private int computChooseNumbers(String number, int redStandCount, int blueStandCount) {
        String[] numbersArray = number.split(":");
        String[] redNumbers = numbersArray[0].split(" ");//红球
        int redParent = getBallCount(redNumbers, redStandCount);
        String[] blueNumbers = numbersArray[1].split(" ");//蓝色球
        int blueParent = getBallCount(blueNumbers, blueStandCount);
        int chooseNumberCount = redParent * blueParent;
        return chooseNumberCount;
    }

    /**
     * 计算排列彩的注数
     *
     * @return
     */
    private int computPLChooseNumbers(String number) {
        String[] numbersArray = number.split(":");
        int numberListSize = numbersArray.length;
        //int[] singleCounts = new int[numbersArray.length];
        int chooseNumberCount = 1;
        for (int i = 0; i < numberListSize; i++) {
            chooseNumberCount = chooseNumberCount * getBallCount(numbersArray[i].split(" "), 1);
        }
        return chooseNumberCount;
    }

    /**
     * 计算竞彩的注数
     * <p>
     * 根据选的比赛和串数计算
     *
     * @return
     */
    private int computMatchChooseNumbers(List<ChooseNumberVo> list, String mixStr) {
        int chooseNumberCount = 0;
        int matchCount = list.size();//总场次
        String[] mixStrArr = mixStr.split(" ");//空格分隔串数
        for (int i = 0; i < mixStrArr.length; i++) {
            //外层循环，循环串数
            int mixTotalCount = 0;
            String singleMix = mixStrArr[i];
            String singleMixNumber = singleMix.split("\\*")[0];
            int singleMixInt = Integer.valueOf(singleMixNumber);//得到串数(N串1，诸如此类)
            //int matchComputSize = CaseComputUtils.countCombination(singleMixInt, matchCount);//根据场次，算出当前串号下会有多少种组合
            //根据串数，对所选场次进行组合
            List<List<ChooseNumberVo>> chooseNumberVoListInMix = combinationChooseNumberList(new ArrayList<>(), list, singleMixInt);//比赛场次在当前串数的情况下的组合
            //中层循环，把比赛按串来组合(选了4场比赛，玩法2串1，就是4取2组合，即6种组合)
            for (int j = 0; j < chooseNumberVoListInMix.size(); j++) {
                List<ChooseNumberVo> chooseNumberVoList = chooseNumberVoListInMix.get(j);
                int chooseCountInMix = 1;
                for (int k = 0; k < chooseNumberVoList.size(); k++) {
                    ChooseNumberVo chooseNumberVo = chooseNumberVoList.get(k);
                    String chooseNumber = chooseNumberVo.getChooseNumberStr();
                    int chooseCount = chooseNumber.split(" ").length;//共选了几个玩法
                    chooseCountInMix = chooseCountInMix * chooseCount;//每个串里面的场次选择的玩法数量相乘
                }
                mixTotalCount = mixTotalCount + chooseCountInMix;
            }
            chooseNumberCount = chooseNumberCount + mixTotalCount;
            logger.info("computMatchChooseNumbers计算出mixTotalCount为:" + mixTotalCount);
        }
        logger.info("computMatchChooseNumbers计算出chooseNumberCount为:" + chooseNumberCount);
        return chooseNumberCount;
    }


    /**
     * 构建选择的比赛组合的列表
     *
     * @param srcChooseNumberList
     * @param n
     * @return
     */
    public static List<List<ChooseNumberVo>> combinationChooseNumberList(List<ChooseNumberVo> subchooseNumberList, List<ChooseNumberVo> srcChooseNumberList, int n) {
        List<List<ChooseNumberVo>> retList = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < srcChooseNumberList.size(); i++) {
                //return s + ia[i];
                List<ChooseNumberVo> tempList = new ArrayList<>();
                tempList.addAll(subchooseNumberList);
                tempList.add(srcChooseNumberList.get(i));
                retList.add(tempList);
            }
        } else {
            for (int i = 0; i < srcChooseNumberList.size() - (n - 1); i++) {
                List<ChooseNumberVo> tempList = new ArrayList<>();
                tempList.addAll(subchooseNumberList);
                tempList.add(srcChooseNumberList.get(i));
                List<ChooseNumberVo> ss = tempList;
                // 建立从i开始的子数组
                //int[] ii = new int[ia.length - i - 1];
                List<ChooseNumberVo> ii = new ArrayList<>();
                for (int j = 0; j < srcChooseNumberList.size() - i - 1; j++) {
                    //ii[j] = ia[i + j + 1];
                    ii.add(srcChooseNumberList.get(i + j + 1));
                }
                retList.addAll(combinationChooseNumberList(ss, ii, n - 1));
            }
        }
        return retList;
    }


    /**
     * 计算排列彩的注数
     *
     * @return
     */
    private int comput7LChooseNumbers(String number, int standCount) {
        String[] redNumbers = number.split(" ");//选了几个球
        int redParent = getBallCount(redNumbers, standCount);
        int chooseNumberCount = redParent;
        return chooseNumberCount;
    }

    /**
     * 得到注数
     *
     * @param numbers
     * @param standCount
     * @return
     */
    private int getBallCount(String[] numbers, int standCount) {
        int count = numbers.length;
        if (count >= standCount) {
            //当所选号码数>应选号码数时候，则进行计算，否则不进行计算
            return factorial(count) / (factorial(count - standCount) * factorial(standCount));
        } else {
            return 0;
        }
    }

    /**
     * 阶乘函数
     *
     * @return
     */
    private int factorial(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return (num * this.factorial(num - 1));
        }
    }

    /**
     * 根据用户ID查询订单列表
     *
     * @param pageNo
     * @param prePageCount
     * @param userId
     * @return
     */
    public List<OrderVo> getOrdOrderList(long pageNo, long prePageCount, long userId) {
        List<OrdOrderOP> orderList = ordOrderOPMapper.getOrdOrderList(pageNo * prePageCount, prePageCount, userId);
        List<OrderVo> orderVoList = new ArrayList<>();
        for (OrdOrderOP ordOrder : orderList) {
            OrderVo orderVo = buildSimpleOrderVo(userId, ordOrder);
            orderVoList.add(orderVo);
        }
        return orderVoList;
    }

    /**
     * 根据用户中奖列表
     *
     * @param pageNo
     * @param prePageCount
     * @param userId
     * @return
     */
    public List<OrderVo> getUserWinOrdOrderList(long pageNo, long prePageCount, long userId) {
        List<OrdOrderOP> orderList = ordOrderOPMapper.getUserWinOrdOrderList(pageNo * prePageCount, prePageCount, userId);
        List<OrderVo> orderVoList = new ArrayList<>();
        for (OrdOrderOP ordOrder : orderList) {
            OrderVo orderVo = buildSimpleOrderVo(userId, ordOrder);
            orderVoList.add(orderVo);
        }
        return orderVoList;
    }

    /**
     * 根据用户TOKENID查询用户对应的商户的中奖订单列表
     *
     * @param pageNo
     * @param prePageCount
     * @param userId
     * @return
     */
    public List<OrderVo> queryShopOrderList(long pageNo, long prePageCount, long userId, String orderSts) {
        ShpShopOP shpShop = shopOPMapper.selectShpShopOPByUserId(userId);
        if (shpShop != null) {
            List<OrdOrderOP> orderList = new ArrayList<>();
            if (CommonConstans.ORDER_STS_P.equals(orderSts)) {
                //查询未处理订单
                //orderList = ordOrderOPMapper.queryShopOrderList(pageNo * prePageCount, prePageCount, shpShop.getShopId(), orderSts);
                orderList = ordOrderOPMapper.queryShopUnDealedOrderList(pageNo * prePageCount, prePageCount, shpShop.getShopId());
            } else if (CommonConstans.ORDER_STS_A.equals(orderSts)) {
                //查询已处理订单，特殊处理，把B和S的订单都带过来
                orderList = ordOrderOPMapper.queryShopDealedOrderList(pageNo * prePageCount, prePageCount, shpShop.getShopId());
            }
            //组装返回
            List<OrderVo> orderVoList = new ArrayList<>();
            for (OrdOrderOP ordOrder : orderList) {
                OrderVo orderVo = buildSimpleOrderVo(userId, ordOrder);
                orderVoList.add(orderVo);
            }
            return orderVoList;
        } else {
            BaseRetDto retDto = new BaseRetDto();
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("您没有任何一家彩票店");
            return null;
        }
    }

    /**
     * 查询商户订单数量
     *
     * @param userId
     * @param orderSts
     * @return
     */
    public long queryShopOrderListCount(long userId, String orderSts) {
        ShpShopOP shpShop = shopOPMapper.selectShpShopOPByUserId(userId);
        long shopOrderListCount = 0l;
        if (shpShop != null) {
            OrdOrderExample ordOrderExample = new OrdOrderExample();
            OrdOrderExample.Criteria criteria = ordOrderExample.createCriteria();
            criteria.andDealShopIdEqualTo(shpShop.getShopId());
            criteria.andOrderStsEqualTo(orderSts);
            shopOrderListCount = ordOrderMapper.countByExample(ordOrderExample);
        }
        return shopOrderListCount;
    }

    /**
     * 根据用户TOKENID查询用户对应的商户的派奖订单列表
     *
     * @param bonusSts
     * @param pageNo
     * @param pageSize
     * @param userId
     * @return
     */
    public List<OrderVo> queryShopBonusList(String bonusSts, long pageNo, long pageSize, long userId) {
        ShpShopOP shpShop = shopOPMapper.selectShpShopOPByUserId(userId);
        List<OrdOrderOP> orderList = ordOrderOPMapper.queryShopBonusList(bonusSts, pageNo * pageSize, pageSize, shpShop.getShopId());
        List<OrderVo> orderVoList = new ArrayList<>();
        for (OrdOrderOP ordOrder : orderList) {
            OrderVo orderVo = buildSimpleOrderVo(userId, ordOrder);
            orderVoList.add(orderVo);
        }
        return orderVoList;
    }

    /**
     * 查询商户派奖订单数量
     *
     * @param userId
     * @param bonusSts
     * @return
     */
    public long queryShopBonusListCount(long userId, String bonusSts) {
        ShpShopOP shpShop = shopOPMapper.selectShpShopOPByUserId(userId);
        long shopOrderListCount = 0l;
        if (shpShop != null) {
            OrdOrderExample ordOrderExample = new OrdOrderExample();
            OrdOrderExample.Criteria criteria = ordOrderExample.createCriteria();
            criteria.andDealShopIdEqualTo(shpShop.getShopId());
            criteria.andBonusStsEqualTo(bonusSts);
            shopOrderListCount = ordOrderMapper.countByExample(ordOrderExample);
        }
        return shopOrderListCount;
    }

    /**
     * 构建基础的订单对象(包含订单基本信息等参数)
     *
     * @return
     */
    private OrderVo buildSimpleOrderVo(Long userId, OrdOrderOP ordOrder) {
        OrderVo orderVo = new OrderVo();
        if (ordOrder != null) {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            orderVo.setOrderId(ordOrder.getOrderId() + "");
            orderVo.setOrderNo(ordOrder.getOrderNo());
            orderVo.setBetTimes(ordOrder.getBetTimes() + "");
            orderVo.setOrderTotalPrice(ordOrder.getOrderPrice() + "");
            orderVo.setBonusAmt(ordOrder.getBonusAmt() + "");
            orderVo.setBonusSts(ordOrder.getBonusSts());
            orderVo.setPaySts(ordOrder.getPaySts());//支付状态
            orderVo.setChaseNo(ordOrder.getChaseNo());

            //获取彩种对象
            LotInst lotInst = lotInstMapper.selectByPrimaryKey(ordOrder.getLottoInstId());
            LotLotto lotLotto = lotLottoMapper.selectByPrimaryKey(lotInst.getLottoId());
            LottoInstVo lottoInstVo = new LottoInstVo();
            lottoInstVo.setLottoBonusNumber(lotInst.getPeriodBonusNumber());
            lottoInstVo.setLottoBonusTime(lotInst.getPeriodBonusTime() != null ? sd.format(lotInst.getPeriodBonusTime()) : null);
            //获得周几
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(lotInst.getPeriodBonusTime());
            lottoInstVo.setLottoBonusTimeWeek(calendar.get(Calendar.DAY_OF_WEEK) + "");
            lottoInstVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
            lottoInstVo.setLottoType(lotLotto.getLottoType());
            lottoInstVo.setLottoId(lotInst.getLottoId() + "");
            lottoInstVo.setLottoInstBeginTime(lotInst.getPeriodBeginTime() != null ? sd.format(lotInst.getPeriodBeginTime()) : null);
            lottoInstVo.setLottoInstEndTime(lotInst.getPeriodEndTime() != null ? sd.format(lotInst.getPeriodEndTime()) : null);
            lottoInstVo.setLottoInstId(ordOrder.getLottoInstId() + "");
            lottoInstVo.setLottoInstName(lotInst.getPeriodName());
            lottoInstVo.setLottoInstSts(lotInst.getPeriodSts());
            lottoInstVo.setLottoInstTags(lotInst.getPeriodTags());
            lottoInstVo.setLottoInstTagsName(lotInst.getPeriodTagsName());
            lottoInstVo.setLottoName(lotLotto.getLottoName());
            orderVo.setLottoInstVo(lottoInstVo);

            orderVo.setOrderChooseCount(ordOrder.getOrderTotalBetsCount().toString());
            orderVo.setOrderCreateTime(sd.format(ordOrder.getOrderCreateTime()));
            orderVo.setOrderInitFlag(ordOrder.getInitUserId().longValue() == userId.longValue());
            orderVo.setOrderSource(ordOrder.getOrderSource());
            orderVo.setOrderSourceStr("普通下单");
            orderVo.setOrderSts(ordOrder.getOrderSts());
            orderVo.setOrderTicketPicUrl(ordOrder.getOrderTicketPic());
            orderVo.setOrderTotalBettings(ordOrder.getOrderTotalBetsCount() + "");
            orderVo.setOrderTotalPrice(ordOrder.getOrderPrice() + "");
            orderVo.setTicketUploadSts(ordOrder.getTicketUploadSts());
        }
        return orderVo;
    }

    /**
     * 根据订单编号查询订单
     *
     * @param userid
     * @param orderNo
     * @return
     */
    public OrderVo queryOrderDetail(Long userid, String orderNo) {
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        return orderToOrderVo(userid, ordOrder);
    }

    /**
     * 将订单模型转化为vo型
     *
     * @param userid
     * @param ordOrder
     * @return
     */
    public OrderVo orderToOrderVo(Long userid, OrdOrderOP ordOrder) {
        OrderVo orderVo = new OrderVo();
        if (ordOrder != null) {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            orderVo.setOrderId(ordOrder.getOrderId() + "");
            orderVo.setOrderNo(ordOrder.getOrderNo());
            orderVo.setBetTimes(ordOrder.getBetTimes() + "");
            orderVo.setBonusAmt(ordOrder.getBonusAmt() + "");
            orderVo.setBonusSts(ordOrder.getBonusSts());
            orderVo.setLottoMethod(ordOrder.getComGameStyle());//

            if (CommonConstans.COMMON_STS_VALID.equals(ordOrder.getOrderTicketReciveSts())) {
                //已取票
                orderVo.setBonusPayTypeStr("取票兑奖");
            } else {
                orderVo.setBonusPayTypeStr("在线支付");
            }

            if (ordOrder.getFinishBonusTime() != null) {
                orderVo.setFinishBonusTime(JBDateUtil.transDate2String(ordOrder.getFinishBonusTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
            }
            orderVo.setPaySts(ordOrder.getPaySts());//支付状态
            orderVo.setChaseNo(ordOrder.getChaseNo());
            //获取订单中的中奖号码列表
            List<OrdBettingInst> ordBettingInsts = ordBettingInstMapper.selectByOrderNo(ordOrder.getOrderNo());
            List<ChooseNumberVo> chooseNumberVos = new ArrayList<>();
            for (OrdBettingInst ordBettingInst : ordBettingInsts) {
                ChooseNumberVo chooseNumberVo = new ChooseNumberVo();
                chooseNumberVo.setChooseCount(ordBettingInst.getBettingCounts() + "");
                chooseNumberVo.setChooseNumberStr(ordBettingInst.getChooseNumber());
                chooseNumberVo.setPayAmount(ordBettingInst.getBettingAmt() + "");
                if (ordBettingInst.getMatchId() != null) {
                    chooseNumberVo.setMatchId(ordBettingInst.getMatchId().toString());
                }
                chooseNumberVos.add(chooseNumberVo);
            }
            orderVo.setChooseNumberList(chooseNumberVos);
            orderVo.setCopOrderNo(ordOrder.getCopOrderNo());
            //获取商店对象
            ShpShop shpShop = shopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
            if (shpShop != null) {
                ShopVo shopVo = new ShopVo(shpShop);
                orderVo.setDealShopVo(shopVo);
            }
            //获取发起的用户
            UsrUser usrUser = usrUserMapper.selectByPrimaryKey(ordOrder.getInitUserId());
            if (usrUser != null) {
                UserVo userVo = new UserVo(usrUser);
                orderVo.setInitUserVo(userVo);
            }
            //处理彩种对象和彩种实例对象
            LotInst lotInst = lotInstMapper.selectByPrimaryKey(ordOrder.getLottoInstId());
            LotLotto lotLotto = lotLottoMapper.selectByPrimaryKey(lotInst.getLottoId());
            //彩种实例对象
            LottoInstVo lottoInstVo = new LottoInstVo();
            lottoInstVo.setLottoBonusNumber(lotInst.getPeriodBonusNumber());//开奖号码
            lottoInstVo.setLottoBonusTime(lotInst.getPeriodBonusTime() != null ? sd.format(lotInst.getPeriodBonusTime()) : null);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(lotInst.getPeriodBonusTime());
            lottoInstVo.setLottoType(lotLotto.getLottoType());
            lottoInstVo.setLottoBonusTimeWeek(calendar.get(Calendar.DAY_OF_WEEK) + "");//周几的参数
            lottoInstVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
            lottoInstVo.setLottoId(lotInst.getLottoId() + "");
            lottoInstVo.setLottoInstBeginTime(lotInst.getPeriodBeginTime() != null ? sd.format(lotInst.getPeriodBeginTime()) : null);
            lottoInstVo.setLottoInstEndTime(lotInst.getPeriodEndTime() != null ? sd.format(lotInst.getPeriodEndTime()) : null);
            lottoInstVo.setLottoInstId(ordOrder.getLottoInstId() + "");
            lottoInstVo.setLottoInstName(lotInst.getPeriodName());
            lottoInstVo.setLottoInstSts(lotInst.getPeriodSts());
            lottoInstVo.setLottoInstTags(lotInst.getPeriodTags());
            lottoInstVo.setLottoInstTagsName(lotInst.getPeriodTagsName());
            lottoInstVo.setLottoName(lotLotto.getLottoName());

            if (CommonConstans.LOTTO_TYPE_TC_CT.equals(lotLotto.getLottoType())) {
                //传统足彩，添加比赛信息
                List<MatchInstVo> matchInstVoList = new ArrayList<>();
                String[] chooseNumberStrs = JBUtil.isListEmpty(chooseNumberVos) ? null : chooseNumberVos.get(0).getChooseNumberStr().split(":");
                boolean hasNumberFlag = chooseNumberStrs != null && chooseNumberStrs.length == 14;//已选号标识
                List<LotInstMatchOP> lotInstMatchOPList = lotInstMatchOPMapper.selectByLotInstId(lotInst.getLottoInstId());
                if (!JBUtil.isListEmpty(lotInstMatchOPList)) {
                    int lotInstMatchOPListSize = lotInstMatchOPList.size();
                    for (int i = 0; i < lotInstMatchOPListSize; i++) {
                        LotInstMatchOP lotInstMatchOP = lotInstMatchOPList.get(i);
                        MatchInstVo matchInstVo = new MatchInstVo(lotInstMatchOP);
                        //判断用户选择的比赛的数字和选择结果
                        if (hasNumberFlag) {
                            matchInstVo.setChooseNumber(chooseNumberStrs[i]);
                            if (!JBUtil.isStrEmpty(lotInstMatchOP.getLotInstMatchResult())) {
                                if ("-1".equals(chooseNumberStrs[i]) || chooseNumberStrs[i].contains(lotInstMatchOP.getLotInstMatchResult())) {
                                    matchInstVo.setChooseResult(CommonConstans.LOTTO_TC_CHOOSE_RESULT_RIGHT);//选错
                                } else {
                                    matchInstVo.setChooseResult(CommonConstans.LOTTO_TC_CHOOSE_RESULT_WRONG);//选对
                                }
                            } else {
                                matchInstVo.setChooseResult(CommonConstans.LOTTO_TC_CHOOSE_RESULT_AVOID);//暂无结果
                            }
                        }
                        if (i < chooseNumberStrs.length) {
                            if (!"-1".equals(chooseNumberStrs[i])) {
                                matchInstVoList.add(matchInstVo);
                            }
                        }
                    }
                    lottoInstVo.setLottoMatchInstVoList(matchInstVoList);
                }
            } else if (CommonConstans.LOTTO_TYPE_TC_JC.equals(lotLotto.getLottoType())) {
                //竞彩类订单查询，添加比赛信息
                List<MatchInstVo> matchInstVoList = new ArrayList<>();
                if (!JBUtil.isListEmpty(chooseNumberVos)) {
                    for (ChooseNumberVo chooseNumberVo : chooseNumberVos) {
                        if (chooseNumberVo != null && !JBUtil.isStrEmpty(chooseNumberVo.getMatchId())) {
                            long matchId = Long.valueOf(chooseNumberVo.getMatchId());
                            LotMatchOP lotMatch = lotMatchOPMapper.selectMatchByMatchId(matchId);
                            MatchInstVo matchInstVo = new MatchInstVo(lotMatch);
                            matchInstVoList.add(matchInstVo);
                        }
                    }
                }
                lottoInstVo.setLottoMatchInstVoList(matchInstVoList);
            }
            orderVo.setLottoInstVo(lottoInstVo);

            orderVo.setOrderChooseCount(ordOrder.getOrderTotalBetsCount().toString());
            orderVo.setOrderCreateTime(sd.format(ordOrder.getOrderCreateTime()));
            orderVo.setOrderInitFlag(ordOrder.getInitUserId().longValue() == userid.longValue());
            orderVo.setOrderSource(ordOrder.getOrderSource());
            orderVo.setOrderSourceStr(transOrderSourceStrByCode(ordOrder.getOrderSource()));//订单来源描述字段
            orderVo.setOrderSts(ordOrder.getOrderSts());
            orderVo.setOrderTicketPicUrl(ordOrder.getOrderTicketPic());
            orderVo.setOrderTotalBettings(ordOrder.getOrderTotalBetsCount() + "");
            orderVo.setOrderTotalPrice(ordOrder.getOrderPrice() + "");
            orderVo.setTicketUploadSts(ordOrder.getTicketUploadSts());
            orderVo.setOrderAcceptTime(JBDateUtil.transDate2String(ordOrder.getOrderAcceptTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
            orderVo.setOrderRejectTime(JBDateUtil.transDate2String(ordOrder.getOrderRejectTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
            orderVo.setOrderCancelTime(JBDateUtil.transDate2String(ordOrder.getOrderCancelTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
            orderVo.setOrderPayTime(JBDateUtil.transDate2String(ordOrder.getOrderPayTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
            orderVo.setOrderTicketTakeSts(ordOrder.getOrderTicketReciveSts());
            orderVo.setOrderTicketTakeTime(JBDateUtil.transDate2String(ordOrder.getOrderTicketReciveTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        }
        return orderVo;
    }


    /**
     * 根据订单来源代码生成订单来源字符串
     *
     * @param code
     * @return
     */
    private String transOrderSourceStrByCode(String code) {
        String retStr;
        if (CommonConstans.ORDER_SOURCE_MANUAL.equals(code)) {
            retStr = "普通下单";
        } else if (CommonConstans.ORDER_SOURCE_AUTOTAKE.equals(code)) {
            retStr = "售彩终端预约订单";
        } else if (CommonConstans.ORDER_SOURCE_FELLOW.equals(code)) {
            retStr = "追号";
        } else if (CommonConstans.ORDER_SOURCE_GETHER.equals(code)) {
            retStr = "合买";
        } else {
            retStr = "普通下单";
        }
        return retStr;
    }

    /**
     * 确认订单
     *
     * @param orderNo
     * @param userId
     * @param imgWxMediaId
     */
    @Transactional
    public BaseRetDto ensureOrder(String orderNo, Long userId, String imgWxMediaId) {
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        ShpShop shpShop = shopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
        BaseRetDto retDto = new BaseRetDto();
        LotInst lotInst = lotInstMapper.selectByPrimaryKey(ordOrder.getLottoInstId());
        Date lottoEndDate = lotInst.getPeriodEndTime();
        Date currentDate = new Date();
        if (currentDate.getTime() > (lottoEndDate.getTime() + 60 * 60000)) {
            //彩票停售后60分钟不可出票
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("本期彩票已暂停销售，已不可出票");
        } else if (shpShop != null && shpShop.getShopOwnerId().longValue() != userId) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("您不是该商店的拥有者，没有权限");
        } else if (ordOrder.getOrderSts().equals(CommonConstans.ORDER_STS_A)) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("该订单已经确认");
        } else {
            // 根据微信的mediaId获取图片url
            String imgUrl = null;
            File picFile = null;
            try {
                logger.debug("开始处理图片");
                //picFile = wxMpService.getMaterialService().mediaDownload(imgWxMediaId);
                picFile = wxMpEventService.downLoadWxMediaFile(ordOrder.getOrderChannel(), imgWxMediaId);
                logger.info("从微信拿到了文件对象，文件名为:" + picFile.getName());
                String suffix = picFile.getName().substring(picFile.getName().lastIndexOf(".") + 1);
                //做图片压缩
                Thumbnails.of(picFile).scale(1f).outputQuality(0.4f).toFile(picFile);

                logger.debug("图片传到七牛开始");
                //文件输入流
                FileInputStream fileInputStream = new FileInputStream(picFile);
                //构造一个带指定Zone对象的配置类
                Configuration cfg = new Configuration(Zone.zone2());//华南二区
                //...其他参数参考类注释
                UploadManager uploadManager = new UploadManager(cfg);
                //...生成上传凭证，然后准备上传
                String accessKey = qiniuPicConfig.getAccesskey();
                String secretKey = qiniuPicConfig.getSecretkey();
                String bucket = qiniuPicConfig.getImageBucket();
                //默认不指定key的情况下，以文件内容的hash值作为文件名
                String key = JBDateUtil.convertDateToString(new Date(), JBDateUtil.dateFormat_yyyy_MM_dd) + "/" + OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.PICNAME_PRE_FLAG) + "." + suffix;
                Auth auth = Auth.create(accessKey, secretKey);
                String upToken = auth.uploadToken(bucket);
                try {
                    Response response = uploadManager.put(fileInputStream, key, upToken, null, null);
                    //解析上传成功的结果
                    DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                    logger.info("七牛传图返回对象:" + putRet.toString());
                    imgUrl = qiniuPicConfig.getImgFileContext() + putRet.key + "?imageslim";
                    logger.info("图片传到七牛完成，文件路径是:" + imgUrl);
                } catch (QiniuException ex) {
                    Response r = ex.response;
                    logger.error("七牛传图异常:" + r.toString() + ",错误内容:" + r.bodyString());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!JBUtil.isStrEmpty(imgUrl)) {
                ordOrder.setOrderTicketPic(imgUrl);//图片
                ordOrder.setTicketUploadSts(CommonConstans.COMMON_STS_VALID);//已上传
                ordOrder.setTicketUploadTime(currentDate);
                ordOrder.setOrderSts(CommonConstans.ORDER_STS_A);
                ordOrder.setOrderAcceptTime(currentDate);
                ordOrderOPMapper.updateByPrimaryKey(ordOrder);

                //账务处理
                accountBo.orderEnsureAccountFlow(ordOrder);

                //发消息处理
                sendMessageService.sendEnsureOrderMsg(ordOrder);
                retDto.setHandlerResult(true);
                retDto.setHandlerMsg("更新成功");
            } else {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("更新失败");
            }

        }
        return retDto;
    }

    /**
     * 保存图片到文件
     *
     * @param picFile
     */
    private String savePicToFile(File picFile) {
        String imgUrl = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(picFile);
            File targetDir = new File(evnConfig.getPicSavePath());
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
            File target = new File(targetDir, picFile.getName());
            if (!target.exists()) {
                target.createNewFile();
                target.setExecutable(true, false);
                target.setReadable(true, false);
            }
            logger.debug("准备将对象写入文件");
            FileOutputStream fos = new FileOutputStream(target);
            byte[] bts = new byte[300];
            while (fileInputStream.read(bts, 0, 300) != -1) {
                fos.write(bts, 0, 300);
            }
            fos.close();
            fileInputStream.close();
            logger.debug("准备将对象写入完成");
            String fileRenderContextPath = evnConfig.getPicRequestPath();
            imgUrl = fileRenderContextPath + picFile.getName();
            logger.info("保存成功，文件路径为:" + imgUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imgUrl;
    }


    /**
     * 取消订单
     *
     * @param orderNo
     * @param userId
     */
    @Transactional
    public BaseRetDto cancelOrder(String orderNo, Long userId) {
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        BaseRetDto retDto = new BaseRetDto();
        if (ordOrder.getInitUserId().longValue() != userId) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("您不是该商店的拥有者，没有权限");
        } else if (ordOrder.getOrderSts().equals(CommonConstans.ORDER_STS_C)) {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("该订单已经取消");
        } else {
            ordOrder.setOrderSts(CommonConstans.ORDER_STS_C);//取消状态
            ordOrder.setOrderCancelTime(new Date());//取消时间
            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
            retDto.setHandlerResult(true);
            retDto.setHandlerMsg("取消成功");
        }
        return retDto;
    }


    /**
     * 订单取票
     *
     * @param orderNo
     * @param userId
     */
    @Transactional
    public BaseRetDto takeOrderTicket(String orderNo, Long userId) {
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        BaseRetDto retDto = new BaseRetDto();
        if ((CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()) || CommonConstans.ORDER_STS_B.equals(ordOrder.getOrderSts())) && CommonConstans.ORDER_TICKET_STS_NOTAKED.equals(ordOrder.getOrderTicketReciveSts())) {
            //订单是A或者B状态，且取票状态为未取票的，可以进行取票操作
            ShpShop shpShop = shopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
            if (shpShop.getShopOwnerId().longValue() == userId) {
                //做取票操作
                if (CommonConstans.ORDER_BONUS_STS_B.equals(ordOrder.getBonusSts())) {
                    //如果订单的中奖状态是已中奖未派奖，则修改状态为已兑奖
                    ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_S);//已兑奖
                    ordOrder.setOrderSts(CommonConstans.ORDER_STS_S);//已兑奖
                }
                ordOrder.setOrderTicketReciveSts(CommonConstans.ORDER_TICKET_STS_TAKED);
                ordOrder.setOrderTicketReciveTime(new Date());
                ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                //发通知给用户
                sendMessageService.sendOrderTakeTicketMsg(ordOrder);
                retDto.setHandlerResult(true);
            } else {
                //无权限进行取票
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("您没有权限进行取票操作");
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("订单状态不对，无法取票");
        }
        return retDto;
    }

    /**
     * 订单取票
     *
     * @param orderNo
     */
    @Transactional
    public BaseRetDto terminalTakeOrderTicket(String orderNo, String lotteryPeriod, String lottoId) {
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        //TODO Junjie.Lai 校验
        BaseRetDto retDto = new BaseRetDto();
        if ((CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()) || CommonConstans.ORDER_STS_B.equals(ordOrder.getOrderSts()) || CommonConstans.ORDER_STS_W.equals(ordOrder.getOrderSts())) && CommonConstans.ORDER_TICKET_STS_NOTAKED.equals(ordOrder.getOrderTicketReciveSts()) && CommonConstans.ORDER_SOURCE_AUTOTAKE.equals(ordOrder.getOrderSource())) {
            //订单是A或者B状态，且取票状态为未取票的，且是中大奖了的自动订单，可以通过此接口进行取票操作
            Date currentDate = new Date();
            //更新订单状态为已确认
            ordOrder.setOrderSts(CommonConstans.ORDER_STS_A);//已确认
            ordOrder.setOrderAcceptTime(currentDate);

            //更新订单的期数的正式值
            LotInst lotInst = lotInstOPMapper.selectLottoInstByName(Long.valueOf(lottoId), lotteryPeriod);
            ordOrder.setLottoInstId(lotInst.getLottoInstId());

            //更新取票状态和取票时间
            ordOrder.setOrderTicketReciveSts(CommonConstans.ORDER_TICKET_STS_TAKED);
            ordOrder.setOrderTicketReciveTime(currentDate);

            //做DB订单参数更新
            ordOrderOPMapper.updateByPrimaryKey(ordOrder);

            //更新订单选彩实例的期数正式值
            OrdBettingInst ordBettingInst = new OrdBettingInst();
            ordBettingInst.setLottoInstId(lotInst.getLottoInstId());
            OrdBettingInstExample ordBettingInstExample = new OrdBettingInstExample();
            ordBettingInstExample.createCriteria().andOrderNoEqualTo(orderNo);
            ordBettingInstMapper.updateByExampleSelective(ordBettingInst, ordBettingInstExample);

            //账务处理
            accountBo.orderEnsureAccountFlow(ordOrder);

            //发确认订单及取票通知给用户
            sendMessageService.sendAutoOrderEnsureAndTakeTicketMsg(ordOrder);
            retDto.setHandlerResult(true);
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("订单状态不对，无法取票");
        }
        return retDto;
    }

    /**
     * 撤销订单
     *
     * @param orderNo
     * @param userId
     */
    @Transactional
    public BaseRetDto rejectOrder(String orderNo, Long userId) {
        BaseRetDto retDto = new BaseRetDto();
        OrdOrderOP ordOrder = ordOrderOPMapper.selectByOrderNo(orderNo);
        if (CommonConstans.ORDER_STS_P.equals(ordOrder.getOrderSts())) {
            //已支付订单可以撤销
            ShpShop shpShop = shopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
            if (shpShop.getShopOwnerId().longValue() == userId) {
                ordOrder.setOrderSts(CommonConstans.ORDER_STS_K);
                ordOrder.setOrderRejectTime(new Date());
                ordOrderOPMapper.updateByPrimaryKey(ordOrder);

                //做退款处理
                orderRefund(ordOrder);

                //记账处理
                accountBo.orderRejectAccountFlow(ordOrder);

                //发消息处理
                sendMessageService.sendOrderRejectMsg(ordOrder);
                retDto.setHandlerResult(true);
            } else {
                //无权限进行撤单
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("您没有权限撤销订单");
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("该订单已经处理，无法撤销");
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
     * 查询公共参数
     *
     * @param paramKey
     * @return
     */
    public PubParamVo queryPubParam(String paramKey, String channelFlag) {
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        PubParamVo retObj = new PubParamVo();
        PubParamExample pubParamExample = new PubParamExample();
        pubParamExample.createCriteria().andParamKeyEqualTo(paramKey).andChannelFlagEqualTo(channelFlag);
        List<PubParam> pubParamList = pubParamMapper.selectByExample(pubParamExample);
        if (!JBUtil.isListEmpty(pubParamList)) {
            PubParam pubParam = pubParamList.get(0);
            if (pubParam != null) {
                retObj.setParamId(pubParam.getParamId().toString());
                retObj.setParamKey(pubParam.getParamKey());
                retObj.setParamName(pubParam.getParamName());
                retObj.setParamValue(pubParam.getParamValue());
            }
        }
        return retObj;
    }

}
