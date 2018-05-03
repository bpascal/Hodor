package com.codido.hodor.mapper;

import com.codido.hodor.model.PubWxInfo;
import com.codido.hodor.model.PubWxInfoExample;
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

public interface PubWxInfoMapper {
    @SelectProvider(type=PubWxInfoSqlProvider.class, method="countByExample")
    long countByExample(PubWxInfoExample example);

    @DeleteProvider(type=PubWxInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(PubWxInfoExample example);

    @Delete({
        "delete from t_pub_wxinfo",
        "where WX_INFO_ID = #{wxInfoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long wxInfoId);

    @Insert({
        "insert into t_pub_wxinfo (WX_APP_ID, WX_APP_SECRET, ",
        "WX_ACCESS_TOKEN, ACCESS_TOKEN_EXP_TIME)",
        "values (#{wxAppId,jdbcType=VARCHAR}, #{wxAppSecret,jdbcType=VARCHAR}, ",
        "#{wxAccessToken,jdbcType=VARCHAR}, #{accessTokenExpTime,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="wxInfoId")
    int insert(PubWxInfo record);

    @InsertProvider(type=PubWxInfoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="wxInfoId")
    int insertSelective(PubWxInfo record);

    @SelectProvider(type=PubWxInfoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="WX_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="WX_APP_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_APP_SECRET", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_ACCESS_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACCESS_TOKEN_EXP_TIME", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<PubWxInfo> selectByExample(PubWxInfoExample example);

    @Select({
        "select",
        "WX_INFO_ID, WX_APP_ID, WX_APP_SECRET, WX_ACCESS_TOKEN, ACCESS_TOKEN_EXP_TIME",
        "from t_pub_wxinfo",
        "where WX_INFO_ID = #{wxInfoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="WX_INFO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="WX_APP_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_APP_SECRET", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="WX_ACCESS_TOKEN", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ACCESS_TOKEN_EXP_TIME", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    PubWxInfo selectByPrimaryKey(Long wxInfoId);

    @UpdateProvider(type=PubWxInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PubWxInfo record, @Param("example") PubWxInfoExample example);

    @UpdateProvider(type=PubWxInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PubWxInfo record, @Param("example") PubWxInfoExample example);

    @UpdateProvider(type=PubWxInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PubWxInfo record);

    @Update({
        "update t_pub_wxinfo",
        "set WX_APP_ID = #{wxAppId,jdbcType=VARCHAR},",
          "WX_APP_SECRET = #{wxAppSecret,jdbcType=VARCHAR},",
          "WX_ACCESS_TOKEN = #{wxAccessToken,jdbcType=VARCHAR},",
          "ACCESS_TOKEN_EXP_TIME = #{accessTokenExpTime,jdbcType=INTEGER}",
        "where WX_INFO_ID = #{wxInfoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PubWxInfo record);
}