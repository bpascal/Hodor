package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpLottoRela;
import com.codido.hodor.model.ShpLottoRelaExample.Criteria;
import com.codido.hodor.model.ShpLottoRelaExample.Criterion;
import com.codido.hodor.model.ShpLottoRelaExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ShpLottoRelaSqlProvider {

    public String countByExample(ShpLottoRelaExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_shp_lotto_rela");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ShpLottoRelaExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_shp_lotto_rela");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ShpLottoRela record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_shp_lotto_rela");
        
        if (record.getShopId() != null) {
            sql.VALUES("SHOP_ID", "#{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.VALUES("LOTTO_ID", "#{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoTradSts() != null) {
            sql.VALUES("LOTTO_TRAD_STS", "#{lottoTradSts,jdbcType=CHAR}");
        }
        
        if (record.getLottoSort() != null) {
            sql.VALUES("LOTTO_SORT", "#{lottoSort,jdbcType=INTEGER}");
        }
        
        if (record.getShopLottoOrderCount() != null) {
            sql.VALUES("SHOP_LOTTO_ORDER_COUNT", "#{shopLottoOrderCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopLottoOrderAmt() != null) {
            sql.VALUES("SHOP_LOTTO_ORDER_AMT", "#{shopLottoOrderAmt,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ShpLottoRelaExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SHOP_LOTTO_RELA_ID");
        } else {
            sql.SELECT("SHOP_LOTTO_RELA_ID");
        }
        sql.SELECT("SHOP_ID");
        sql.SELECT("LOTTO_ID");
        sql.SELECT("LOTTO_TRAD_STS");
        sql.SELECT("LOTTO_SORT");
        sql.SELECT("SHOP_LOTTO_ORDER_COUNT");
        sql.SELECT("SHOP_LOTTO_ORDER_AMT");
        sql.FROM("t_shp_lotto_rela");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ShpLottoRela record = (ShpLottoRela) parameter.get("record");
        ShpLottoRelaExample example = (ShpLottoRelaExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_shp_lotto_rela");
        
        if (record.getShopLottoRelaId() != null) {
            sql.SET("SHOP_LOTTO_RELA_ID = #{record.shopLottoRelaId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoTradSts() != null) {
            sql.SET("LOTTO_TRAD_STS = #{record.lottoTradSts,jdbcType=CHAR}");
        }
        
        if (record.getLottoSort() != null) {
            sql.SET("LOTTO_SORT = #{record.lottoSort,jdbcType=INTEGER}");
        }
        
        if (record.getShopLottoOrderCount() != null) {
            sql.SET("SHOP_LOTTO_ORDER_COUNT = #{record.shopLottoOrderCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopLottoOrderAmt() != null) {
            sql.SET("SHOP_LOTTO_ORDER_AMT = #{record.shopLottoOrderAmt,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_shp_lotto_rela");
        
        sql.SET("SHOP_LOTTO_RELA_ID = #{record.shopLottoRelaId,jdbcType=BIGINT}");
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("LOTTO_ID = #{record.lottoId,jdbcType=BIGINT}");
        sql.SET("LOTTO_TRAD_STS = #{record.lottoTradSts,jdbcType=CHAR}");
        sql.SET("LOTTO_SORT = #{record.lottoSort,jdbcType=INTEGER}");
        sql.SET("SHOP_LOTTO_ORDER_COUNT = #{record.shopLottoOrderCount,jdbcType=INTEGER}");
        sql.SET("SHOP_LOTTO_ORDER_AMT = #{record.shopLottoOrderAmt,jdbcType=BIGINT}");
        
        ShpLottoRelaExample example = (ShpLottoRelaExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ShpLottoRela record) {
        SQL sql = new SQL();
        sql.UPDATE("t_shp_lotto_rela");
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoId() != null) {
            sql.SET("LOTTO_ID = #{lottoId,jdbcType=BIGINT}");
        }
        
        if (record.getLottoTradSts() != null) {
            sql.SET("LOTTO_TRAD_STS = #{lottoTradSts,jdbcType=CHAR}");
        }
        
        if (record.getLottoSort() != null) {
            sql.SET("LOTTO_SORT = #{lottoSort,jdbcType=INTEGER}");
        }
        
        if (record.getShopLottoOrderCount() != null) {
            sql.SET("SHOP_LOTTO_ORDER_COUNT = #{shopLottoOrderCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopLottoOrderAmt() != null) {
            sql.SET("SHOP_LOTTO_ORDER_AMT = #{shopLottoOrderAmt,jdbcType=BIGINT}");
        }
        
        sql.WHERE("SHOP_LOTTO_RELA_ID = #{shopLottoRelaId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ShpLottoRelaExample example, boolean includeExamplePhrase) {
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