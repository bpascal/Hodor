package com.codido.hodor.mapper;

import com.codido.hodor.model.AccUserAcdt;
import com.codido.hodor.model.AccUserAcdtExample.Criteria;
import com.codido.hodor.model.AccUserAcdtExample.Criterion;
import com.codido.hodor.model.AccUserAcdtExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AccUserAcdtSqlProvider {

    public String countByExample(AccUserAcdtExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_acc_user_acdt");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AccUserAcdtExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_acc_user_acdt");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(AccUserAcdt record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_acc_user_acdt");
        
        if (record.getUserAccountId() != null) {
            sql.VALUES("USER_ACCOUNT_ID", "#{userAccountId,jdbcType=BIGINT}");
        }
        
        if (record.getTxAmount() != null) {
            sql.VALUES("TX_AMOUNT", "#{txAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTxOrderNo() != null) {
            sql.VALUES("TX_ORDER_NO", "#{txOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTxNo() != null) {
            sql.VALUES("TX_NO", "#{txNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTxWay() != null) {
            sql.VALUES("TX_WAY", "#{txWay,jdbcType=CHAR}");
        }
        
        if (record.getTxTime() != null) {
            sql.VALUES("TX_TIME", "#{txTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAcdtSts() != null) {
            sql.VALUES("ACDT_STS", "#{acdtSts,jdbcType=CHAR}");
        }
        
        if (record.getAcdtDesc() != null) {
            sql.VALUES("ACDT_DESC", "#{acdtDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getAcdtType() != null) {
            sql.VALUES("ACDT_TYPE", "#{acdtType,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AccUserAcdtExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER_ACDT_ID");
        } else {
            sql.SELECT("USER_ACDT_ID");
        }
        sql.SELECT("USER_ACCOUNT_ID");
        sql.SELECT("TX_AMOUNT");
        sql.SELECT("TX_ORDER_NO");
        sql.SELECT("TX_NO");
        sql.SELECT("TX_WAY");
        sql.SELECT("TX_TIME");
        sql.SELECT("ACDT_STS");
        sql.SELECT("ACDT_DESC");
        sql.SELECT("ACDT_TYPE");
        sql.FROM("t_acc_user_acdt");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccUserAcdt record = (AccUserAcdt) parameter.get("record");
        AccUserAcdtExample example = (AccUserAcdtExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_acc_user_acdt");
        
        if (record.getUserAcdtId() != null) {
            sql.SET("USER_ACDT_ID = #{record.userAcdtId,jdbcType=BIGINT}");
        }
        
        if (record.getUserAccountId() != null) {
            sql.SET("USER_ACCOUNT_ID = #{record.userAccountId,jdbcType=BIGINT}");
        }
        
        if (record.getTxAmount() != null) {
            sql.SET("TX_AMOUNT = #{record.txAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTxOrderNo() != null) {
            sql.SET("TX_ORDER_NO = #{record.txOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTxNo() != null) {
            sql.SET("TX_NO = #{record.txNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTxWay() != null) {
            sql.SET("TX_WAY = #{record.txWay,jdbcType=CHAR}");
        }
        
        if (record.getTxTime() != null) {
            sql.SET("TX_TIME = #{record.txTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAcdtSts() != null) {
            sql.SET("ACDT_STS = #{record.acdtSts,jdbcType=CHAR}");
        }
        
        if (record.getAcdtDesc() != null) {
            sql.SET("ACDT_DESC = #{record.acdtDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getAcdtType() != null) {
            sql.SET("ACDT_TYPE = #{record.acdtType,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_user_acdt");
        
        sql.SET("USER_ACDT_ID = #{record.userAcdtId,jdbcType=BIGINT}");
        sql.SET("USER_ACCOUNT_ID = #{record.userAccountId,jdbcType=BIGINT}");
        sql.SET("TX_AMOUNT = #{record.txAmount,jdbcType=DECIMAL}");
        sql.SET("TX_ORDER_NO = #{record.txOrderNo,jdbcType=VARCHAR}");
        sql.SET("TX_NO = #{record.txNo,jdbcType=VARCHAR}");
        sql.SET("TX_WAY = #{record.txWay,jdbcType=CHAR}");
        sql.SET("TX_TIME = #{record.txTime,jdbcType=TIMESTAMP}");
        sql.SET("ACDT_STS = #{record.acdtSts,jdbcType=CHAR}");
        sql.SET("ACDT_DESC = #{record.acdtDesc,jdbcType=VARCHAR}");
        sql.SET("ACDT_TYPE = #{record.acdtType,jdbcType=CHAR}");
        
        AccUserAcdtExample example = (AccUserAcdtExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AccUserAcdt record) {
        SQL sql = new SQL();
        sql.UPDATE("t_acc_user_acdt");
        
        if (record.getUserAccountId() != null) {
            sql.SET("USER_ACCOUNT_ID = #{userAccountId,jdbcType=BIGINT}");
        }
        
        if (record.getTxAmount() != null) {
            sql.SET("TX_AMOUNT = #{txAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTxOrderNo() != null) {
            sql.SET("TX_ORDER_NO = #{txOrderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTxNo() != null) {
            sql.SET("TX_NO = #{txNo,jdbcType=VARCHAR}");
        }
        
        if (record.getTxWay() != null) {
            sql.SET("TX_WAY = #{txWay,jdbcType=CHAR}");
        }
        
        if (record.getTxTime() != null) {
            sql.SET("TX_TIME = #{txTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAcdtSts() != null) {
            sql.SET("ACDT_STS = #{acdtSts,jdbcType=CHAR}");
        }
        
        if (record.getAcdtDesc() != null) {
            sql.SET("ACDT_DESC = #{acdtDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getAcdtType() != null) {
            sql.SET("ACDT_TYPE = #{acdtType,jdbcType=CHAR}");
        }
        
        sql.WHERE("USER_ACDT_ID = #{userAcdtId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AccUserAcdtExample example, boolean includeExamplePhrase) {
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