package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrToken;
import com.codido.hodor.model.UsrTokenExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UsrTokenOPMapper {
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
        "insert into t_usr_token (TOKEN_ID, USER_ID, ",
        "TOKEN_STS, TOKEN_CREATE_TIME, ",
        "TOKEN_END_TIME)",
        "values (#{tokenId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{tokenSts,jdbcType=CHAR}, #{tokenCreateTime,jdbcType=TIMESTAMP}, ",
        "#{tokenEndTime,jdbcType=TIMESTAMP}"
    })
    int insert(UsrToken record);

    @InsertProvider(type=UsrTokenSqlProvider.class, method="insertSelective")
    int insertSelective(UsrToken record);

    @SelectProvider(type=UsrTokenSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="TOKEN_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TOKEN_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TOKEN_CREATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="TOKEN_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
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
        @Arg(column="TOKEN_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
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


    @Update({
            "update t_usr_token",
            "set TOKEN_STS = #{tokenSts,jdbcType=CHAR}",
            "where USER_ID = #{userId,jdbcType=BIGINT}"
    })
    int updateTokenStsByUserId(@Param("userId") Long userId,@Param("tokenSts") String tokenSts);
}