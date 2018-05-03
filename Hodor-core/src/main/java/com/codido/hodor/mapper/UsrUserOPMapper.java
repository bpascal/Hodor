package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrUser;
import com.codido.hodor.model.UsrUserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UsrUserOPMapper {
    @Select({
            "select",
            "USER_ID, USER_NICKNAME, USER_REALNAME, USER_MOBILE, USER_EMAIL, USER_IDCARD, ",
            "USER_STS, USER_SEX, USER_HEADIMG_URL, USER_COUNTRY, USER_PROVINCE, USER_CITY, ",
            "USER_CURRENT_TOKEN_ID, USER_WX_TOKEN, USER_WX_OPEN_ID, USER_WX_NICKNAME, USER_WX_PRIVILEGE, ",
            "USER_WX_UNIONID, USER_TYPE, WX_ACCESS_TOKEN, WX_SESSSION_KEY, WX_REFRESH_TOKEN, ",
            "USER_CREATE_TIME, USER_SOURCE",
            "from t_usr_user",
            "where USER_WX_UNIONID = #{unionId,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_REALNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_MOBILE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_EMAIL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_IDCARD", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_SEX", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_HEADIMG_URL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_COUNTRY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_PROVINCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CITY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CURRENT_TOKEN_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "USER_WX_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_PRIVILEGE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_UNIONID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_TYPE", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "WX_ACCESS_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_REFRESH_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CREATE_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "USER_SOURCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    UsrUser selectByUnionId(@Param("unionId") String unionId);

    /**
     * 根据openid和wxAppType获取用户信息，之前写死了WX_LOTTOSTORE，现在做一下修改
     *
     * @param openId
     * @param wxAppType
     * @return
     */
    @Select({
            "select",
            "a.USER_ID, USER_NICKNAME, USER_REALNAME, USER_MOBILE, USER_EMAIL, USER_IDCARD, ",
            "USER_STS, USER_SEX, USER_HEADIMG_URL, USER_COUNTRY, USER_PROVINCE, USER_CITY, ",
            "USER_CURRENT_TOKEN_ID, USER_WX_TOKEN, USER_WX_OPEN_ID, USER_WX_NICKNAME, USER_WX_PRIVILEGE, ",
            "USER_WX_UNIONID, USER_TYPE, WX_ACCESS_TOKEN, WX_SESSSION_KEY, WX_REFRESH_TOKEN, ",
            "USER_CREATE_TIME, USER_SOURCE",
            "from t_usr_user a,t_usr_openid b",
            "where b.WX_OPEN_ID = #{openId,jdbcType=VARCHAR} AND b.USER_ID = a.USER_ID AND WX_APP_TYPE = #{wxAppType,jdbcType=VARCHAR} limit 1"
    })
    @ConstructorArgs({
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_REALNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_MOBILE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_EMAIL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_IDCARD", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_SEX", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_HEADIMG_URL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_COUNTRY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_PROVINCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CITY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CURRENT_TOKEN_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "USER_WX_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_PRIVILEGE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_UNIONID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_TYPE", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "WX_ACCESS_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_REFRESH_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CREATE_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "USER_SOURCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    UsrUser selectByOpenId(@Param("openId") String openId, @Param("wxAppType") String wxAppType);

    @Select({
            "select",
            "a.USER_ID, USER_NICKNAME, USER_REALNAME, USER_MOBILE, USER_EMAIL, USER_IDCARD, ",
            "USER_STS, USER_SEX, USER_HEADIMG_URL, USER_COUNTRY, USER_PROVINCE, USER_CITY, ",
            "USER_CURRENT_TOKEN_ID, USER_WX_TOKEN, USER_WX_OPEN_ID, USER_WX_NICKNAME, USER_WX_PRIVILEGE, ",
            "USER_WX_UNIONID, USER_TYPE, WX_ACCESS_TOKEN, WX_SESSSION_KEY, WX_REFRESH_TOKEN, ",
            "USER_CREATE_TIME, USER_SOURCE",
            "from t_usr_user a,t_usr_token b",
            "where a.USER_ID = b.USER_ID ",
            "AND b.TOKEN_ID = #{tokenId,jdbcType=BIGINT} ",
            "AND b.TOKEN_STS = 'A' ",
            "limit 1"
    })
    @ConstructorArgs({
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_REALNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_MOBILE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_EMAIL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_IDCARD", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_SEX", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_HEADIMG_URL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_COUNTRY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_PROVINCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CITY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CURRENT_TOKEN_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "USER_WX_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_PRIVILEGE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_UNIONID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_TYPE", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "WX_ACCESS_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_REFRESH_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CREATE_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "USER_SOURCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    UsrUser selectByTokenId(@Param("tokenId") long tokenId);
    //TODO Junjie.Lai 这个方法，要同时判断用户token失效时间，以后加

    @Select({
            "select",
            "a.USER_ID, USER_NICKNAME, USER_REALNAME, USER_MOBILE, USER_EMAIL, USER_IDCARD, ",
            "USER_STS, USER_SEX, USER_HEADIMG_URL, USER_COUNTRY, USER_PROVINCE, USER_CITY, ",
            "USER_CURRENT_TOKEN_ID, USER_WX_TOKEN, USER_WX_OPEN_ID, USER_WX_NICKNAME, USER_WX_PRIVILEGE, ",
            "USER_WX_UNIONID, USER_TYPE, WX_ACCESS_TOKEN, WX_SESSSION_KEY, WX_REFRESH_TOKEN, ",
            "USER_CREATE_TIME, USER_SOURCE",
            "from t_usr_user a",
            "where (USER_MOBILE = #{mblNo,jdbcType=VARCHAR} or USER_IDCARD = #{idNo,jdbcType=VARCHAR}) AND USER_SOURCE = #{channelFlag,jdbcType=VARCHAR}",
            "limit 1"
    })
    @ConstructorArgs({
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_REALNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_MOBILE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_EMAIL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_IDCARD", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_SEX", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "USER_HEADIMG_URL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_COUNTRY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_PROVINCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CITY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CURRENT_TOKEN_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "USER_WX_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_NICKNAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_PRIVILEGE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_WX_UNIONID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_TYPE", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "WX_ACCESS_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_REFRESH_TOKEN", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "USER_CREATE_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "USER_SOURCE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    UsrUser selectByMblNoOrIdCard(@Param("mblNo") String mblNo,@Param("idNo") String idNo,@Param("channelFlag") String channelFlag);
}