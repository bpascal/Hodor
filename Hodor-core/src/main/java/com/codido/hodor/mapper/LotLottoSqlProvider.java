package com.codido.hodor.mapper;

import com.codido.hodor.model.LotLotto;
import com.codido.hodor.model.LotLottoExample.Criteria;
import com.codido.hodor.model.LotLottoExample.Criterion;
import com.codido.hodor.model.LotLottoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LotLottoSqlProvider {

    public String countByExample(LotLottoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_lot_lotto");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LotLottoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_lot_lotto");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LotLotto record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_lot_lotto");
        
        if (record.getLottoName() != null) {
            sql.VALUES("LOTTO_NAME", "#{lottoName,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoDesc() != null) {
            sql.VALUES("LOTTO_DESC", "#{lottoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoOwner() != null) {
            sql.VALUES("LOTTO_OWNER", "#{lottoOwner,jdbcType=CHAR}");
        }
        
        if (record.getLottoShotValue() != null) {
            sql.VALUES("LOTTO_SHOT_VALUE", "#{lottoShotValue,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoIconUrl() != null) {
            sql.VALUES("LOTTO_ICON_URL", "#{lottoIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBackgroundUrl() != null) {
            sql.VALUES("LOTTO_BACKGROUND_URL", "#{lottoBackgroundUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoSts() != null) {
            sql.VALUES("LOTTO_STS", "#{lottoSts,jdbcType=CHAR}");
        }
        
        if (record.getLottoType() != null) {
            sql.VALUES("LOTTO_TYPE", "#{lottoType,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoPublishDay() != null) {
            sql.VALUES("LOTTO_PUBLISH_DAY", "#{lottoPublishDay,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoPublishTime() != null) {
            sql.VALUES("LOTTO_PUBLISH_TIME", "#{lottoPublishTime,jdbcType=TIME}");
        }
        
        if (record.getLastLottoInstId() != null) {
            sql.VALUES("LAST_LOTTO_INST_ID", "#{lastLottoInstId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LotLottoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("LOTTO_ID");
        } else {
            sql.SELECT("LOTTO_ID");
        }
        sql.SELECT("LOTTO_NAME");
        sql.SELECT("LOTTO_DESC");
        sql.SELECT("LOTTO_OWNER");
        sql.SELECT("LOTTO_SHOT_VALUE");
        sql.SELECT("LOTTO_ICON_URL");
        sql.SELECT("LOTTO_BACKGROUND_URL");
        sql.SELECT("LOTTO_STS");
        sql.SELECT("LOTTO_TYPE");
        sql.SELECT("LOTTO_PUBLISH_DAY");
        sql.SELECT("LOTTO_PUBLISH_TIME");
        sql.SELECT("LAST_LOTTO_INST_ID");
        sql.FROM("t_lot_lotto");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LotLotto record = (LotLotto) parameter.get("record");
        LotLottoExample example = (LotLottoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_lot_lotto");
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoName() != null) {
            sql.SET("LOTTO_NAME = #{record.lottoName,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoDesc() != null) {
            sql.SET("LOTTO_DESC = #{record.lottoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoOwner() != null) {
            sql.SET("LOTTO_OWNER = #{record.lottoOwner,jdbcType=CHAR}");
        }
        
        if (record.getLottoShotValue() != null) {
            sql.SET("LOTTO_SHOT_VALUE = #{record.lottoShotValue,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoIconUrl() != null) {
            sql.SET("LOTTO_ICON_URL = #{record.lottoIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBackgroundUrl() != null) {
            sql.SET("LOTTO_BACKGROUND_URL = #{record.lottoBackgroundUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoSts() != null) {
            sql.SET("LOTTO_STS = #{record.lottoSts,jdbcType=CHAR}");
        }
        
        if (record.getLottoType() != null) {
            sql.SET("LOTTO_TYPE = #{record.lottoType,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoPublishDay() != null) {
            sql.SET("LOTTO_PUBLISH_DAY = #{record.lottoPublishDay,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoPublishTime() != null) {
            sql.SET("LOTTO_PUBLISH_TIME = #{record.lottoPublishTime,jdbcType=TIME}");
        }
        
        if (record.getLastLottoInstId() != null) {
            sql.SET("LAST_LOTTO_INST_ID = #{record.lastLottoInstId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_lotto");
        
        sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        sql.SET("LOTTO_NAME = #{record.lottoName,jdbcType=VARCHAR}");
        sql.SET("LOTTO_DESC = #{record.lottoDesc,jdbcType=VARCHAR}");
        sql.SET("LOTTO_OWNER = #{record.lottoOwner,jdbcType=CHAR}");
        sql.SET("LOTTO_SHOT_VALUE = #{record.lottoShotValue,jdbcType=VARCHAR}");
        sql.SET("LOTTO_ICON_URL = #{record.lottoIconUrl,jdbcType=VARCHAR}");
        sql.SET("LOTTO_BACKGROUND_URL = #{record.lottoBackgroundUrl,jdbcType=VARCHAR}");
        sql.SET("LOTTO_STS = #{record.lottoSts,jdbcType=CHAR}");
        sql.SET("LOTTO_TYPE = #{record.lottoType,jdbcType=VARCHAR}");
        sql.SET("LOTTO_PUBLISH_DAY = #{record.lottoPublishDay,jdbcType=VARCHAR}");
        sql.SET("LOTTO_PUBLISH_TIME = #{record.lottoPublishTime,jdbcType=TIME}");
        sql.SET("LAST_LOTTO_INST_ID = #{record.lastLottoInstId,jdbcType=BIGINT}");
        
        LotLottoExample example = (LotLottoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LotLotto record) {
        SQL sql = new SQL();
        sql.UPDATE("t_lot_lotto");
        
        if (record.getLottoName() != null) {
            sql.SET("LOTTO_NAME = #{lottoName,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoDesc() != null) {
            sql.SET("LOTTO_DESC = #{lottoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoOwner() != null) {
            sql.SET("LOTTO_OWNER = #{lottoOwner,jdbcType=CHAR}");
        }
        
        if (record.getLottoShotValue() != null) {
            sql.SET("LOTTO_SHOT_VALUE = #{lottoShotValue,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoIconUrl() != null) {
            sql.SET("LOTTO_ICON_URL = #{lottoIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoBackgroundUrl() != null) {
            sql.SET("LOTTO_BACKGROUND_URL = #{lottoBackgroundUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoSts() != null) {
            sql.SET("LOTTO_STS = #{lottoSts,jdbcType=CHAR}");
        }
        
        if (record.getLottoType() != null) {
            sql.SET("LOTTO_TYPE = #{lottoType,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoPublishDay() != null) {
            sql.SET("LOTTO_PUBLISH_DAY = #{lottoPublishDay,jdbcType=VARCHAR}");
        }
        
        if (record.getLottoPublishTime() != null) {
            sql.SET("LOTTO_PUBLISH_TIME = #{lottoPublishTime,jdbcType=TIME}");
        }
        
        if (record.getLastLottoInstId() != null) {
            sql.SET("LAST_LOTTO_INST_ID = #{lastLottoInstId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("LOTTO_ID = #{lottoId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LotLottoExample example, boolean includeExamplePhrase) {
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