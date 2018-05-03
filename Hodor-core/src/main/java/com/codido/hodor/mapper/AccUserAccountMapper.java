package com.codido.hodor.mapper;

import com.codido.hodor.model.AccUserAccount;
import com.codido.hodor.model.AccUserAccountExample;
import java.math.BigDecimal;
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

public interface AccUserAccountMapper {
    @SelectProvider(type=AccUserAccountSqlProvider.class, method="countByExample")
    long countByExample(AccUserAccountExample example);

    @DeleteProvider(type=AccUserAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccUserAccountExample example);

    @Delete({
        "delete from t_acc_user_account",
        "where USER_ACCOUNT_ID = #{userAccountId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userAccountId);

    @Insert({
        "insert into t_acc_user_account (USER_ID, ACCOUNT_TYPE_ID, ",
        "AMOUNT, ACCOUNT_STS)",
        "values (#{userId,jdbcType=BIGINT}, #{accountTypeId,jdbcType=BIGINT}, ",
        "#{amount,jdbcType=DECIMAL}, #{accountSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="userAccountId")
    int insert(AccUserAccount record);

    @InsertProvider(type=AccUserAccountSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="userAccountId")
    int insertSelective(AccUserAccount record);

    @SelectProvider(type=AccUserAccountSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USER_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccUserAccount> selectByExample(AccUserAccountExample example);

    @Select({
        "select",
        "USER_ACCOUNT_ID, USER_ID, ACCOUNT_TYPE_ID, AMOUNT, ACCOUNT_STS",
        "from t_acc_user_account",
        "where USER_ACCOUNT_ID = #{userAccountId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USER_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    AccUserAccount selectByPrimaryKey(Long userAccountId);

    @UpdateProvider(type=AccUserAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccUserAccount record, @Param("example") AccUserAccountExample example);

    @UpdateProvider(type=AccUserAccountSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccUserAccount record, @Param("example") AccUserAccountExample example);

    @UpdateProvider(type=AccUserAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccUserAccount record);

    @Update({
        "update t_acc_user_account",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "ACCOUNT_TYPE_ID = #{accountTypeId,jdbcType=BIGINT},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "ACCOUNT_STS = #{accountSts,jdbcType=CHAR}",
        "where USER_ACCOUNT_ID = #{userAccountId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccUserAccount record);
}