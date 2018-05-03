package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdOrder;
import com.codido.hodor.model.OrdOrderExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface OrdOrderMapper {
    @SelectProvider(type=OrdOrderSqlProvider.class, method="countByExample")
    long countByExample(OrdOrderExample example);

    @DeleteProvider(type=OrdOrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdOrderExample example);

    @Delete({
        "delete from t_ord_order",
        "where ORDER_ID = #{orderId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long orderId);

    @Insert({
        "insert into t_ord_order (ORDER_NO, LOTTO_INST_ID, ",
        "INIT_USER_ID, DEAL_USER_ID, ",
        "DEAL_SHOP_ID, BET_TIMES, ",
        "ORDER_TOTAL_BETS_COUNT, ORDER_PRICE, ",
        "ORDER_STS, COM_GAME_STYLE, ",
        "TICKET_UPLOAD_STS, BONUS_STS, ",
        "BONUS_AMT, BONUS_DESC, ",
        "BONUS_PAY_ORDER_NO, ORDER_CREATE_TIME, ",
        "ORDER_CANCEL_TIME, ORDER_SEND_TIME, ",
        "ORDER_ACCEPT_TIME, ORDER_TICKET_PIC, ",
        "SUBMIT_FORM_ID, ORDER_PUSHMSG_STS, ",
        "TICKET_UPLOAD_TIME, PAY_ORDER_ID, ",
        "PAY_CHANNEL, PAY_STS, ORDER_PAY_TIME, ",
        "ORDER_REJECT_TIME, ORDER_SOURCE, ",
        "CHASE_NO, COP_ORDER_NO, ",
        "RECIVE_BONUS_TIME, RECIVE_BONUS_STS_TIME, ",
        "APPLY_BONUS_TIME, FINISH_BONUS_TIME, ",
        "ORDER_TICKET_RECIVE_STS, ORDER_TICKET_RECIVE_TIME, ",
        "ORDER_CHANNEL)",
        "values (#{orderNo,jdbcType=VARCHAR}, #{lottoInstId,jdbcType=BIGINT}, ",
        "#{initUserId,jdbcType=BIGINT}, #{dealUserId,jdbcType=BIGINT}, ",
        "#{dealShopId,jdbcType=BIGINT}, #{betTimes,jdbcType=INTEGER}, ",
        "#{orderTotalBetsCount,jdbcType=INTEGER}, #{orderPrice,jdbcType=INTEGER}, ",
        "#{orderSts,jdbcType=CHAR}, #{comGameStyle,jdbcType=VARCHAR}, ",
        "#{ticketUploadSts,jdbcType=CHAR}, #{bonusSts,jdbcType=CHAR}, ",
        "#{bonusAmt,jdbcType=BIGINT}, #{bonusDesc,jdbcType=VARCHAR}, ",
        "#{bonusPayOrderNo,jdbcType=VARCHAR}, #{orderCreateTime,jdbcType=TIMESTAMP}, ",
        "#{orderCancelTime,jdbcType=TIMESTAMP}, #{orderSendTime,jdbcType=TIMESTAMP}, ",
        "#{orderAcceptTime,jdbcType=TIMESTAMP}, #{orderTicketPic,jdbcType=VARCHAR}, ",
        "#{submitFormId,jdbcType=VARCHAR}, #{orderPushmsgSts,jdbcType=CHAR}, ",
        "#{ticketUploadTime,jdbcType=TIMESTAMP}, #{payOrderId,jdbcType=VARCHAR}, ",
        "#{payChannel,jdbcType=CHAR}, #{paySts,jdbcType=CHAR}, #{orderPayTime,jdbcType=TIMESTAMP}, ",
        "#{orderRejectTime,jdbcType=TIMESTAMP}, #{orderSource,jdbcType=CHAR}, ",
        "#{chaseNo,jdbcType=VARCHAR}, #{copOrderNo,jdbcType=VARCHAR}, ",
        "#{reciveBonusTime,jdbcType=TIMESTAMP}, #{reciveBonusStsTime,jdbcType=TIMESTAMP}, ",
        "#{applyBonusTime,jdbcType=TIMESTAMP}, #{finishBonusTime,jdbcType=TIMESTAMP}, ",
        "#{orderTicketReciveSts,jdbcType=CHAR}, #{orderTicketReciveTime,jdbcType=TIMESTAMP}, ",
        "#{orderChannel,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="orderId")
    int insert(OrdOrder record);

    @InsertProvider(type=OrdOrderSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="orderId")
    int insertSelective(OrdOrder record);

    @SelectProvider(type=OrdOrderSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ORDER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="INIT_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="DEAL_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="DEAL_SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BET_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ORDER_TOTAL_BETS_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ORDER_PRICE", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ORDER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="COM_GAME_STYLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TICKET_UPLOAD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BONUS_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BONUS_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_PAY_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_CANCEL_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_SEND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_ACCEPT_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_TICKET_PIC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SUBMIT_FORM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_PUSHMSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TICKET_UPLOAD_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAY_ORDER_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_CHANNEL", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_PAY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_REJECT_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_SOURCE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHASE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COP_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="RECIVE_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="RECIVE_BONUS_STS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="APPLY_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="FINISH_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_TICKET_RECIVE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_TICKET_RECIVE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_CHANNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OrdOrder> selectByExample(OrdOrderExample example);

    @Select({
        "select",
        "ORDER_ID, ORDER_NO, LOTTO_INST_ID, INIT_USER_ID, DEAL_USER_ID, DEAL_SHOP_ID, ",
        "BET_TIMES, ORDER_TOTAL_BETS_COUNT, ORDER_PRICE, ORDER_STS, COM_GAME_STYLE, TICKET_UPLOAD_STS, ",
        "BONUS_STS, BONUS_AMT, BONUS_DESC, BONUS_PAY_ORDER_NO, ORDER_CREATE_TIME, ORDER_CANCEL_TIME, ",
        "ORDER_SEND_TIME, ORDER_ACCEPT_TIME, ORDER_TICKET_PIC, SUBMIT_FORM_ID, ORDER_PUSHMSG_STS, ",
        "TICKET_UPLOAD_TIME, PAY_ORDER_ID, PAY_CHANNEL, PAY_STS, ORDER_PAY_TIME, ORDER_REJECT_TIME, ",
        "ORDER_SOURCE, CHASE_NO, COP_ORDER_NO, RECIVE_BONUS_TIME, RECIVE_BONUS_STS_TIME, ",
        "APPLY_BONUS_TIME, FINISH_BONUS_TIME, ORDER_TICKET_RECIVE_STS, ORDER_TICKET_RECIVE_TIME, ",
        "ORDER_CHANNEL",
        "from t_ord_order",
        "where ORDER_ID = #{orderId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="ORDER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="INIT_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="DEAL_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="DEAL_SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BET_TIMES", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ORDER_TOTAL_BETS_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ORDER_PRICE", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="ORDER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="COM_GAME_STYLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TICKET_UPLOAD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BONUS_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BONUS_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BONUS_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BONUS_PAY_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_CANCEL_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_SEND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_ACCEPT_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_TICKET_PIC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SUBMIT_FORM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_PUSHMSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TICKET_UPLOAD_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAY_ORDER_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PAY_CHANNEL", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="PAY_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_PAY_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_REJECT_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_SOURCE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CHASE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COP_ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="RECIVE_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="RECIVE_BONUS_STS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="APPLY_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="FINISH_BONUS_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_TICKET_RECIVE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_TICKET_RECIVE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="ORDER_CHANNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    OrdOrder selectByPrimaryKey(Long orderId);

    @UpdateProvider(type=OrdOrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdOrder record, @Param("example") OrdOrderExample example);

    @UpdateProvider(type=OrdOrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdOrder record, @Param("example") OrdOrderExample example);

    @UpdateProvider(type=OrdOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdOrder record);

    @Update({
        "update t_ord_order",
        "set ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT},",
          "INIT_USER_ID = #{initUserId,jdbcType=BIGINT},",
          "DEAL_USER_ID = #{dealUserId,jdbcType=BIGINT},",
          "DEAL_SHOP_ID = #{dealShopId,jdbcType=BIGINT},",
          "BET_TIMES = #{betTimes,jdbcType=INTEGER},",
          "ORDER_TOTAL_BETS_COUNT = #{orderTotalBetsCount,jdbcType=INTEGER},",
          "ORDER_PRICE = #{orderPrice,jdbcType=INTEGER},",
          "ORDER_STS = #{orderSts,jdbcType=CHAR},",
          "COM_GAME_STYLE = #{comGameStyle,jdbcType=VARCHAR},",
          "TICKET_UPLOAD_STS = #{ticketUploadSts,jdbcType=CHAR},",
          "BONUS_STS = #{bonusSts,jdbcType=CHAR},",
          "BONUS_AMT = #{bonusAmt,jdbcType=BIGINT},",
          "BONUS_DESC = #{bonusDesc,jdbcType=VARCHAR},",
          "BONUS_PAY_ORDER_NO = #{bonusPayOrderNo,jdbcType=VARCHAR},",
          "ORDER_CREATE_TIME = #{orderCreateTime,jdbcType=TIMESTAMP},",
          "ORDER_CANCEL_TIME = #{orderCancelTime,jdbcType=TIMESTAMP},",
          "ORDER_SEND_TIME = #{orderSendTime,jdbcType=TIMESTAMP},",
          "ORDER_ACCEPT_TIME = #{orderAcceptTime,jdbcType=TIMESTAMP},",
          "ORDER_TICKET_PIC = #{orderTicketPic,jdbcType=VARCHAR},",
          "SUBMIT_FORM_ID = #{submitFormId,jdbcType=VARCHAR},",
          "ORDER_PUSHMSG_STS = #{orderPushmsgSts,jdbcType=CHAR},",
          "TICKET_UPLOAD_TIME = #{ticketUploadTime,jdbcType=TIMESTAMP},",
          "PAY_ORDER_ID = #{payOrderId,jdbcType=VARCHAR},",
          "PAY_CHANNEL = #{payChannel,jdbcType=CHAR},",
          "PAY_STS = #{paySts,jdbcType=CHAR},",
          "ORDER_PAY_TIME = #{orderPayTime,jdbcType=TIMESTAMP},",
          "ORDER_REJECT_TIME = #{orderRejectTime,jdbcType=TIMESTAMP},",
          "ORDER_SOURCE = #{orderSource,jdbcType=CHAR},",
          "CHASE_NO = #{chaseNo,jdbcType=VARCHAR},",
          "COP_ORDER_NO = #{copOrderNo,jdbcType=VARCHAR},",
          "RECIVE_BONUS_TIME = #{reciveBonusTime,jdbcType=TIMESTAMP},",
          "RECIVE_BONUS_STS_TIME = #{reciveBonusStsTime,jdbcType=TIMESTAMP},",
          "APPLY_BONUS_TIME = #{applyBonusTime,jdbcType=TIMESTAMP},",
          "FINISH_BONUS_TIME = #{finishBonusTime,jdbcType=TIMESTAMP},",
          "ORDER_TICKET_RECIVE_STS = #{orderTicketReciveSts,jdbcType=CHAR},",
          "ORDER_TICKET_RECIVE_TIME = #{orderTicketReciveTime,jdbcType=TIMESTAMP},",
          "ORDER_CHANNEL = #{orderChannel,jdbcType=VARCHAR}",
        "where ORDER_ID = #{orderId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdOrder record);
}