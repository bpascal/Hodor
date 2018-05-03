package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpBankcard;
import com.codido.hodor.model.ShpBankcardExample;
import com.codido.hodor.model.ShpBankcardOP;
import com.codido.hodor.model.UsrBankCardOP;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface ShpBankcardOPMapper {
    @Select({
            "select",
            "SHOP_BANKCARD_ID, a.SHOP_ID, BANK_ID, BANK_CARD_NO, SHOP_BANKCARD_STS, BIND_TIME, BANK_CARD_OWNER_NAME",
            "from t_shp_bankcard a,t_shp_shop b",
            "where a.SHOP_ID = b.SHOP_ID AND b.SHOP_OWNER_ID = #{userId,jdbcType=BIGINT} AND a.SHOP_BANKCARD_STS='A' limit 1"
    })
    @Results({
            @Result(property = "shopBankcardId", column = "SHOP_BANKCARD_ID"),
            @Result(property = "shopId", column = "SHOP_ID"),
            @Result(property = "cmmBank", column = "BANK_ID",one = @One(select = "com.codido.hodor.mapper.CmmBankMapper.selectByPrimaryKey")),
            @Result(property = "bankCardNo", column = "BANK_CARD_NO"),
            @Result(property = "shopBankcardSts", column = "SHOP_BANKCARD_STS"),
            @Result(property = "bankCardOwnerName", column = "BANK_CARD_OWNER_NAME"),
            @Result(property = "bindTime", column = "BIND_TIME")
    })
    @ConstructorArgs({
            @Arg(column="SHOP_BANKCARD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
            @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="BANK_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
            @Arg(column="BANK_CARD_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="SHOP_BANKCARD_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
            @Arg(column="BANK_CARD_OWNER_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Arg(column="BIND_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    ShpBankcardOP selectByShopOwnerUserId(@Param("userId") Long userId);
}