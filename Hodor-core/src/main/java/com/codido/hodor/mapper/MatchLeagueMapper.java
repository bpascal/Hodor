package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchLeague;
import com.codido.hodor.model.MatchLeagueExample;
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

public interface MatchLeagueMapper {
    @SelectProvider(type=MatchLeagueSqlProvider.class, method="countByExample")
    long countByExample(MatchLeagueExample example);

    @DeleteProvider(type=MatchLeagueSqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchLeagueExample example);

    @Delete({
        "delete from t_match_league",
        "where LEAGUE_ID = #{leagueId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long leagueId);

    @Insert({
        "insert into t_match_league (LEAGUE_NAME, LEAGUE_SHOT_NAME, ",
        "LEAGUE_DESC, LEAGUE_ICON_URL, ",
        "LEAGUE_TYPE, LEAGUE_SPORT_TYPE, ",
        "LEAGUE_STS)",
        "values (#{leagueName,jdbcType=VARCHAR}, #{leagueShotName,jdbcType=VARCHAR}, ",
        "#{leagueDesc,jdbcType=VARCHAR}, #{leagueIconUrl,jdbcType=VARCHAR}, ",
        "#{leagueType,jdbcType=VARCHAR}, #{leagueSportType,jdbcType=VARCHAR}, ",
        "#{leagueSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="leagueId")
    int insert(MatchLeague record);

    @InsertProvider(type=MatchLeagueSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="leagueId")
    int insertSelective(MatchLeague record);

    @SelectProvider(type=MatchLeagueSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_SHOT_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_SPORT_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<MatchLeague> selectByExample(MatchLeagueExample example);

    @Select({
        "select",
        "LEAGUE_ID, LEAGUE_NAME, LEAGUE_SHOT_NAME, LEAGUE_DESC, LEAGUE_ICON_URL, LEAGUE_TYPE, ",
        "LEAGUE_SPORT_TYPE, LEAGUE_STS",
        "from t_match_league",
        "where LEAGUE_ID = #{leagueId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="LEAGUE_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LEAGUE_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_SHOT_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_SPORT_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LEAGUE_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    MatchLeague selectByPrimaryKey(Long leagueId);

    @UpdateProvider(type=MatchLeagueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchLeague record, @Param("example") MatchLeagueExample example);

    @UpdateProvider(type=MatchLeagueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchLeague record, @Param("example") MatchLeagueExample example);

    @UpdateProvider(type=MatchLeagueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchLeague record);

    @Update({
        "update t_match_league",
        "set LEAGUE_NAME = #{leagueName,jdbcType=VARCHAR},",
          "LEAGUE_SHOT_NAME = #{leagueShotName,jdbcType=VARCHAR},",
          "LEAGUE_DESC = #{leagueDesc,jdbcType=VARCHAR},",
          "LEAGUE_ICON_URL = #{leagueIconUrl,jdbcType=VARCHAR},",
          "LEAGUE_TYPE = #{leagueType,jdbcType=VARCHAR},",
          "LEAGUE_SPORT_TYPE = #{leagueSportType,jdbcType=VARCHAR},",
          "LEAGUE_STS = #{leagueSts,jdbcType=CHAR}",
        "where LEAGUE_ID = #{leagueId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchLeague record);
}