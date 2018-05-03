package com.codido.hodor.ord.service;

import com.codido.hodor.common.constans.CommonConstans;
import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.common.util.JBUtil;
import com.codido.hodor.job.bean.dto.BaseRetDto;
import com.codido.hodor.job.config.EvnConfig;
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
     * 给用户发送中奖结果通知
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendOrderBonusMsg(OrdOrderOP ordOrder) {
        //组装和查询数据
        //UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), CommonConstans.WX_APP_TYPE_LOTTOSTORE);
        UsrOpenId usrOpenId = usrOpenIdOPMapper.selectByUserId(ordOrder.getInitUserId(), ordOrder.getOrderChannel());
        LotInstWithLotto lotInstWithLotto = lotInstOPMapper.selectLottoInstWithLottoByKey(ordOrder.getLottoInstId());
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        String title = "开奖结果通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append(lotInstWithLotto.getPeriodName()).append("期，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，恭喜中奖，请及时查看");//您购买的$|$期，订单金额$元，恭喜中奖，请及时查看
        String content = stringBuffer.toString();

        WxMpTemplateData data1 = new WxMpTemplateData("result", "恭喜您，中奖啦！");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("totalWinMoney", "中奖" + ordOrder.getBonusAmt() + "元");
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("issueInfo", lotInstWithLotto.getPeriodName() + "期");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("fee", ordOrder.getOrderPrice().toString() + "元");
        wxMpTemplateDataList.add(data4);
        WxMpTemplateData data5 = new WxMpTemplateData("betTime", JBDateUtil.transDate2String(ordOrder.getOrderCreateTime(), "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        wxMpTemplateDataList.add(data5);



        String templateId = "";//模板ID
        String contextUrl = evnConfig.getUrlRequestContext();//context地址
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(ordOrder.getOrderChannel())) {
            //彩士多公众号
            templateId = CommonConstans.WX_MSG_TEMPLATE_ID_ORDERBONUS;
            contextUrl = evnConfig.getUrlRequestContext();//context地址
            String tips = "奖金将由彩票投注站在48小时内给你兑付，请稍候领取，如有疑问请及时与彩票投注站联系";
            WxMpTemplateData data7 = new WxMpTemplateData("remark", tips);
            wxMpTemplateDataList.add(data7);
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(ordOrder.getOrderChannel())) {
            //中大奖了公众号
            templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_ORDERBONUS;
            contextUrl = evnConfig.getZdjlrequestpath();//context地址
            String tips = "前往详情页面查看中奖详情，如有疑问请及时通过公众号下方对话框与我们联系";
            WxMpTemplateData data7 = new WxMpTemplateData("remark", tips);
            wxMpTemplateDataList.add(data7);
        }

        String url = contextUrl + CommonConstans.SHOP_ORDERDETAIL_URL + ordOrder.getOrderNo();
        BaseRetDto retDto = sendMessage(usrOpenId.getWxOpenId(), templateId, url, wxMpTemplateDataList, ordOrder.getOrderChannel());
        saveMessageRecord(0L, ordOrder.getInitUserId(), title, content, url, CommonConstans.MSG_TYPE_ORDERBONUS);
        return retDto;
    }


    /**
     * 给用户发送订阅的彩票开奖结果通知
     *
     * @param userId
     * @param openId
     * @param lottoName
     * @param lottoInstName
     * @param bonusTime
     * @param bonusNumbers
     * @return
     */
    public BaseRetDto sendLottoBonusMsg(Long userId, String openId, String lottoName, String lottoInstName, Date bonusTime, String bonusNumbers, String channelFlag) {
        List<WxMpTemplateData> wxMpTemplateDataList = new ArrayList<>();
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        String title = "开奖结果通知";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("您订阅的").append(lottoName).append(lottoInstName).append("期，已开奖，请及时查看");//您购买的$|$期，订单金额$元，本期未中奖，再接再厉，请及时查看
        String content = stringBuffer.toString();
        String tips = "前往开奖详情页面查看，官方数据实时更新";
        WxMpTemplateData data1 = new WxMpTemplateData("first", "彩票已开奖，请及时查看");
        wxMpTemplateDataList.add(data1);
        WxMpTemplateData data2 = new WxMpTemplateData("keyword1", lottoName);
        wxMpTemplateDataList.add(data2);
        WxMpTemplateData data3 = new WxMpTemplateData("keyword2", lottoInstName + "期");
        wxMpTemplateDataList.add(data3);
        WxMpTemplateData data4 = new WxMpTemplateData("keyword3", JBDateUtil.transDate2String(bonusTime, "", JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss));
        wxMpTemplateDataList.add(data4);
        WxMpTemplateData data5 = new WxMpTemplateData("keyword4", bonusNumbers);//开奖号码
        wxMpTemplateDataList.add(data5);
        WxMpTemplateData data7 = new WxMpTemplateData("remark", tips);
        wxMpTemplateDataList.add(data7);


        String templateId = "";//模板ID
        String contextUrl = evnConfig.getUrlRequestContext();//context地址
        if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
            //彩士多公众号
            templateId = CommonConstans.WX_MSG_TEMPLATE_ID_LOTTOBONUS;
            contextUrl = evnConfig.getUrlRequestContext();//context地址
        } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
            //中大奖了公众号
            templateId = CommonConstans.ZDJL_MSG_TEMPLATE_ID_LOTTOBONUS;
            contextUrl = evnConfig.getZdjlrequestpath();//context地址
        }

        String url = contextUrl + CommonConstans.SHOP_LOTTORESULT_URL;
        BaseRetDto retDto = sendMessage(openId, templateId, url, wxMpTemplateDataList, channelFlag);
        saveMessageRecord(0L, userId, title, content, url, CommonConstans.MSG_TYPE_LOTTOBONUS);
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
        stringBuffer.append("您购买的").append(lotInstWithLotto.getLotLotto().getLottoName()).append(lotInstWithLotto.getPeriodName()).append("期，订单金额").append(ordOrder.getOrderPrice().toString()).append("元，因彩店24小时未处理，已撤单，请及时查看");//您购买的$|$期，订单金额$元，彩店已撤单，请及时查看
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
     * 给用户发送预约成功的通知
     *
     * @param ordOrder
     * @return
     */
    public BaseRetDto sendPaysuccessSaveOrderMsg(OrdOrder ordOrder) {
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
        if (JBUtil.isStrEmpty(channelFlag)) {
            channelFlag = CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP;
        }
        WxMpTemplateMessage wxMpTemplateMessage = WxMpTemplateMessage.builder().toUser(openId).templateId(templateId).url(url).data(wxMpTemplateDataList).build();
        try {
            if (CommonConstans.COMMON_CHANNEL_LOTTOSTORE_MP.equals(channelFlag)) {
                //彩士多公众号
                wxCsdMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
            } else if (CommonConstans.COMMON_CHANNEL_ZDJL_MP.equals(channelFlag)) {
                //中大奖了公众号
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
}
