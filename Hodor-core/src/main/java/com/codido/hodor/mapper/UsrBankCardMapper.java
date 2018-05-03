package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrBankCard;
import com.codido.hodor.model.UsrBankCardExample;
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

public interface UsrBankCardMapper {
    @SelectProvider(type=UsrBankCardSqlProvider.class, method="countByExample")
    long countByExample(UsrBankCardExample example);

    @DeleteProvider(type=UsrBankCardSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrBankCardExample example);

    @Delete({
        "delete from t_usr_bankcard",
        "where USR_BANKCARD_ID = #{usrBankcardId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long usrBankcardId);

    @Insert({
        "insert into t_usr_bankcard (USER_ID, BANK_ID, ",
        "BANK_CARD_NO, USR_BANKCARD_STS, ",
        "BAND_TIME)",
        "values (#{userId,jdbcType=BIGINT}, #{bankId,jdbcType=BIGINT}, ",
        "#{bankCardNo,jdbcType=VARCHAR}, #{usrBankcardSts,jdbcType=CHAR}, ",
        "#{bandTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="usrBankcardId")
    int insert(UsrBankCard record);

    @InsertProvider(type=UsrBankCardSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="usrBankcardId")
    int insertSelective(UsrBankCard record);

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
        "where USR_BANKCARD_ID = #{usrBankcardId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USR_BANKCARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USR_BANKCARD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BAND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    UsrBankCard selectByPrimaryKey(Long usrBankcardId);

    @UpdateProvider(type=UsrBankCardSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrBankCard record, @Param("example") UsrBankCardExample example);

    @UpdateProvider(type=UsrBankCardSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrBankCard record, @Param("example") UsrBankCardExample example);

    @UpdateProvider(type=UsrBankCardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrBankCard record);

    @Update({
        "update t_usr_bankcard",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "BANK_ID = #{bankId,jdbcType=BIGINT},",
          "BANK_CARD_NO = #{bankCardNo,jdbcType=VARCHAR},",
          "USR_BANKCARD_STS = #{usrBankcardSts,jdbcType=CHAR},",
          "BAND_TIME = #{bandTime,jdbcType=TIMESTAMP}",
        "where USR_BANKCARD_ID = #{usrBankcardId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrBankCard record);
}