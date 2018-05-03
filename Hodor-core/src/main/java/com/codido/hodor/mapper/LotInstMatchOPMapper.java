package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInstMatch;
import com.codido.hodor.model.LotInstMatchExample;
import com.codido.hodor.model.LotInstMatchOP;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LotInstMatchOPMapper {

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
        "LOT_INST_MATCH_RESULT ",
        "from t_lot_inst_match ",
        "where LOTTO_INST_ID = #{lotInstId,jdbcType=BIGINT} AND LOT_INST_MATCH_STS = 'A' ORDER BY MATCH_SORT ASC"
    })
    @Results({
        @Result(property = "lotInstMatchId", column = "LOT_INST_MATCH_ID"),
        @Result(property = "lottoInstId", column = "LOTTO_INST_ID"),
        @Result(property = "lotMatch", column = "MATCH_ID",one = @One(select = "com.codido.hodor.mapper.LotMatchMapper.selectByPrimaryKey")),
        @Result(property = "matchSort", column = "MATCH_SORT"),
        @Result(property = "lotInstMatchSts", column = "LOT_INST_MATCH_STS"),
        @Result(property = "lotInstMatchResult", column = "LOT_INST_MATCH_RESULT")
    })
    @ConstructorArgs({
        @Arg(column="LOT_INST_MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MATCH_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="LOT_INST_MATCH_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOT_INST_MATCH_RESULT", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<LotInstMatchOP> selectByLotInstId(@Param("lotInstId") Long lotInstId);
}