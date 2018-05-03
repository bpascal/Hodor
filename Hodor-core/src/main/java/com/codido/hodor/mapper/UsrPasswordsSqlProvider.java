package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrPasswords;
import com.codido.hodor.model.UsrPasswordsExample.Criteria;
import com.codido.hodor.model.UsrPasswordsExample.Criterion;
import com.codido.hodor.model.UsrPasswordsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrPasswordsSqlProvider {

    public String countByExample(UsrPasswordsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_passwords");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrPasswordsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_passwords");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrPasswords record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_passwords");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMblNo() != null) {
            sql.VALUES("USER_MBL_NO", "#{userMblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLoginName() != null) {
            sql.VALUES("USER_LOGIN_NAME", "#{userLoginName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPasswords() != null) {
            sql.VALUES("USER_PASSWORDS", "#{userPasswords,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdType() != null) {
            sql.VALUES("PWD_TYPE", "#{pwdType,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrPasswordsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USR_PWD_ID");
        } else {
            sql.SELECT("USR_PWD_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("USER_MBL_NO");
        sql.SELECT("USER_LOGIN_NAME");
        sql.SELECT("USER_PASSWORDS");
        sql.SELECT("PWD_TYPE");
        sql.FROM("t_usr_passwords");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrPasswords record = (UsrPasswords) parameter.get("record");
        UsrPasswordsExample example = (UsrPasswordsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_passwords");
        
        if (record.getUsrPwdId() != null) {
            sql.SET("USR_PWD_ID = #{record.usrPwdId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMblNo() != null) {
            sql.SET("USER_MBL_NO = #{record.userMblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLoginName() != null) {
            sql.SET("USER_LOGIN_NAME = #{record.userLoginName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPasswords() != null) {
            sql.SET("USER_PASSWORDS = #{record.userPasswords,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdType() != null) {
            sql.SET("PWD_TYPE = #{record.pwdType,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_passwords");
        
        sql.SET("USR_PWD_ID = #{record.usrPwdId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("USER_MBL_NO = #{record.userMblNo,jdbcType=VARCHAR}");
        sql.SET("USER_LOGIN_NAME = #{record.userLoginName,jdbcType=VARCHAR}");
        sql.SET("USER_PASSWORDS = #{record.userPasswords,jdbcType=VARCHAR}");
        sql.SET("PWD_TYPE = #{record.pwdType,jdbcType=CHAR}");
        
        UsrPasswordsExample example = (UsrPasswordsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrPasswords record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_passwords");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserMblNo() != null) {
            sql.SET("USER_MBL_NO = #{userMblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLoginName() != null) {
            sql.SET("USER_LOGIN_NAME = #{userLoginName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPasswords() != null) {
            sql.SET("USER_PASSWORDS = #{userPasswords,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdType() != null) {
            sql.SET("PWD_TYPE = #{pwdType,jdbcType=CHAR}");
        }
        
        sql.WHERE("USR_PWD_ID = #{usrPwdId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrPasswordsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}