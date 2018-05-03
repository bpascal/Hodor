package com.codido.hodor.mapper;

import com.codido.hodor.model.MatchPlay;
import com.codido.hodor.model.MatchPlayExample;
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

public interface MatchPlayMapper {
    @SelectProvider(type=MatchPlaySqlProvider.class, method="countByExample")
    long countByExample(MatchPlayExample example);

    @DeleteProvider(type=MatchPlaySqlProvider.class, method="deleteByExample")
    int deleteByExample(MatchPlayExample example);

    @Delete({
        "delete from t_match_play",
        "where MATCH_PLAY_ID = #{matchPlayId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long matchPlayId);

    @Insert({
        "insert into t_match_play (PLAY_NAME, PLAY_LOTTO_ID, ",
        "PLAY_CODE)",
        "values (#{playName,jdbcType=VARCHAR}, #{playLottoId,jdbcType=BIGINT}, ",
        "#{playCode,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="matchPlayId")
    int insert(MatchPlay record);

    @InsertProvider(type=MatchPlaySqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="matchPlayId")
    int insertSelective(MatchPlay record);

    @SelectProvider(type=MatchPlaySqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="MATCH_PLAY_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PLAY_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PLAY_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="PLAY_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<MatchPlay> selectByExample(MatchPlayExample example);

    @Select({
        "select",
        "MATCH_PLAY_ID, PLAY_NAME, PLAY_LOTTO_ID, PLAY_CODE",
        "from t_match_play",
        "where MATCH_PLAY_ID = #{matchPlayId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="MATCH_PLAY_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PLAY_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PLAY_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="PLAY_CODE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    MatchPlay selectByPrimaryKey(Long matchPlayId);

    @UpdateProvider(type=MatchPlaySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MatchPlay record, @Param("example") MatchPlayExample example);

    @UpdateProvider(type=MatchPlaySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MatchPlay record, @Param("example") MatchPlayExample example);

    @UpdateProvider(type=MatchPlaySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MatchPlay record);

    @Update({
        "update t_match_play",
        "set PLAY_NAME = #{playName,jdbcType=VARCHAR},",
          "PLAY_LOTTO_ID = #{playLottoId,jdbcType=BIGINT},",
          "PLAY_CODE = #{playCode,jdbcType=VARCHAR}",
        "where MATCH_PLAY_ID = #{matchPlayId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MatchPlay record);
}