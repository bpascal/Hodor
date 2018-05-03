package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchTeam;
import com.codido.hodor.model.MatchTeamExample;
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

public interface MatchTeamMapper {
    @SelectProvider(type=MatchTeamSqlProvider.class, method="countByExample")
    long countByExample(MatchTeamExample example);

    @DeleteProvider(type=MatchTeamSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchTeamExample example);

    @Delete({
        "delete from t_match_team",
        "where TEAM_ID = #{teamId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long teamId);

    @Insert({
        "insert into t_match_team (TEAM_NAME, TEAM_SHORT_NAME, ",
        "TEAM_ICON_URL, TEAM_DESC, ",
        "TEAM_ADDRESS, TEAM_SPORT_TYPE, ",
        "TEAM_STS, SPORTTERY_TEAM_ID)",
        "values (#{teamName,jdbcType=VARCHAR}, #{teamShortName,jdbcType=VARCHAR}, ",
        "#{teamIconUrl,jdbcType=VARCHAR}, #{teamDesc,jdbcType=VARCHAR}, ",
        "#{teamAddress,jdbcType=VARCHAR}, #{teamSportType,jdbcType=VARCHAR}, ",
        "#{teamSts,jdbcType=CHAR}, #{sportteryTeamId,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="teamId")
    int insert(MatchTeam record);

    @InsertProvider(type=MatchTeamSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="teamId")
    int insertSelective(MatchTeam record);

    @SelectProvider(type=MatchTeamSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_SHORT_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_SPORT_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SPORTTERY_TEAM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MatchTeam> selectByExample(MatchTeamExample example);

    @Select({
        "select",
        "TEAM_ID, TEAM_NAME, TEAM_SHORT_NAME, TEAM_ICON_URL, TEAM_DESC, TEAM_ADDRESS, ",
        "TEAM_SPORT_TYPE, TEAM_STS, SPORTTERY_TEAM_ID",
        "from t_match_team",
        "where TEAM_ID = #{teamId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="TEAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_SHORT_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_SPORT_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TEAM_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SPORTTERY_TEAM_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    MatchTeam selectByPrimaryKey(Long teamId);

    @UpdateProvider(type=MatchTeamSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchTeam record, @Param("example") MatchTeamExample example);

    @UpdateProvider(type=MatchTeamSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchTeam record, @Param("example") MatchTeamExample example);

    @UpdateProvider(type=MatchTeamSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchTeam record);

    @Update({
        "update t_match_team",
        "set TEAM_NAME = #{teamName,jdbcType=VARCHAR},",
          "TEAM_SHORT_NAME = #{teamShortName,jdbcType=VARCHAR},",
          "TEAM_ICON_URL = #{teamIconUrl,jdbcType=VARCHAR},",
          "TEAM_DESC = #{teamDesc,jdbcType=VARCHAR},",
          "TEAM_ADDRESS = #{teamAddress,jdbcType=VARCHAR},",
          "TEAM_SPORT_TYPE = #{teamSportType,jdbcType=VARCHAR},",
          "TEAM_STS = #{teamSts,jdbcType=CHAR},",
          "SPORTTERY_TEAM_ID = #{sportteryTeamId,jdbcType=VARCHAR}",
        "where TEAM_ID = #{teamId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchTeam record);
}