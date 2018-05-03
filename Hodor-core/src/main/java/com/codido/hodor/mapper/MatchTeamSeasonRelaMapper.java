package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchTeamSeasonRela;
import com.codido.hodor.model.MatchTeamSeasonRelaExample;
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

public interface MatchTeamSeasonRelaMapper {
    @SelectProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="countByExample")
    long countByExample(MatchTeamSeasonRelaExample example);

    @DeleteProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchTeamSeasonRelaExample example);

    @Delete({
        "delete from t_match_team_season_rela",
        "where T_S_RELA_ID = #{tSRelaId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long tSRelaId);

    @Insert({
        "insert into t_match_team_season_rela (TEAM_ID, SEASON_ID, ",
        "LEAGUE_ID, RELA_STS, TEAM_SORT, ",
        "TEAM_SCORE, TEAM_SCORE_UPDATE_TIME)",
        "values (#{teamId,jdbcType=BIGINT}, #{seasonId,jdbcType=BIGINT}, ",
        "#{leagueId,jdbcType=BIGINT}, #{relaSts,jdbcType=CHAR}, #{teamSort,jdbcType=INTEGER}, ",
        "#{teamScore,jdbcType=INTEGER}, #{teamScoreUpdateTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="tSRelaId")
    int insert(MatchTeamSeasonRela record);

    @InsertProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="tSRelaId")
    int insertSelective(MatchTeamSeasonRela record);

    @SelectProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="T_S_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="RELA_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TEAM_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="TEAM_SCORE", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="TEAM_SCORE_UPDATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<MatchTeamSeasonRela> selectByExample(MatchTeamSeasonRelaExample example);

    @Select({
        "select",
        "T_S_RELA_ID, TEAM_ID, SEASON_ID, LEAGUE_ID, RELA_STS, TEAM_SORT, TEAM_SCORE, ",
        "TEAM_SCORE_UPDATE_TIME",
        "from t_match_team_season_rela",
        "where T_S_RELA_ID = #{tSRelaId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="T_S_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="TEAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SEASON_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="RELA_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="TEAM_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="TEAM_SCORE", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="TEAM_SCORE_UPDATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    MatchTeamSeasonRela selectByPrimaryKey(Long tSRelaId);

    @UpdateProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchTeamSeasonRela record, @Param("example") MatchTeamSeasonRelaExample example);

    @UpdateProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchTeamSeasonRela record, @Param("example") MatchTeamSeasonRelaExample example);

    @UpdateProvider(type=MatchTeamSeasonRelaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchTeamSeasonRela record);

    @Update({
        "update t_match_team_season_rela",
        "set TEAM_ID = #{teamId,jdbcType=BIGINT},",
          "SEASON_ID = #{seasonId,jdbcType=BIGINT},",
          "LEAGUE_ID = #{leagueId,jdbcType=BIGINT},",
          "RELA_STS = #{relaSts,jdbcType=CHAR},",
          "TEAM_SORT = #{teamSort,jdbcType=INTEGER},",
          "TEAM_SCORE = #{teamScore,jdbcType=INTEGER},",
          "TEAM_SCORE_UPDATE_TIME = #{teamScoreUpdateTime,jdbcType=TIMESTAMP}",
        "where T_S_RELA_ID = #{tSRelaId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchTeamSeasonRela record);
}