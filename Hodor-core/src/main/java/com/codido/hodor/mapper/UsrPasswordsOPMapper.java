package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrPasswords;
import com.codido.hodor.model.UsrPasswordsExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UsrPasswordsOPMapper {

    @Select({
        "select",
        "USR_PWD_ID, USER_ID, USER_MBL_NO, USER_LOGIN_NAME, USER_PASSWORDS, PWD_TYPE",
        "from t_usr_passwords",
        "where USER_MBL_NO = #{mblNo,jdbcType=VARCHAR} AND PWD_TYPE = #{pwdType,jdbcType=VARCHAR} limit 1"
    })
    @ConstructorArgs({
        @Arg(column="USR_PWD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_LOGIN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_PASSWORDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PWD_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    UsrPasswords selectByMblNoAndType(@Param("mblNo") String mblNo,@Param("pwdType") String pwdType);
}