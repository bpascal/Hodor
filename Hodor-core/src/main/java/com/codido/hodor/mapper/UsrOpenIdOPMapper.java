package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrOpenId;
import com.codido.hodor.model.UsrOpenIdExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UsrOpenIdOPMapper {

    @SelectProvider(type = UsrOpenIdSqlProvider.class, method = "selectByExample")
    @ConstructorArgs({
            @Arg(column = "RELA_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_APP_TYPE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    List<UsrOpenId> selectByExample(UsrOpenIdExample example);

    @Select({
            "select",
            "RELA_ID, USER_ID, WX_OPEN_ID, WX_APP_TYPE, WX_SESSION_KEY",
            "from t_usr_openid",
            "where USER_ID = #{userId,jdbcType=BIGINT} AND WX_APP_TYPE=#{wxAppType,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
            @Arg(column = "RELA_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_APP_TYPE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    UsrOpenId selectByUserId(@Param("userId") Long userId, @Param("wxAppType") String wxAppType);


    @Select({
            "select",
            "RELA_ID, USER_ID, WX_OPEN_ID, WX_APP_TYPE, WX_SESSION_KEY",
            "from t_usr_openid a,t_shp_shop b",
            "where b.SHOP_ID = #{shopId,jdbcType=BIGINT} AND b.SHOP_OWNER_ID=a.USER_ID AND WX_APP_TYPE=#{wxAppType,jdbcType=VARCHAR} limit 1"
    })
    @ConstructorArgs({
            @Arg(column = "RELA_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_APP_TYPE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    UsrOpenId selectShopOwnerOpenIdByShopId(@Param("shopId") Long shopId, @Param("wxAppType") String wxAppType);


    @Select({"<script>"
            + " select "
            + " a.RELA_ID, a.USER_ID, a.WX_OPEN_ID, a.WX_APP_TYPE, a.WX_SESSION_KEY "
            + " from t_usr_openid a , t_usr_subscriber_lotto b,t_lot_inst c"
            + " where b.LOTTO_ID = c.LOTTO_ID AND b.SUBSCRIB_STS = 'A' AND c.LOTTO_INST_ID = #{lottoInstId,jdbcType=BIGINT} AND a.USER_ID = b.USER_ID AND a.WX_APP_TYPE IN"
            + " <foreach item='wxAppType' index='index' collection='wxAppType' open='(' separator=',' close=')'>"
            + "  #{wxAppType}"
            + " </foreach>"
            + " </script>"
    })
    @ConstructorArgs({
            @Arg(column = "RELA_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "WX_OPEN_ID", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_APP_TYPE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "WX_SESSION_KEY", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    List<UsrOpenId> selectBySubscriberUserLottoInstId(@Param("lottoInstId") Long lottoInstId, @Param("wxAppType") String[] wxAppType);

}