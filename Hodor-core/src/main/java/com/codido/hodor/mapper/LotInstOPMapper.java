package com.codido.hodor.mapper;

import com.codido.hodor.model.LotInst;
import com.codido.hodor.model.LotInstOP;
import com.codido.hodor.model.LotInstWithLotto;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface LotInstOPMapper {

    @Select({"select",
            "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC, TM_SMP ",
            "from t_lot_inst ",
            "where LOTTO_ID = #{LOTTO_ID,jdbcType=BIGINT} and PERIOD_STS IN ('R') AND PERIOD_END_TIME > NOW() ORDER BY PERIOD_END_TIME ASC LIMIT 1"})
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    LotInst selectOnSellLotto(Long lottoId);

    @Select({"select",
            "LOTTO_ID,max(LOTTO_INST_ID) LOTTO_INST_ID",
            "from t_lot_inst",
            "where PERIOD_STS = 'E' group by LOTTO_ID"})
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT)
    })
    List<LotInstOP> selectInsts();

    @Select({"select",
            "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC, TM_SMP ",
            "from t_lot_inst ",
            "where LOTTO_ID = #{lottoId,jdbcType=BIGINT} and PERIOD_STS = 'E' order by PERIOD_BONUS_TIME DESC limit #{startNum,jdbcType=INTEGER},#{num,jdbcType=INTEGER}"})
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    List<LotInst> selectHistoryInsts(@Param("lottoId") Long lottoId, @Param("startNum") int startNum, @Param("num") int num);


    @Select({"select",
            "LOTTO_INST_ID, a.LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC",
            "from t_lot_inst a,t_shp_lotto_rela b ",
            "where a.PERIOD_STS ='R' AND a.LOTTO_ID = b.LOTTO_ID AND b.SHOP_ID = #{shopId,jdbcType=BIGINT} AND b.LOTTO_TRAD_STS='A' AND PERIOD_END_TIME>NOW() ORDER BY PERIOD_END_TIME DESC"})
    @Results({
            @Result(property = "lottoInstId", column = "LOTTO_INST_ID"),
            @Result(property = "lotLotto", column = "LOTTO_ID", one = @One(select = "com.codido.hodor.mapper.LotLottoMapper.selectByPrimaryKey")),
            @Result(property = "periodName", column = "PERIOD_NAME"),
            @Result(property = "periodBeginTime", column = "PERIOD_BEGIN_TIME"),
            @Result(property = "periodEndTime", column = "PERIOD_END_TIME"),
            @Result(property = "periodBonusTime", column = "PERIOD_BONUS_TIME"),
            @Result(property = "periodSts", column = "PERIOD_STS"),
            @Result(property = "periodTags", column = "PERIOD_TAGS"),
            @Result(property = "periodTagsName", column = "PERIOD_TAGS_NAME"),
            @Result(property = "periodBonusNumber", column = "PERIOD_BONUS_NUMBER"),
            @Result(property = "periodTotalSell", column = "PERIOD_TOTAL_SELL"),
            @Result(property = "periodTotalBonus", column = "PERIOD_TOTAL_BONUS"),
            @Result(property = "periodTotalBonusDesc", column = "PERIOD_TOTAL_BONUS_DESC")
    })
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    List<LotInstWithLotto> selectShopNewestLottoInstList(@Param("shopId") Long shopId);


    @Select({"select",
            "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC, TM_SMP",
            "from t_lot_inst ",
            "where PERIOD_STS IN ('R','A') AND LOTTO_ID = #{lottoId,jdbcType=BIGINT} ORDER BY PERIOD_END_TIME DESC limit 1"})
    @Results({
            @Result(property = "lottoInstId", column = "LOTTO_INST_ID"),
            @Result(property = "lotLotto", column = "LOTTO_ID", one = @One(select = "com.codido.hodor.mapper.LotLottoMapper.selectByPrimaryKey")),
            @Result(property = "periodName", column = "PERIOD_NAME"),
            @Result(property = "periodBeginTime", column = "PERIOD_BEGIN_TIME"),
            @Result(property = "periodEndTime", column = "PERIOD_END_TIME"),
            @Result(property = "periodBonusTime", column = "PERIOD_BONUS_TIME"),
            @Result(property = "periodSts", column = "PERIOD_STS"),
            @Result(property = "periodTags", column = "PERIOD_TAGS"),
            @Result(property = "periodTagsName", column = "PERIOD_TAGS_NAME"),
            @Result(property = "periodBonusNumber", column = "PERIOD_BONUS_NUMBER"),
            @Result(property = "periodTotalSell", column = "PERIOD_TOTAL_SELL"),
            @Result(property = "periodTotalBonus", column = "PERIOD_TOTAL_BONUS"),
            @Result(property = "periodTotalBonusDesc", column = "PERIOD_TOTAL_BONUS_DESC")
    })
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    LotInstWithLotto selectLottoInstWithLotto(@Param("lottoId") Long lottoId);


    @Select({"select",
            "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC, TM_SMP",
            "from t_lot_inst ",
            "where LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT} ORDER BY PERIOD_END_TIME DESC limit 1"})
    @Results({
            @Result(property = "lottoInstId", column = "LOTTO_INST_ID"),
            @Result(property = "lotLotto", column = "LOTTO_ID", one = @One(select = "com.codido.hodor.mapper.LotLottoMapper.selectByPrimaryKey")),
            @Result(property = "periodName", column = "PERIOD_NAME"),
            @Result(property = "periodBeginTime", column = "PERIOD_BEGIN_TIME"),
            @Result(property = "periodEndTime", column = "PERIOD_END_TIME"),
            @Result(property = "periodBonusTime", column = "PERIOD_BONUS_TIME"),
            @Result(property = "periodSts", column = "PERIOD_STS"),
            @Result(property = "periodTags", column = "PERIOD_TAGS"),
            @Result(property = "periodTagsName", column = "PERIOD_TAGS_NAME"),
            @Result(property = "periodBonusNumber", column = "PERIOD_BONUS_NUMBER"),
            @Result(property = "periodTotalSell", column = "PERIOD_TOTAL_SELL"),
            @Result(property = "periodTotalBonus", column = "PERIOD_TOTAL_BONUS"),
            @Result(property = "periodTotalBonusDesc", column = "PERIOD_TOTAL_BONUS_DESC")
    })
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    LotInstWithLotto selectLottoInstWithLottoByKey(@Param("lottoInstId") Long lottoInstId);


    @Select({"select",
            "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC, TM_SMP",
            "from t_lot_inst ",
            "where PERIOD_STS = 'E' AND LOTTO_ID = #{lottoId,jdbcType=BIGINT} ORDER BY PERIOD_BONUS_TIME DESC limit 1"})
    @Results({
            @Result(property = "lottoInstId", column = "LOTTO_INST_ID"),
            @Result(property = "lottoId", column = "LOTTO_ID"),
            @Result(property = "periodName", column = "PERIOD_NAME"),
            @Result(property = "periodBeginTime", column = "PERIOD_BEGIN_TIME"),
            @Result(property = "periodEndTime", column = "PERIOD_END_TIME"),
            @Result(property = "periodBonusTime", column = "PERIOD_BONUS_TIME"),
            @Result(property = "periodSts", column = "PERIOD_STS"),
            @Result(property = "periodTags", column = "PERIOD_TAGS"),
            @Result(property = "periodTagsName", column = "PERIOD_TAGS_NAME"),
            @Result(property = "periodBonusNumber", column = "PERIOD_BONUS_NUMBER"),
            @Result(property = "periodTotalSell", column = "PERIOD_TOTAL_SELL"),
            @Result(property = "periodTotalBonus", column = "PERIOD_TOTAL_BONUS"),
            @Result(property = "periodTotalBonusDesc", column = "PERIOD_TOTAL_BONUS_DESC")
    })
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    LotInst selectLastLottoInstWithLotto(@Param("lottoId") Long lottoId);


    @Select({"select",
            "LOTTO_INST_ID, LOTTO_ID, PERIOD_NAME, PERIOD_BEGIN_TIME, PERIOD_END_TIME, PERIOD_BONUS_TIME, ",
            "PERIOD_STS, PERIOD_TAGS, PERIOD_TAGS_NAME, PERIOD_BONUS_NUMBER, PERIOD_TOTAL_SELL, ",
            "PERIOD_TOTAL_BONUS, PERIOD_TOTAL_BONUS_DESC, TM_SMP",
            "from t_lot_inst ",
            "where LOTTO_ID = #{lottoId,jdbcType=BIGINT} AND PERIOD_NAME = #{lottoInstName,jdbcType=VARCHAR} AND PERIOD_STS <> 'N' limit 1"})
    @Results({
            @Result(property = "lottoInstId", column = "LOTTO_INST_ID"),
            @Result(property = "lottoId", column = "LOTTO_ID"),
            @Result(property = "periodName", column = "PERIOD_NAME"),
            @Result(property = "periodBeginTime", column = "PERIOD_BEGIN_TIME"),
            @Result(property = "periodEndTime", column = "PERIOD_END_TIME"),
            @Result(property = "periodBonusTime", column = "PERIOD_BONUS_TIME"),
            @Result(property = "periodSts", column = "PERIOD_STS"),
            @Result(property = "periodTags", column = "PERIOD_TAGS"),
            @Result(property = "periodTagsName", column = "PERIOD_TAGS_NAME"),
            @Result(property = "periodBonusNumber", column = "PERIOD_BONUS_NUMBER"),
            @Result(property = "periodTotalSell", column = "PERIOD_TOTAL_SELL"),
            @Result(property = "periodTotalBonus", column = "PERIOD_TOTAL_BONUS"),
            @Result(property = "periodTotalBonusDesc", column = "PERIOD_TOTAL_BONUS_DESC")
    })
    @ConstructorArgs({
            @Arg(column = "LOTTO_INST_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "LOTTO_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "PERIOD_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BEGIN_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_END_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_BONUS_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "PERIOD_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "PERIOD_TAGS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TAGS_NAME", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_BONUS_NUMBER", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_SELL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "PERIOD_TOTAL_BONUS_DESC", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    LotInst selectLottoInstByName(@Param("lottoId") Long lottoId, @Param("lottoInstName") String lottoInstName);

}