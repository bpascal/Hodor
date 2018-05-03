package com.codido.hodor.mapper;

import com.codido.hodor.model.CmmBank;
import com.codido.hodor.model.CmmBankExample;
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

public interface CmmBankMapper {
    @SelectProvider(type=CmmBankSqlProvider.class, method="countByExample")
    long countByExample(CmmBankExample example);

    @DeleteProvider(type=CmmBankSqlProvider.class, method="deleteByExample")
    int deleteByExample(CmmBankExample example);

    @Delete({
        "delete from t_cmm_bank",
        "where BANK_ID = #{bankId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long bankId);

    @Insert({
        "insert into t_cmm_bank (BANK_NAME, BANK_LOGO_URL, ",
        "BANK_CODE)",
        "values (#{bankName,jdbcType=VARCHAR}, #{bankLogoUrl,jdbcType=VARCHAR}, ",
        "#{bankCode,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="bankId")
    int insert(CmmBank record);

    @InsertProvider(type=CmmBankSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="bankId")
    int insertSelective(CmmBank record);

    @SelectProvider(type=CmmBankSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="BANK_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BANK_LOGO_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BANK_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<CmmBank> selectByExample(CmmBankExample example);

    @Select({
        "select",
        "BANK_ID, BANK_NAME, BANK_LOGO_URL, BANK_CODE",
        "from t_cmm_bank",
        "where BANK_ID = #{bankId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="BANK_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BANK_LOGO_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="BANK_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    CmmBank selectByPrimaryKey(Long bankId);

    @UpdateProvider(type=CmmBankSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CmmBank record, @Param("example") CmmBankExample example);

    @UpdateProvider(type=CmmBankSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CmmBank record, @Param("example") CmmBankExample example);

    @UpdateProvider(type=CmmBankSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CmmBank record);

    @Update({
        "update t_cmm_bank",
        "set BANK_NAME = #{bankName,jdbcType=VARCHAR},",
          "BANK_LOGO_URL = #{bankLogoUrl,jdbcType=VARCHAR},",
          "BANK_CODE = #{bankCode,jdbcType=VARCHAR}",
        "where BANK_ID = #{bankId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CmmBank record);
}