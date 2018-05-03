package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrFollowMatch;
import com.codido.hodor.model.UsrFollowMatchExample;
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

public interface UsrFollowMatchMapper {
    @SelectProvider(type=UsrFollowMatchSqlProvider.class, method="countByExample")
    long countByExample(UsrFollowMatchExample example);

    @DeleteProvider(type=UsrFollowMatchSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrFollowMatchExample example);

    @Delete({
        "delete from t_usr_follow_match",
        "where FOLLOW_ID = #{followId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long followId);

    @Insert({
        "insert into t_usr_follow_match (USER_ID, MATCH_ID, ",
        "MATCH_TYPE, FOLLOW_DATE, ",
        "FOLLOW_TIME, FOLLOW_STS, ",
        "FORM_ID, ORDER_PUSHMSG_STS)",
        "values (#{userId,jdbcType=BIGINT}, #{matchId,jdbcType=BIGINT}, ",
        "#{matchType,jdbcType=VARCHAR}, #{followDate,jdbcType=DATE}, ",
        "#{followTime,jdbcType=TIME}, #{followSts,jdbcType=CHAR}, ",
        "#{formId,jdbcType=VARCHAR}, #{orderPushmsgSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="followId")
    int insert(UsrFollowMatch record);

    @InsertProvider(type=UsrFollowMatchSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="followId")
    int insertSelective(UsrFollowMatch record);

    @SelectProvider(type=UsrFollowMatchSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="FOLLOW_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="FOLLOW_DATE", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="FOLLOW_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="FOLLOW_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="FORM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_PUSHMSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<UsrFollowMatch> selectByExample(UsrFollowMatchExample example);

    @Select({
        "select",
        "FOLLOW_ID, USER_ID, MATCH_ID, MATCH_TYPE, FOLLOW_DATE, FOLLOW_TIME, FOLLOW_STS, ",
        "FORM_ID, ORDER_PUSHMSG_STS",
        "from t_usr_follow_match",
        "where FOLLOW_ID = #{followId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="FOLLOW_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="FOLLOW_DATE", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="FOLLOW_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="FOLLOW_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="FORM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ORDER_PUSHMSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    UsrFollowMatch selectByPrimaryKey(Long followId);

    @UpdateProvider(type=UsrFollowMatchSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrFollowMatch record, @Param("example") UsrFollowMatchExample example);

    @UpdateProvider(type=UsrFollowMatchSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrFollowMatch record, @Param("example") UsrFollowMatchExample example);

    @UpdateProvider(type=UsrFollowMatchSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrFollowMatch record);

    @Update({
        "update t_usr_follow_match",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "MATCH_ID = #{matchId,jdbcType=BIGINT},",
          "MATCH_TYPE = #{matchType,jdbcType=VARCHAR},",
          "FOLLOW_DATE = #{followDate,jdbcType=DATE},",
          "FOLLOW_TIME = #{followTime,jdbcType=TIME},",
          "FOLLOW_STS = #{followSts,jdbcType=CHAR},",
          "FORM_ID = #{formId,jdbcType=VARCHAR},",
          "ORDER_PUSHMSG_STS = #{orderPushmsgSts,jdbcType=CHAR}",
        "where FOLLOW_ID = #{followId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrFollowMatch record);
}