package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdOrderUser;
import com.codido.hodor.model.OrdOrderUserExample;
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

public interface OrdOrderUserMapper {
    @SelectProvider(type=OrdOrderUserSqlProvider.class, method="countByExample")
    long countByExample(OrdOrderUserExample example);

    @DeleteProvider(type=OrdOrderUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdOrderUserExample example);

    @Delete({
        "delete from t_ord_orderuser",
        "where ORDER_USER_INST_ID = #{orderUserInstId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long orderUserInstId);

    @Insert({
        "insert into t_ord_orderuser (ORDER_NO, USER_ID, ",
        "ORDER_USER_TYPE, ORDER_USER_STS)",
        "values (#{orderNo,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{orderUserType,jdbcType=CHAR}, #{orderUserSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="orderUserInstId")
    int insert(OrdOrderUser record);

    @InsertProvider(type=OrdOrderUserSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="orderUserInstId")
    int insertSelective(OrdOrderUser record);

    @SelectProvider(type=OrdOrderUserSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ORDER_USER_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ORDER_USER_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_USER_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<OrdOrderUser> selectByExample(OrdOrderUserExample example);

    @Select({
        "select",
        "ORDER_USER_INST_ID, ORDER_NO, USER_ID, ORDER_USER_TYPE, ORDER_USER_STS",
        "from t_ord_orderuser",
        "where ORDER_USER_INST_ID = #{orderUserInstId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="ORDER_USER_INST_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="ORDER_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ORDER_USER_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="ORDER_USER_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    OrdOrderUser selectByPrimaryKey(Long orderUserInstId);

    @UpdateProvider(type=OrdOrderUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdOrderUser record, @Param("example") OrdOrderUserExample example);

    @UpdateProvider(type=OrdOrderUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OrdOrderUser record, @Param("example") OrdOrderUserExample example);

    @UpdateProvider(type=OrdOrderUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OrdOrderUser record);

    @Update({
        "update t_ord_orderuser",
        "set ORDER_NO = #{orderNo,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=BIGINT},",
          "ORDER_USER_TYPE = #{orderUserType,jdbcType=CHAR},",
          "ORDER_USER_STS = #{orderUserSts,jdbcType=CHAR}",
        "where ORDER_USER_INST_ID = #{orderUserInstId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OrdOrderUser record);
}