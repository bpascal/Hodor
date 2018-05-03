package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpShop;
import com.codido.hodor.model.ShpShopExample;
import java.math.BigDecimal;
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

public interface ShpShopMapper {
    @SelectProvider(type=ShpShopSqlProvider.class, method="countByExample")
    long countByExample(ShpShopExample example);

    @DeleteProvider(type=ShpShopSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShpShopExample example);

    @Delete({
        "delete from t_shp_shop",
        "where SHOP_ID = #{shopId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long shopId);

    @Insert({
        "insert into t_shp_shop (SHOP_NAME, SHOP_DESC, ",
        "SHOP_OWNER_ID, SHOP_ICON_URL, ",
        "SHOP_MBL_NO, SHOP_WX_ID, ",
        "SHOP_ALIPAY_ID, SHOP_QRCODE_URL, ",
        "SHOP_SLOGEN1, SHOP_SLOGEN2, ",
        "SHOP_TYPE, SHOP_MAIN_LOTTO_ID, ",
        "SHOP_SUB_LOTTO_ID, SHOP_USER_COUNT, ",
        "SHOP_TOTAL_ORDER_COUNT, SHOP_TOTAL_ORDER_AMT, ",
        "SHOP_TOTAL_BOUNS_COUNT, SHOP_TOTAL_BOUNS_AMT, ",
        "SHOP_TOTAL_COMMISSION, SHOP_ADDRESS, ",
        "SHOP_STS, SHOP_TRAD_STS, ",
        "SHOP_TRAD_BEGIN_TIME, SHOP_TRAD_END_TIME, ",
        "SHOP_TRAD_RATE, SHOP_CHANNAL)",
        "values (#{shopName,jdbcType=VARCHAR}, #{shopDesc,jdbcType=VARCHAR}, ",
        "#{shopOwnerId,jdbcType=BIGINT}, #{shopIconUrl,jdbcType=VARCHAR}, ",
        "#{shopMblNo,jdbcType=VARCHAR}, #{shopWxId,jdbcType=VARCHAR}, ",
        "#{shopAlipayId,jdbcType=VARCHAR}, #{shopQrcodeUrl,jdbcType=VARCHAR}, ",
        "#{shopSlogen1,jdbcType=VARCHAR}, #{shopSlogen2,jdbcType=VARCHAR}, ",
        "#{shopType,jdbcType=CHAR}, #{shopMainLottoId,jdbcType=BIGINT}, ",
        "#{shopSubLottoId,jdbcType=BIGINT}, #{shopUserCount,jdbcType=INTEGER}, ",
        "#{shopTotalOrderCount,jdbcType=INTEGER}, #{shopTotalOrderAmt,jdbcType=BIGINT}, ",
        "#{shopTotalBounsCount,jdbcType=INTEGER}, #{shopTotalBounsAmt,jdbcType=BIGINT}, ",
        "#{shopTotalCommission,jdbcType=DECIMAL}, #{shopAddress,jdbcType=VARCHAR}, ",
        "#{shopSts,jdbcType=CHAR}, #{shopTradSts,jdbcType=CHAR}, ",
        "#{shopTradBeginTime,jdbcType=TIME}, #{shopTradEndTime,jdbcType=TIME}, ",
        "#{shopTradRate,jdbcType=DECIMAL}, #{shopChannal,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="shopId")
    int insert(ShpShop record);

    @InsertProvider(type=ShpShopSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="shopId")
    int insertSelective(ShpShop record);

    @SelectProvider(type=ShpShopSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_OWNER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_WX_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_ALIPAY_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_QRCODE_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_SLOGEN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_SLOGEN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SHOP_MAIN_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_SUB_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_USER_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_TOTAL_ORDER_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_TOTAL_ORDER_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TOTAL_BOUNS_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_TOTAL_BOUNS_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TOTAL_COMMISSION", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="SHOP_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SHOP_TRAD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SHOP_TRAD_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="SHOP_TRAD_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="SHOP_TRAD_RATE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="SHOP_CHANNAL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ShpShop> selectByExample(ShpShopExample example);

    @Select({
        "select",
        "SHOP_ID, SHOP_NAME, SHOP_DESC, SHOP_OWNER_ID, SHOP_ICON_URL, SHOP_MBL_NO, SHOP_WX_ID, ",
        "SHOP_ALIPAY_ID, SHOP_QRCODE_URL, SHOP_SLOGEN1, SHOP_SLOGEN2, SHOP_TYPE, SHOP_MAIN_LOTTO_ID, ",
        "SHOP_SUB_LOTTO_ID, SHOP_USER_COUNT, SHOP_TOTAL_ORDER_COUNT, SHOP_TOTAL_ORDER_AMT, ",
        "SHOP_TOTAL_BOUNS_COUNT, SHOP_TOTAL_BOUNS_AMT, SHOP_TOTAL_COMMISSION, SHOP_ADDRESS, ",
        "SHOP_STS, SHOP_TRAD_STS, SHOP_TRAD_BEGIN_TIME, SHOP_TRAD_END_TIME, SHOP_TRAD_RATE, ",
        "SHOP_CHANNAL",
        "from t_shp_shop",
        "where SHOP_ID = #{shopId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="SHOP_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_OWNER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ICON_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_WX_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_ALIPAY_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_QRCODE_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_SLOGEN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_SLOGEN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SHOP_MAIN_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_SUB_LOTTO_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_USER_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_TOTAL_ORDER_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_TOTAL_ORDER_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TOTAL_BOUNS_COUNT", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="SHOP_TOTAL_BOUNS_AMT", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TOTAL_COMMISSION", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="SHOP_ADDRESS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SHOP_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SHOP_TRAD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="SHOP_TRAD_BEGIN_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="SHOP_TRAD_END_TIME", javaType=Date.class, jdbcType=JdbcType.TIME),
        @Arg(column="SHOP_TRAD_RATE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="SHOP_CHANNAL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ShpShop selectByPrimaryKey(Long shopId);

    @UpdateProvider(type=ShpShopSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ShpShop record, @Param("example") ShpShopExample example);

    @UpdateProvider(type=ShpShopSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ShpShop record, @Param("example") ShpShopExample example);

    @UpdateProvider(type=ShpShopSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ShpShop record);

    @Update({
        "update t_shp_shop",
        "set SHOP_NAME = #{shopName,jdbcType=VARCHAR},",
          "SHOP_DESC = #{shopDesc,jdbcType=VARCHAR},",
          "SHOP_OWNER_ID = #{shopOwnerId,jdbcType=BIGINT},",
          "SHOP_ICON_URL = #{shopIconUrl,jdbcType=VARCHAR},",
          "SHOP_MBL_NO = #{shopMblNo,jdbcType=VARCHAR},",
          "SHOP_WX_ID = #{shopWxId,jdbcType=VARCHAR},",
          "SHOP_ALIPAY_ID = #{shopAlipayId,jdbcType=VARCHAR},",
          "SHOP_QRCODE_URL = #{shopQrcodeUrl,jdbcType=VARCHAR},",
          "SHOP_SLOGEN1 = #{shopSlogen1,jdbcType=VARCHAR},",
          "SHOP_SLOGEN2 = #{shopSlogen2,jdbcType=VARCHAR},",
          "SHOP_TYPE = #{shopType,jdbcType=CHAR},",
          "SHOP_MAIN_LOTTO_ID = #{shopMainLottoId,jdbcType=BIGINT},",
          "SHOP_SUB_LOTTO_ID = #{shopSubLottoId,jdbcType=BIGINT},",
          "SHOP_USER_COUNT = #{shopUserCount,jdbcType=INTEGER},",
          "SHOP_TOTAL_ORDER_COUNT = #{shopTotalOrderCount,jdbcType=INTEGER},",
          "SHOP_TOTAL_ORDER_AMT = #{shopTotalOrderAmt,jdbcType=BIGINT},",
          "SHOP_TOTAL_BOUNS_COUNT = #{shopTotalBounsCount,jdbcType=INTEGER},",
          "SHOP_TOTAL_BOUNS_AMT = #{shopTotalBounsAmt,jdbcType=BIGINT},",
          "SHOP_TOTAL_COMMISSION = #{shopTotalCommission,jdbcType=DECIMAL},",
          "SHOP_ADDRESS = #{shopAddress,jdbcType=VARCHAR},",
          "SHOP_STS = #{shopSts,jdbcType=CHAR},",
          "SHOP_TRAD_STS = #{shopTradSts,jdbcType=CHAR},",
          "SHOP_TRAD_BEGIN_TIME = #{shopTradBeginTime,jdbcType=TIME},",
          "SHOP_TRAD_END_TIME = #{shopTradEndTime,jdbcType=TIME},",
          "SHOP_TRAD_RATE = #{shopTradRate,jdbcType=DECIMAL},",
          "SHOP_CHANNAL = #{shopChannal,jdbcType=VARCHAR}",
        "where SHOP_ID = #{shopId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ShpShop record);
}