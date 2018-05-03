package com.codido.hodor.mapper;

import com.codido.hodor.model.SmsCode;
import com.codido.hodor.model.SmsCodeExample;
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

public interface SmsCodeMapper {
    @SelectProvider(type=SmsCodeSqlProvider.class, method="countByExample")
    long countByExample(SmsCodeExample example);

    @DeleteProvider(type=SmsCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(SmsCodeExample example);

    @Delete({
        "delete from t_sms_code",
        "where SMS_CODE_ID = #{smsCodeId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long smsCodeId);

    @Insert({
        "insert into t_sms_code (MBL_NO, SMS_TYPE, ",
        "SMS_CODE, SMS_CONTENT, ",
        "SMS_CODE_CREATE_TIME, SMS_SEND_TIME, ",
        "SMS_CODE_STS, ERR_COUNT, ",
        "LOG_ID)",
        "values (#{mblNo,jdbcType=VARCHAR}, #{smsType,jdbcType=CHAR}, ",
        "#{smsCode,jdbcType=VARCHAR}, #{smsContent,jdbcType=VARCHAR}, ",
        "#{smsCodeCreateTime,jdbcType=TIMESTAMP}, #{smsSendTime,jdbcType=TIMESTAMP}, ",
        "#{smsCodeSts,jdbcType=CHAR}, #{errCount,jdbcType=INTEGER}, ",
        "#{logId,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="smsCodeId")
    int insert(SmsCode record);

    @InsertProvider(type=SmsCodeSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="smsCodeId")
    int insertSelective(SmsCode record);

    @SelectProvider(type=SmsCodeSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SMS_CODE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SMS_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SMS_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SMS_CONTENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SMS_CODE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SMS_SEND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SMS_CODE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ERR_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOG_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SmsCode> selectByExample(SmsCodeExample example);

    @Select({
        "select",
        "SMS_CODE_ID, MBL_NO, SMS_TYPE, SMS_CODE, SMS_CONTENT, SMS_CODE_CREATE_TIME, ",
        "SMS_SEND_TIME, SMS_CODE_STS, ERR_COUNT, LOG_ID",
        "from t_sms_code",
        "where SMS_CODE_ID = #{smsCodeId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SMS_CODE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SMS_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SMS_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SMS_CONTENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SMS_CODE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SMS_SEND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SMS_CODE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ERR_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOG_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    SmsCode selectByPrimaryKey(Long smsCodeId);

    @UpdateProvider(type=SmsCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SmsCode record, @Param("example") SmsCodeExample example);

    @UpdateProvider(type=SmsCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SmsCode record, @Param("example") SmsCodeExample example);

    @UpdateProvider(type=SmsCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SmsCode record);

    @Update({
        "update t_sms_code",
        "set MBL_NO = #{mblNo,jdbcType=VARCHAR},",
          "SMS_TYPE = #{smsType,jdbcType=CHAR},",
          "SMS_CODE = #{smsCode,jdbcType=VARCHAR},",
          "SMS_CONTENT = #{smsContent,jdbcType=VARCHAR},",
          "SMS_CODE_CREATE_TIME = #{smsCodeCreateTime,jdbcType=TIMESTAMP},",
          "SMS_SEND_TIME = #{smsSendTime,jdbcType=TIMESTAMP},",
          "SMS_CODE_STS = #{smsCodeSts,jdbcType=CHAR},",
          "ERR_COUNT = #{errCount,jdbcType=INTEGER},",
          "LOG_ID = #{logId,jdbcType=VARCHAR}",
        "where SMS_CODE_ID = #{smsCodeId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SmsCode record);
}