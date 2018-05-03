package com.codido.hodor.mapper;

import com.codido.hodor.model.LotLotto;
import com.codido.hodor.model.LotLottoExample;
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

public interface LotLottoMapper {
    @SelectProvider(type=LotLottoSqlProvider.class, method="countByExample")
    long countByExample(LotLottoExample example);

    @DeleteProvider(type=LotLottoSqlProvider.class, method="deleteByExample")
    int deleteByExample(LotLottoExample example);

    @Delete({
        "delete from t_lot_lotto",
        "where LOTTO_ID = #{lottoId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long lottoId);

    @Insert({
        "insert into t_lot_lotto (LOTTO_NAME, LOTTO_DESC, ",
        "LOTTO_OWNER, LOTTO_SHOT_VALUE, ",
        "LOTTO_ICON_URL, LOTTO_BACKGROUND_URL, ",
        "LOTTO_STS, LOTTO_TYPE, ",
        "LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME, ",
        "LAST_LOTTO_INST_ID)",
        "values (#{lottoName,jdbcType=VARCHAR}, #{lottoDesc,jdbcType=VARCHAR}, ",
        "#{lottoOwner,jdbcType=CHAR}, #{lottoShotValue,jdbcType=VARCHAR}, ",
        "#{lottoIconUrl,jdbcType=VARCHAR}, #{lottoBackgroundUrl,jdbcType=VARCHAR}, ",
        "#{lottoSts,jdbcType=CHAR}, #{lottoType,jdbcType=VARCHAR}, ",
        "#{lottoPublishDay,jdbcType=VARCHAR}, #{lottoPublishTime,jdbcType=TIME}, ",
        "#{lastLottoInstId,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="lottoId")
    int insert(LotLotto record);

    @InsertProvider(type=LotLottoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="lottoId")
    int insertSelective(LotLotto record);

    @SelectProvider(type=LotLottoSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_OWNER", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOTTO_SHOT_VALUE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BACKGROUND_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOTTO_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_PUBLISH_DAY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_PUBLISH_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="LAST_LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<LotLotto> selectByExample(LotLottoExample example);

    @Select({
        "select",
        "LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
        "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME, ",
        "LAST_LOTTO_INST_ID",
        "from t_lot_lotto",
        "where LOTTO_ID = #{lottoId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="LOTTO_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_OWNER", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOTTO_SHOT_VALUE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_BACKGROUND_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOTTO_TYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_PUBLISH_DAY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="LOTTO_PUBLISH_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="LAST_LOTTO_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    LotLotto selectByPrimaryKey(Long lottoId);

    @UpdateProvider(type=LotLottoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LotLotto record, @Param("example") LotLottoExample example);

    @UpdateProvider(type=LotLottoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LotLotto record, @Param("example") LotLottoExample example);

    @UpdateProvider(type=LotLottoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LotLotto record);

    @Update({
        "update t_lot_lotto",
        "set LOTTO_NAME = #{lottoName,jdbcType=VARCHAR},",
          "LOTTO_DESC = #{lottoDesc,jdbcType=VARCHAR},",
          "LOTTO_OWNER = #{lottoOwner,jdbcType=CHAR},",
          "LOTTO_SHOT_VALUE = #{lottoShotValue,jdbcType=VARCHAR},",
          "LOTTO_ICON_URL = #{lottoIconUrl,jdbcType=VARCHAR},",
          "LOTTO_BACKGROUND_URL = #{lottoBackgroundUrl,jdbcType=VARCHAR},",
          "LOTTO_STS = #{lottoSts,jdbcType=CHAR},",
          "LOTTO_TYPE = #{lottoType,jdbcType=VARCHAR},",
          "LOTTO_PUBLISH_DAY = #{lottoPublishDay,jdbcType=VARCHAR},",
          "LOTTO_PUBLISH_TIME = #{lottoPublishTime,jdbcType=TIME},",
          "LAST_LOTTO_INST_ID = #{lastLottoInstId,jdbcType=BIGINT}",
        "where LOTTO_ID = #{lottoId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(LotLotto record);
}