package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrSubscriberLotto;
import com.codido.hodor.model.UsrSubscriberLottoExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UsrSubscriberLottoOPMapper {

    @Select({
        "select",
        "USR_SUBSCRIB_LOTTO_ID, USER_ID, LOTTO_ID, SUBSCRIB_STS, SUBSCRIB_TME, UNSUBSCRIB_TME",
        "from t_usr_subscriber_lotto",
        "where USER_ID = #{userId,jdbcType=BIGINT} and LOTTO_ID = #{lottoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USR_SUBSCRIB_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SUBSCRIB_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SUBSCRIB_TME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="UNSUBSCRIB_TME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    UsrSubscriberLotto selectByUserIdAndLottoId(@Param("userId")Long userId,@Param("lottoId")Long lottoId);

}