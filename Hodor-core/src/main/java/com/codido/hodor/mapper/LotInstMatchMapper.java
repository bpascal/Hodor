package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInstMatch;
import com.codido.hodor.model.LotInstMatchExample;
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

public interface LotInstMatchMapper {
    @SelectProvider(type=LotInstMatchSqlProvider.class, method="countByExample")
    long countByExample(LotInstMatchExample example);

    @DeleteProvider(type=LotInstMatchSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotInstMatchExample example);

    @Delete({
        "delete from t_lot_inst_match",
        "where LOT_INST_MATCH_ID = #{lotInstMatchId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long lotInstMatchId);

    @Insert({
        "insert into t_lot_inst_match (LOTTO_INST_ID, MATCH_ID, ",
        "MATCH_SORT, LOT_INST_MATCH_STS, ",
        "LOT_INST_MATCH_RESULT)",
        "values (#{lottoInstId,jdbcType=BIGINT}, #{matchId,jdbcType=BIGINT}, ",
        "#{matchSort,jdbcType=INTEGER}, #{lotInstMatchSts,jdbcType=CHAR}, ",
        "#{lotInstMatchResult,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="lotInstMatchId")
    int insert(LotInstMatch record);

    @InsertProvider(type=LotInstMatchSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="lotInstMatchId")
    int insertSelective(LotInstMatch record);

    @SelectProvider(type=LotInstMatchSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="LOT_INST_MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOT_INST_MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOT_INST_MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<LotInstMatch> selectByExample(LotInstMatchExample example);

    @Select({
        "select",
        "LOT_INST_MATCH_ID, LOTTO_INST_ID, MATCH_ID, MATCH_SORT, LOT_INST_MATCH_STS, ",
        "LOT_INST_MATCH_RESULT",
        "from t_lot_inst_match",
        "where LOT_INST_MATCH_ID = #{lotInstMatchId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="LOT_INST_MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOT_INST_MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOT_INST_MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    LotInstMatch selectByPrimaryKey(Long lotInstMatchId);

    @UpdateProvider(type=LotInstMatchSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotInstMatch record, @Param("example") LotInstMatchExample example);

    @UpdateProvider(type=LotInstMatchSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotInstMatch record, @Param("example") LotInstMatchExample example);

    @UpdateProvider(type=LotInstMatchSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotInstMatch record);

    @Update({
        "update t_lot_inst_match",
        "set LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT},",
          "MATCH_ID = #{matchId,jdbcType=BIGINT},",
          "MATCH_SORT = #{matchSort,jdbcType=INTEGER},",
          "LOT_INST_MATCH_STS = #{lotInstMatchSts,jdbcType=CHAR},",
          "LOT_INST_MATCH_RESULT = #{lotInstMatchResult,jdbcType=CHAR}",
        "where LOT_INST_MATCH_ID = #{lotInstMatchId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotInstMatch record);
}