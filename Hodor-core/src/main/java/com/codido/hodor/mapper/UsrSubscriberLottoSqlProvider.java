package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrSubscriberLotto;
import com.codido.hodor.model.UsrSubscriberLottoExample.Criteria;
import com.codido.hodor.model.UsrSubscriberLottoExample.Criterion;
import com.codido.hodor.model.UsrSubscriberLottoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrSubscriberLottoSqlProvider {

    public String countByExample(UsrSubscriberLottoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_subscriber_lotto");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrSubscriberLottoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_subscriber_lotto");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrSubscriberLotto record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_subscriber_lotto");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.VALUES("LOTTO_ID", "#{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getSubscribSts() != null) {
            sql.VALUES("SUBSCRIB_STS", "#{subscribSts,jdbcType=CHAR}");
        }
        
        if (record.getSubscribTme() != null) {
            sql.VALUES("SUBSCRIB_TME", "#{subscribTme,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUnsubscribTme() != null) {
            sql.VALUES("UNSUBSCRIB_TME", "#{unsubscribTme,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrSubscriberLottoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USR_SUBSCRIB_LOTTO_ID");
        } else {
            sql.SELECT("USR_SUBSCRIB_LOTTO_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("LOTTO_ID");
        sql.SELECT("SUBSCRIB_STS");
        sql.SELECT("SUBSCRIB_TME");
        sql.SELECT("UNSUBSCRIB_TME");
        sql.FROM("t_usr_subscriber_lotto");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrSubscriberLotto record = (UsrSubscriberLotto) parameter.get("record");
        UsrSubscriberLottoExample example = (UsrSubscriberLottoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_subscriber_lotto");
        
        if (record.getUsrSubscribLottoId() != null) {
            sql.SET("USR_SUBSCRIB_LOTTO_ID = #{record.usrSubscribLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getSubscribSts() != null) {
            sql.SET("SUBSCRIB_STS = #{record.subscribSts,jdbcType=CHAR}");
        }
        
        if (record.getSubscribTme() != null) {
            sql.SET("SUBSCRIB_TME = #{record.subscribTme,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUnsubscribTme() != null) {
            sql.SET("UNSUBSCRIB_TME = #{record.unsubscribTme,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_subscriber_lotto");
        
        sql.SET("USR_SUBSCRIB_LOTTO_ID = #{record.usrSubscribLottoId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        sql.SET("SUBSCRIB_STS = #{record.subscribSts,jdbcType=CHAR}");
        sql.SET("SUBSCRIB_TME = #{record.subscribTme,jdbcType=TIMESTAMP}");
        sql.SET("UNSUBSCRIB_TME = #{record.unsubscribTme,jdbcType=TIMESTAMP}");
        
        UsrSubscriberLottoExample example = (UsrSubscriberLottoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrSubscriberLotto record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_subscriber_lotto");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getSubscribSts() != null) {
            sql.SET("SUBSCRIB_STS = #{subscribSts,jdbcType=CHAR}");
        }
        
        if (record.getSubscribTme() != null) {
            sql.SET("SUBSCRIB_TME = #{subscribTme,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUnsubscribTme() != null) {
            sql.SET("UNSUBSCRIB_TME = #{unsubscribTme,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("USR_SUBSCRIB_LOTTO_ID = #{usrSubscribLottoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrSubscriberLottoExample example, boolean includeExamplePhrase) {
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