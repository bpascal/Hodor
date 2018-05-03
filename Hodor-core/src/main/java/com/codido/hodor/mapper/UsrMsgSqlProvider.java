package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrMsg;
import com.codido.hodor.model.UsrMsgExample.Criteria;
import com.codido.hodor.model.UsrMsgExample.Criterion;
import com.codido.hodor.model.UsrMsgExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrMsgSqlProvider {

    public String countByExample(UsrMsgExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_msg");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrMsgExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_msg");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrMsg record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_msg");
        
        if (record.getFromUserId() != null) {
            sql.VALUES("FROM_USER_ID", "#{fromUserId,jdbcType=BIGINT}");
        }
        
        if (record.getToUserId() != null) {
            sql.VALUES("TO_USER_ID", "#{toUserId,jdbcType=BIGINT}");
        }
        
        if (record.getMsgTitle() != null) {
            sql.VALUES("MSG_TITLE", "#{msgTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgInfo() != null) {
            sql.VALUES("MSG_INFO", "#{msgInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgTime() != null) {
            sql.VALUES("MSG_TIME", "#{msgTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgReadTime() != null) {
            sql.VALUES("MSG_READ_TIME", "#{msgReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgSts() != null) {
            sql.VALUES("MSG_STS", "#{msgSts,jdbcType=CHAR}");
        }
        
        if (record.getMsgType() != null) {
            sql.VALUES("MSG_TYPE", "#{msgType,jdbcType=CHAR}");
        }
        
        if (record.getMsgJumpUrl() != null) {
            sql.VALUES("MSG_JUMP_URL", "#{msgJumpUrl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrMsgExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("MSG_ID");
        } else {
            sql.SELECT("MSG_ID");
        }
        sql.SELECT("FROM_USER_ID");
        sql.SELECT("TO_USER_ID");
        sql.SELECT("MSG_TITLE");
        sql.SELECT("MSG_INFO");
        sql.SELECT("MSG_TIME");
        sql.SELECT("MSG_READ_TIME");
        sql.SELECT("MSG_STS");
        sql.SELECT("MSG_TYPE");
        sql.SELECT("MSG_JUMP_URL");
        sql.FROM("t_usr_msg");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrMsg record = (UsrMsg) parameter.get("record");
        UsrMsgExample example = (UsrMsgExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_msg");
        
        if (record.getMsgId() != null) {
            sql.SET("MSG_ID = #{record.msgId,jdbcType=BIGINT}");
        }
        
        if (record.getFromUserId() != null) {
            sql.SET("FROM_USER_ID = #{record.fromUserId,jdbcType=BIGINT}");
        }
        
        if (record.getToUserId() != null) {
            sql.SET("TO_USER_ID = #{record.toUserId,jdbcType=BIGINT}");
        }
        
        if (record.getMsgTitle() != null) {
            sql.SET("MSG_TITLE = #{record.msgTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgInfo() != null) {
            sql.SET("MSG_INFO = #{record.msgInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgTime() != null) {
            sql.SET("MSG_TIME = #{record.msgTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgReadTime() != null) {
            sql.SET("MSG_READ_TIME = #{record.msgReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgSts() != null) {
            sql.SET("MSG_STS = #{record.msgSts,jdbcType=CHAR}");
        }
        
        if (record.getMsgType() != null) {
            sql.SET("MSG_TYPE = #{record.msgType,jdbcType=CHAR}");
        }
        
        if (record.getMsgJumpUrl() != null) {
            sql.SET("MSG_JUMP_URL = #{record.msgJumpUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_msg");
        
        sql.SET("MSG_ID = #{record.msgId,jdbcType=BIGINT}");
        sql.SET("FROM_USER_ID = #{record.fromUserId,jdbcType=BIGINT}");
        sql.SET("TO_USER_ID = #{record.toUserId,jdbcType=BIGINT}");
        sql.SET("MSG_TITLE = #{record.msgTitle,jdbcType=VARCHAR}");
        sql.SET("MSG_INFO = #{record.msgInfo,jdbcType=VARCHAR}");
        sql.SET("MSG_TIME = #{record.msgTime,jdbcType=TIMESTAMP}");
        sql.SET("MSG_READ_TIME = #{record.msgReadTime,jdbcType=TIMESTAMP}");
        sql.SET("MSG_STS = #{record.msgSts,jdbcType=CHAR}");
        sql.SET("MSG_TYPE = #{record.msgType,jdbcType=CHAR}");
        sql.SET("MSG_JUMP_URL = #{record.msgJumpUrl,jdbcType=VARCHAR}");
        
        UsrMsgExample example = (UsrMsgExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrMsg record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_msg");
        
        if (record.getFromUserId() != null) {
            sql.SET("FROM_USER_ID = #{fromUserId,jdbcType=BIGINT}");
        }
        
        if (record.getToUserId() != null) {
            sql.SET("TO_USER_ID = #{toUserId,jdbcType=BIGINT}");
        }
        
        if (record.getMsgTitle() != null) {
            sql.SET("MSG_TITLE = #{msgTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgInfo() != null) {
            sql.SET("MSG_INFO = #{msgInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgTime() != null) {
            sql.SET("MSG_TIME = #{msgTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgReadTime() != null) {
            sql.SET("MSG_READ_TIME = #{msgReadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgSts() != null) {
            sql.SET("MSG_STS = #{msgSts,jdbcType=CHAR}");
        }
        
        if (record.getMsgType() != null) {
            sql.SET("MSG_TYPE = #{msgType,jdbcType=CHAR}");
        }
        
        if (record.getMsgJumpUrl() != null) {
            sql.SET("MSG_JUMP_URL = #{msgJumpUrl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("MSG_ID = #{msgId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrMsgExample example, boolean includeExamplePhrase) {
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