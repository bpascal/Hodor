package com.codido.hodor.mapper;

import com.codido.hodor.model.LotLotto;
import com.codido.hodor.model.LotLottoExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface LotLottoOPMapper {

    @Select({
            "select",
            "a.LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
            "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME,",
            "LAST_LOTTO_INST_ID",
            "from t_lot_lotto a,t_usr_subscriber_lotto b",
            "where a.LOTTO_ID = b.LOTTO_ID ",
            "and b.USER_ID = #{userId,jdbcType=BIGINT} "
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
    List<LotLotto> selectByUserId(@Param("userId")Long userId);

    @Select({
        "select",
        "a.LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
        "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME,",
        "LAST_LOTTO_INST_ID",
        "from t_lot_lotto a,t_usr_subscriber_lotto b",
        "where a.LOTTO_ID = b.LOTTO_ID ",
        "and b.USER_ID = #{userId,jdbcType=BIGINT} ",
        "and b.SUBSCRIB_STS = 'A'"
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
    List<LotLotto> selectEffectByUserId(@Param("userId")Long userId);

    @Select({
            "select",
            "a.LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
            "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME,",
            "LAST_LOTTO_INST_ID",
            "from t_lot_lotto a,t_usr_subscriber_lotto b",
            "where a.LOTTO_ID = b.LOTTO_ID ",
            "and b.USER_ID = #{userId,jdbcType=BIGINT} ",
            "and b.SUBSCRIB_STS = 'N'"
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
    List<LotLotto> selectInvalidByUserId(@Param("userId")Long userId);

    @Select({
            "select",
            "a.LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
            "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME,",
            "LAST_LOTTO_INST_ID",
            "from t_lot_lotto a,t_shp_lotto_rela b",
            "where a.LOTTO_ID = b.LOTTO_ID ",
            "and b.SHOP_ID = #{shopId,jdbcType=BIGINT} ",
            "and b.LOTTO_TRAD_STS = 'A'",
            "and a.LOTTO_STS = 'A'"
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
    List<LotLotto> selectEffectByShopId(@Param("shopId")Long userId);

    @Select({
            "select",
            "LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
            "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME,",
            "LAST_LOTTO_INST_ID",
            "from t_lot_lotto a",
            "where a.LOTTO_OWNER = #{shopType,jdbcType=VARCHAR} and LOTTO_STS = 'A'"
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
    List<LotLotto> selectByTpye(@Param("shopType")String shopType);


    @Select({
            "select",
            "LOTTO_ID, LOTTO_NAME, LOTTO_DESC, LOTTO_OWNER, LOTTO_SHOT_VALUE, LOTTO_ICON_URL, ",
            "LOTTO_BACKGROUND_URL, LOTTO_STS, LOTTO_TYPE, LOTTO_PUBLISH_DAY, LOTTO_PUBLISH_TIME,",
            "LAST_LOTTO_INST_ID",
            "from t_lot_lotto ",
            "where LOTTO_STS = 'A' "
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
    List<LotLotto> selectAll();




}