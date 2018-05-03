package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrPasswords;
import com.codido.hodor.model.UsrPasswordsExample;
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

public interface UsrPasswordsMapper {
    @SelectProvider(type=UsrPasswordsSqlProvider.class, method="countByExample")
    long countByExample(UsrPasswordsExample example);

    @DeleteProvider(type=UsrPasswordsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsrPasswordsExample example);

    @Delete({
        "delete from t_usr_passwords",
        "where USR_PWD_ID = #{usrPwdId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long usrPwdId);

    @Insert({
        "insert into t_usr_passwords (USER_ID, USER_MBL_NO, ",
        "USER_LOGIN_NAME, USER_PASSWORDS, ",
        "PWD_TYPE)",
        "values (#{userId,jdbcType=BIGINT}, #{userMblNo,jdbcType=VARCHAR}, ",
        "#{userLoginName,jdbcType=VARCHAR}, #{userPasswords,jdbcType=VARCHAR}, ",
        "#{pwdType,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="usrPwdId")
    int insert(UsrPasswords record);

    @InsertProvider(type=UsrPasswordsSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="usrPwdId")
    int insertSelective(UsrPasswords record);

    @SelectProvider(type=UsrPasswordsSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="USR_PWD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_LOGIN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_PASSWORDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PWD_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    List<UsrPasswords> selectByExample(UsrPasswordsExample example);

    @Select({
        "select",
        "USR_PWD_ID, USER_ID, USER_MBL_NO, USER_LOGIN_NAME, USER_PASSWORDS, PWD_TYPE",
        "from t_usr_passwords",
        "where USR_PWD_ID = #{usrPwdId,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="USR_PWD_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="USER_ID", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="USER_MBL_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_LOGIN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="USER_PASSWORDS", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PWD_TYPE", javaType=String.class, jdbcType=JdbcType.CHAR)
    })
    UsrPasswords selectByPrimaryKey(Long usrPwdId);

    @UpdateProvider(type=UsrPasswordsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UsrPasswords record, @Param("example") UsrPasswordsExample example);

    @UpdateProvider(type=UsrPasswordsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UsrPasswords record, @Param("example") UsrPasswordsExample example);

    @UpdateProvider(type=UsrPasswordsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsrPasswords record);

    @Update({
        "update t_usr_passwords",
        "set USER_ID = #{userId,jdbcType=BIGINT},",
          "USER_MBL_NO = #{userMblNo,jdbcType=VARCHAR},",
          "USER_LOGIN_NAME = #{userLoginName,jdbcType=VARCHAR},",
          "USER_PASSWORDS = #{userPasswords,jdbcType=VARCHAR},",
          "PWD_TYPE = #{pwdType,jdbcType=CHAR}",
        "where USR_PWD_ID = #{usrPwdId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UsrPasswords record);
}