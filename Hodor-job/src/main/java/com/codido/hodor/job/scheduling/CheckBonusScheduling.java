package com.codido.hodor.job.scheduling;


import com.codido.hodor.bo.dto.OrderBonusReturnDto;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.job.bean.dto.BaseRetDto;
import com.codido.hodor.job.bean.dto.SendOrderToTerminalRetDto;
import com.codido.hodor.mapper.*;
import com.codido.hodor.ord.service.OrderService;
import com.codido.hodor.model.*;
import com.codido.hodor.ord.service.SendMessageService;
import com.codido.hodor.ord.service.TerminalTransportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 定时任务
 * cron表达式格式:
 * 1.Seconds Minutes Hours DayofMonth Month DayofWeek Year
 * 2.Seconds Minutes Hours DayofMonth Month DayofWeek
 * 顺序:
 * 秒（0~59）
 * 分钟（0~59）
 * 小时（0~23）
 * 天（月）（0~31，但是你需要考虑你月的天数）
 * 月（0~11）
 * 天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
 * 年份（1970－2099）
 * <p>
 * 注:其中每个元素可以是一个值(如6),一个连续区间(9-12),一个间隔时间(8-18/4)(/表示每隔4小时),一个列表(1,3,5),通配符。
 * 由于"月份中的日期"和"星期中的日期"这两个元素互斥的,必须要对其中一个设置?.
 */
@Component
public class CheckBonusScheduling {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(CheckBonusScheduling.class);

    /**
     * 订单DAO层
     */
    @Autowired
    private OrdOrderOPMapper ordOrderOPMapper;

    /**
     * 订单DAO层实例方法
     */
    @Autowired
    private OrdOrderMapper ordOrderMapper;

    /**
     * 订单退款DAO层实例
     */
    @Autowired
    private OrdRefundMapper ordRefundMapper;

    /**
     * 终端传输服务
     */
    @Autowired
    private TerminalTransportService terminalTransportService;

    /**
     * 订单处理bo
     */
    @Autowired
    private OrderService orderService;

    /**
     * 微信公众号service
     */
    @Autowired
    private SendMessageService sendMessageService;

    /**
     * 获取彩种实例OP
     */
    @Autowired
    private LotInstOPMapper lotInstOPMapper;

    /**
     * 彩种mapper
     */
    @Autowired
    private LotLottoOPMapper lotLottoOPMapper;

    /**
     * 用户OPENID查询
     */
    @Autowired
    private UsrOpenIdOPMapper usrOpenIdOPMapper;

    /**
     * 彩种mapper
     */
    @Autowired
    private LotLottoMapper lotLottoMapper;

    /**
     * 检查数字彩是否中奖的轮训
     */
    @Scheduled(cron = "30 0,10,20,30,40,50 8,9,14,20,21 * * ?")
    public void checkNumberLottoBonus() {
        logger.info("检查数字彩中奖情况轮训启动");
        //取所有未开奖的订单准备做循环
        String[] orderStsArr = new String[]{CommonConstans.ORDER_STS_A, CommonConstans.ORDER_STS_P, CommonConstans.ORDER_STS_I};//查询所有I,P,A的订单
        String[] lottoTypeArr = new String[]{CommonConstans.LOTTO_TYPE_FC_NUM, CommonConstans.LOTTO_TYPE_TC_NUM};//体彩数字型和福彩数字型
        List<OrdOrderOP> ordOrderList = ordOrderOPMapper.selectNeedBonusCheckOrder(orderStsArr, lottoTypeArr);
        if (!JBUtil.isListEmpty(ordOrderList)) {
            int ordOrderListSize = ordOrderList.size();
            for (int i = 0; i < ordOrderListSize; i++) {
                //每一笔订单看是否中奖
                OrdOrderOP ordOrder = ordOrderList.get(i);
                if ((ordOrder.getDealShopId() == null && (CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()) || CommonConstans.ORDER_STS_I.equals(ordOrder.getOrderSts())))
                        || (ordOrder.getDealShopId() != null && CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()))) {
                    //1.店铺ID为空，且状态为A或者I状态，这是极速选号订单，做中奖判断
                    //2.店铺ID不为空，且状态为A，这是彩士多正常已确认订单，做中奖判断
                    OrderBonusReturnDto orderBonusReturnDto = orderService.checkNumberLottoOrderBonus(ordOrder);//检查数字彩是否中奖
                    if (orderBonusReturnDto.getRetResult()) {
                        //处理成功
                        if (CommonConstans.ORDER_BONUS_STS_B.equals(orderBonusReturnDto.getBonusSts())) {
                            //已中奖
                            if (CommonConstans.ORDER_TICKET_STS_TAKED.equals(ordOrder.getOrderTicketReciveSts())) {
                                //如果是已取票订单，此时改为已中奖已兑奖
                                ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_S);//中奖状态为中奖已兑奖
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_S);//订单状态为已兑奖
                            } else {
                                ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_B);//中奖状态为中奖未付款
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_B);//订单状态为中奖
                            }
                            ordOrder.setReciveBonusStsTime(new Date());//中奖状态更新时间
                            ordOrder.setBonusAmt(orderBonusReturnDto.getBonusAmt());//中奖金额
                            //ordOrder.setReciveBonusTime();//开奖时间
                            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                            //发推送
                            sendMessageService.sendOrderBonusMsg(ordOrder);
                        } else {
                            //未中奖
                            ordOrder.setOrderSts(CommonConstans.ORDER_STS_B);//订单状态为已开奖
                            ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_N);//中奖状态为未中奖
                            ordOrder.setReciveBonusStsTime(new Date());//中奖状态更新时间
                            //ordOrder.setBonusAmt(0L);//中奖金额不填写
                            //ordOrder.setReciveBonusTime();//开奖时间
                            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                        }
                    } else {
                        //处理失败，暂时是不处理，下次重做，目前的情况可能是开奖结果没出来
                    }
                } else if (CommonConstans.ORDER_STS_P.equals(ordOrder.getOrderSts()) && ordOrder.getDealShopId() != null) {
                    //订单为已支付，且店铺ID不为空的，这是彩士多支付未处理订单，自动做撤销操作
                    orderService.rejectOrder(ordOrder);
                }
            }
        }
        logger.info("检查数字彩中奖情况轮训结束");
    }


    /**
     * 检查传统足彩中奖情况
     */
    @Scheduled(fixedDelay = 900000)//每隔15分钟执行一次
    public void checkTraditionSportLottoBonus() {
        logger.info("检查传统足彩中奖情况轮训启动");
        //取所有未开奖的订单准备做循环
        String[] orderStsArr = new String[]{CommonConstans.ORDER_STS_A, CommonConstans.ORDER_STS_P, CommonConstans.ORDER_STS_I};
        String[] lottoTypeArr = new String[]{CommonConstans.LOTTO_TYPE_TC_CT};//传统足彩
        List<OrdOrderOP> ordOrderList = ordOrderOPMapper.selectNeedBonusCheckOrder(orderStsArr, lottoTypeArr);
        if (!JBUtil.isListEmpty(ordOrderList)) {
            int ordOrderListSize = ordOrderList.size();
            for (int i = 0; i < ordOrderListSize; i++) {
                //每一笔订单看是否中奖
                OrdOrderOP ordOrder = ordOrderList.get(i);
                if ((ordOrder.getDealShopId() == null && (CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()) || CommonConstans.ORDER_STS_I.equals(ordOrder.getOrderSts())))
                        || (ordOrder.getDealShopId() != null && CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()))) {
                    //1.店铺ID为空并且状态为A或者I状态，这是极速选号订单，做中奖判断
                    //2.店铺ID不为空，且状态为A，这是彩士多正常已确认订单，做中奖判断
                    OrderBonusReturnDto orderBonusReturnDto = orderService.checkCtzcLottoOrderBonus(ordOrder);//查询传统足彩是否中奖
                    if (orderBonusReturnDto.getRetResult()) {
                        //处理成功
                        if (CommonConstans.ORDER_BONUS_STS_B.equals(orderBonusReturnDto.getBonusSts())) {
                            //已中奖
                            if (CommonConstans.ORDER_TICKET_STS_TAKED.equals(ordOrder.getOrderTicketReciveSts())) {
                                //如果是已取票订单，此时改为已中奖已兑奖
                                ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_S);//中奖状态为中奖已兑奖
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_S);//订单状态为中奖
                            } else {
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_B);//订单状态为中奖
                                ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_B);//中奖状态为中奖未付款
                            }
                            ordOrder.setReciveBonusStsTime(new Date());//中奖状态更新时间
                            ordOrder.setBonusAmt(orderBonusReturnDto.getBonusAmt());//中奖金额
                            //ordOrder.setReciveBonusTime();//开奖时间
                            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                            //发推送
                            sendMessageService.sendOrderBonusMsg(ordOrder);
                        } else {
                            //未中奖
                            ordOrder.setOrderSts(CommonConstans.ORDER_STS_B);//订单状态为已开奖
                            ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_N);//中奖状态为未中奖
                            ordOrder.setReciveBonusStsTime(new Date());//中奖状态更新时间
                            //ordOrder.setBonusAmt(0L);//中奖金额不填写
                            //ordOrder.setReciveBonusTime();//开奖时间
                            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                        }
                    } else {
                        //处理失败，暂时是不处理，下次重做，目前的情况可能是开奖结果没出来

                    }
                } else if (CommonConstans.ORDER_STS_P.equals(ordOrder.getOrderSts()) && ordOrder.getDealShopId() != null) {
                    //订单为已支付，且店铺ID不为空的，这是彩士多支付未处理订单，自动做撤销操作
                    orderService.rejectOrder(ordOrder);
                }
            }
        }
        logger.info("检查传统足彩中奖情况轮训结束");
    }


    /**
     * 检查竞彩中奖情况
     */
    @Scheduled(fixedDelay = 900000)//每隔15分钟执行一次
    public void checkCompeteSportLottoBonus() {
        logger.info("检查竞彩彩票中奖情况轮训启动");
        //1.遍历所有竞彩的已确认的订单
        String[] orderStsArr = new String[]{CommonConstans.ORDER_STS_A, CommonConstans.ORDER_STS_P, CommonConstans.ORDER_STS_I};
        String[] lottoTypeArr = new String[]{CommonConstans.LOTTO_TYPE_TC_JC};//竞彩
        List<OrdOrderOP> ordOrderList = ordOrderOPMapper.selectNeedBonusCheckOrder(orderStsArr, lottoTypeArr);
        if (!JBUtil.isListEmpty(ordOrderList)) {
            int ordOrderListSize = ordOrderList.size();
            for (int i = 0; i < ordOrderListSize; i++) {
                //每一笔订单看是否中奖的判断
                OrdOrderOP ordOrder = ordOrderList.get(i);
                if ((ordOrder.getDealShopId() == null && (CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()) || CommonConstans.ORDER_STS_I.equals(ordOrder.getOrderSts())))
                        || (ordOrder.getDealShopId() != null && CommonConstans.ORDER_STS_A.equals(ordOrder.getOrderSts()))) {
                    //以下两种情况要做中奖判断
                    //1.店铺ID为空并且状态为A或者I状态，这是极速选号订单，做中奖判断
                    //2.店铺ID不为空，且状态为A，这是彩士多正常已确认订单，做中奖判断
                    OrderBonusReturnDto orderBonusReturnDto = orderService.checkCompeteLottoOrderBonus(ordOrder);//查询传统足彩是否中奖
                    if (orderBonusReturnDto.getRetResult()) {
                        //处理成功
                        if (CommonConstans.ORDER_BONUS_STS_B.equals(orderBonusReturnDto.getBonusSts())) {
                            //已中奖
                            if (CommonConstans.ORDER_TICKET_STS_TAKED.equals(ordOrder.getOrderTicketReciveSts())) {
                                //如果是已取票订单，此时改为已中奖已兑奖
                                ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_S);//中奖状态为中奖已兑奖
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_S);//订单状态为中奖
                            } else {
                                ordOrder.setOrderSts(CommonConstans.ORDER_STS_B);//订单状态为中奖
                                ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_B);//中奖状态为中奖未付款
                            }
                            ordOrder.setReciveBonusStsTime(new Date());//中奖状态更新时间
                            ordOrder.setBonusAmt(orderBonusReturnDto.getBonusAmt());//中奖金额
                            //ordOrder.setReciveBonusTime();//开奖时间
                            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                            //发推送
                            sendMessageService.sendOrderBonusMsg(ordOrder);
                        } else {
                            //未中奖
                            ordOrder.setOrderSts(CommonConstans.ORDER_STS_B);//订单状态为已开奖
                            ordOrder.setBonusSts(CommonConstans.ORDER_BONUS_STS_N);//中奖状态为未中奖
                            ordOrder.setReciveBonusStsTime(new Date());//中奖状态更新时间
                            //ordOrder.setBonusAmt(0L);//中奖金额不填写
                            //ordOrder.setReciveBonusTime();//开奖时间
                            ordOrderOPMapper.updateByPrimaryKey(ordOrder);
                        }
                    } else {
                        //处理失败，暂时是不处理，下次重做，目前的情况可能是有些比赛结果没出来
                        logger.info("检查竞彩彩票中奖情况:单笔中奖情况判断失败，说明有一些比赛的结果还没出来");
                    }
                } else if (CommonConstans.ORDER_STS_P.equals(ordOrder.getOrderSts()) && ordOrder.getDealShopId() != null) {
                    //订单为已支付，且店铺ID不为空的，这是彩士多支付未处理订单，自动做撤销操作
                    orderService.rejectOrder(ordOrder);
                }
            }
        }
        logger.info("检查竞彩彩票情况轮训结束");
    }


    /**
     * 用户订阅的开奖情况发送
     */
    @Scheduled(cron = "30 0,10,20,30,40,50 8,9,10,11,14,15,20,21 * * ?")
    public void sendUserLottoBonus() {
        logger.info("检查用户订阅情况轮训启动");
        List<LotLotto> lotLottoList = lotLottoOPMapper.selectAll();
        if (!JBUtil.isListEmpty(lotLottoList)) {
            int lotLottoListSize = lotLottoList.size();
            for (int i = 0; i < lotLottoListSize; i++) {
                LotLotto lotLotto = lotLottoList.get(i);
                if (lotLotto != null) {
                    //找到最新一期的实例
                    LotInst lastLotInst = lotInstOPMapper.selectLastLottoInstWithLotto(lotLotto.getLottoId());
                    if (lastLotInst != null) {
                        if (lastLotInst.getLottoInstId().longValue() != lotLotto.getLastLottoInstId()) {
                            //如果找到两个值不相等，说明现在开了新一期，准备给订阅的用户发推送了
                            sendUserSubscriberLottoInst(lastLotInst, lotLotto);
                        }
                    }
                }
            }
        }
        logger.info("检查用户订阅情况轮训结束");
    }

    /**
     * 给某一期所有订阅了的用户发推送
     *
     * @param lotInst
     * @param lotLotto
     * @return
     */
    public BaseRetDto sendUserSubscriberLottoInst(LotInst lotInst, LotLotto lotLotto) {
        BaseRetDto baseRetDto = new BaseRetDto();
        //支持多种渠道
        //List<UsrOpenId> usrOpenIdList = usrOpenIdOPMapper.selectBySubscriberUserLottoInstId(lotInst.getLottoInstId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        String[] userChannels = new String[]{CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP, CommonConstans.COMMON_CHANNEL_ZDJL_MP};
        List<UsrOpenId> usrOpenIdList = usrOpenIdOPMapper.selectBySubscriberUserLottoInstId(lotInst.getLottoInstId(), userChannels);
        if (!JBUtil.isListEmpty(usrOpenIdList)) {
            int usrOpenIdListSize = usrOpenIdList.size();
            for (int i = 0; i < usrOpenIdListSize; i++) {
                UsrOpenId usrOpenId = usrOpenIdList.get(i);
                if (usrOpenId != null) {
                    //发送推送给用户
                    sendMessageService.sendLottoBonusMsg(usrOpenId.getUserId(), usrOpenId.getWxOpenId(), lotLotto.getLottoName(), lotInst.getPeriodName(), lotInst.getPeriodBonusTime(), lotInst.getPeriodBonusNumber(), usrOpenId.getWxAppType());
                }
            }
            //循环完成，更新最新的lottoInstId到lotLotto表
            lotLotto.setLastLottoInstId(lotInst.getLottoInstId());
            lotLottoMapper.updateByPrimaryKey(lotLotto);
        }

        baseRetDto.setHandlerResult(true);
        return baseRetDto;
    }

    /**
     * 订单过期未支付的处理-->1小时后，将订单置为失效
     */
    @Scheduled(fixedDelay = 600000)
    public void processOrderNotPayJob() {
        logger.info("检查未支付过期的订单情况轮训启动");
        //订单过期未支付的处理，改为失效
        ordOrderOPMapper.updateOutOfTimePayOrder();
        logger.info("检查未支付过期的订单情况轮训结束");
    }


    /**
     * 送给终端的订单补偿，两分钟一次
     */
    @Scheduled(fixedDelay = 120000)
    public void processOrderSendTerminal() {
        logger.info("补充发送给终端的订单轮训开始");
        //查询所有中大奖了的付款了未出票的订单
        OrdOrderExample ordOrderExample = new OrdOrderExample();
        ordOrderExample.createCriteria().andOrderStsEqualTo(CommonConstans.ORDER_STS_P).andOrderChannelEqualTo(CommonConstans.COMMON_CHANNEL_ZDJL_MP).andOrderSourceEqualTo(CommonConstans.ORDER_SOURCE_AUTOTAKE);

        List<OrdOrder> ordOrderList = ordOrderMapper.selectByExample(ordOrderExample);
        if (!JBUtil.isListEmpty(ordOrderList)) {
            for (OrdOrder ordOrder : ordOrderList) {
                if (ordOrder != null) {
                    //送到终端后台去
                    SendOrderToTerminalRetDto sendOrderToTerminalRetDto = terminalTransportService.sendOrderToTerminal(ordOrder);
                    if (sendOrderToTerminalRetDto.isHandlerResult()) {
                        //如果处理成功则做确认订单的处理
                        ensureOrderAfterOrderTransTerminal(ordOrder, sendOrderToTerminalRetDto.getOrderTicketUrl());
                    }
                }
            }
        }
        logger.info("补充发送给终端的订单轮训结束");
    }

    /**
     * 通知了终端订单信息后，做订单确认的操作
     *
     * @param ordOrder
     * @param imgUrl
     */
    private void ensureOrderAfterOrderTransTerminal(OrdOrder ordOrder, String imgUrl) {
        Date currentDate = new Date();
        ordOrder.setOrderTicketPic(imgUrl);//图片
        ordOrder.setTicketUploadSts(CommonConstans.COMMON_STS_VALID);//已上传
        ordOrder.setTicketUploadTime(currentDate);
        ordOrder.setOrderSts(CommonConstans.ORDER_STS_W);//预约订单待开奖
        ordOrderMapper.updateByPrimaryKey(ordOrder);

        //预约订单发消息处理
        sendMessageService.sendPaysuccessSaveOrderMsg(ordOrder);
    }


    /**
     * 更新退款状态的轮训，五分钟一次
     */
    @Scheduled(fixedDelay = 300000)
    public void processRefundQuery() {
        logger.info("更新退款状态轮训开始");
        //查询所有中大奖了的付款了未出票的订单
        OrdRefundExample ordRefundExample = new OrdRefundExample();
        ordRefundExample.createCriteria().andRefundStsEqualTo(CommonConstans.ORDER_STS_P);//所有未处理的退款单

        List<OrdRefund> ordRefundList = ordRefundMapper.selectByExample(ordRefundExample);
        if (!JBUtil.isListEmpty(ordRefundList)) {
            for (OrdRefund ordRefund : ordRefundList) {
                if (ordRefund != null) {
                    //查询微信的订单状态并更新
                    orderService.syncWxRefundSts(ordRefund);
                }
            }
        }
        logger.info("更新退款状态轮训结束");
    }

}
