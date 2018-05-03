package com.codido.hodor.ord.bean.vo;

import com.codido.hodor.common.util.JBDateUtil;
import com.codido.hodor.model.OrdOrder;
import com.codido.hodor.usr.bean.vo.ShopVo;
import com.codido.hodor.usr.bean.vo.UserVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.List;

/**
 * 订单对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel
public class OrderVo implements Serializable {

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty("订单对应的彩种期数实例信息")
    private LottoInstVo lottoInstVo;

    @ApiModelProperty("订单发起人信息")
    private UserVo initUserVo;

    @ApiModelProperty("订单店铺信息")
    private ShopVo dealShopVo;

    @ApiModelProperty("订单倍数")
    private String betTimes;

    @ApiModelProperty("订单状态:I:发起,P:已支付,C:取消,K:撤销,A:已确认,B:已开奖,S:已兑奖,N:失效")
    private String orderSts;

    @ApiModelProperty("出票上传状态:A:已上传,N:未上传")
    private String ticketUploadSts;

    @ApiModelProperty("中奖状态:B:已中奖未兑奖,S:已中奖已兑奖,N:未中奖,I:未开奖")
    private String bonusSts;

    @ApiModelProperty("支付状态:I:初始(未缴费),A:已支付,N:失效(长时间未支付)")
    private String paySts;

    @ApiModelProperty("中奖金额")
    private String bonusAmt;

    @ApiModelProperty("兑奖支付时间")
    private String finishBonusTime;

    @ApiModelProperty("兑奖方式文字描述")
    private String bonusPayTypeStr;

    @ApiModelProperty("订单出票照片地址")
    private String orderTicketPicUrl;

    @ApiModelProperty("选择的号码列表")
    private List<ChooseNumberVo> chooseNumberList;

    @ApiModelProperty("订单创建时间")
    private String orderCreateTime;

    @ApiModelProperty("订单总投注记录数")
    private String orderChooseCount;

    @ApiModelProperty("订单总投注注数")
    private String orderTotalBettings;

    @ApiModelProperty("订单总金额")
    private String orderTotalPrice;

    @ApiModelProperty("是否自己下单的标识")
    private Boolean orderInitFlag;

    @ApiModelProperty("订单来源:M:手工下单,G:合买,F:追号")
    private String orderSource;

    @ApiModelProperty("来源的追号订单号")
    private String chaseNo;

    @ApiModelProperty("来源的合买方案订单号")
    private String copOrderNo;

    @ApiModelProperty("订单来源描述(如果是追号的，则显示共几期，已追几期，如果是合买的，则显示共多少股，自己买多少股)")
    private String orderSourceStr;

    @ApiModelProperty("订单支付时间")
    private String orderPayTime;

    @ApiModelProperty("订单取消时间")
    private String orderCancelTime;

    @ApiModelProperty("订单撤单时间")
    private String orderRejectTime;

    @ApiModelProperty("订单确认时间")
    private String orderAcceptTime;

    @ApiModelProperty("订单取票状态:A:已取票,N:未取票")
    private String orderTicketTakeSts;

    @ApiModelProperty("订单取票时间")
    private String orderTicketTakeTime;

    @ApiModelProperty("竞彩专用:串数，逗号分隔")
    private String lottoMethod;

    /**
     * 无参数构造方法
     */
    public OrderVo() {
    }

    /**
     * 带参数构造方法
     */
    public OrderVo(OrdOrder ordOrder){
        this.orderId= ordOrder.getOrderId().toString();
        this.orderNo  =ordOrder.getOrderNo();
        this.orderSts = ordOrder.getOrderSts();
        this.orderTicketPicUrl = ordOrder.getOrderTicketPic();
        this.betTimes = ordOrder.getBetTimes().toString();
        this.ticketUploadSts = ordOrder.getTicketUploadSts();
        this.bonusSts = ordOrder.getBonusSts();
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("中奖金额计算:"+df.format(Float.valueOf(ordOrder.getBonusAmt()==null?"0":ordOrder.getBonusAmt().toString())));
        this.bonusAmt = df.format(Float.valueOf(ordOrder.getBonusAmt()==null?"0":ordOrder.getBonusAmt().toString()));
        //this.bonusAmt = ordOrder.getBonusAmt()==null?"0":ordOrder.getBonusAmt().toString();
        this.orderCreateTime = JBDateUtil.transDate2String(ordOrder.getOrderCreateTime(),"",JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.orderTotalBettings = ordOrder.getOrderTotalBetsCount().toString();
        this.orderTotalPrice = ordOrder.getOrderPrice().toString();
        this.orderSource = ordOrder.getOrderSource();//订单来源
        this.chaseNo = ordOrder.getChaseNo();//订单来源的追号订单号
        this.copOrderNo = ordOrder.getCopOrderNo();//订单来源的合买订单号
        this.orderPayTime = ordOrder.getOrderPayTime()==null?"":JBDateUtil.transDate2String(ordOrder.getOrderPayTime(),"",JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.orderCancelTime = ordOrder.getOrderCancelTime()==null?"":JBDateUtil.transDate2String(ordOrder.getOrderCancelTime(),"",JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.orderRejectTime = ordOrder.getOrderRejectTime()==null?"":JBDateUtil.transDate2String(ordOrder.getOrderRejectTime(),"",JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.orderAcceptTime = ordOrder.getOrderAcceptTime()==null?"":JBDateUtil.transDate2String(ordOrder.getOrderAcceptTime(),"",JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.orderTicketTakeSts = ordOrder.getOrderTicketReciveSts();
        this.orderTicketTakeTime = ordOrder.getOrderTicketReciveTime()==null?"":JBDateUtil.transDate2String(ordOrder.getOrderTicketReciveTime(),"",JBDateUtil.dateFormat_yyyy_MM_dd_HH_mm_ss);
        this.lottoMethod = ordOrder.getComGameStyle();
    }
}
