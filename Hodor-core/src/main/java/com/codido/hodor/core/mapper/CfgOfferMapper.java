package com.codido.hodor.core.mapper;

import com.codido.hodor.core.model.CfgOffer;
import com.codido.hodor.core.model.CfgOfferExample;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CfgOfferMapper {
    @SelectProvider(type=CfgOfferSqlProvider.class, method="countByExample")
    long countByExample(CfgOfferExample example);

    @DeleteProvider(type=CfgOfferSqlProvider.class, method="deleteByExample")
    int deleteByExample(CfgOfferExample example);

    @Delete({
        "delete from t_cfg_offer",
        "where OFFER_ID = #{offerId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long offerId);

    @Insert({
    })
    @Options(useGeneratedKeys=true,keyProperty="offerId")
    int insert(CfgOffer record);

    @InsertProvider(type=CfgOfferSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="offerId")
    int insertSelective(CfgOffer record);

    @SelectProvider(type=CfgOfferSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="OFFER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true)
    })
    List<CfgOffer> selectByExample(CfgOfferExample example);

    @UpdateProvider(type=CfgOfferSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CfgOffer record, @Param("example") CfgOfferExample example);

    @UpdateProvider(type=CfgOfferSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CfgOffer record, @Param("example") CfgOfferExample example);
}