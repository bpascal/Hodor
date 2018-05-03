package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdOrder;
import com.codido.hodor.model.OrdOrderExample.Criteria;
import com.codido.hodor.model.OrdOrderExample.Criterion;
import com.codido.hodor.model.OrdOrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdOrderSqlProvider {

    public String countByExample(OrdOrderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdOrderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_order");
        
        if (record.getOrderNo() != null) {
            sql.VALUES("ORDER_NO", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.VALUES("LOTTO_INST_ID", "#{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getInitUserId() != null) {
            sql.VALUES("INIT_USER_ID", "#{initUserId,jdbcType=BIGINT}");
        }
        
        if (record.getDealUserId() != null) {
            sql.VALUES("DEAL_USER_ID", "#{dealUserId,jdbcType=BIGINT}");
        }
        
        if (record.getDealShopId() != null) {
            sql.VALUES("DEAL_SHOP_ID", "#{dealShopId,jdbcType=BIGINT}");
        }
        
        if (record.getBetTimes() != null) {
            sql.VALUES("BET_TIMES", "#{betTimes,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalBetsCount() != null) {
            sql.VALUES("ORDER_TOTAL_BETS_COUNT", "#{orderTotalBetsCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderPrice() != null) {
            sql.VALUES("ORDER_PRICE", "#{orderPrice,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSts() != null) {
            sql.VALUES("ORDER_STS", "#{orderSts,jdbcType=CHAR}");
        }
        
        if (record.getComGameStyle() != null) {
            sql.VALUES("COM_GAME_STYLE", "#{comGameStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getTicketUploadSts() != null) {
            sql.VALUES("TICKET_UPLOAD_STS", "#{ticketUploadSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusSts() != null) {
            sql.VALUES("BONUS_STS", "#{bonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusAmt() != null) {
            sql.VALUES("BONUS_AMT", "#{bonusAmt,jdbcType=BIGINT}");
        }
        
        if (record.getBonusDesc() != null) {
            sql.VALUES("BONUS_DESC", "#{bonusDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusPayOrderNo() != null) {
            sql.VALUES("BONUS_PAY_ORDER_NO", "#{bonusPayOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCreateTime() != null) {
            sql.VALUES("ORDER_CREATE_TIME", "#{orderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderCancelTime() != null) {
            sql.VALUES("ORDER_CANCEL_TIME", "#{orderCancelTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderSendTime() != null) {
            sql.VALUES("ORDER_SEND_TIME", "#{orderSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderAcceptTime() != null) {
            sql.VALUES("ORDER_ACCEPT_TIME", "#{orderAcceptTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderTicketPic() != null) {
            sql.VALUES("ORDER_TICKET_PIC", "#{orderTicketPic,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmitFormId() != null) {
            sql.VALUES("SUBMIT_FORM_ID", "#{submitFormId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderPushmsgSts() != null) {
            sql.VALUES("ORDER_PUSHMSG_STS", "#{orderPushmsgSts,jdbcType=CHAR}");
        }
        
        if (record.getTicketUploadTime() != null) {
            sql.VALUES("TICKET_UPLOAD_TIME", "#{ticketUploadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayOrderId() != null) {
            sql.VALUES("PAY_ORDER_ID", "#{payOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannel() != null) {
            sql.VALUES("PAY_CHANNEL", "#{payChannel,jdbcType=CHAR}");
        }
        
        if (record.getPaySts() != null) {
            sql.VALUES("PAY_STS", "#{paySts,jdbcType=CHAR}");
        }
        
        if (record.getOrderPayTime() != null) {
            sql.VALUES("ORDER_PAY_TIME", "#{orderPayTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderRejectTime() != null) {
            sql.VALUES("ORDER_REJECT_TIME", "#{orderRejectTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderSource() != null) {
            sql.VALUES("ORDER_SOURCE", "#{orderSource,jdbcType=CHAR}");
        }
        
        if (record.getChaseNo() != null) {
            sql.VALUES("CHASE_NO", "#{chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCopOrderNo() != null) {
            sql.VALUES("COP_ORDER_NO", "#{copOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getReciveBonusTime() != null) {
            sql.VALUES("RECIVE_BONUS_TIME", "#{reciveBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReciveBonusStsTime() != null) {
            sql.VALUES("RECIVE_BONUS_STS_TIME", "#{reciveBonusStsTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getApplyBonusTime() != null) {
            sql.VALUES("APPLY_BONUS_TIME", "#{applyBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFinishBonusTime() != null) {
            sql.VALUES("FINISH_BONUS_TIME", "#{finishBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderTicketReciveSts() != null) {
            sql.VALUES("ORDER_TICKET_RECIVE_STS", "#{orderTicketReciveSts,jdbcType=CHAR}");
        }
        
        if (record.getOrderTicketReciveTime() != null) {
            sql.VALUES("ORDER_TICKET_RECIVE_TIME", "#{orderTicketReciveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderChannel() != null) {
            sql.VALUES("ORDER_CHANNEL", "#{orderChannel,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdOrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ORDER_ID");
        } else {
            sql.SELECT("ORDER_ID");
        }
        sql.SELECT("ORDER_NO");
        sql.SELECT("LOTTO_INST_ID");
        sql.SELECT("INIT_USER_ID");
        sql.SELECT("DEAL_USER_ID");
        sql.SELECT("DEAL_SHOP_ID");
        sql.SELECT("BET_TIMES");
        sql.SELECT("ORDER_TOTAL_BETS_COUNT");
        sql.SELECT("ORDER_PRICE");
        sql.SELECT("ORDER_STS");
        sql.SELECT("COM_GAME_STYLE");
        sql.SELECT("TICKET_UPLOAD_STS");
        sql.SELECT("BONUS_STS");
        sql.SELECT("BONUS_AMT");
        sql.SELECT("BONUS_DESC");
        sql.SELECT("BONUS_PAY_ORDER_NO");
        sql.SELECT("ORDER_CREATE_TIME");
        sql.SELECT("ORDER_CANCEL_TIME");
        sql.SELECT("ORDER_SEND_TIME");
        sql.SELECT("ORDER_ACCEPT_TIME");
        sql.SELECT("ORDER_TICKET_PIC");
        sql.SELECT("SUBMIT_FORM_ID");
        sql.SELECT("ORDER_PUSHMSG_STS");
        sql.SELECT("TICKET_UPLOAD_TIME");
        sql.SELECT("PAY_ORDER_ID");
        sql.SELECT("PAY_CHANNEL");
        sql.SELECT("PAY_STS");
        sql.SELECT("ORDER_PAY_TIME");
        sql.SELECT("ORDER_REJECT_TIME");
        sql.SELECT("ORDER_SOURCE");
        sql.SELECT("CHASE_NO");
        sql.SELECT("COP_ORDER_NO");
        sql.SELECT("RECIVE_BONUS_TIME");
        sql.SELECT("RECIVE_BONUS_STS_TIME");
        sql.SELECT("APPLY_BONUS_TIME");
        sql.SELECT("FINISH_BONUS_TIME");
        sql.SELECT("ORDER_TICKET_RECIVE_STS");
        sql.SELECT("ORDER_TICKET_RECIVE_TIME");
        sql.SELECT("ORDER_CHANNEL");
        sql.FROM("t_ord_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdOrder record = (OrdOrder) parameter.get("record");
        OrdOrderExample example = (OrdOrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_order");
        
        if (record.getOrderId() != null) {
            sql.SET("ORDER_ID = #{record.orderId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getInitUserId() != null) {
            sql.SET("INIT_USER_ID = #{record.initUserId,jdbcType=BIGINT}");
        }
        
        if (record.getDealUserId() != null) {
            sql.SET("DEAL_USER_ID = #{record.dealUserId,jdbcType=BIGINT}");
        }
        
        if (record.getDealShopId() != null) {
            sql.SET("DEAL_SHOP_ID = #{record.dealShopId,jdbcType=BIGINT}");
        }
        
        if (record.getBetTimes() != null) {
            sql.SET("BET_TIMES = #{record.betTimes,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalBetsCount() != null) {
            sql.SET("ORDER_TOTAL_BETS_COUNT = #{record.orderTotalBetsCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderPrice() != null) {
            sql.SET("ORDER_PRICE = #{record.orderPrice,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSts() != null) {
            sql.SET("ORDER_STS = #{record.orderSts,jdbcType=CHAR}");
        }
        
        if (record.getComGameStyle() != null) {
            sql.SET("COM_GAME_STYLE = #{record.comGameStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getTicketUploadSts() != null) {
            sql.SET("TICKET_UPLOAD_STS = #{record.ticketUploadSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusSts() != null) {
            sql.SET("BONUS_STS = #{record.bonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusAmt() != null) {
            sql.SET("BONUS_AMT = #{record.bonusAmt,jdbcType=BIGINT}");
        }
        
        if (record.getBonusDesc() != null) {
            sql.SET("BONUS_DESC = #{record.bonusDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusPayOrderNo() != null) {
            sql.SET("BONUS_PAY_ORDER_NO = #{record.bonusPayOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCreateTime() != null) {
            sql.SET("ORDER_CREATE_TIME = #{record.orderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderCancelTime() != null) {
            sql.SET("ORDER_CANCEL_TIME = #{record.orderCancelTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderSendTime() != null) {
            sql.SET("ORDER_SEND_TIME = #{record.orderSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderAcceptTime() != null) {
            sql.SET("ORDER_ACCEPT_TIME = #{record.orderAcceptTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderTicketPic() != null) {
            sql.SET("ORDER_TICKET_PIC = #{record.orderTicketPic,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmitFormId() != null) {
            sql.SET("SUBMIT_FORM_ID = #{record.submitFormId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderPushmsgSts() != null) {
            sql.SET("ORDER_PUSHMSG_STS = #{record.orderPushmsgSts,jdbcType=CHAR}");
        }
        
        if (record.getTicketUploadTime() != null) {
            sql.SET("TICKET_UPLOAD_TIME = #{record.ticketUploadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayOrderId() != null) {
            sql.SET("PAY_ORDER_ID = #{record.payOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannel() != null) {
            sql.SET("PAY_CHANNEL = #{record.payChannel,jdbcType=CHAR}");
        }
        
        if (record.getPaySts() != null) {
            sql.SET("PAY_STS = #{record.paySts,jdbcType=CHAR}");
        }
        
        if (record.getOrderPayTime() != null) {
            sql.SET("ORDER_PAY_TIME = #{record.orderPayTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderRejectTime() != null) {
            sql.SET("ORDER_REJECT_TIME = #{record.orderRejectTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderSource() != null) {
            sql.SET("ORDER_SOURCE = #{record.orderSource,jdbcType=CHAR}");
        }
        
        if (record.getChaseNo() != null) {
            sql.SET("CHASE_NO = #{record.chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCopOrderNo() != null) {
            sql.SET("COP_ORDER_NO = #{record.copOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getReciveBonusTime() != null) {
            sql.SET("RECIVE_BONUS_TIME = #{record.reciveBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReciveBonusStsTime() != null) {
            sql.SET("RECIVE_BONUS_STS_TIME = #{record.reciveBonusStsTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getApplyBonusTime() != null) {
            sql.SET("APPLY_BONUS_TIME = #{record.applyBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFinishBonusTime() != null) {
            sql.SET("FINISH_BONUS_TIME = #{record.finishBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderTicketReciveSts() != null) {
            sql.SET("ORDER_TICKET_RECIVE_STS = #{record.orderTicketReciveSts,jdbcType=CHAR}");
        }
        
        if (record.getOrderTicketReciveTime() != null) {
            sql.SET("ORDER_TICKET_RECIVE_TIME = #{record.orderTicketReciveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderChannel() != null) {
            sql.SET("ORDER_CHANNEL = #{record.orderChannel,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_order");
        
        sql.SET("ORDER_ID = #{record.orderId,jdbcType=BIGINT}");
        sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("LOTTO_INST_ID = #{record.lottoInstId,jdbcType=BIGINT}");
        sql.SET("INIT_USER_ID = #{record.initUserId,jdbcType=BIGINT}");
        sql.SET("DEAL_USER_ID = #{record.dealUserId,jdbcType=BIGINT}");
        sql.SET("DEAL_SHOP_ID = #{record.dealShopId,jdbcType=BIGINT}");
        sql.SET("BET_TIMES = #{record.betTimes,jdbcType=INTEGER}");
        sql.SET("ORDER_TOTAL_BETS_COUNT = #{record.orderTotalBetsCount,jdbcType=INTEGER}");
        sql.SET("ORDER_PRICE = #{record.orderPrice,jdbcType=INTEGER}");
        sql.SET("ORDER_STS = #{record.orderSts,jdbcType=CHAR}");
        sql.SET("COM_GAME_STYLE = #{record.comGameStyle,jdbcType=VARCHAR}");
        sql.SET("TICKET_UPLOAD_STS = #{record.ticketUploadSts,jdbcType=CHAR}");
        sql.SET("BONUS_STS = #{record.bonusSts,jdbcType=CHAR}");
        sql.SET("BONUS_AMT = #{record.bonusAmt,jdbcType=BIGINT}");
        sql.SET("BONUS_DESC = #{record.bonusDesc,jdbcType=VARCHAR}");
        sql.SET("BONUS_PAY_ORDER_NO = #{record.bonusPayOrderNo,jdbcType=VARCHAR}");
        sql.SET("ORDER_CREATE_TIME = #{record.orderCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_CANCEL_TIME = #{record.orderCancelTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_SEND_TIME = #{record.orderSendTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_ACCEPT_TIME = #{record.orderAcceptTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_TICKET_PIC = #{record.orderTicketPic,jdbcType=VARCHAR}");
        sql.SET("SUBMIT_FORM_ID = #{record.submitFormId,jdbcType=VARCHAR}");
        sql.SET("ORDER_PUSHMSG_STS = #{record.orderPushmsgSts,jdbcType=CHAR}");
        sql.SET("TICKET_UPLOAD_TIME = #{record.ticketUploadTime,jdbcType=TIMESTAMP}");
        sql.SET("PAY_ORDER_ID = #{record.payOrderId,jdbcType=VARCHAR}");
        sql.SET("PAY_CHANNEL = #{record.payChannel,jdbcType=CHAR}");
        sql.SET("PAY_STS = #{record.paySts,jdbcType=CHAR}");
        sql.SET("ORDER_PAY_TIME = #{record.orderPayTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_REJECT_TIME = #{record.orderRejectTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_SOURCE = #{record.orderSource,jdbcType=CHAR}");
        sql.SET("CHASE_NO = #{record.chaseNo,jdbcType=VARCHAR}");
        sql.SET("COP_ORDER_NO = #{record.copOrderNo,jdbcType=VARCHAR}");
        sql.SET("RECIVE_BONUS_TIME = #{record.reciveBonusTime,jdbcType=TIMESTAMP}");
        sql.SET("RECIVE_BONUS_STS_TIME = #{record.reciveBonusStsTime,jdbcType=TIMESTAMP}");
        sql.SET("APPLY_BONUS_TIME = #{record.applyBonusTime,jdbcType=TIMESTAMP}");
        sql.SET("FINISH_BONUS_TIME = #{record.finishBonusTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_TICKET_RECIVE_STS = #{record.orderTicketReciveSts,jdbcType=CHAR}");
        sql.SET("ORDER_TICKET_RECIVE_TIME = #{record.orderTicketReciveTime,jdbcType=TIMESTAMP}");
        sql.SET("ORDER_CHANNEL = #{record.orderChannel,jdbcType=VARCHAR}");
        
        OrdOrderExample example = (OrdOrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_order");
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoInstId() != null) {
            sql.SET("LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT}");
        }
        
        if (record.getInitUserId() != null) {
            sql.SET("INIT_USER_ID = #{initUserId,jdbcType=BIGINT}");
        }
        
        if (record.getDealUserId() != null) {
            sql.SET("DEAL_USER_ID = #{dealUserId,jdbcType=BIGINT}");
        }
        
        if (record.getDealShopId() != null) {
            sql.SET("DEAL_SHOP_ID = #{dealShopId,jdbcType=BIGINT}");
        }
        
        if (record.getBetTimes() != null) {
            sql.SET("BET_TIMES = #{betTimes,jdbcType=INTEGER}");
        }
        
        if (record.getOrderTotalBetsCount() != null) {
            sql.SET("ORDER_TOTAL_BETS_COUNT = #{orderTotalBetsCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderPrice() != null) {
            sql.SET("ORDER_PRICE = #{orderPrice,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSts() != null) {
            sql.SET("ORDER_STS = #{orderSts,jdbcType=CHAR}");
        }
        
        if (record.getComGameStyle() != null) {
            sql.SET("COM_GAME_STYLE = #{comGameStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getTicketUploadSts() != null) {
            sql.SET("TICKET_UPLOAD_STS = #{ticketUploadSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusSts() != null) {
            sql.SET("BONUS_STS = #{bonusSts,jdbcType=CHAR}");
        }
        
        if (record.getBonusAmt() != null) {
            sql.SET("BONUS_AMT = #{bonusAmt,jdbcType=BIGINT}");
        }
        
        if (record.getBonusDesc() != null) {
            sql.SET("BONUS_DESC = #{bonusDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getBonusPayOrderNo() != null) {
            sql.SET("BONUS_PAY_ORDER_NO = #{bonusPayOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderCreateTime() != null) {
            sql.SET("ORDER_CREATE_TIME = #{orderCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderCancelTime() != null) {
            sql.SET("ORDER_CANCEL_TIME = #{orderCancelTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderSendTime() != null) {
            sql.SET("ORDER_SEND_TIME = #{orderSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderAcceptTime() != null) {
            sql.SET("ORDER_ACCEPT_TIME = #{orderAcceptTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderTicketPic() != null) {
            sql.SET("ORDER_TICKET_PIC = #{orderTicketPic,jdbcType=VARCHAR}");
        }
        
        if (record.getSubmitFormId() != null) {
            sql.SET("SUBMIT_FORM_ID = #{submitFormId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderPushmsgSts() != null) {
            sql.SET("ORDER_PUSHMSG_STS = #{orderPushmsgSts,jdbcType=CHAR}");
        }
        
        if (record.getTicketUploadTime() != null) {
            sql.SET("TICKET_UPLOAD_TIME = #{ticketUploadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayOrderId() != null) {
            sql.SET("PAY_ORDER_ID = #{payOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannel() != null) {
            sql.SET("PAY_CHANNEL = #{payChannel,jdbcType=CHAR}");
        }
        
        if (record.getPaySts() != null) {
            sql.SET("PAY_STS = #{paySts,jdbcType=CHAR}");
        }
        
        if (record.getOrderPayTime() != null) {
            sql.SET("ORDER_PAY_TIME = #{orderPayTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderRejectTime() != null) {
            sql.SET("ORDER_REJECT_TIME = #{orderRejectTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderSource() != null) {
            sql.SET("ORDER_SOURCE = #{orderSource,jdbcType=CHAR}");
        }
        
        if (record.getChaseNo() != null) {
            sql.SET("CHASE_NO = #{chaseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCopOrderNo() != null) {
            sql.SET("COP_ORDER_NO = #{copOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getReciveBonusTime() != null) {
            sql.SET("RECIVE_BONUS_TIME = #{reciveBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReciveBonusStsTime() != null) {
            sql.SET("RECIVE_BONUS_STS_TIME = #{reciveBonusStsTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getApplyBonusTime() != null) {
            sql.SET("APPLY_BONUS_TIME = #{applyBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFinishBonusTime() != null) {
            sql.SET("FINISH_BONUS_TIME = #{finishBonusTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderTicketReciveSts() != null) {
            sql.SET("ORDER_TICKET_RECIVE_STS = #{orderTicketReciveSts,jdbcType=CHAR}");
        }
        
        if (record.getOrderTicketReciveTime() != null) {
            sql.SET("ORDER_TICKET_RECIVE_TIME = #{orderTicketReciveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrderChannel() != null) {
            sql.SET("ORDER_CHANNEL = #{orderChannel,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ORDER_ID = #{orderId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdOrderExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}