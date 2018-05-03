package com.codido.hodor.mapper;

import com.codido.hodor.model.CmmBank;
import com.codido.hodor.model.CmmBankExample.Criteria;
import com.codido.hodor.model.CmmBankExample.Criterion;
import com.codido.hodor.model.CmmBankExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CmmBankSqlProvider {

    public String countByExample(CmmBankExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_cmm_bank");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CmmBankExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_cmm_bank");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CmmBank record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_cmm_bank");
        
        if (record.getBankName() != null) {
            sql.VALUES("BANK_NAME", "#{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankLogoUrl() != null) {
            sql.VALUES("BANK_LOGO_URL", "#{bankLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBankCode() != null) {
            sql.VALUES("BANK_CODE", "#{bankCode,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CmmBankExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("BANK_ID");
        } else {
            sql.SELECT("BANK_ID");
        }
        sql.SELECT("BANK_NAME");
        sql.SELECT("BANK_LOGO_URL");
        sql.SELECT("BANK_CODE");
        sql.FROM("t_cmm_bank");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CmmBank record = (CmmBank) parameter.get("record");
        CmmBankExample example = (CmmBankExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_cmm_bank");
        
        if (record.getBankId() != null) {
            sql.SET("BANK_ID = #{record.bankId,jdbcType=BIGINT}");
        }
        
        if (record.getBankName() != null) {
            sql.SET("BANK_NAME = #{record.bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankLogoUrl() != null) {
            sql.SET("BANK_LOGO_URL = #{record.bankLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBankCode() != null) {
            sql.SET("BANK_CODE = #{record.bankCode,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_cmm_bank");
        
        sql.SET("BANK_ID = #{record.bankId,jdbcType=BIGINT}");
        sql.SET("BANK_NAME = #{record.bankName,jdbcType=VARCHAR}");
        sql.SET("BANK_LOGO_URL = #{record.bankLogoUrl,jdbcType=VARCHAR}");
        sql.SET("BANK_CODE = #{record.bankCode,jdbcType=VARCHAR}");
        
        CmmBankExample example = (CmmBankExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CmmBank record) {
        SQL sql = new SQL();
        sql.UPDATE("t_cmm_bank");
        
        if (record.getBankName() != null) {
            sql.SET("BANK_NAME = #{bankName,jdbcType=VARCHAR}");
        }
        
        if (record.getBankLogoUrl() != null) {
            sql.SET("BANK_LOGO_URL = #{bankLogoUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getBankCode() != null) {
            sql.SET("BANK_CODE = #{bankCode,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("BANK_ID = #{bankId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CmmBankExample example, boolean includeExamplePhrase) {
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