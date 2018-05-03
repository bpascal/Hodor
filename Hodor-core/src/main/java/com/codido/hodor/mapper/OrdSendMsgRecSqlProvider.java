package com.codido.hodor.mapper;

import com.codido.hodor.model.OrdSendMsgRec;
import com.codido.hodor.model.OrdSendMsgRecExample.Criteria;
import com.codido.hodor.model.OrdSendMsgRecExample.Criterion;
import com.codido.hodor.model.OrdSendMsgRecExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdSendMsgRecSqlProvider {

    public String countByExample(OrdSendMsgRecExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_ord_sendmsg_rec");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdSendMsgRecExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_ord_sendmsg_rec");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdSendMsgRec record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_ord_sendmsg_rec");
        
        if (record.getOrderNo() != null) {
            sql.VALUES("ORDER_NO", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            sql.VALUES("OPEN_ID", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getTemplateId() != null) {
            sql.VALUES("TEMPLATE_ID", "#{templateId,jdbcType=VARCHAR}");
        }
        
        if (record.getFormId() != null) {
            sql.VALUES("FORM_ID", "#{formId,jdbcType=VARCHAR}");
        }
        
        if (record.getSendReqUrl() != null) {
            sql.VALUES("SEND_REQ_URL", "#{sendReqUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSendMsgTime() != null) {
            sql.VALUES("SEND_MSG_TIME", "#{sendMsgTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendMsgSts() != null) {
            sql.VALUES("SEND_MSG_STS", "#{sendMsgSts,jdbcType=CHAR}");
        }
        
        if (record.getSendMsgPara() != null) {
            sql.VALUES("SEND_MSG_PARA", "#{sendMsgPara,jdbcType=VARCHAR}");
        }
        
        if (record.getSendMsgRet() != null) {
            sql.VALUES("SEND_MSG_RET", "#{sendMsgRet,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdSendMsgRecExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SENDMSG_REC_ID");
        } else {
            sql.SELECT("SENDMSG_REC_ID");
        }
        sql.SELECT("ORDER_NO");
        sql.SELECT("OPEN_ID");
        sql.SELECT("TEMPLATE_ID");
        sql.SELECT("FORM_ID");
        sql.SELECT("SEND_REQ_URL");
        sql.SELECT("SEND_MSG_TIME");
        sql.SELECT("SEND_MSG_STS");
        sql.SELECT("SEND_MSG_PARA");
        sql.SELECT("SEND_MSG_RET");
        sql.FROM("t_ord_sendmsg_rec");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdSendMsgRec record = (OrdSendMsgRec) parameter.get("record");
        OrdSendMsgRecExample example = (OrdSendMsgRecExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_ord_sendmsg_rec");
        
        if (record.getSendmsgRecId() != null) {
            sql.SET("SENDMSG_REC_ID = #{record.sendmsgRecId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            sql.SET("OPEN_ID = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getTemplateId() != null) {
            sql.SET("TEMPLATE_ID = #{record.templateId,jdbcType=VARCHAR}");
        }
        
        if (record.getFormId() != null) {
            sql.SET("FORM_ID = #{record.formId,jdbcType=VARCHAR}");
        }
        
        if (record.getSendReqUrl() != null) {
            sql.SET("SEND_REQ_URL = #{record.sendReqUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSendMsgTime() != null) {
            sql.SET("SEND_MSG_TIME = #{record.sendMsgTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendMsgSts() != null) {
            sql.SET("SEND_MSG_STS = #{record.sendMsgSts,jdbcType=CHAR}");
        }
        
        if (record.getSendMsgPara() != null) {
            sql.SET("SEND_MSG_PARA = #{record.sendMsgPara,jdbcType=VARCHAR}");
        }
        
        if (record.getSendMsgRet() != null) {
            sql.SET("SEND_MSG_RET = #{record.sendMsgRet,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_sendmsg_rec");
        
        sql.SET("SENDMSG_REC_ID = #{record.sendmsgRecId,jdbcType=BIGINT}");
        sql.SET("ORDER_NO = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("OPEN_ID = #{record.openId,jdbcType=VARCHAR}");
        sql.SET("TEMPLATE_ID = #{record.templateId,jdbcType=VARCHAR}");
        sql.SET("FORM_ID = #{record.formId,jdbcType=VARCHAR}");
        sql.SET("SEND_REQ_URL = #{record.sendReqUrl,jdbcType=VARCHAR}");
        sql.SET("SEND_MSG_TIME = #{record.sendMsgTime,jdbcType=TIMESTAMP}");
        sql.SET("SEND_MSG_STS = #{record.sendMsgSts,jdbcType=CHAR}");
        sql.SET("SEND_MSG_PARA = #{record.sendMsgPara,jdbcType=VARCHAR}");
        sql.SET("SEND_MSG_RET = #{record.sendMsgRet,jdbcType=VARCHAR}");
        
        OrdSendMsgRecExample example = (OrdSendMsgRecExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrdSendMsgRec record) {
        SQL sql = new SQL();
        sql.UPDATE("t_ord_sendmsg_rec");
        
        if (record.getOrderNo() != null) {
            sql.SET("ORDER_NO = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            sql.SET("OPEN_ID = #{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getTemplateId() != null) {
            sql.SET("TEMPLATE_ID = #{templateId,jdbcType=VARCHAR}");
        }
        
        if (record.getFormId() != null) {
            sql.SET("FORM_ID = #{formId,jdbcType=VARCHAR}");
        }
        
        if (record.getSendReqUrl() != null) {
            sql.SET("SEND_REQ_URL = #{sendReqUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSendMsgTime() != null) {
            sql.SET("SEND_MSG_TIME = #{sendMsgTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendMsgSts() != null) {
            sql.SET("SEND_MSG_STS = #{sendMsgSts,jdbcType=CHAR}");
        }
        
        if (record.getSendMsgPara() != null) {
            sql.SET("SEND_MSG_PARA = #{sendMsgPara,jdbcType=VARCHAR}");
        }
        
        if (record.getSendMsgRet() != null) {
            sql.SET("SEND_MSG_RET = #{sendMsgRet,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("SENDMSG_REC_ID = #{sendmsgRecId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdSendMsgRecExample example, boolean includeExamplePhrase) {
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