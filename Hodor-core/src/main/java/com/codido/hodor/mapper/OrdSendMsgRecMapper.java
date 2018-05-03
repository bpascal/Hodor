package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdSendMsgRec;
import com.codido.hodor.model.OrdSendMsgRecExample;
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

public interface OrdSendMsgRecMapper {
    @SelectProvider(type=OrdSendMsgRecSqlProvider.class, method="countByExample")
    long countByExample(OrdSendMsgRecExample example);

    @DeleteProvider(type=OrdSendMsgRecSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdSendMsgRecExample example);

    @Delete({
        "delete from t_ord_sendmsg_rec",
        "where SENDMSG_REC_ID = #{sendmsgRecId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long sendmsgRecId);

    @Insert({
        "insert into t_ord_sendmsg_rec (ORDER_NO, OPEN_ID, ",
        "TEMPLATE_ID, FORM_ID, ",
        "SEND_REQ_URL, SEND_MSG_TIME, ",
        "SEND_MSG_STS, SEND_MSG_PARA, ",
        "SEND_MSG_RET)",
        "values (#{orderNo,jdbcType=VARCHAR}, #{openId,jdbcType=VARCHAR}, ",
        "#{templateId,jdbcType=VARCHAR}, #{formId,jdbcType=VARCHAR}, ",
        "#{sendReqUrl,jdbcType=VARCHAR}, #{sendMsgTime,jdbcType=TIMESTAMP}, ",
        "#{sendMsgSts,jdbcType=CHAR}, #{sendMsgPara,jdbcType=VARCHAR}, ",
        "#{sendMsgRet,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="sendmsgRecId")
    int insert(OrdSendMsgRec record);

    @InsertProvider(type=OrdSendMsgRecSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="sendmsgRecId")
    int insertSelective(OrdSendMsgRec record);

    @SelectProvider(type=OrdSendMsgRecSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SENDMSG_REC_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OPEN_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEMPLATE_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="FORM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEND_REQ_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEND_MSG_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SEND_MSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SEND_MSG_PARA", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEND_MSG_RET", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OrdSendMsgRec> selectByExample(OrdSendMsgRecExample example);

    @Select({
        "select",
        "SENDMSG_REC_ID, ORDER_NO, OPEN_ID, TEMPLATE_ID, FORM_ID, SEND_REQ_URL, SEND_MSG_TIME, ",
        "SEND_MSG_STS, SEND_MSG_PARA, SEND_MSG_RET",
        "from t_ord_sendmsg_rec",
        "where SENDMSG_REC_ID = #{sendmsgRecId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SENDMSG_REC_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OPEN_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEMPLATE_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="FORM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEND_REQ_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEND_MSG_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SEND_MSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SEND_MSG_PARA", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SEND_MSG_RET", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    OrdSendMsgRec selectByPrimaryKey(Long sendmsgRecId);

    @UpdateProvider(type=OrdSendMsgRecSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdSendMsgRec record, @Param("example") OrdSendMsgRecExample example);

    @UpdateProvider(type=OrdSendMsgRecSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdSendMsgRec record, @Param("example") OrdSendMsgRecExample example);

    @UpdateProvider(type=OrdSendMsgRecSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdSendMsgRec record);

    @Update({
        "update t_ord_sendmsg_rec",
        "set ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "OPEN_ID = #{openId,jdbcType=VARCHAR},",
          "TEMPLATE_ID = #{templateId,jdbcType=VARCHAR},",
          "FORM_ID = #{formId,jdbcType=VARCHAR},",
          "SEND_REQ_URL = #{sendReqUrl,jdbcType=VARCHAR},",
          "SEND_MSG_TIME = #{sendMsgTime,jdbcType=TIMESTAMP},",
          "SEND_MSG_STS = #{sendMsgSts,jdbcType=CHAR},",
          "SEND_MSG_PARA = #{sendMsgPara,jdbcType=VARCHAR},",
          "SEND_MSG_RET = #{sendMsgRet,jdbcType=VARCHAR}",
        "where SENDMSG_REC_ID = #{sendmsgRecId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdSendMsgRec record);
}