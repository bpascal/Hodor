package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrShopRela;
import com.codido.hodor.model.UsrShopRelaExample;
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

public interface UsrShopRelaMapper {
    @SelectProvider(type=UsrShopRelaSqlProvider.class, method="countByExample")
    long countByExample(UsrShopRelaExample example);

    @DeleteProvider(type=UsrShopRelaSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrShopRelaExample example);

    @Delete({
        "delete from t_usr_shop_rela",
        "where USR_SHOP_RELA_ID = #{usrShopRelaId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long usrShopRelaId);

    @Insert({
        "insert into t_usr_shop_rela (USER_ID, SHOP_ID, ",
        "SHOP_TYPE, USR_SHOP_RELA_STS, ",
        "USR_SHOP_RELA_SORT)",
        "values (#{userId,jdbcType=BIGINT}, #{shopId,jdbcType=BIGINT}, ",
        "#{shopType,jdbcType=CHAR}, #{usrShopRelaSts,jdbcType=CHAR}, ",
        "#{usrShopRelaSort,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="usrShopRelaId")
    int insert(UsrShopRela record);

    @InsertProvider(type=UsrShopRelaSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="usrShopRelaId")
    int insertSelective(UsrShopRela record);

    @SelectProvider(type=UsrShopRelaSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USR_SHOP_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USR_SHOP_RELA_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USR_SHOP_RELA_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<UsrShopRela> selectByExample(UsrShopRelaExample example);

    @Select({
        "select",
        "USR_SHOP_RELA_ID, USER_ID, SHOP_ID, SHOP_TYPE, USR_SHOP_RELA_STS, USR_SHOP_RELA_SORT",
        "from t_usr_shop_rela",
        "where USR_SHOP_RELA_ID = #{usrShopRelaId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USR_SHOP_RELA_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="SHOP_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USR_SHOP_RELA_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="USR_SHOP_RELA_SORT", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    UsrShopRela selectByPrimaryKey(Long usrShopRelaId);

    @UpdateProvider(type=UsrShopRelaSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrShopRela record, @Param("example") UsrShopRelaExample example);

    @UpdateProvider(type=UsrShopRelaSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrShopRela record, @Param("example") UsrShopRelaExample example);

    @UpdateProvider(type=UsrShopRelaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrShopRela record);

    @Update({
        "update t_usr_shop_rela",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "SHOP_ID = #{shopId,jdbcType=BIGINT},",
          "SHOP_TYPE = #{shopType,jdbcType=CHAR},",
          "USR_SHOP_RELA_STS = #{usrShopRelaSts,jdbcType=CHAR},",
          "USR_SHOP_RELA_SORT = #{usrShopRelaSort,jdbcType=INTEGER}",
        "where USR_SHOP_RELA_ID = #{usrShopRelaId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrShopRela record);
}