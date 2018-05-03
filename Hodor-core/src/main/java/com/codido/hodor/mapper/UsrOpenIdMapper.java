package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrOpenId;
import com.codido.hodor.model.UsrOpenIdExample;
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

public interface UsrOpenIdMapper {
    @SelectProvider(type=UsrOpenIdSqlProvider.class, method="countByExample")
    long countByExample(UsrOpenIdExample example);

    @DeleteProvider(type=UsrOpenIdSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrOpenIdExample example);

    @Delete({
        "delete from t_usr_openid",
        "where RELA_ID = #{relaId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long relaId);

    @Insert({
        "insert into t_usr_openid (USER_ID, WX_OPEN_ID, ",
        "WX_APP_TYPE, WX_SESSION_KEY)",
        "values (#{userId,jdbcType=BIGINT}, #{wxOpenId,jdbcType=VARCHAR}, ",
        "#{wxAppType,jdbcType=VARCHAR}, #{wxSessionKey,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="relaId")
    int insert(UsrOpenId record);

    @InsertProvider(type=UsrOpenIdSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="relaId")
    int insertSelective(UsrOpenId record);

    @SelectProvider(type=UsrOpenIdSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="WX_OPEN_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_APP_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_SESSION_KEY", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<UsrOpenId> selectByExample(UsrOpenIdExample example);

    @Select({
        "select",
        "RELA_ID, USER_ID, WX_OPEN_ID, WX_APP_TYPE, WX_SESSION_KEY",
        "from t_usr_openid",
        "where RELA_ID = #{relaId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="WX_OPEN_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_APP_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_SESSION_KEY", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    UsrOpenId selectByPrimaryKey(Long relaId);

    @UpdateProvider(type=UsrOpenIdSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrOpenId record, @Param("example") UsrOpenIdExample example);

    @UpdateProvider(type=UsrOpenIdSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrOpenId record, @Param("example") UsrOpenIdExample example);

    @UpdateProvider(type=UsrOpenIdSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrOpenId record);

    @Update({
        "update t_usr_openid",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "WX_OPEN_ID = #{wxOpenId,jdbcType=VARCHAR},",
          "WX_APP_TYPE = #{wxAppType,jdbcType=VARCHAR},",
          "WX_SESSION_KEY = #{wxSessionKey,jdbcType=VARCHAR}",
        "where RELA_ID = #{relaId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrOpenId record);
}