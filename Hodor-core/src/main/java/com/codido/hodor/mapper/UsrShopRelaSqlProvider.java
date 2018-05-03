package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrShopRela;
import com.codido.hodor.model.UsrShopRelaExample.Criteria;
import com.codido.hodor.model.UsrShopRelaExample.Criterion;
import com.codido.hodor.model.UsrShopRelaExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrShopRelaSqlProvider {

    public String countByExample(UsrShopRelaExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_shop_rela");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrShopRelaExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_shop_rela");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrShopRela record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_shop_rela");
        
        if (record.getUserId() != null) {
            sql.VALUES("USER_ID", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.VALUES("SHOP_ID", "#{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopType() != null) {
            sql.VALUES("SHOP_TYPE", "#{shopType,jdbcType=CHAR}");
        }
        
        if (record.getUsrShopRelaSts() != null) {
            sql.VALUES("USR_SHOP_RELA_STS", "#{usrShopRelaSts,jdbcType=CHAR}");
        }
        
        if (record.getUsrShopRelaSort() != null) {
            sql.VALUES("USR_SHOP_RELA_SORT", "#{usrShopRelaSort,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrShopRelaExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USR_SHOP_RELA_ID");
        } else {
            sql.SELECT("USR_SHOP_RELA_ID");
        }
        sql.SELECT("USER_ID");
        sql.SELECT("SHOP_ID");
        sql.SELECT("SHOP_TYPE");
        sql.SELECT("USR_SHOP_RELA_STS");
        sql.SELECT("USR_SHOP_RELA_SORT");
        sql.FROM("t_usr_shop_rela");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrShopRela record = (UsrShopRela) parameter.get("record");
        UsrShopRelaExample example = (UsrShopRelaExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_shop_rela");
        
        if (record.getUsrShopRelaId() != null) {
            sql.SET("USR_SHOP_RELA_ID = #{record.usrShopRelaId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopType() != null) {
            sql.SET("SHOP_TYPE = #{record.shopType,jdbcType=CHAR}");
        }
        
        if (record.getUsrShopRelaSts() != null) {
            sql.SET("USR_SHOP_RELA_STS = #{record.usrShopRelaSts,jdbcType=CHAR}");
        }
        
        if (record.getUsrShopRelaSort() != null) {
            sql.SET("USR_SHOP_RELA_SORT = #{record.usrShopRelaSort,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_shop_rela");
        
        sql.SET("USR_SHOP_RELA_ID = #{record.usrShopRelaId,jdbcType=BIGINT}");
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("SHOP_TYPE = #{record.shopType,jdbcType=CHAR}");
        sql.SET("USR_SHOP_RELA_STS = #{record.usrShopRelaSts,jdbcType=CHAR}");
        sql.SET("USR_SHOP_RELA_SORT = #{record.usrShopRelaSort,jdbcType=INTEGER}");
        
        UsrShopRelaExample example = (UsrShopRelaExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrShopRela record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_shop_rela");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopType() != null) {
            sql.SET("SHOP_TYPE = #{shopType,jdbcType=CHAR}");
        }
        
        if (record.getUsrShopRelaSts() != null) {
            sql.SET("USR_SHOP_RELA_STS = #{usrShopRelaSts,jdbcType=CHAR}");
        }
        
        if (record.getUsrShopRelaSort() != null) {
            sql.SET("USR_SHOP_RELA_SORT = #{usrShopRelaSort,jdbcType=INTEGER}");
        }
        
        sql.WHERE("USR_SHOP_RELA_ID = #{usrShopRelaId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrShopRelaExample example, boolean includeExamplePhrase) {
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