package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpBankcard;
import com.codido.hodor.model.ShpBankcardExample;
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

public interface ShpBankcardMapper {
    @SelectProvider(type=ShpBankcardSqlProvider.class, method="countByExample")
    long countByExample(ShpBankcardExample example);

    @DeleteProvider(type=ShpBankcardSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShpBankcardExample example);

    @Delete({
        "delete from t_shp_bankcard",
        "where SHOP_BANKCARD_ID = #{shopBankcardId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long shopBankcardId);

    @Insert({
        "insert into t_shp_bankcard (SHOP_ID, BANK_ID, ",
        "BANK_CARD_NO, SHOP_BANKCARD_STS, ",
        "BANK_CARD_OWNER_NAME, BIND_TIME)",
        "values (#{shopId,jdbcType=BIGINT}, #{bankId,jdbcType=BIGINT}, ",
        "#{bankCardNo,jdbcType=VARCHAR}, #{shopBankcardSts,jdbcType=CHAR}, ",
        "#{bankCardOwnerName,jdbcType=VARCHAR}, #{bindTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="shopBankcardId")
    int insert(ShpBankcard record);

    @InsertProvider(type=ShpBankcardSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="shopBankcardId")
    int insertSelective(ShpBankcard record);

    @SelectProvider(type=ShpBankcardSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SHOP_BANKCARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_BANKCARD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BANK_CARD_OWNER_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BIND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<ShpBankcard> selectByExample(ShpBankcardExample example);

    @Select({
        "select",
        "SHOP_BANKCARD_ID, SHOP_ID, BANK_ID, BANK_CARD_NO, SHOP_BANKCARD_STS, BANK_CARD_OWNER_NAME, ",
        "BIND_TIME",
        "from t_shp_bankcard",
        "where SHOP_BANKCARD_ID = #{shopBankcardId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SHOP_BANKCARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_BANKCARD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="BANK_CARD_OWNER_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BIND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    ShpBankcard selectByPrimaryKey(Long shopBankcardId);

    @UpdateProvider(type=ShpBankcardSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShpBankcard record, @Param("example") ShpBankcardExample example);

    @UpdateProvider(type=ShpBankcardSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShpBankcard record, @Param("example") ShpBankcardExample example);

    @UpdateProvider(type=ShpBankcardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShpBankcard record);

    @Update({
        "update t_shp_bankcard",
        "set SHOP_ID = #{shopId,jdbcType=BIGINT},",
          "BANK_ID = #{bankId,jdbcType=BIGINT},",
          "BANK_CARD_NO = #{bankCardNo,jdbcType=VARCHAR},",
          "SHOP_BANKCARD_STS = #{shopBankcardSts,jdbcType=CHAR},",
          "BANK_CARD_OWNER_NAME = #{bankCardOwnerName,jdbcType=VARCHAR},",
          "BIND_TIME = #{bindTime,jdbcType=TIMESTAMP}",
        "where SHOP_BANKCARD_ID = #{shopBankcardId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShpBankcard record);
}