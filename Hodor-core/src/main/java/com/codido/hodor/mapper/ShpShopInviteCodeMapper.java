package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpShopInviteCode;
import com.codido.hodor.model.ShpShopInviteCodeExample;
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

public interface ShpShopInviteCodeMapper {
    @SelectProvider(type=ShpShopInviteCodeSqlProvider.class, method="countByExample")
    long countByExample(ShpShopInviteCodeExample example);

    @DeleteProvider(type=ShpShopInviteCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShpShopInviteCodeExample example);

    @Delete({
        "delete from t_shp_shop_invite_code",
        "where INVITE_CODE_ID = #{inviteCodeId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long inviteCodeId);

    @Insert({
        "insert into t_shp_shop_invite_code (SHOP_ID, INVITE_CODE, ",
        "CODE_STS, CODE_CREATE_TIME, ",
        "CODE_EXP_TIME, WX_QRTICKET, ",
        "WX_QRCODE_URL)",
        "values (#{shopId,jdbcType=BIGINT}, #{inviteCode,jdbcType=VARCHAR}, ",
        "#{codeSts,jdbcType=CHAR}, #{codeCreateTime,jdbcType=TIMESTAMP}, ",
        "#{codeExpTime,jdbcType=TIMESTAMP}, #{wxQrticket,jdbcType=VARCHAR}, ",
        "#{wxQrcodeUrl,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="inviteCodeId")
    int insert(ShpShopInviteCode record);

    @InsertProvider(type=ShpShopInviteCodeSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="inviteCodeId")
    int insertSelective(ShpShopInviteCode record);

    @SelectProvider(type=ShpShopInviteCodeSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="INVITE_CODE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="INVITE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CODE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CODE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CODE_EXP_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="WX_QRTICKET", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_QRCODE_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ShpShopInviteCode> selectByExample(ShpShopInviteCodeExample example);

    @Select({
        "select",
        "INVITE_CODE_ID, SHOP_ID, INVITE_CODE, CODE_STS, CODE_CREATE_TIME, CODE_EXP_TIME, ",
        "WX_QRTICKET, WX_QRCODE_URL",
        "from t_shp_shop_invite_code",
        "where INVITE_CODE_ID = #{inviteCodeId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="INVITE_CODE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="INVITE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CODE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CODE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CODE_EXP_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="WX_QRTICKET", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_QRCODE_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ShpShopInviteCode selectByPrimaryKey(Long inviteCodeId);

    @UpdateProvider(type=ShpShopInviteCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShpShopInviteCode record, @Param("example") ShpShopInviteCodeExample example);

    @UpdateProvider(type=ShpShopInviteCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShpShopInviteCode record, @Param("example") ShpShopInviteCodeExample example);

    @UpdateProvider(type=ShpShopInviteCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShpShopInviteCode record);

    @Update({
        "update t_shp_shop_invite_code",
        "set SHOP_ID = #{shopId,jdbcType=BIGINT},",
          "INVITE_CODE = #{inviteCode,jdbcType=VARCHAR},",
          "CODE_STS = #{codeSts,jdbcType=CHAR},",
          "CODE_CREATE_TIME = #{codeCreateTime,jdbcType=TIMESTAMP},",
          "CODE_EXP_TIME = #{codeExpTime,jdbcType=TIMESTAMP},",
          "WX_QRTICKET = #{wxQrticket,jdbcType=VARCHAR},",
          "WX_QRCODE_URL = #{wxQrcodeUrl,jdbcType=VARCHAR}",
        "where INVITE_CODE_ID = #{inviteCodeId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShpShopInviteCode record);
}