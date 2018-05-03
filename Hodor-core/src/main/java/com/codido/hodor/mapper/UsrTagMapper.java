package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrTag;
import com.codido.hodor.model.UsrTagExample;
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

public interface UsrTagMapper {
    @SelectProvider(type=UsrTagSqlProvider.class, method="countByExample")
    long countByExample(UsrTagExample example);

    @DeleteProvider(type=UsrTagSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrTagExample example);

    @Delete({
        "delete from t_usr_tag",
        "where TAG_ID = #{tagId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long tagId);

    @Insert({
        "insert into t_usr_tag (TAG_NAME, TAG_DESC, ",
        "TAG_STS)",
        "values (#{tagName,jdbcType=VARCHAR}, #{tagDesc,jdbcType=VARCHAR}, ",
        "#{tagSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="tagId")
    int insert(UsrTag record);

    @InsertProvider(type=UsrTagSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="tagId")
    int insertSelective(UsrTag record);

    @SelectProvider(type=UsrTagSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="TAG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="TAG_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TAG_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TAG_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<UsrTag> selectByExample(UsrTagExample example);

    @Select({
        "select",
        "TAG_ID, TAG_NAME, TAG_DESC, TAG_STS",
        "from t_usr_tag",
        "where TAG_ID = #{tagId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="TAG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="TAG_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TAG_DESC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TAG_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    UsrTag selectByPrimaryKey(Long tagId);

    @UpdateProvider(type=UsrTagSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrTag record, @Param("example") UsrTagExample example);

    @UpdateProvider(type=UsrTagSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrTag record, @Param("example") UsrTagExample example);

    @UpdateProvider(type=UsrTagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrTag record);

    @Update({
        "update t_usr_tag",
        "set TAG_NAME = #{tagName,jdbcType=VARCHAR},",
          "TAG_DESC = #{tagDesc,jdbcType=VARCHAR},",
          "TAG_STS = #{tagSts,jdbcType=CHAR}",
        "where TAG_ID = #{tagId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrTag record);
}