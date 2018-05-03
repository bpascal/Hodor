package com.codido.hodor.ord.service;

import com.codido.hodor.common.bean.dto.BaseRetDto;
import com.codido.hodor.common.config.EvnConfig;
import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.mapper.*;
import com.codido.hodor.model.*;
import com.codido.hodor.weixin.service.WxCsdMpService;
import com.codido.hodor.weixin.service.WxZdjlMpService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 发送微信消息的service
 */
@Service
public class SendMessageService {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(SendMessageService.class);

    /**
     * 彩士多公众号服务对象
     */
    @Autowired
    private WxCsdMpService wxCsdMpService;

    /**
     * 中大奖了公众号服务对象
     */
    @Autowired
    private WxZdjlMpService wxZdjlMpService;

    /**
     * 用户openid
     */
    @Autowired
    private UsrOpenIdOPMapper usrOpenIdOPMapper;

    /**
     * 用户信息mapper
     */
    @Autowired
    private UsrUserMapper usrUserMapper;

    /**
     * 彩种信息mapper
     */
    @Autowired
    private LotInstOPMapper lotInstOPMapper;

    /**
     * 获取商户信息mapper
     */
    @Autowired
    private ShpShopMapper shpShopMapper;

    /**
     * 用户message
     */
    @Autowired
    private UsrMsgMapper usrMsgMapper;

    /**
     * 环境信息
     */
    @Autowired
    private EvnConfig evnConfig;

    /**
     * 给店主发送用户支付完成订单提交过来的消息推送
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendOrderPayMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectShopOwnerOpenIdByShopId(ordOrder.getDealShopId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectShopOwnerOpenIdByShopId(ordOrder.getDealShopId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        UsrUser usrUser = usrUserMapper.selectByPrimaryKey(ordOrder.getInitUserId());
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "待出票通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("用户").append(usrUser.getUserNickname()).append("购买").append(lotInstWithLotto.getLotLotto().getLottoName()).append(lotInstWithLotto.getPeriodName()).append("期，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，已付款，请及时出票");//用户$购买的$|$期，订单金额$元，已付款，请及时出票
        String content = stringBuffer.toString();
        String tips = "请在开奖前完成出票，并拍照上传彩票照片。";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "您有一个新的彩票订单待出票，请及时处理");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", lotInstWithLotto.getLotLotto().getLottoName() + lotInstWithLotto.getPeriodName() + "期");
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", ordOrder.getOrderPrice().toString() + "元");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("keyword3", "共" + ordOrder.getOrderTotalBetsCount() + "注，倍投" + ordOrder.getBetTimes() + "倍");
        wxMpTemplateDataList.add(data4);
        WxMpTemplateData data5 = new WxMpTemplateData("keyword4", "下单用户|" + usrUser.getUserNickname());
        wxMpTemplateDataList.add(data5);
        WxMpTemplateData data6 = new WxMpTemplateData("keyword5", "已付款");
        wxMpTemplateDataList.add(data6);
        WxMpTemplateData data7 = new WxMpTemplateData("remark", tips);
        wxMpTemplateDataList.add(data7);


        String templateId = "";//模板ID
        String contextUrl = evnConfig.getUrlRequestContext();//context地址
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(ordOrder.getOrderChannel())) {
            //彩士多公众号
            templateId = CommonConstans.WX_MSG_TEMPLATE_ID_ORDERIN;
            contextUrl = evnConfig.getUrlRequestContext();
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(ordOrder.getOrderChannel())) {
            //中大奖了公众号
            templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_ORDERIN;
            contextUrl = evnConfig.getZdjlrequestpath();
        }

        String url = contextUrl + CommonConstans.SHOP_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(ordOrder.getInitUserId(), usrOpenId.getUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERIN);
        return retDto;
    }

    /**
     * 给用户发送店主确认订单完成的消息推送
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendEnsureOrderMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        //UsrUser usrUser = usrUserMapper.selectByPrimaryKey(ordOrder.getInitUserId());
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "出票通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append(lotInstWithLotto.getPeriodName()).append("期，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，彩店已出票，请及时查看");//您购买的$|$期，订单金额$元，彩店已出票，请及时查看
        String content = stringBuffer.toString();
        String tips = "请及时查看";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "恭喜您！您购买的彩票订单已经出票，请及时查看，祝您中大奖");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", lotInstWithLotto.getPeriodName() + "期");
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", ordOrder.getOrderPrice().toString() + "元");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("keyword3", JBDateUtil.transDate2String(ordOrder.getOrderCreateTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        wxMpTemplateDataList.add(data4);
        String bonusTime = genrLottoBonusTime(lotInstWithLotto);//计算彩种开奖时间
        WxMpTemplateData data5 = new WxMpTemplateData("keyword4", bonusTime);
        wxMpTemplateDataList.add(data5);
        WxMpTemplateData data6 = new WxMpTemplateData("keyword5", "共" + ordOrder.getOrderTotalBetsCount() + "注，投注" + ordOrder.getBetTimes() + "倍");
        wxMpTemplateDataList.add(data6);
        WxMpTemplateData data7 = new WxMpTemplateData("remark", "前往详情页面查看投注详情，如有疑问请及时与彩票投注站联系");
        wxMpTemplateDataList.add(data7);

        String templateId = "";//模板ID
        String contextUrl = evnConfig.getUrlRequestContext();//context地址
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(ordOrder.getOrderChannel())) {
            //彩士多公众号
            templateId = CommonConstans.WX_MSG_TEMPLATE_ID_ORDERENSURE;
            contextUrl = evnConfig.getUrlRequestContext();
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(ordOrder.getOrderChannel())) {
            //中大奖了公众号
            templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_ORDERENSURE;
            contextUrl = evnConfig.getZdjlrequestpath();
        }

        String url = contextUrl + CommonConstans.USER_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(ordOrder.getDealShopId(), ordOrder.getInitUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERPROCESS);
        return retDto;
    }


    /**
     * 给用户发送店铺撤销订单的消息推送
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendOrderRejectMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        ShpShop shpShop = shpShopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "撤单通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append(lotInstWithLotto.getPeriodName()).append("期，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，彩店已撤单，请及时查看");//您购买的$|$期，订单金额$元，彩店已撤单，请及时查看
        String content = stringBuffer.toString();
        String tips = "购彩资金将直接退回至您的余额账户，请您放心";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "很抱歉！您购买的彩票订单因故撤销，未能出票，请及时查看");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", "撤单用户|" + shpShop.getShopName());
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", ordOrder.getOrderPrice().toString() + "元");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("keyword3", lotInstWithLotto.getPeriodName() + "期");
        wxMpTemplateDataList.add(data4);
        WxMpTemplateData data5 = new WxMpTemplateData("keyword4", JBDateUtil.transDate2String(ordOrder.getOrderCreateTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        wxMpTemplateDataList.add(data5);
        WxMpTemplateData data7 = new WxMpTemplateData("remark", tips);
        wxMpTemplateDataList.add(data7);


        String templateId = "";//模板ID
        String contextUrl = evnConfig.getUrlRequestContext();//context地址
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(ordOrder.getOrderChannel())) {
            //彩士多公众号
            templateId = CommonConstans.WX_MSG_TEMPLATE_ID_REJECTORDER;
            contextUrl = evnConfig.getUrlRequestContext();//context地址
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(ordOrder.getOrderChannel())) {
            //中大奖了公众号
            templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_REJECTORDER;
            contextUrl = evnConfig.getZdjlrequestpath();//context地址
        }

        String url = contextUrl + CommonConstans.USER_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(ordOrder.getDealShopId(), ordOrder.getInitUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERREJECT);
        return retDto;
    }


    /**
     * 给用户发送订单取票的消息推送
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendOrderTakeTicketMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        ShpShop shpShop = shpShopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "取票完成通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append(lotInstWithLotto.getPeriodName()).append("期，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，彩票已取走，请及时查看");//您购买的$|$期，订单金额$元，彩店已撤单，请及时查看
        String content = stringBuffer.toString();
        String tips = "取走彩票由用户自行兑奖，请您妥善保管，如有疑问请及时与彩票投注站联系";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "您的彩票已经出票取走，请及时查看");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", shpShop.getShopName());
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", lotInstWithLotto.getLotLotto().getLottoName() + lotInstWithLotto.getPeriodName() + "期");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("keyword3", ordOrder.getOrderPrice().toString() + "元");
        wxMpTemplateDataList.add(data4);
        WxMpTemplateData data5 = new WxMpTemplateData("keyword4", JBDateUtil.transDate2String(ordOrder.getOrderTicketReciveTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        wxMpTemplateDataList.add(data5);
        WxMpTemplateData data7 = new WxMpTemplateData("remark", tips);
        wxMpTemplateDataList.add(data7);


        String templateId = "";//模板ID
        String contextUrl = evnConfig.getUrlRequestContext();//context地址
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(ordOrder.getOrderChannel())) {
            //彩士多公众号
            templateId = CommonConstans.WX_MSG_TEMPLATE_ID_TAKETICKET;
            contextUrl = evnConfig.getUrlRequestContext();//context地址
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(ordOrder.getOrderChannel())) {
            //中大奖了公众号
            templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_TAKETICKET;
            contextUrl = evnConfig.getZdjlrequestpath();//context地址
        }

        String url = contextUrl + CommonConstans.USER_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(ordOrder.getDealShopId(), ordOrder.getInitUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERTAKETICKET);
        return retDto;
    }


    /**
     * 给用户发送订单确认及取票的消息推送
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendAutoOrderEnsureAndTakeTicketMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        ShpShop shpShop = shpShopMapper.selectByPrimaryKey(ordOrder.getDealShopId());
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "出票结果通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append("，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，彩票已取走，请及时查看");//您购买的$|$期，订单金额$元，彩店已撤单，请及时查看
        String content = stringBuffer.toString();
        String tips = "前往详情页面查看投注详情，如有疑问请及时通过公众号下方对话框与我们联系。";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "恭喜您！您兑换的取票码已经成功投注彩票，请及时关注中奖信息。");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", lotInstWithLotto.getPeriodName() + "期");
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", ordOrder.getOrderPrice().toString() + "元");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("keyword3", JBDateUtil.transDate2String(ordOrder.getOrderCreateTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        wxMpTemplateDataList.add(data4);
        String bonusTime = genrLottoBonusTime(lotInstWithLotto);//计算彩种开奖时间
        WxMpTemplateData data5 = new WxMpTemplateData("keyword4", bonusTime);
        wxMpTemplateDataList.add(data5);
        WxMpTemplateData data6 = new WxMpTemplateData("keyword5", "共" + ordOrder.getOrderTotalBetsCount() + "注，投注" + ordOrder.getBetTimes() + "倍");
        wxMpTemplateDataList.add(data6);
        WxMpTemplateData data7 = new WxMpTemplateData("remark", "前往详情页面查看投注详情，如有疑问请及时通过公众号下方对话框与我们联系。");
        wxMpTemplateDataList.add(data7);

        String templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_ORDERENSURE;//模板ID
        String contextUrl = evnConfig.getZdjlrequestpath();//context地址

        String url = contextUrl + CommonConstans.USER_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(ordOrder.getDealShopId(), ordOrder.getInitUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERTAKETICKET);
        return retDto;
    }

    /**
     * 给用户发送预约成功的通知
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendPaysuccessSaveOrderMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        //UsrUser usrUser = usrUserMapper.selectByPrimaryKey(ordOrder.getInitUserId());
        ShpShop shpShop = shpShopMapper.selectByPrimaryKey(ordOrder.getDealShopId());

        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "出票通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append("，取票码已生成，请及时前往智能售彩终端上取票完成投注。");
        String content = stringBuffer.toString();
        String tips = "请及时查看";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "您好，您的取票码已生成，请及时前往智能售彩终端上取票完成投注。");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", shpShop.getShopName());//站点
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", "点击订单详情，查看取票二维码");//取票码
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData remark = new WxMpTemplateData("remark", "请在七日内在智能售彩终端上取票。");
        wxMpTemplateDataList.add(remark);

        //模板ID
        String templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_GENEDTICKET;

        String url = evnConfig.getZdjlrequestpath() + CommonConstans.USER_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(ordOrder.getDealShopId(), ordOrder.getInitUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERPROCESS);
        return retDto;
    }

    /**
     * 发送消息方法
     *
     * @param openId
     * @param templateId
     * @param wxMpTemplateDataList
     * @return
     */
    private BaseRetDto sendMessage(String openId, String templateId, String url, List<WxMpTemplateData> wxMpTemplateDataList, String channelFlag) {
        BaseRetDto retDto = new BaseRetDto();
        WxMpTemplateMessage wxMpTemplateMessage = WxMpTemplateMessage.builder().toUser(openId).templateId(templateId).url(url).data(wxMpTemplateDataList).build();
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        try {
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                //彩士多推送
                wxCsdMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                //中大奖了推送
                wxZdjlMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
            }
            retDto.setHandlerResult(true);
            logger.info("sendMessage成功");
        } catch (WxErrorException e) {
            e.printStackTrace();
            retDto.setHandlerResult(false);
            logger.info("sendMessage异常了:" + e.getMessage());
        }
        return retDto;
    }

    /**
     * 保存用户推送的消息
     *
     * @param fromUserId
     * @param toUserId
     * @param title
     * @param content
     * @return
     */
    private BaseRetDto saveMessageRecord(Long fromUserId, Long toUserId, String title, String content, String url, String msgType) {
        BaseRetDto retDto = new BaseRetDto();
        UsrMsg usrMsg = new UsrMsg();
        usrMsg.setFromUserId(fromUserId);
        usrMsg.setToUserId(toUserId);
        usrMsg.setMsgTitle(title);
        usrMsg.setMsgInfo(content);
        usrMsg.setMsgJumpUrl(url);
        usrMsg.setMsgTime(new Date());
        usrMsg.setMsgSts(CommonConstans.USER_MSG_STS_INIT);//初始状态
        usrMsg.setMsgType(msgType);
        usrMsgMapper.insert(usrMsg);
        retDto.setHandlerResult(true);
        return retDto;
    }

    /**
     * 根据彩种实例计算彩种的开奖时间
     *
     * @param lotInst
     * @return
     */
    private String genrLottoBonusTime(LotInstWithLotto lotInst) {
        String retStr = "";
        if (CommonConstans.LOTTO_INST_STS_RECOMMOND.equals(lotInst.getPeriodSts())) {
            //在售状态，目前取结束时间，这个地方可优化
            String dateStr = JBDateUtil.transDate2String(lotInst.getPeriodEndTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd);
            String timeStr = " 21:15:00";
            if (CommonConstans.LOTTO_TYPE_FC_NUM.equals(lotInst.getLotLotto().getLottoType())) {
                //福彩数字彩
                timeStr = " 21:15:00";
            } else if (CommonConstans.LOTTO_TYPE_TC_NUM.equals(lotInst.getLotLotto().getLottoType())) {
                //体彩数字彩
                timeStr = " 20:30:00";
            }
            retStr = dateStr + timeStr;
        } else {
            retStr = JBDateUtil.transDate2String(lotInst.getPeriodBonusTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        }
        return retStr;
    }
}
