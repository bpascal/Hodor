package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrMsg;
import com.codido.hodor.model.UsrMsgExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface UsrMsgOPMapper {

    @Select({
            "select",
            "MSG_ID, FROM_USER_ID, TO_USER_ID, MSG_TITLE, MSG_INFO, MSG_TIME, MSG_READ_TIME, ",
            "MSG_STS, MSG_TYPE, MSG_JUMP_URL",
            "from t_usr_msg",
            "where TO_USER_ID = #{toUserId,jdbcType=BIGINT} ",
            "order by MSG_TIME desc",
            "LIMIT  #{pageNo,jdbcType=BIGINT},#{prePageCount,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
            @Arg(column = "MSG_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Arg(column = "FROM_USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "TO_USER_ID", javaType = Long.class, jdbcType = JdbcType.BIGINT),
            @Arg(column = "MSG_TITLE", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "MSG_INFO", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Arg(column = "MSG_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "MSG_READ_TIME", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
            @Arg(column = "MSG_STS", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "MSG_TYPE", javaType = String.class, jdbcType = JdbcType.CHAR),
            @Arg(column = "MSG_JUMP_URL", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    List<UsrMsg> getUsrMsgList(@Param("pageNo") Long pageNo, @Param("prePageCount") Long prePageCount, @Param("toUserId") Long toUserId);
    @Select({
            "select",
            "MSG_ID, FROM_USER_ID, TO_USER_ID, MSG_TITLE, MSG_INFO, MSG_TIME, MSG_READ_TIME, ",
            "MSG_STS, MSG_TYPE, MSG_JUMP_URL",
            "from t_usr_msg",
            "where MSG_ID = #{msgId,jdbcType=BIGINT} and TO_USER_ID = #{toUserId,jdbcType=BIGINT}"
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
    UsrMsg selectByPrimaryKey(@Param("msgId") Long msgId,@Param("toUserId") Long toUserId);
}