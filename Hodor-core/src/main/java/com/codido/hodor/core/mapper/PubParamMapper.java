package com.codido.hodor.core.mapper;

import com.codido.hodor.core.model.PubParam;
import com.codido.hodor.core.model.PubParamExample;
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

public interface PubParamMapper {
    @SelectProvider(type=PubParamSqlProvider.class, method="countByExample")
    long countByExample(PubParamExample example);

    @DeleteProvider(type=PubParamSqlProvider.class, method="deleteByExample")
    int deleteByExample(PubParamExample example);

    @Delete({
        "delete from t_pub_param",
        "where PARAM_ID = #{paramId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long paramId);

    @Insert({
        "insert into t_pub_param (PARAM_NAME, PARAM_KEY, ",
        "PARAM_VALUE)",
        "values (#{paramName,jdbcType=VARCHAR}, #{paramKey,jdbcType=VARCHAR}, ",
        "#{paramValue,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="paramId")
    int insert(PubParam record);

    @InsertProvider(type=PubParamSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="paramId")
    int insertSelective(PubParam record);

    @SelectProvider(type=PubParamSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="PARAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PARAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PARAM_KEY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PARAM_VALUE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PubParam> selectByExample(PubParamExample example);

    @Select({
        "select",
        "PARAM_ID, PARAM_NAME, PARAM_KEY, PARAM_VALUE",
        "from t_pub_param",
        "where PARAM_ID = #{paramId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="PARAM_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="PARAM_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PARAM_KEY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PARAM_VALUE", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    PubParam selectByPrimaryKey(Long paramId);

    @UpdateProvider(type=PubParamSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PubParam record, @Param("example") PubParamExample example);

    @UpdateProvider(type=PubParamSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PubParam record, @Param("example") PubParamExample example);

    @UpdateProvider(type=PubParamSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PubParam record);

    @Update({
        "update t_pub_param",
        "set PARAM_NAME = #{paramName,jdbcType=VARCHAR},",
          "PARAM_KEY = #{paramKey,jdbcType=VARCHAR},",
          "PARAM_VALUE = #{paramValue,jdbcType=VARCHAR}",
        "where PARAM_ID = #{paramId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PubParam record);
}