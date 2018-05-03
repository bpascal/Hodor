package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrToken;
import com.codido.hodor.model.UsrTokenExample;
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

public interface UsrTokenMapper {
    @SelectProvider(type=UsrTokenSqlProvider.class, method="countByExample")
    long countByExample(UsrTokenExample example);

    @DeleteProvider(type=UsrTokenSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrTokenExample example);

    @Delete({
        "delete from t_usr_token",
        "where TOKEN_ID = #{tokenId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long tokenId);

    @Insert({
        "insert into t_usr_token (USER_ID, TOKEN_STS, ",
        "TOKEN_CREATE_TIME, TOKEN_END_TIME)",
        "values (#{userId,jdbcType=BIGINT}, #{tokenSts,jdbcType=CHAR}, ",
        "#{tokenCreateTime,jdbcType=TIMESTAMP}, #{tokenEndTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="tokenId")
    int insert(UsrToken record);

    @InsertProvider(type=UsrTokenSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="tokenId")
    int insertSelective(UsrToken record);

    @SelectProvider(type=UsrTokenSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="TOKEN_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TOKEN_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TOKEN_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="TOKEN_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<UsrToken> selectByExample(UsrTokenExample example);

    @Select({
        "select",
        "TOKEN_ID, USER_ID, TOKEN_STS, TOKEN_CREATE_TIME, TOKEN_END_TIME",
        "from t_usr_token",
        "where TOKEN_ID = #{tokenId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="TOKEN_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TOKEN_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TOKEN_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="TOKEN_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    UsrToken selectByPrimaryKey(Long tokenId);

    @UpdateProvider(type=UsrTokenSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrToken record, @Param("example") UsrTokenExample example);

    @UpdateProvider(type=UsrTokenSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrToken record, @Param("example") UsrTokenExample example);

    @UpdateProvider(type=UsrTokenSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrToken record);

    @Update({
        "update t_usr_token",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "TOKEN_STS = #{tokenSts,jdbcType=CHAR},",
          "TOKEN_CREATE_TIME = #{tokenCreateTime,jdbcType=TIMESTAMP},",
          "TOKEN_END_TIME = #{tokenEndTime,jdbcType=TIMESTAMP}",
        "where TOKEN_ID = #{tokenId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrToken record);
}