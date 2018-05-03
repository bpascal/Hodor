package com.codido.hodor.mapper;

import com.codido.hodor.model.AccPlatAccount;
import com.codido.hodor.model.AccPlatAccountExample;
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

public interface AccPlatAccountMapper {
    @SelectProvider(type=AccPlatAccountSqlProvider.class, method="countByExample")
    long countByExample(AccPlatAccountExample example);

    @DeleteProvider(type=AccPlatAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccPlatAccountExample example);

    @Delete({
        "delete from t_acc_plat_account",
        "where PLAT_ACCOUNT_ID = #{platAccountId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long platAccountId);

    @Insert({
        "insert into t_acc_plat_account (ACCOUNT_TYPE_ID, AMOUNT, ",
        "ACCOUNT_STS)",
        "values (#{accountTypeId,jdbcType=BIGINT}, #{amount,jdbcType=DECIMAL}, ",
        "#{accountSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="platAccountId")
    int insert(AccPlatAccount record);

    @InsertProvider(type=AccPlatAccountSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="platAccountId")
    int insertSelective(AccPlatAccount record);

    @SelectProvider(type=AccPlatAccountSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="PLAT_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccPlatAccount> selectByExample(AccPlatAccountExample example);

    @Select({
        "select",
        "PLAT_ACCOUNT_ID, ACCOUNT_TYPE_ID, AMOUNT, ACCOUNT_STS",
        "from t_acc_plat_account",
        "where PLAT_ACCOUNT_ID = #{platAccountId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="PLAT_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    AccPlatAccount selectByPrimaryKey(Long platAccountId);

    @UpdateProvider(type=AccPlatAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccPlatAccount record, @Param("example") AccPlatAccountExample example);

    @UpdateProvider(type=AccPlatAccountSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccPlatAccount record, @Param("example") AccPlatAccountExample example);

    @UpdateProvider(type=AccPlatAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccPlatAccount record);

    @Update({
        "update t_acc_plat_account",
        "set ACCOUNT_TYPE_ID = #{accountTypeId,jdbcType=BIGINT},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "ACCOUNT_STS = #{accountSts,jdbcType=CHAR}",
        "where PLAT_ACCOUNT_ID = #{platAccountId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccPlatAccount record);
}