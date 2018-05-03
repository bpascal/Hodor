package com.codido.hodor.usr.service;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.constans.LottoStoreH5Constans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.common.util.Password;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.ord.bean.vo.AccountFlowVo;
import com.codido.hodor.ord.bean.vo.LottoInstVo;
import com.codido.hodor.usr.bean.dto.*;
import com.codido.hodor.usr.bean.vo.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 店铺服务
 */
@Service
public class ShopService {

    /**
     * 日志
     */
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(ShopService.class);


    /**
     * 店铺自定义mapper
     */
    @Autowired
    private ShpShopOPMapper shpShopOPMapper;
    /**
     * 店铺自定义mapper
     */
    @Autowired
    private LotInstOPMapper lotInstOPMapper;

    @Autowired
    private LotInstMapper lotInstMapper;
    @Autowired
    private LotLottoMapper lotLottoMapper;
    @Autowired
    private LotInstBonusOPMapper lotInstBonusOPMapper;

    @Autowired
    private LotLottoBonusOPMapper lotLottoBonusOPMapper;
    @Autowired
    private ShpLottoRelaOPMapper shpLottoRelaOPMapper;
    @Autowired
    private ShpLottoRelaMapper shpLottoRelaMapper;

    @Autowired
    private LotLottoOPMapper lotLottoOPMapper;
    @Autowired
    private LotLottoMapper lottoMapper;
    @Autowired
    private ShpShopMapper shpShopMapper;

    @Autowired
    private AccShopAccountMapper accShopAccountMapper;

    @Autowired
    private OrdOrderMapper ordOrderMapper;

    @Autowired
    private AccShopAcdtOPMapper accShopAcdtOPMapper;

    @Autowired
    private ShpBankcardOPMapper shpBankcardOPMapper;

    @Autowired
    private UsrPasswordsOPMapper usrPasswordsOPMapper;

    @Autowired
    private UsrTokenOPMapper usrTokenOPMapper;

    @Autowired
    private UsrTokenMapper usrTokenMapper;

    @Autowired
    private UsrUserMapper usrUserMapper;

    /**
     * 短信验证码mapper
     */
    @Autowired
    private SmsCodeMapper smsCodeMapper;

    /**
     * 修改店铺状态
     *
     * @param userId
     * @param shopVo
     * @return
     */
    public BaseRetDto saveShopSts(long userId, ShopVo shopVo) {
        BaseRetDto baseRetDto = new BaseRetDto();
        if (JBUtil.isStrEmpty(shopVo.getShopTradSts())) {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("店铺状态为空");
        } else {
            ShpShop shpShop = shpShopOPMapper.selectShopByShopOwnerId(userId);
            if (shpShop == null) {
                baseRetDto.setHandlerResult(false);
                baseRetDto.setHandlerMsg("该用户不是店主");
            } else {
                shpShop.setShopTradSts(shopVo.getShopTradSts());
                shpShopMapper.updateByPrimaryKey(shpShop);
                baseRetDto.setHandlerResult(true);
                baseRetDto.setHandlerMsg("更新成功");

            }
        }
        return baseRetDto;
    }

    /**
     * 修改店铺里面的彩种状态
     *
     * @param userId
     * @param shopLottoVo
     * @return
     */
    public BaseRetDto saveShopLottoSts(long userId, ShopLottoVo shopLottoVo) {
        BaseRetDto baseRetDto = new BaseRetDto();
        if (JBUtil.isStrEmpty(shopLottoVo.getLottoId())) {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("采种ID为空");
        } else {
            ShpShop shpShop = shpShopOPMapper.selectShopByShopOwnerId(userId);
            if (shpShop == null) {
                baseRetDto.setHandlerResult(false);
                baseRetDto.setHandlerMsg("该用户不是店主");
            } else {
                long lottoId = Long.valueOf(shopLottoVo.getLottoId());
                ShpLottoRela shpLottoRela = shpLottoRelaOPMapper.getRelaByUserIdAndLottoId(shpShop.getShopId(), lottoId);
                if (shpLottoRela == null) {
                    shpLottoRela = new ShpLottoRela();
                    shpLottoRela.setLottoId(lottoId);
                    shpLottoRela.setShopId(shpShop.getShopId());
                    shpLottoRela.setLottoTradSts("A");
                    shpLottoRela.setLottoSort(0);
                    shpLottoRela.setShopLottoOrderAmt(0l);
                    shpLottoRela.setShopLottoOrderCount(0);
                    shpLottoRelaMapper.insert(shpLottoRela);
                } else {
                    shpLottoRela.setLottoTradSts(shopLottoVo.getLottoSts());
                    shpLottoRelaMapper.updateByPrimaryKey(shpLottoRela);
                }
                baseRetDto.setHandlerResult(true);
                baseRetDto.setHandlerMsg("更新成功");
            }
        }
        return baseRetDto;

    }

    /**
     * 查询自己的店铺支持销售采种
     *
     * @param userId
     * @return
     */
    public List<ShopLottoVo> getLottoInstListByUserId(long userId) {
        List<ShopLottoVo> shopLottoVoList = new ArrayList<>();
        ShpShop shpShop = shpShopOPMapper.selectShopByShopOwnerId(userId);
        if (shpShop != null) {//先确定店铺存在
            //查询已经开通的彩票
            List<LotLotto> effectLotLottoList = lotLottoOPMapper.selectEffectByShopId(shpShop.getShopId());
//            effectLotLottoList.forEach(lotLotto -> {
//                ShopLottoVo shopLottoVo = new ShopLottoVo();
//                shopLottoVo.setLottoId(lotLotto.getLottoId().toString());
//                shopLottoVo.setLottoName(lotLotto.getLottoName());
//                shopLottoVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
//                shopLottoVo.setLottoType(lotLotto.getLottoType());
//                shopLottoVo.setLottoSts("A");
//                shopLottoVoList.add(shopLottoVo);
//            });
            //查询所有的采种
            List<LotLotto> allLotLottoList;
            if ("D".equals(shpShop.getShopType())) {
                allLotLottoList = lotLottoOPMapper.selectAll();
            } else {
                allLotLottoList = lotLottoOPMapper.selectByTpye(shpShop.getShopType());
            }
            //不在 effectLotLottoList 那个就是不支持或者关闭的采种
            allLotLottoList.forEach(lotLotto -> {
                String subSts = "N";
                if (!JBUtil.isListEmpty(effectLotLottoList)) {
                    for (LotLotto effectLotLotto : effectLotLottoList) {
                        if (lotLotto.getLottoId().equals(effectLotLotto.getLottoId())) {
                            //已经开启了
                            subSts = "A";
                        }
                    }
                }
                ShopLottoVo shopLottoVo = new ShopLottoVo();
                shopLottoVo.setLottoId(lotLotto.getLottoId().toString());
                shopLottoVo.setLottoName(lotLotto.getLottoName());
                shopLottoVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
                shopLottoVo.setLottoType(lotLotto.getLottoType());
                shopLottoVo.setLottoSts(subSts);
                shopLottoVoList.add(shopLottoVo);

            });
        }
        return shopLottoVoList;
    }


    /**
     * 更新自己的店铺联系方式
     *
     * @param userId
     * @param shopVo
     * @return
     */
    public BaseRetDto saveShopContact(long userId, ShopVo shopVo) {
        BaseRetDto baseRetDto = new BaseRetDto();
        if (JBUtil.isStrEmpty(shopVo.getShopMblNo())) {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("手机号码为空");
        } else if (shopVo.getShopMblNo().length() != 11) {
            baseRetDto.setHandlerResult(false);
            baseRetDto.setHandlerMsg("手机号不正确");
        } else {
            ShpShop shpShop = shpShopOPMapper.selectShopByShopOwnerId(userId);
            if (shpShop == null) {
                baseRetDto.setHandlerResult(false);
                baseRetDto.setHandlerMsg("该用户不是店主");
            } else {
                shpShop.setShopMblNo(shopVo.getShopMblNo());
                shpShop.setShopWxId(shopVo.getShopWxId());
                shpShop.setShopAlipayId(shopVo.getShopAlipayId());
                shpShopMapper.updateByPrimaryKeySelective(shpShop);
                baseRetDto.setHandlerResult(true);
                baseRetDto.setHandlerMsg("更新成功");
            }
        }
        return baseRetDto;
    }

    /**
     * 查询用户自己的店铺
     *
     * @param userId
     * @return
     */
    public ShopVo getShopByShopOwnerId(long userId) {
        ShpShop shpShop = shpShopOPMapper.selectShopByShopOwnerId(userId);
        ShopVo shopVo = null;
        if (shpShop != null) {
            shopVo = new ShopVo(shpShop);
        }
        return shopVo;
    }

    /**
     * 用户Id查询绑定的店铺
     */
    public List<ShopVo> getShopBandByUserId(long userId) {
        List<ShpShop> shopList = shpShopOPMapper.selectBandByUserId(userId);
        List<ShopVo> shopVoList = new ArrayList<>();
        shopList.forEach(shpShop -> {
            shopVoList.add(getShopVoByShShop(shpShop));
        });
        return shopVoList;

    }

    /**
     * 用户Id查询绑定第一个店铺
     */
    public ShopVo getShopTopBandByUserId(long userId) {
        ShpShop shpShop = shpShopOPMapper.selectTopBandByUserId(userId);
        ShopVo shopVo = null;
        if (shpShop != null) {
            shopVo = getShopVoByShShop(shpShop);
        }
        return shopVo;

    }

    /**
     * 更具 shpShop 查询 ShopVo并补全信息
     *
     * @param shpShop
     * @return
     */
    private ShopVo getShopVoByShShop(ShpShop shpShop) {
        ShopVo shopVo = new ShopVo(shpShop);

        List<LottoInstVo> lottoInstVoList = new ArrayList<>();
        LotInstWithLotto mainLottoInst = lotInstOPMapper.selectLottoInstWithLotto(shpShop.getShopMainLottoId());
        if (mainLottoInst != null) {
            shopVo.setMainLottoInstVo(buildLottoInstVo(mainLottoInst));
        }
        LotInstWithLotto subLottoInst = lotInstOPMapper.selectLottoInstWithLotto(shpShop.getShopSubLottoId());
        if (subLottoInst != null) {
            shopVo.setSubLottoInstVo(buildLottoInstVo(subLottoInst));
        }
        List<LotInstWithLotto> lotInstList = lotInstOPMapper.selectShopNewestLottoInstList(shpShop.getShopId());
        lotInstList.forEach(lotInst -> {

            LottoInstVo lottoInstVo = buildLottoInstVo(lotInst);

//            // 获取中奖信息
//            List<LottoBonusInstVo> lottoBonusInstVoList = new ArrayList<>();
//            List<LotInstBonus> lotInstBonuses = lotInstBonusOPMapper.selectByLottoInstId(lotInst.getLottoInstId());
//            lotInstBonuses.forEach(lotInstBonus -> {
//                LottoBonusInstVo vo = new LottoBonusInstVo();
//                LotLottoBonus lotLottoBonus = lotLottoBonusOPMapper.selectByLottoId(lotInst.getLottoId(), lotInstBonus.getBonusLevel());
//                vo.setBonusCondition(lotLottoBonus.getLottoBonusDesc());
//                vo.setBonusName(lotInstBonus.getBonusName());
//                vo.setBonusCounts(lotInstBonus.getBonusCount());
//                vo.setBonusAmt(lotInstBonus.getBonusPreAmt());
//                vo.setBonusInstId(lotInstBonus.getLottoInstId() + "");
//                lottoBonusInstVoList.add(vo);
//            });
//            lottoInstVo.setLottoBonusInstVoList(lottoBonusInstVoList);

            lottoInstVoList.add(lottoInstVo);
        });
        shopVo.setLottoInstVoList(lottoInstVoList);
        return shopVo;
    }

    /**
     * 根据db对象构建LottoInstVo
     *
     * @param lotInst
     * @return
     */
    private LottoInstVo buildLottoInstVo(LotInstWithLotto lotInst) {
        LottoInstVo lottoInstVo = new LottoInstVo();
        lottoInstVo.setLottoId(lotInst.getLottoId() + "");
        lottoInstVo.setLottoBonusTime(JBDateUtil.convertDateToString(lotInst.getPeriodBonusTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
        lottoInstVo.setLottoBonusTimeWeek(JBDateUtil.getWeekOfDate(lotInst.getPeriodBonusTime()));
        lottoInstVo.setLottoInstName(lotInst.getPeriodName());
        lottoInstVo.setLottoBonusNumber(lotInst.getPeriodBonusNumber());
        lottoInstVo.setLottoInstBeginTime(JBDateUtil.convertDateToString(lotInst.getPeriodBeginTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
        lottoInstVo.setLottoInstId(lotInst.getLottoInstId() + "");
        lottoInstVo.setLottoInstEndTime(JBDateUtil.convertDateToString(lotInst.getPeriodEndTime(), JBDateUtil.dateFormat_yyyyMMddHHmmssSSS));
        lottoInstVo.setLottoInstSts(lotInst.getPeriodSts());
        lottoInstVo.setLottoInstTagsName(lotInst.getPeriodTagsName());
        lottoInstVo.setLottoInstName(lotInst.getPeriodName());
        lottoInstVo.setLottoInstTags(lotInst.getPeriodTags());

        LotLotto lotLotto = lotInst.getLotLotto();
        if (lotLotto != null) {
            lottoInstVo.setLottoName(lotLotto.getLottoName());
            lottoInstVo.setLottoIconUrl(lotLotto.getLottoIconUrl());
            lottoInstVo.setLottoType(lotLotto.getLottoType());
            lottoInstVo.setLottoDesc(lotLotto.getLottoDesc());
        }
        return lottoInstVo;
    }


    /**
     * 查询商户账户信息详情
     *
     * @param shopId
     * @return
     */
    public ShopAccountDetailVo queryShopAccountDetail(Long shopId) {
        ShopAccountDetailVo retObj = new ShopAccountDetailVo();
        AccShopAccountExample example = new AccShopAccountExample();
        example.createCriteria().andShopIdEqualTo(shopId).andAccountStsEqualTo(CommonConstans.COMMON_STS_VALID);
        List<AccShopAccount> accShopAccountList = accShopAccountMapper.selectByExample(example);
        if (!JBUtil.isListEmpty(accShopAccountList)) {
            for (AccShopAccount accShopAccount : accShopAccountList) {
                if (CommonConstans.ACCOUNT_TYPE_ID_USEFUL.equals(accShopAccount.getAccountTypeId())) {
                    //可用余额
                    retObj.setUsefulBalance(accShopAccount.getAmount().toString());
                } else if (CommonConstans.ACCOUNT_TYPE_ID_BALANCE.equals(accShopAccount.getAccountTypeId())) {
                    //可提现余额
                    retObj.setWithdrawAbleBalance(accShopAccount.getAmount().toString());
                }
            }
        }
        return retObj;
    }


    /**
     * 查询商户首页订单和派奖数量
     *
     * @param shopId
     * @return
     */
    public ShopIndexCountRetDto queryShopIndexCount(Long shopId) {
        ShopIndexCountRetDto retDto = new ShopIndexCountRetDto();
        OrdOrderExample waitOrdOrderExample = new OrdOrderExample();
        waitOrdOrderExample.createCriteria().andDealShopIdEqualTo(shopId).andOrderStsEqualTo(CommonConstans.ORDER_STS_P);
        retDto.setOrderCount(ordOrderMapper.countByExample(waitOrdOrderExample) + "");
        OrdOrderExample boundOrdOrderExample = new OrdOrderExample();
        boundOrdOrderExample.createCriteria().andDealShopIdEqualTo(shopId).andOrderStsEqualTo(CommonConstans.ORDER_STS_B).andBonusStsEqualTo(CommonConstans.ORDER_BONUS_STS_B);
        retDto.setBonusCount(ordOrderMapper.countByExample(boundOrdOrderExample) + "");
        retDto.setHandlerResult(true);
        return retDto;
    }


    /**
     * 查询商户首页的资金情况
     * <p>
     * 出票数据：今日数据，本周数据，本月出票
     * 派奖数据：今日派奖，本周派奖，本月派奖
     *
     * @param shopId
     * @return
     */
    public ShopIndexAmtRetDto queryShopIndexAmt(Long shopId) {
        ShopIndexAmtRetDto retDto = new ShopIndexAmtRetDto();
        //日期
        SimpleDateFormat format = new SimpleDateFormat("y-M-d", Locale.CHINA);
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTimeInMillis(System.currentTimeMillis());
        //今天
        String dateStr = format.format(calendar.getTime());
        AccShopStatistics shopStatistics = accShopAcdtOPMapper.selectOrderSumInfoByDate(shopId, dateStr);
        retDto.setTodayOrderCount(String.valueOf(shopStatistics.getOrderCount()));
        retDto.setTodayOrderAmt(String.valueOf(shopStatistics.getOrderPiceSum()));
        retDto.setTodayBonusCount(String.valueOf(shopStatistics.getAmtCount()));
        retDto.setTodayBonusAmt(String.valueOf(shopStatistics.getAmtSum()));
        logger.debug("queryShopIndexAmt Todat(" + dateStr + ") ->" + shopStatistics.toString());
        //本周
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        dateStr = format.format(calendar.getTime());
        shopStatistics = accShopAcdtOPMapper.selectOrderSumInfoByDate(shopId, dateStr);
        retDto.setThisWeekOrderCount(String.valueOf(shopStatistics.getOrderCount()));
        retDto.setThisWeekOrderAmt(String.valueOf(shopStatistics.getOrderPiceSum()));
        retDto.setThisWeekBonusCount(String.valueOf(shopStatistics.getAmtCount()));
        retDto.setThisWeekBonusAmt(String.valueOf(shopStatistics.getAmtSum()));
        logger.debug("queryShopIndexAmt Week(" + dateStr + ") ->" + shopStatistics.toString());
        //本月
        calendar.add(Calendar.MONTH, Calendar.ERA);
        calendar.set(Calendar.DAY_OF_MONTH, Calendar.YEAR);
        dateStr = format.format(calendar.getTime());
        shopStatistics = accShopAcdtOPMapper.selectOrderSumInfoByDate(shopId, dateStr);
        retDto.setThisMonthOrderCount(String.valueOf(shopStatistics.getOrderCount()));
        retDto.setThisMonthOrderAmt(String.valueOf(shopStatistics.getOrderPiceSum()));
        retDto.setThisMonthBonusCount(String.valueOf(shopStatistics.getAmtCount()));
        retDto.setThisMonthBonusAmt(String.valueOf(shopStatistics.getAmtSum()));
        logger.debug("queryShopIndexAmt Month(" + dateStr + ") ->" + shopStatistics.toString());

        retDto.setHandlerResult(true);
        return retDto;
    }

    /**
     * 查询商户交易流水列表
     *
     * @return
     */
    public List<AccountFlowVo> queryShopAccountFlow(Long shopId, Long pageNo, Long pageCount) {
        List<AccShopAcdt> accShopAcdtList = accShopAcdtOPMapper.selectShopAcctFlowByShopId(shopId, pageNo * pageCount, pageCount);
        List<AccountFlowVo> accountFlowVoList = new ArrayList<>();
        if (!JBUtil.isListEmpty(accShopAcdtList)) {
            for (AccShopAcdt accShopAcdt : accShopAcdtList) {
                accountFlowVoList.add(new AccountFlowVo(accShopAcdt));
            }
        }
        return accountFlowVoList;
    }


    /**
     * 查询店铺银行卡列表
     *
     * @param userId
     * @return
     */
    public QueryShopBankCardRetDto queryShopBankCard(Long userId) {
        QueryShopBankCardRetDto retDto = new QueryShopBankCardRetDto();
        ShpBankcardOP shpBankcardOP = shpBankcardOPMapper.selectByShopOwnerUserId(userId);
        if (shpBankcardOP != null) {
            BankCardVo bankCardVo = new BankCardVo();
            if (!JBUtil.isStrEmpty(shpBankcardOP.getBankCardNo())) {
                bankCardVo.setCardNo("尾号" + shpBankcardOP.getBankCardNo().substring(shpBankcardOP.getBankCardNo().length() - 4));
            }
            bankCardVo.setCardOwnerName(shpBankcardOP.getBankCardOwnerName());
            bankCardVo.setShopBankCardId(shpBankcardOP.getShopBankcardId().toString());
            bankCardVo.setBankVo(new BankVo(shpBankcardOP.getCmmBank()));
            List<BankCardVo> bankCardVoList = new ArrayList<>();
            bankCardVoList.add(bankCardVo);
            retDto.setBankCardVoList(bankCardVoList);
            retDto.setHandlerResult(true);
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("未找到用户的银行卡信息");
        }
        return retDto;
    }


    /**
     * 店铺登录
     *
     * @param mblNo
     * @param passwords
     * @return
     */
    public ShopLoginRetDto shopLoginProcess(String mblNo, String passwords) {
        ShopLoginRetDto retDto = new ShopLoginRetDto();
        UsrPasswords usrPasswords = usrPasswordsOPMapper.selectByMblNoAndType(mblNo, CommonConstans.PWD_TYPE_LOGIN);
        if (usrPasswords != null) {
            if (Password.validatePassword(passwords, usrPasswords.getUserPasswords())) {
                //通过密码验证
                UsrUser usrUser = usrUserMapper.selectByPrimaryKey(usrPasswords.getUserId());
                if (usrUser != null) {
                    String tokenId = handlerUserTokenRefresh(usrUser);
                    retDto.setTokenId(tokenId);
                    retDto.setHandlerResult(true);
                    retDto.setHandlerMsg("此号码未注册，请使用注册号码登录");
                } else {
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("无此用户");
                }
            } else {
                //未通过密码验证
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("密码错误");
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("此号码未注册，请使用注册号码登录");
        }

        return retDto;
    }


    /**
     * 店铺通过短信验证码登录
     *
     * @param mblNo
     * @param smsCode
     * @return
     */
    public ShopLoginRetDto shopLoginWithSmsCodeProcess(String mblNo, String smsCode) {
        ShopLoginRetDto retDto = new ShopLoginRetDto();
        //通过短信验证码登录校验
        SmsCodeExample smsCodeExample = new SmsCodeExample();
        SmsCodeExample.Criteria criteria = smsCodeExample.createCriteria();
        criteria.andMblNoEqualTo(mblNo);
        criteria.andSmsTypeEqualTo("LOGIN");
        smsCodeExample.setOrderByClause("SMS_CODE_CREATE_TIME DESC");
        List<SmsCode> smsCodeList = smsCodeMapper.selectByExample(smsCodeExample);
        if (smsCodeList != null && smsCodeList.size() > 0) {
            //获取最新验证码
            SmsCode smsCodeDbObj = smsCodeList.get(0);
            if (smsCodeDbObj.getSmsCode().equals(smsCode)) {
                //密码验证通过
                //获取用户信息
                UsrUserExample usrUserExample = new UsrUserExample();
                usrUserExample.createCriteria().andUserMobileEqualTo(mblNo);
                List<UsrUser> usrUserList = usrUserMapper.selectByExample(usrUserExample);
                if (!JBUtil.isListEmpty(usrUserList)) {
                    UsrUser usrUser = usrUserList.get(0);
                    String tokenId = handlerUserTokenRefresh(usrUser);
                    retDto.setTokenId(tokenId);
                    retDto.setHandlerResult(true);
                } else {
                    retDto.setHandlerResult(false);
                    retDto.setHandlerMsg("号码未注册");
                }
            } else {
                retDto.setHandlerResult(false);
                retDto.setHandlerMsg("短信验证码不正确");
            }
        } else {
            retDto.setHandlerResult(false);
            retDto.setHandlerMsg("您还未获取验证码");
        }
        return retDto;
    }


    /**
     * 根据用户信息更新TOKEN
     *
     * @return
     */
    private String handlerUserTokenRefresh(UsrUser usrUser) {
        String retTokenId = null;
        int updateCount = usrTokenOPMapper.updateTokenStsByUserId(usrUser.getUserId(), CommonConstans.COMMON_STS_UNVALID);
        UsrToken usrToken = new UsrToken();
        usrToken.setUserId(usrUser.getUserId());
        usrToken.setTokenSts(CommonConstans.COMMON_STS_VALID);
        Date currentDate = new Date();
        usrToken.setTokenCreateTime(currentDate);
        usrToken.setTokenEndTime(JBDateUtil.addDate(LottoStoreH5Constans.TOKEN_EXP_DAYS));
        usrTokenMapper.insert(usrToken);
        retTokenId = usrToken.getTokenId().toString();
        return retTokenId;
    }
}
