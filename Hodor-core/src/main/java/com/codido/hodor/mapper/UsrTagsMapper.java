package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrTags;
import com.codido.hodor.model.UsrTagsExample;
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

public interface UsrTagsMapper {
    @SelectProvider(type=UsrTagsSqlProvider.class, method="countByExample")
    long countByExample(UsrTagsExample example);

    @DeleteProvider(type=UsrTagsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrTagsExample example);

    @Delete({
        "delete from t_usr_tags",
        "where USER_TAG_ID = #{userTagId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userTagId);

    @Insert({
        "insert into t_usr_tags (USER_ID, TAG_ID, ",
        "TAG_TIME, USER_TAG_STS)",
        "values (#{userId,jdbcType=BIGINT}, #{tagId,jdbcType=BIGINT}, ",
        "#{tagTime,jdbcType=TIMESTAMP}, #{userTagSts,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="userTagId")
    int insert(UsrTags record);

    @InsertProvider(type=UsrTagsSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="userTagId")
    int insertSelective(UsrTags record);

    @SelectProvider(type=UsrTagsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USER_TAG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TAG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TAG_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="USER_TAG_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<UsrTags> selectByExample(UsrTagsExample example);

    @Select({
        "select",
        "USER_TAG_ID, USER_ID, TAG_ID, TAG_TIME, USER_TAG_STS",
        "from t_usr_tags",
        "where USER_TAG_ID = #{userTagId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USER_TAG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TAG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TAG_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="USER_TAG_STS", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    UsrTags selectByPrimaryKey(Long userTagId);

    @UpdateProvider(type=UsrTagsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrTags record, @Param("example") UsrTagsExample example);

    @UpdateProvider(type=UsrTagsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrTags record, @Param("example") UsrTagsExample example);

    @UpdateProvider(type=UsrTagsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrTags record);

    @Update({
        "update t_usr_tags",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "TAG_ID = #{tagId,jdbcType=BIGINT},",
          "TAG_TIME = #{tagTime,jdbcType=TIMESTAMP},",
          "USER_TAG_STS = #{userTagSts,jdbcType=CHAR}",
        "where USER_TAG_ID = #{userTagId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrTags record);
}