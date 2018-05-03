package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpLottoRela;
import com.codido.hodor.model.ShpLottoRelaExample;
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

public interface ShpLottoRelaMapper {
    @SelectProvider(type=ShpLottoRelaSqlProvider.class, method="countByExample")
    long countByExample(ShpLottoRelaExample example);

    @DeleteProvider(type=ShpLottoRelaSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShpLottoRelaExample example);

    @Delete({
        "delete from t_shp_lotto_rela",
        "where SHOP_LOTTO_RELA_ID = #{shopLottoRelaId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long shopLottoRelaId);

    @Insert({
        "insert into t_shp_lotto_rela (SHOP_ID, LOTTO_ID, ",
        "LOTTO_TRAD_STS, LOTTO_SORT, ",
        "SHOP_LOTTO_ORDER_COUNT, SHOP_LOTTO_ORDER_AMT)",
        "values (#{shopId,jdbcType=BIGINT}, #{lottoId,jdbcType=BIGINT}, ",
        "#{lottoTradSts,jdbcType=CHAR}, #{lottoSort,jdbcType=INTEGER}, ",
        "#{shopLottoOrderCount,jdbcType=INTEGER}, #{shopLottoOrderAmt,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="shopLottoRelaId")
    int insert(ShpLottoRela record);

    @InsertProvider(type=ShpLottoRelaSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="shopLottoRelaId")
    int insertSelective(ShpLottoRela record);

    @SelectProvider(type=ShpLottoRelaSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SHOP_LOTTO_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_TRAD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOTTO_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_LOTTO_ORDER_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_LOTTO_ORDER_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<ShpLottoRela> selectByExample(ShpLottoRelaExample example);

    @Select({
        "select",
        "SHOP_LOTTO_RELA_ID, SHOP_ID, LOTTO_ID, LOTTO_TRAD_STS, LOTTO_SORT, SHOP_LOTTO_ORDER_COUNT, ",
        "SHOP_LOTTO_ORDER_AMT",
        "from t_shp_lotto_rela",
        "where SHOP_LOTTO_RELA_ID = #{shopLottoRelaId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SHOP_LOTTO_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="LOTTO_TRAD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="LOTTO_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_LOTTO_ORDER_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_LOTTO_ORDER_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    ShpLottoRela selectByPrimaryKey(Long shopLottoRelaId);

    @UpdateProvider(type=ShpLottoRelaSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShpLottoRela record, @Param("example") ShpLottoRelaExample example);

    @UpdateProvider(type=ShpLottoRelaSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShpLottoRela record, @Param("example") ShpLottoRelaExample example);

    @UpdateProvider(type=ShpLottoRelaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShpLottoRela record);

    @Update({
        "update t_shp_lotto_rela",
        "set SHOP_ID = #{shopId,jdbcType=BIGINT},",
          "LOTTO_ID = #{lottoId,jdbcType=BIGINT},",
          "LOTTO_TRAD_STS = #{lottoTradSts,jdbcType=CHAR},",
          "LOTTO_SORT = #{lottoSort,jdbcType=INTEGER},",
          "SHOP_LOTTO_ORDER_COUNT = #{shopLottoOrderCount,jdbcType=INTEGER},",
          "SHOP_LOTTO_ORDER_AMT = #{shopLottoOrderAmt,jdbcType=BIGINT}",
        "where SHOP_LOTTO_RELA_ID = #{shopLottoRelaId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShpLottoRela record);
}