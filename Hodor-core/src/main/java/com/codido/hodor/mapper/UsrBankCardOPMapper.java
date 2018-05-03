package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrBankCard;
import com.codido.hodor.model.UsrBankCardExample;
import com.codido.hodor.model.UsrBankCardOP;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UsrBankCardOPMapper {

    @SelectProvider(type=UsrBankCardSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USR_BANKCARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USR_BANKCARD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BAND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<UsrBankCard> selectByExample(UsrBankCardExample example);

    @Select({
        "select",
        "USR_BANKCARD_ID, USER_ID, BANK_ID, BANK_CARD_NO, USR_BANKCARD_STS, BAND_TIME",
        "from t_usr_bankcard",
        "where USER_ID = #{userId,jdbcType=BIGINT} AND USR_BANKCARD_STS = 'A'"
    })
    @Results({
            @Result(property = "usrBankcardId", column = "USR_BANKCARD_ID"),
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "cmmBank", column = "BANK_ID",one = @One(select = "com.codido.hodor.mapper.CmmBankMapper.selectByPrimaryKey")),
            @Result(property = "bankCardNo", column = "BANK_CARD_NO"),
            @Result(property = "usrBankcardSts", column = "USR_BANKCARD_STS"),
            @Result(property = "bandTime", column = "BAND_TIME")
    })
    @ConstructorArgs({
        @Arg(column="USR_BANKCARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USR_BANKCARD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BAND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    UsrBankCardOP selectByUserId(@Param("userId") Long userId);
}