package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrBankCard;
import com.codido.hodor.model.UsrBankCardExample.Criteria;
import com.codido.hodor.model.UsrBankCardExample.Criterion;
import com.codido.hodor.model.UsrBankCardExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrBankCardSqlProvider {

    public String countByExample(UsrBankCardExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_bankcard");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrBankCardExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_bankcard");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrBankCard record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_bankcard");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getBankId() != null) {
            sql.VALUES("BANK_ID", "#{bankId,jdbcType=BIGINT}");
        }
        
        if (record.getBankCardNo() != null) {
            sql.VALUES("BANK_CARD_NO", "#{bankCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUsrBankcardSts() != null) {
            sql.VALUES("USR_BANKCARD_STS", "#{usrBankcardSts,jdbcType=CHAR}");
        }
        
        if (record.getBandTime() != null) {
            sql.VALUES("BAND_TIME", "#{bandTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrBankCardExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USR_BANKCARD_ID");
        } else {
            sql.SELECT("USR_BANKCARD_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("BANK_ID");
        sql.SELECT("BANK_CARD_NO");
        sql.SELECT("USR_BANKCARD_STS");
        sql.SELECT("BAND_TIME");
        sql.FROM("t_usr_bankcard");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrBankCard record = (UsrBankCard) parameter.get("record");
        UsrBankCardExample example = (UsrBankCardExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_bankcard");
        
        if (record.getUsrBankcardId() != null) {
            sql.SET("USR_BANKCARD_ID = #{record.usrBankcardId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getBankId() != null) {
            sql.SET("BANK_ID = #{record.bankId,jdbcType=BIGINT}");
        }
        
        if (record.getBankCardNo() != null) {
            sql.SET("BANK_CARD_NO = #{record.bankCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUsrBankcardSts() != null) {
            sql.SET("USR_BANKCARD_STS = #{record.usrBankcardSts,jdbcType=CHAR}");
        }
        
        if (record.getBandTime() != null) {
            sql.SET("BAND_TIME = #{record.bandTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_bankcard");
        
        sql.SET("USR_BANKCARD_ID = #{record.usrBankcardId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("BANK_ID = #{record.bankId,jdbcType=BIGINT}");
        sql.SET("BANK_CARD_NO = #{record.bankCardNo,jdbcType=VARCHAR}");
        sql.SET("USR_BANKCARD_STS = #{record.usrBankcardSts,jdbcType=CHAR}");
        sql.SET("BAND_TIME = #{record.bandTime,jdbcType=TIMESTAMP}");
        
        UsrBankCardExample example = (UsrBankCardExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrBankCard record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_bankcard");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getBankId() != null) {
            sql.SET("BANK_ID = #{bankId,jdbcType=BIGINT}");
        }
        
        if (record.getBankCardNo() != null) {
            sql.SET("BANK_CARD_NO = #{bankCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUsrBankcardSts() != null) {
            sql.SET("USR_BANKCARD_STS = #{usrBankcardSts,jdbcType=CHAR}");
        }
        
        if (record.getBandTime() != null) {
            sql.SET("BAND_TIME = #{bandTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("USR_BANKCARD_ID = #{usrBankcardId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrBankCardExample example, boolean includeExamplePhrase) {
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