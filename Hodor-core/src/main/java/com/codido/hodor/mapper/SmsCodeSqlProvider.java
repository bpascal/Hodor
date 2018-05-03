package com.codido.hodor.mapper;

import com.codido.hodor.model.SmsCode;
import com.codido.hodor.model.SmsCodeExample.Criteria;
import com.codido.hodor.model.SmsCodeExample.Criterion;
import com.codido.hodor.model.SmsCodeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SmsCodeSqlProvider {

    public String countByExample(SmsCodeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_sms_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SmsCodeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_sms_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SmsCode record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_sms_code");
        
        if (record.getMblNo() != null) {
            sql.VALUES("MBL_NO", "#{mblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsType() != null) {
            sql.VALUES("SMS_TYPE", "#{smsType,jdbcType=CHAR}");
        }
        
        if (record.getSmsCode() != null) {
            sql.VALUES("SMS_CODE", "#{smsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsContent() != null) {
            sql.VALUES("SMS_CONTENT", "#{smsContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsCodeCreateTime() != null) {
            sql.VALUES("SMS_CODE_CREATE_TIME", "#{smsCodeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSmsSendTime() != null) {
            sql.VALUES("SMS_SEND_TIME", "#{smsSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSmsCodeSts() != null) {
            sql.VALUES("SMS_CODE_STS", "#{smsCodeSts,jdbcType=CHAR}");
        }
        
        if (record.getErrCount() != null) {
            sql.VALUES("ERR_COUNT", "#{errCount,jdbcType=INTEGER}");
        }
        
        if (record.getLogId() != null) {
            sql.VALUES("LOG_ID", "#{logId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SmsCodeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SMS_CODE_ID");
        } else {
            sql.SELECT("SMS_CODE_ID");
        }
        sql.SELECT("MBL_NO");
        sql.SELECT("SMS_TYPE");
        sql.SELECT("SMS_CODE");
        sql.SELECT("SMS_CONTENT");
        sql.SELECT("SMS_CODE_CREATE_TIME");
        sql.SELECT("SMS_SEND_TIME");
        sql.SELECT("SMS_CODE_STS");
        sql.SELECT("ERR_COUNT");
        sql.SELECT("LOG_ID");
        sql.FROM("t_sms_code");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SmsCode record = (SmsCode) parameter.get("record");
        SmsCodeExample example = (SmsCodeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_sms_code");
        
        if (record.getSmsCodeId() != null) {
            sql.SET("SMS_CODE_ID = #{record.smsCodeId,jdbcType=BIGINT}");
        }
        
        if (record.getMblNo() != null) {
            sql.SET("MBL_NO = #{record.mblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsType() != null) {
            sql.SET("SMS_TYPE = #{record.smsType,jdbcType=CHAR}");
        }
        
        if (record.getSmsCode() != null) {
            sql.SET("SMS_CODE = #{record.smsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsContent() != null) {
            sql.SET("SMS_CONTENT = #{record.smsContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsCodeCreateTime() != null) {
            sql.SET("SMS_CODE_CREATE_TIME = #{record.smsCodeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSmsSendTime() != null) {
            sql.SET("SMS_SEND_TIME = #{record.smsSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSmsCodeSts() != null) {
            sql.SET("SMS_CODE_STS = #{record.smsCodeSts,jdbcType=CHAR}");
        }
        
        if (record.getErrCount() != null) {
            sql.SET("ERR_COUNT = #{record.errCount,jdbcType=INTEGER}");
        }
        
        if (record.getLogId() != null) {
            sql.SET("LOG_ID = #{record.logId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_sms_code");
        
        sql.SET("SMS_CODE_ID = #{record.smsCodeId,jdbcType=BIGINT}");
        sql.SET("MBL_NO = #{record.mblNo,jdbcType=VARCHAR}");
        sql.SET("SMS_TYPE = #{record.smsType,jdbcType=CHAR}");
        sql.SET("SMS_CODE = #{record.smsCode,jdbcType=VARCHAR}");
        sql.SET("SMS_CONTENT = #{record.smsContent,jdbcType=VARCHAR}");
        sql.SET("SMS_CODE_CREATE_TIME = #{record.smsCodeCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("SMS_SEND_TIME = #{record.smsSendTime,jdbcType=TIMESTAMP}");
        sql.SET("SMS_CODE_STS = #{record.smsCodeSts,jdbcType=CHAR}");
        sql.SET("ERR_COUNT = #{record.errCount,jdbcType=INTEGER}");
        sql.SET("LOG_ID = #{record.logId,jdbcType=VARCHAR}");
        
        SmsCodeExample example = (SmsCodeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SmsCode record) {
        SQL sql = new SQL();
        sql.UPDATE("t_sms_code");
        
        if (record.getMblNo() != null) {
            sql.SET("MBL_NO = #{mblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsType() != null) {
            sql.SET("SMS_TYPE = #{smsType,jdbcType=CHAR}");
        }
        
        if (record.getSmsCode() != null) {
            sql.SET("SMS_CODE = #{smsCode,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsContent() != null) {
            sql.SET("SMS_CONTENT = #{smsContent,jdbcType=VARCHAR}");
        }
        
        if (record.getSmsCodeCreateTime() != null) {
            sql.SET("SMS_CODE_CREATE_TIME = #{smsCodeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSmsSendTime() != null) {
            sql.SET("SMS_SEND_TIME = #{smsSendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSmsCodeSts() != null) {
            sql.SET("SMS_CODE_STS = #{smsCodeSts,jdbcType=CHAR}");
        }
        
        if (record.getErrCount() != null) {
            sql.SET("ERR_COUNT = #{errCount,jdbcType=INTEGER}");
        }
        
        if (record.getLogId() != null) {
            sql.SET("LOG_ID = #{logId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("SMS_CODE_ID = #{smsCodeId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SmsCodeExample example, boolean includeExamplePhrase) {
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