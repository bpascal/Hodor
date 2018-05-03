package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrSubscriberLotto;
import com.codido.hodor.model.UsrSubscriberLottoExample;
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

public interface UsrSubscriberLottoMapper {
    @SelectProvider(type=UsrSubscriberLottoSqlProvider.class, method="countByExample")
    long countByExample(UsrSubscriberLottoExample example);

    @DeleteProvider(type=UsrSubscriberLottoSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrSubscriberLottoExample example);

    @Delete({
        "delete from t_usr_subscriber_lotto",
        "where USR_SUBSCRIB_LOTTO_ID = #{usrSubscribLottoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long usrSubscribLottoId);

    @Insert({
        "insert into t_usr_subscriber_lotto (USER_ID, LOTTO_ID, ",
        "SUBSCRIB_STS, SUBSCRIB_TME, ",
        "UNSUBSCRIB_TME)",
        "values (#{userId,jdbcType=BIGINT}, #{lottoId,jdbcType=BIGINT}, ",
        "#{subscribSts,jdbcType=CHAR}, #{subscribTme,jdbcType=TIMESTAMP}, ",
        "#{unsubscribTme,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="usrSubscribLottoId")
    int insert(UsrSubscriberLotto record);

    @InsertProvider(type=UsrSubscriberLottoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="usrSubscribLottoId")
    int insertSelective(UsrSubscriberLotto record);

    @SelectProvider(type=UsrSubscriberLottoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USR_SUBSCRIB_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SUBSCRIB_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SUBSCRIB_TME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="UNSUBSCRIB_TME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<UsrSubscriberLotto> selectByExample(UsrSubscriberLottoExample example);

    @Select({
        "select",
        "USR_SUBSCRIB_LOTTO_ID, USER_ID, LOTTO_ID, SUBSCRIB_STS, SUBSCRIB_TME, UNSUBSCRIB_TME",
        "from t_usr_subscriber_lotto",
        "where USR_SUBSCRIB_LOTTO_ID = #{usrSubscribLottoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USR_SUBSCRIB_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SUBSCRIB_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SUBSCRIB_TME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="UNSUBSCRIB_TME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    UsrSubscriberLotto selectByPrimaryKey(Long usrSubscribLottoId);

    @UpdateProvider(type=UsrSubscriberLottoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrSubscriberLotto record, @Param("example") UsrSubscriberLottoExample example);

    @UpdateProvider(type=UsrSubscriberLottoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrSubscriberLotto record, @Param("example") UsrSubscriberLottoExample example);

    @UpdateProvider(type=UsrSubscriberLottoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrSubscriberLotto record);

    @Update({
        "update t_usr_subscriber_lotto",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "LOTTO_ID = #{lottoId,jdbcType=BIGINT},",
          "SUBSCRIB_STS = #{subscribSts,jdbcType=CHAR},",
          "SUBSCRIB_TME = #{subscribTme,jdbcType=TIMESTAMP},",
          "UNSUBSCRIB_TME = #{unsubscribTme,jdbcType=TIMESTAMP}",
        "where USR_SUBSCRIB_LOTTO_ID = #{usrSubscribLottoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrSubscriberLotto record);
}