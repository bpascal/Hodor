package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrUser;
import com.codido.hodor.model.UsrUserExample;
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

public interface UsrUserMapper {
    @SelectProvider(type=UsrUserSqlProvider.class, method="countByExample")
    long countByExample(UsrUserExample example);

    @DeleteProvider(type=UsrUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrUserExample example);

    @Delete({
        "delete from t_usr_user",
        "where USER_ID = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    @Insert({
        "insert into t_usr_user (USER_NICKNAME, USER_REALNAME, ",
        "USER_MOBILE, USER_EMAIL, ",
        "USER_IDCARD, USER_STS, ",
        "USER_SEX, USER_HEADIMG_URL, ",
        "USER_COUNTRY, USER_PROVINCE, ",
        "USER_CITY, USER_CURRENT_TOKEN_ID, ",
        "USER_WX_TOKEN, USER_WX_OPEN_ID, ",
        "USER_WX_NICKNAME, USER_WX_PRIVILEGE, ",
        "USER_WX_UNIONID, USER_TYPE, ",
        "WX_ACCESS_TOKEN, WX_SESSSION_KEY, ",
        "WX_REFRESH_TOKEN, USER_CREATE_TIME, ",
        "USER_SOURCE)",
        "values (#{userNickname,jdbcType=VARCHAR}, #{userRealname,jdbcType=VARCHAR}, ",
        "#{userMobile,jdbcType=VARCHAR}, #{userEmail,jdbcType=VARCHAR}, ",
        "#{userIdcard,jdbcType=VARCHAR}, #{userSts,jdbcType=CHAR}, ",
        "#{userSex,jdbcType=CHAR}, #{userHeadimgUrl,jdbcType=VARCHAR}, ",
        "#{userCountry,jdbcType=VARCHAR}, #{userProvince,jdbcType=VARCHAR}, ",
        "#{userCity,jdbcType=VARCHAR}, #{userCurrentTokenId,jdbcType=BIGINT}, ",
        "#{userWxToken,jdbcType=VARCHAR}, #{userWxOpenId,jdbcType=VARCHAR}, ",
        "#{userWxNickname,jdbcType=VARCHAR}, #{userWxPrivilege,jdbcType=VARCHAR}, ",
        "#{userWxUnionid,jdbcType=VARCHAR}, #{userType,jdbcType=CHAR}, ",
        "#{wxAccessToken,jdbcType=VARCHAR}, #{wxSesssionKey,jdbcType=VARCHAR}, ",
        "#{wxRefreshToken,jdbcType=VARCHAR}, #{userCreateTime,jdbcType=TIMESTAMP}, ",
        "#{userSource,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="userId")
    int insert(UsrUser record);

    @InsertProvider(type=UsrUserSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="userId")
    int insertSelective(UsrUser record);

    @SelectProvider(type=UsrUserSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_NICKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_REALNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_MOBILE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_EMAIL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_IDCARD", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USER_SEX", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USER_HEADIMG_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_COUNTRY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_PROVINCE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_CITY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_CURRENT_TOKEN_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_WX_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_OPEN_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_NICKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_PRIVILEGE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_UNIONID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="WX_ACCESS_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_SESSSION_KEY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_REFRESH_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="USER_SOURCE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<UsrUser> selectByExample(UsrUserExample example);

    @Select({
        "select",
        "USER_ID, USER_NICKNAME, USER_REALNAME, USER_MOBILE, USER_EMAIL, USER_IDCARD, ",
        "USER_STS, USER_SEX, USER_HEADIMG_URL, USER_COUNTRY, USER_PROVINCE, USER_CITY, ",
        "USER_CURRENT_TOKEN_ID, USER_WX_TOKEN, USER_WX_OPEN_ID, USER_WX_NICKNAME, USER_WX_PRIVILEGE, ",
        "USER_WX_UNIONID, USER_TYPE, WX_ACCESS_TOKEN, WX_SESSSION_KEY, WX_REFRESH_TOKEN, ",
        "USER_CREATE_TIME, USER_SOURCE",
        "from t_usr_user",
        "where USER_ID = #{userId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_NICKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_REALNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_MOBILE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_EMAIL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_IDCARD", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USER_SEX", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USER_HEADIMG_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_COUNTRY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_PROVINCE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_CITY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_CURRENT_TOKEN_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_WX_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_OPEN_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_NICKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_PRIVILEGE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_WX_UNIONID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="WX_ACCESS_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_SESSSION_KEY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_REFRESH_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="USER_SOURCE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    UsrUser selectByPrimaryKey(Long userId);

    @UpdateProvider(type=UsrUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrUser record, @Param("example") UsrUserExample example);

    @UpdateProvider(type=UsrUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrUser record, @Param("example") UsrUserExample example);

    @UpdateProvider(type=UsrUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrUser record);

    @Update({
        "update t_usr_user",
        "set USER_NICKNAME = #{userNickname,jdbcType=VARCHAR},",
          "USER_REALNAME = #{userRealname,jdbcType=VARCHAR},",
          "USER_MOBILE = #{userMobile,jdbcType=VARCHAR},",
          "USER_EMAIL = #{userEmail,jdbcType=VARCHAR},",
          "USER_IDCARD = #{userIdcard,jdbcType=VARCHAR},",
          "USER_STS = #{userSts,jdbcType=CHAR},",
          "USER_SEX = #{userSex,jdbcType=CHAR},",
          "USER_HEADIMG_URL = #{userHeadimgUrl,jdbcType=VARCHAR},",
          "USER_COUNTRY = #{userCountry,jdbcType=VARCHAR},",
          "USER_PROVINCE = #{userProvince,jdbcType=VARCHAR},",
          "USER_CITY = #{userCity,jdbcType=VARCHAR},",
          "USER_CURRENT_TOKEN_ID = #{userCurrentTokenId,jdbcType=BIGINT},",
          "USER_WX_TOKEN = #{userWxToken,jdbcType=VARCHAR},",
          "USER_WX_OPEN_ID = #{userWxOpenId,jdbcType=VARCHAR},",
          "USER_WX_NICKNAME = #{userWxNickname,jdbcType=VARCHAR},",
          "USER_WX_PRIVILEGE = #{userWxPrivilege,jdbcType=VARCHAR},",
          "USER_WX_UNIONID = #{userWxUnionid,jdbcType=VARCHAR},",
          "USER_TYPE = #{userType,jdbcType=CHAR},",
          "WX_ACCESS_TOKEN = #{wxAccessToken,jdbcType=VARCHAR},",
          "WX_SESSSION_KEY = #{wxSesssionKey,jdbcType=VARCHAR},",
          "WX_REFRESH_TOKEN = #{wxRefreshToken,jdbcType=VARCHAR},",
          "USER_CREATE_TIME = #{userCreateTime,jdbcType=TIMESTAMP},",
          "USER_SOURCE = #{userSource,jdbcType=VARCHAR}",
        "where USER_ID = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrUser record);
}