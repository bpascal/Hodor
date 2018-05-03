package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrMsg;
import com.codido.hodor.model.UsrMsgExample;
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

public interface UsrMsgMapper {
    @SelectProvider(type=UsrMsgSqlProvider.class, method="countByExample")
    long countByExample(UsrMsgExample example);

    @DeleteProvider(type=UsrMsgSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrMsgExample example);

    @Delete({
        "delete from t_usr_msg",
        "where MSG_ID = #{msgId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long msgId);

    @Insert({
        "insert into t_usr_msg (FROM_USER_ID, TO_USER_ID, ",
        "MSG_TITLE, MSG_INFO, ",
        "MSG_TIME, MSG_READ_TIME, ",
        "MSG_STS, MSG_TYPE, MSG_JUMP_URL)",
        "values (#{fromUserId,jdbcType=BIGINT}, #{toUserId,jdbcType=BIGINT}, ",
        "#{msgTitle,jdbcType=VARCHAR}, #{msgInfo,jdbcType=VARCHAR}, ",
        "#{msgTime,jdbcType=TIMESTAMP}, #{msgReadTime,jdbcType=TIMESTAMP}, ",
        "#{msgSts,jdbcType=CHAR}, #{msgType,jdbcType=CHAR}, #{msgJumpUrl,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="msgId")
    int insert(UsrMsg record);

    @InsertProvider(type=UsrMsgSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="msgId")
    int insertSelective(UsrMsg record);

    @SelectProvider(type=UsrMsgSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="MSG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="FROM_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TO_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MSG_TITLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MSG_INFO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MSG_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MSG_READ_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MSG_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MSG_JUMP_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<UsrMsg> selectByExample(UsrMsgExample example);

    @Select({
        "select",
        "MSG_ID, FROM_USER_ID, TO_USER_ID, MSG_TITLE, MSG_INFO, MSG_TIME, MSG_READ_TIME, ",
        "MSG_STS, MSG_TYPE, MSG_JUMP_URL",
        "from t_usr_msg",
        "where MSG_ID = #{msgId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="MSG_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="FROM_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="TO_USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="MSG_TITLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MSG_INFO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MSG_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MSG_READ_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MSG_STS", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MSG_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="MSG_JUMP_URL", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    UsrMsg selectByPrimaryKey(Long msgId);

    @UpdateProvider(type=UsrMsgSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrMsg record, @Param("example") UsrMsgExample example);

    @UpdateProvider(type=UsrMsgSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrMsg record, @Param("example") UsrMsgExample example);

    @UpdateProvider(type=UsrMsgSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrMsg record);

    @Update({
        "update t_usr_msg",
        "set FROM_USER_ID = #{fromUserId,jdbcType=BIGINT},",
          "TO_USER_ID = #{toUserId,jdbcType=BIGINT},",
          "MSG_TITLE = #{msgTitle,jdbcType=VARCHAR},",
          "MSG_INFO = #{msgInfo,jdbcType=VARCHAR},",
          "MSG_TIME = #{msgTime,jdbcType=TIMESTAMP},",
          "MSG_READ_TIME = #{msgReadTime,jdbcType=TIMESTAMP},",
          "MSG_STS = #{msgSts,jdbcType=CHAR},",
          "MSG_TYPE = #{msgType,jdbcType=CHAR},",
          "MSG_JUMP_URL = #{msgJumpUrl,jdbcType=VARCHAR}",
        "where MSG_ID = #{msgId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrMsg record);
}