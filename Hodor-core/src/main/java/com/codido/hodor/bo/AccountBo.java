package com.codido.hodor.bo;

import com.codido.hodor.bo.dto.BaseReturnDto;
import com.codido.hodor.bo.dto.CreateAccountParaDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.common.util.OrderNoGeneratorUtil;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 账户处理相关bo，账户的一些核心共性问题在此处理
 */
@Component
public class AccountBo extends BaseBo {

    /**
     * 用户账户mapper
     */
    @Autowired
    private AccUserAccountMapper accUserAccountMapper;

    /**
     * 用户特殊账户mapper
     */
    @Autowired
    private AccUserAccountOPMapper accUserAccountOPMapper;

    /**
     * 店铺的mapper
     */
    @Autowired
    private AccShopAccountMapper accShopAccountMapper;

    /**
     * 店铺特殊账户mapper
     */
    @Autowired
    private AccShopAccountOPMapper accShopAccountOPMapper;

    /**
     * 平台账户mapper
     */
    @Autowired
    private AccPlatAccountMapper accPlatAccountMapper;

    /**
     * 用户交易流水mapper
     */
    @Autowired
    private AccUserAcdtMapper accUserAcdtMapper;

    /**
     * 商户交易流水mapper
     */
    @Autowired
    private AccShopAcdtMapper accShopAcdtMapper;

    /**
     * 平台交易流水mapper
     */
    @Autowired
    private AccPlatAcdtMapper accPlatAcdtMapper;

    /**
     * 店铺信息查询mapper
     */
    @Autowired
    private ShpShopMapper shpShopMapper;

    /**
     * 创建用户账户
     *
     * @param createAccountParaDto
     * @return
     */
    public BaseReturnDto createUserAccount(CreateAccountParaDto createAccountParaDto) {
        BaseReturnDto retDto = new BaseReturnDto();
        if (CommonConstans.ACCOUNT_OWNER_TYPE_PLAYER.equals(createAccountParaDto.getAccountOwnerType())) {
            //彩民,给彩民新建余额账户和支付账户以及冻结账户
            AccUserAccount accUserBalanceAccount = new AccUserAccount();
            accUserBalanceAccount.setUserId(createAccountParaDto.getUserId());
            accUserBalanceAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accUserBalanceAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_BALANCE);
            accUserBalanceAccount.setAmount(BigDecimal.ZERO);
            accUserAccountMapper.insert(accUserBalanceAccount);

            AccUserAccount accUserWxPayAccount = new AccUserAccount();
            accUserWxPayAccount.setUserId(createAccountParaDto.getUserId());
            accUserWxPayAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accUserWxPayAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_WXPAY);
            accUserWxPayAccount.setAmount(BigDecimal.ZERO);
            accUserAccountMapper.insert(accUserWxPayAccount);

            AccUserAccount accUserFrezonPayAccount = new AccUserAccount();
            accUserFrezonPayAccount.setUserId(createAccountParaDto.getUserId());
            accUserFrezonPayAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accUserFrezonPayAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_FREZON);
            accUserFrezonPayAccount.setAmount(BigDecimal.ZERO);
            accUserAccountMapper.insert(accUserFrezonPayAccount);

            AccUserAccount accUserUsefulPayAccount = new AccUserAccount();
            accUserUsefulPayAccount.setUserId(createAccountParaDto.getUserId());
            accUserUsefulPayAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accUserUsefulPayAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_USEFUL);
            accUserUsefulPayAccount.setAmount(BigDecimal.ZERO);
            accUserAccountMapper.insert(accUserUsefulPayAccount);
        } else if (CommonConstans.ACCOUNT_OWNER_TYPE_SHOP.equals(createAccountParaDto.getAccountOwnerType())) {
            //商铺
            AccShopAccount accShopBalanceAccount = new AccShopAccount();
            accShopBalanceAccount.setShopId(createAccountParaDto.getShopId());
            accShopBalanceAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accShopBalanceAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_BALANCE);
            accShopBalanceAccount.setAmount(BigDecimal.ZERO);
            accShopAccountMapper.insert(accShopBalanceAccount);

            AccShopAccount accShopWxPayAccount = new AccShopAccount();
            accShopWxPayAccount.setShopId(createAccountParaDto.getShopId());
            accShopWxPayAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accShopWxPayAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_WXPAY);
            accShopWxPayAccount.setAmount(BigDecimal.ZERO);
            accShopAccountMapper.insert(accShopWxPayAccount);

            AccShopAccount accShopFrezonPayAccount = new AccShopAccount();
            accShopFrezonPayAccount.setShopId(createAccountParaDto.getUserId());
            accShopFrezonPayAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accShopFrezonPayAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_FREZON);
            accShopFrezonPayAccount.setAmount(BigDecimal.ZERO);
            accShopAccountMapper.insert(accShopFrezonPayAccount);


            AccShopAccount accShopUsefulAccount = new AccShopAccount();
            accShopUsefulAccount.setShopId(createAccountParaDto.getUserId());
            accShopUsefulAccount.setAccountSts(CommonConstans.COMMON_STS_VALID);
            accShopUsefulAccount.setAccountTypeId(CommonConstans.ACCOUNT_TYPE_ID_USEFUL);
            accShopUsefulAccount.setAmount(BigDecimal.ZERO);
            accShopAccountMapper.insert(accShopUsefulAccount);
        } else if (CommonConstans.ACCOUNT_OWNER_TYPE_BUSINESS.equals(createAccountParaDto.getAccountOwnerType())) {
            //商户店主用户 暂不处理
        }
        retDto.setRetResult(true);
        return retDto;
    }


    /**
     * 购买支付订单流水处理
     *
     * @return
     */
    @Transactional
    public BaseReturnDto orderPayAccountFlow(OrdOrderOP ordOrder) {
        BaseReturnDto baseReturnDto = new BaseReturnDto();
        if (ordOrder != null) {
            Long userId = ordOrder.getInitUserId();
            String orderNo = ordOrder.getOrderNo();
            Double orderAmount = ordOrder.getOrderPrice().doubleValue();
            String txNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.TXNO_PRE_FLAG);
            //记账操作
            // 用户支付账户CR:订单金额,用户冻结账户DR:订单金额
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_WXPAY, CommonConstans.ACDT_TX_WAY_CR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_PAYORDER);//用户付款记账
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_FREZON, CommonConstans.ACDT_TX_WAY_DR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_PAYORDER);//用户付款记账
        }

        baseReturnDto.setRetResult(true);
        return baseReturnDto;
    }


    /**
     * 订单确认记账
     *
     * @param ordOrder
     * @return
     */
    @Transactional
    public BaseReturnDto orderEnsureAccountFlow(OrdOrderOP ordOrder) {
        BaseReturnDto baseReturnDto = new BaseReturnDto();
        if (ordOrder != null) {
            Long userId = ordOrder.getInitUserId();
            Long shopId = ordOrder.getDealShopId();
            String orderNo = ordOrder.getOrderNo();
            Double orderAmount = ordOrder.getOrderPrice().doubleValue();
            ShpShop shpShop = shpShopMapper.selectByPrimaryKey(shopId);
            Double rate = shpShop.getShopTradRate().doubleValue();
            Double orderCommissionAmt = orderAmount * rate;
            String txNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.TXNO_PRE_FLAG);
            //记账操作
            // 用户冻结账户CR:订单金额,商户可用账户DR:订单金额，商户可用账户CR:订单佣金，平台可用账户DR:订单佣金
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_FREZON, CommonConstans.ACDT_TX_WAY_CR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_PAYORDER);//用户冻结账户付款记账
            shopAccountProcess(txNo, shopId, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_DR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_PAYIN);//商户收款记账
            shopAccountProcess(txNo, shopId, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_CR, orderNo, orderCommissionAmt, CommonConstans.ACDT_TYPE_COMMISSION);//商户付佣金记账
            platAccountProcess(txNo, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_DR, orderNo, orderCommissionAmt, CommonConstans.ACDT_TYPE_COMMISSIONIN);//平台收佣金记账
        }

        baseReturnDto.setRetResult(true);
        return baseReturnDto;
    }


    /**
     * 派奖支付订单流水处理
     *
     * @return
     */
    public BaseReturnDto orderBonusPayAccountFlow(OrdOrderOP ordOrder) {
        BaseReturnDto baseReturnDto = new BaseReturnDto();
        if (ordOrder != null) {
            Long userId = ordOrder.getInitUserId();
            Long shopId = ordOrder.getDealShopId();
            String orderNo = ordOrder.getOrderNo();
            Double bonusAmount = ordOrder.getBonusAmt().doubleValue();
            String txNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.TXNO_PRE_FLAG);
            //记账操作
            // 商户支付账户CR:中奖金额，用户可提现账户DR:中奖金额
            shopAccountProcess(txNo, shopId, CommonConstans.ACCOUNT_TYPE_ID_WXPAY, CommonConstans.ACDT_TX_WAY_CR, orderNo, bonusAmount, CommonConstans.ACDT_TYPE_PAYBONUS);//商户派奖付款记账
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_DR, orderNo, bonusAmount, CommonConstans.ACDT_TYPE_BONUSIN);//用户收奖记账
        }

        baseReturnDto.setRetResult(true);
        return baseReturnDto;
    }


    /**
     * 撤单订单记账
     *
     * @param ordOrder
     * @return
     */
    public BaseReturnDto orderRejectAccountFlow(OrdOrderOP ordOrder) {
        BaseReturnDto baseReturnDto = new BaseReturnDto();
        if (ordOrder != null) {
            Long userId = ordOrder.getInitUserId();
            String orderNo = ordOrder.getOrderNo();
            Double orderAmount = ordOrder.getOrderPrice().doubleValue();
            String txNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.TXNO_PRE_FLAG);
            //记账操作
            //用户冻结账户CR:订单金额，用户可提现账户DR:订单金额
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_FREZON, CommonConstans.ACDT_TX_WAY_CR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_REJET);//用户冻结账户扣除
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_DR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_REJET);//用户余额账户增加
        }

        baseReturnDto.setRetResult(true);
        return baseReturnDto;
    }


    /**
     * 用户提现订单记账
     * @return
     */
    public BaseReturnDto userWithdrawAccountFlow(AccWithdrawOrder withdrawOrder){
        BaseReturnDto baseReturnDto = new BaseReturnDto();
        if(withdrawOrder!=null){
            Long userId = withdrawOrder.getUserId();
            String orderNo = withdrawOrder.getWithdrawOrderNo();
            Double orderAmount = withdrawOrder.getWithdrawAmt().doubleValue();
            String txNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.TXNO_PRE_FLAG);

            //记账操作
            //用户余额账户CR:提现金额，用户冻结账户DR:提现金额
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_CR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_WITHDRAW);//用户余额账户扣除
            userAccountProcess(txNo, userId, CommonConstans.ACCOUNT_TYPE_ID_FREZON, CommonConstans.ACDT_TX_WAY_DR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_WITHDRAW);//用户冻结账户增加
        }
        baseReturnDto.setRetResult(true);
        return baseReturnDto;
    }


    /**
     * 商户提现订单记账
     * @return
     */
    public BaseReturnDto shopWithdrawAccountFlow(AccWithdrawOrder withdrawOrder){
        BaseReturnDto baseReturnDto = new BaseReturnDto();
        if(withdrawOrder!=null){
            Long shopId = withdrawOrder.getShopId();
            String orderNo = withdrawOrder.getWithdrawOrderNo();
            Double orderAmount = withdrawOrder.getWithdrawAmt().doubleValue();
            String txNo = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.TXNO_PRE_FLAG);

            //记账操作
            //用户余额账户CR:提现金额，用户冻结账户DR:提现金额
            shopAccountProcess(txNo, shopId, CommonConstans.ACCOUNT_TYPE_ID_BALANCE, CommonConstans.ACDT_TX_WAY_CR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_WITHDRAW);//商户余额账户扣除
            shopAccountProcess(txNo, shopId, CommonConstans.ACCOUNT_TYPE_ID_FREZON, CommonConstans.ACDT_TX_WAY_DR, orderNo, orderAmount, CommonConstans.ACDT_TYPE_WITHDRAW);//商户冻结账户增加
        }
        baseReturnDto.setRetResult(true);
        return baseReturnDto;
    }


    /**
     * 用户账户操作
     *
     * @return
     */
    private int userAccountProcess(String txNo, Long userId, Long accountTypeId, String way, String orderNo, Double amount, String acdtType) {
        int retInt = 0;
        //1.用户支付账户扣款
        AccUserAccount accUserAccount = accUserAccountOPMapper.selectByUserIdAndAccType(userId, accountTypeId);
        if (accUserAccount != null) {
            BigDecimal oldAmountDec = accUserAccount.getAmount();
            Double oldAmt = oldAmountDec == null ? 0 : oldAmountDec.doubleValue();
            Double newAmt = CommonConstans.ACDT_TX_WAY_DR.equals(way) ? (oldAmt + amount) : (oldAmt - amount);
            accUserAccount.setAmount(new BigDecimal(newAmt));
            accUserAccountMapper.updateByPrimaryKey(accUserAccount);
            //2.用户支付账户扣款流水记录
            retInt = createUserAccountFlow(txNo, accUserAccount.getUserAccountId(), amount, orderNo, way, CommonConstans.ACDT_STS_FINISH, acdtType);
        }
        return retInt;
    }

    /**
     * 商户账户操作
     *
     * @return
     */
    private int shopAccountProcess(String txNo, Long shopId, Long accountTypeId, String way, String orderNo, Double amount, String acdtType) {
        //1.商户账户收款
        int retInt = 0;
        AccShopAccount accShopAccount = accShopAccountOPMapper.selectByShopIdAndAccountTypeId(shopId, accountTypeId);
        if (accShopAccount != null) {
            BigDecimal oldAmountDec = accShopAccount.getAmount();
            Double oldAmt = oldAmountDec == null ? 0 : oldAmountDec.doubleValue();
            Double newAmt = CommonConstans.ACDT_TX_WAY_DR.equals(way) ? (oldAmt + amount) : (oldAmt - amount);
            accShopAccount.setAmount(new BigDecimal(newAmt));
            accShopAccountMapper.updateByPrimaryKey(accShopAccount);
            //2.商户账户收款流水记录
            retInt = createShopAccountFlow(txNo, accShopAccount.getShopAccountId(), amount, orderNo, way, CommonConstans.ACDT_STS_FINISH, acdtType);
        }
        return retInt;

    }

    /**
     * 平台账户操作
     *
     * @return
     */
    private int platAccountProcess(String txNo, Long accountTypeId, String way, String orderNo, Double amount, String acdtType) {
        int retInt = 0;
        //1.平台账户收款
        AccPlatAccountExample platAccountExample = new AccPlatAccountExample();
        platAccountExample.createCriteria().andAccountTypeIdEqualTo(accountTypeId);
        List<AccPlatAccount> accPlatAccountList = accPlatAccountMapper.selectByExample(platAccountExample);
        if (!JBUtil.isListEmpty(accPlatAccountList)) {
            AccPlatAccount accPlatAccount = accPlatAccountList.get(0);
            if (accPlatAccount != null) {
                BigDecimal oldAmountDec = accPlatAccount.getAmount();
                Double oldAmt = oldAmountDec == null ? 0 : oldAmountDec.doubleValue();
                Double newAmt = CommonConstans.ACDT_TX_WAY_DR.equals(way) ? (oldAmt + amount) : (oldAmt - amount);
                accPlatAccount.setAmount(new BigDecimal(newAmt));
                accPlatAccountMapper.updateByPrimaryKey(accPlatAccount);
                //2.平台账户收款流水记录
                retInt = createPlatAccountFlow(txNo, accPlatAccount.getPlatAccountId(), amount, orderNo, way, CommonConstans.ACDT_STS_FINISH, acdtType);
            }

        }
        return retInt;

    }

    /**
     * 新增用户交易流水记录
     *
     * @return
     */
    private int createUserAccountFlow(String txNo, Long userAccountId, Double amount, String orderNo, String way, String acdtSts, String type) {
        AccUserAcdt accUserAcdt = new AccUserAcdt();
        accUserAcdt.setTxNo(txNo);
        accUserAcdt.setUserAccountId(userAccountId);
        accUserAcdt.setTxAmount(BigDecimal.valueOf(amount));
        accUserAcdt.setTxOrderNo(orderNo);
        accUserAcdt.setTxWay(way);
        accUserAcdt.setTxTime(new Date());
        accUserAcdt.setAcdtSts(acdtSts);
        accUserAcdt.setAcdtDesc(buildAcdtDescByType(type, orderNo, way, amount));
        accUserAcdt.setAcdtType(type);
        return accUserAcdtMapper.insert(accUserAcdt);
    }

    /**
     * 新增商户交易流水记录
     *
     * @return
     */
    private int createShopAccountFlow(String txNo, Long shopAccountId, Double amount, String orderNo, String way, String acdtSts, String type) {
        AccShopAcdt accShopAcdt = new AccShopAcdt();
        accShopAcdt.setTxNo(txNo);
        accShopAcdt.setShopAccountId(shopAccountId);
        accShopAcdt.setTxAmount(BigDecimal.valueOf(amount));
        accShopAcdt.setTxOrderNo(orderNo);
        accShopAcdt.setTxWay(way);
        accShopAcdt.setTxTime(new Date());
        accShopAcdt.setAcdtSts(acdtSts);
        accShopAcdt.setAcdtDesc(buildAcdtDescByType(type, orderNo, way, amount));
        accShopAcdt.setAcdtType(type);
        return accShopAcdtMapper.insert(accShopAcdt);
    }

    /**
     * 新增平台交易流水记录
     *
     * @return
     */
    private int createPlatAccountFlow(String txNo, Long platAccountId, Double amount, String orderNo, String way, String acdtSts, String type) {
        AccPlatAcdt accPlatAcdt = new AccPlatAcdt();
        accPlatAcdt.setTxNo(txNo);
        accPlatAcdt.setPlatAccountId(platAccountId);
        accPlatAcdt.setTxAmount(BigDecimal.valueOf(amount));
        accPlatAcdt.setTxOrderNo(orderNo);
        accPlatAcdt.setTxWay(way);
        accPlatAcdt.setTxTime(new Date());
        accPlatAcdt.setAcdtSts(acdtSts);
        accPlatAcdt.setAcdtDesc(buildAcdtDescByType(type, orderNo, way, amount));
        accPlatAcdt.setAcdtType(type);
        return accPlatAcdtMapper.insert(accPlatAcdt);
    }

    /**
     * 根据type获取交易流水描述信息
     *
     * @return
     */
    public static String buildAcdtDescByType(String type, String orderNo, String way, Double amount) {
        String retStr = null;
        if (CommonConstans.ACDT_TYPE_CHARGE.equals(type)) {
            //充值
            retStr = "充值" + amount + "元，订单号:" + orderNo;
        } else if (CommonConstans.ACDT_TYPE_WITHDRAW.equals(type)) {
            //提现
            retStr = "提现" + amount + "元，订单号:" + orderNo;
        } else if (CommonConstans.ACDT_TYPE_PAYORDER.equals(type)) {
            //订单投注
            retStr = "投注" + amount + "元，订单号:" + orderNo;
        } else if (CommonConstans.ACDT_TYPE_BONUSIN.equals(type)) {
            //中奖
            retStr = "中奖" + amount + "元，订单号:" + orderNo;
        } else if (CommonConstans.ACDT_TYPE_PAYBONUS.equals(type)) {
            //派奖
            retStr = "派奖" + amount + "元，订单号:" + orderNo;
        } else if (CommonConstans.ACDT_TYPE_PAYIN.equals(type)) {
            //收单
            retStr = "收单" + amount + "元，订单号:" + orderNo;
        } else if (CommonConstans.ACDT_TYPE_COMMISSION.equals(type)) {
            //提现
            retStr = "佣金" + amount + "元，订单号:" + orderNo;
        } else if(CommonConstans.ACDT_TYPE_REJET.equals(type)){
            //撤单
            retStr = "撤单" + amount + "元，订单号:" + orderNo;
        }else if(CommonConstans.ACDT_TYPE_COMMISSIONIN.equals(type)){
            //佣金支出
            retStr = "佣金" + amount + "元，订单号:" + orderNo;
        }
        return retStr;
    }

}
