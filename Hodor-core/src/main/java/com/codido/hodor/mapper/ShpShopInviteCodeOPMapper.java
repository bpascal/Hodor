package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpShop;
import com.codido.hodor.model.ShpShopInviteCode;
import com.codido.hodor.model.ShpShopInviteCodeExample;
import com.codido.hodor.model.ShpShopInviteCodeWithShop;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface ShpShopInviteCodeOPMapper {
    @SelectProvider(type=ShpShopInviteCodeSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="INVITE_CODE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="INVITE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CODE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CODE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CODE_EXP_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
    })
    List<ShpShopInviteCode> selectByExample(ShpShopInviteCodeExample example);

    @Select({
        "select",
        "INVITE_CODE_ID, SHOP_ID, INVITE_CODE, CODE_STS, CODE_CREATE_TIME, CODE_EXP_TIME",
        "from t_shp_shop_invite_code",
        "where INVITE_CODE = #{inviteCode,jdbcType=BIGINT} AND CODE_STS = 'A' AND (CODE_EXP_TIME>NOW() OR CODE_EXP_TIME IS NULL)"
    })
    @Results({
            @Result(property = "inviteCodeId", column = "INVITE_CODE_ID"),
            @Result(property = "shpShop", column = "SHOP_ID",one = @One(select = "com.codido.hodor.mapper.ShpShopMapper.selectByPrimaryKey")),
            @Result(property = "inviteCode", column = "INVITE_CODE"),
            @Result(property = "codeSts", column = "CODE_STS"),
            @Result(property = "codeCreateTime", column = "CODE_CREATE_TIME"),
            @Result(property = "codeExpTime", column = "CODE_EXP_TIME")
    })
    @ConstructorArgs({
        @Arg(column="INVITE_CODE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="INVITE_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CODE_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="CODE_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CODE_EXP_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
    })
    ShpShopInviteCodeWithShop selectShopByInviteCode(@Param("inviteCode") String inviteCode);
}