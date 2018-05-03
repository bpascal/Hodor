package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpShop;
import com.codido.hodor.model.ShpShopExample;
import com.codido.hodor.model.ShpShopOP;
import com.codido.hodor.model.UsrShopRela;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ShpShopOPMapper {

    @Select({
            "select",
            "SHOP_ID, SHOP_NAME, SHOP_DESC, SHOP_OWNER_ID, SHOP_ICON_URL, SHOP_MBL_NO, SHOP_WX_ID, ",
            "SHOP_ALIPAY_ID, SHOP_QRCODE_URL, SHOP_SLOGEN1, SHOP_SLOGEN2, SHOP_TYPE, SHOP_MAIN_LOTTO_ID, ",
            "SHOP_SUB_LOTTO_ID, SHOP_USER_COUNT, SHOP_TOTAL_ORDER_COUNT, SHOP_TOTAL_ORDER_AMT, ",
            "SHOP_TOTAL_BOUNS_COUNT, SHOP_TOTAL_BOUNS_AMT, SHOP_TOTAL_COMMISSION, SHOP_ADDRESS, ",
            "SHOP_STS, SHOP_TRAD_STS, SHOP_TRAD_BEGIN_TIME, SHOP_TRAD_END_TIME, SHOP_TRAD_RATE,SHOP_CHANNAL",
            "from t_shp_shop",
            "where SHOP_OWNER_ID = #{userId,jdbcType=BIGINT}"
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
    ShpShop selectShopByShopOwnerId(@Param("userId") Long userId);

    @Select({
            "select",
            "s.SHOP_ID, SHOP_NAME, SHOP_DESC, SHOP_OWNER_ID, SHOP_ICON_URL, SHOP_MBL_NO, SHOP_WX_ID, ",
            "SHOP_ALIPAY_ID, SHOP_QRCODE_URL, SHOP_SLOGEN1, SHOP_SLOGEN2, s.SHOP_TYPE, SHOP_MAIN_LOTTO_ID, ",
            "SHOP_SUB_LOTTO_ID, SHOP_USER_COUNT, SHOP_TOTAL_ORDER_COUNT, SHOP_TOTAL_ORDER_AMT, ",
            "SHOP_TOTAL_BOUNS_COUNT, SHOP_TOTAL_BOUNS_AMT, SHOP_TOTAL_COMMISSION, SHOP_ADDRESS, ",
            "SHOP_STS, SHOP_TRAD_STS, SHOP_TRAD_BEGIN_TIME, SHOP_TRAD_END_TIME, SHOP_TRAD_RATE,SHOP_CHANNAL",
            "from t_shp_shop s,t_usr_shop_rela u ",
            "where s.SHOP_ID = u.SHOP_ID and u.USER_ID = #{userId,jdbcType=BIGINT} AND u.USR_SHOP_RELA_STS = 'A' ",
            "order by USR_SHOP_RELA_SORT ",
            "limit 0, 1 "
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
    ShpShop selectTopBandByUserId(@Param("userId") Long userId);


    @Select({
            "select",
            "s.SHOP_ID, SHOP_NAME, SHOP_DESC, SHOP_OWNER_ID, SHOP_ICON_URL, SHOP_MBL_NO, SHOP_WX_ID, ",
            "SHOP_ALIPAY_ID, SHOP_QRCODE_URL, SHOP_SLOGEN1, SHOP_SLOGEN2, s.SHOP_TYPE, SHOP_MAIN_LOTTO_ID, ",
            "SHOP_SUB_LOTTO_ID, SHOP_USER_COUNT, SHOP_TOTAL_ORDER_COUNT, SHOP_TOTAL_ORDER_AMT, ",
            "SHOP_TOTAL_BOUNS_COUNT, SHOP_TOTAL_BOUNS_AMT, SHOP_TOTAL_COMMISSION, SHOP_ADDRESS, ",
            "SHOP_STS, SHOP_TRAD_STS, SHOP_TRAD_BEGIN_TIME, SHOP_TRAD_END_TIME, SHOP_TRAD_RATE,SHOP_CHANNAL",
            "from t_shp_shop s,t_usr_shop_rela u",
            "where s.SHOP_ID = u.SHOP_ID and u.USER_ID = #{userId,jdbcType=BIGINT}",
            "order by USR_SHOP_RELA_SORT"
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
    List<ShpShop> selectBandByUserId(@Param("userId") Long userId);


    @Select({
            "select",
            "SHOP_ID, SHOP_NAME, SHOP_DESC, SHOP_OWNER_ID, SHOP_ICON_URL, SHOP_MBL_NO, SHOP_WX_ID, ",
            "SHOP_ALIPAY_ID, SHOP_QRCODE_URL, SHOP_SLOGEN1, SHOP_SLOGEN2, SHOP_TYPE, SHOP_MAIN_LOTTO_ID, ",
            "SHOP_SUB_LOTTO_ID, SHOP_USER_COUNT, SHOP_TOTAL_ORDER_COUNT, SHOP_TOTAL_ORDER_AMT, ",
            "SHOP_TOTAL_BOUNS_COUNT, SHOP_TOTAL_BOUNS_AMT, SHOP_TOTAL_COMMISSION, SHOP_ADDRESS, ",
            "SHOP_STS, SHOP_TRAD_STS, SHOP_TRAD_BEGIN_TIME, SHOP_TRAD_END_TIME, SHOP_TRAD_RATE,SHOP_CHANNAL",
            "from t_shp_shop",
            "where SHOP_OWNER_ID = #{userId,jdbcType=BIGINT}"
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
    ShpShopOP selectShpShopOPByUserId(@Param("userId") Long userId);
}