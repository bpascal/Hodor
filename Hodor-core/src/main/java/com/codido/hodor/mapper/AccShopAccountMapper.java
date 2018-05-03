package com.codido.hodor.mapper;

import com.codido.hodor.model.AccShopAccount;
import com.codido.hodor.model.AccShopAccountExample;
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

public interface AccShopAccountMapper {
    @SelectProvider(type=AccShopAccountSqlProvider.class, method="countByExample")
    long countByExample(AccShopAccountExample example);

    @DeleteProvider(type=AccShopAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccShopAccountExample example);

    @Delete({
        "delete from t_acc_shop_account",
        "where SHOP_ACCOUNT_ID = #{shopAccountId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long shopAccountId);

    @Insert({
        "insert into t_acc_shop_account (SHOP_ID, ACCOUNT_TYPE_ID, ",
        "AMOUNT, ACCOUNT_STS)",
        "values (#{shopId,jdbcType=BIGINT}, #{accountTypeId,jdbcType=BIGINT}, ",
        "#{amount,jdbcType=DECIMAL}, #{accountSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="shopAccountId")
    int insert(AccShopAccount record);

    @InsertProvider(type=AccShopAccountSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="shopAccountId")
    int insertSelective(AccShopAccount record);

    @SelectProvider(type=AccShopAccountSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SHOP_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<AccShopAccount> selectByExample(AccShopAccountExample example);

    @Select({
        "select",
        "SHOP_ACCOUNT_ID, SHOP_ID, ACCOUNT_TYPE_ID, AMOUNT, ACCOUNT_STS",
        "from t_acc_shop_account",
        "where SHOP_ACCOUNT_ID = #{shopAccountId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SHOP_ACCOUNT_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ACCOUNT_TYPE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="AMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ACCOUNT_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    AccShopAccount selectByPrimaryKey(Long shopAccountId);

    @UpdateProvider(type=AccShopAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccShopAccount record, @Param("example") AccShopAccountExample example);

    @UpdateProvider(type=AccShopAccountSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccShopAccount record, @Param("example") AccShopAccountExample example);

    @UpdateProvider(type=AccShopAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccShopAccount record);

    @Update({
        "update t_acc_shop_account",
        "set SHOP_ID = #{shopId,jdbcType=BIGINT},",
          "ACCOUNT_TYPE_ID = #{accountTypeId,jdbcType=BIGINT},",
          "AMOUNT = #{amount,jdbcType=DECIMAL},",
          "ACCOUNT_STS = #{accountSts,jdbcType=CHAR}",
        "where SHOP_ACCOUNT_ID = #{shopAccountId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AccShopAccount record);
}