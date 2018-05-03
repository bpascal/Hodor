package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpShopInviteCode;
import com.codido.hodor.model.ShpShopInviteCodeExample.Criteria;
import com.codido.hodor.model.ShpShopInviteCodeExample.Criterion;
import com.codido.hodor.model.ShpShopInviteCodeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ShpShopInviteCodeSqlProvider {

    public String countByExample(ShpShopInviteCodeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_shp_shop_invite_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ShpShopInviteCodeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_shp_shop_invite_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ShpShopInviteCode record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_shp_shop_invite_code");
        
        if (record.getShopId() != null) {
            sql.VALUES("SHOP_ID", "#{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getInviteCode() != null) {
            sql.VALUES("INVITE_CODE", "#{inviteCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeSts() != null) {
            sql.VALUES("CODE_STS", "#{codeSts,jdbcType=CHAR}");
        }
        
        if (record.getCodeCreateTime() != null) {
            sql.VALUES("CODE_CREATE_TIME", "#{codeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCodeExpTime() != null) {
            sql.VALUES("CODE_EXP_TIME", "#{codeExpTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWxQrticket() != null) {
            sql.VALUES("WX_QRTICKET", "#{wxQrticket,jdbcType=VARCHAR}");
        }
        
        if (record.getWxQrcodeUrl() != null) {
            sql.VALUES("WX_QRCODE_URL", "#{wxQrcodeUrl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ShpShopInviteCodeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("INVITE_CODE_ID");
        } else {
            sql.SELECT("INVITE_CODE_ID");
        }
        sql.SELECT("SHOP_ID");
        sql.SELECT("INVITE_CODE");
        sql.SELECT("CODE_STS");
        sql.SELECT("CODE_CREATE_TIME");
        sql.SELECT("CODE_EXP_TIME");
        sql.SELECT("WX_QRTICKET");
        sql.SELECT("WX_QRCODE_URL");
        sql.FROM("t_shp_shop_invite_code");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ShpShopInviteCode record = (ShpShopInviteCode) parameter.get("record");
        ShpShopInviteCodeExample example = (ShpShopInviteCodeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_shp_shop_invite_code");
        
        if (record.getInviteCodeId() != null) {
            sql.SET("INVITE_CODE_ID = #{record.inviteCodeId,jdbcType=BIGINT}");
        }
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getInviteCode() != null) {
            sql.SET("INVITE_CODE = #{record.inviteCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeSts() != null) {
            sql.SET("CODE_STS = #{record.codeSts,jdbcType=CHAR}");
        }
        
        if (record.getCodeCreateTime() != null) {
            sql.SET("CODE_CREATE_TIME = #{record.codeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCodeExpTime() != null) {
            sql.SET("CODE_EXP_TIME = #{record.codeExpTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWxQrticket() != null) {
            sql.SET("WX_QRTICKET = #{record.wxQrticket,jdbcType=VARCHAR}");
        }
        
        if (record.getWxQrcodeUrl() != null) {
            sql.SET("WX_QRCODE_URL = #{record.wxQrcodeUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_shp_shop_invite_code");
        
        sql.SET("INVITE_CODE_ID = #{record.inviteCodeId,jdbcType=BIGINT}");
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("INVITE_CODE = #{record.inviteCode,jdbcType=VARCHAR}");
        sql.SET("CODE_STS = #{record.codeSts,jdbcType=CHAR}");
        sql.SET("CODE_CREATE_TIME = #{record.codeCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("CODE_EXP_TIME = #{record.codeExpTime,jdbcType=TIMESTAMP}");
        sql.SET("WX_QRTICKET = #{record.wxQrticket,jdbcType=VARCHAR}");
        sql.SET("WX_QRCODE_URL = #{record.wxQrcodeUrl,jdbcType=VARCHAR}");
        
        ShpShopInviteCodeExample example = (ShpShopInviteCodeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ShpShopInviteCode record) {
        SQL sql = new SQL();
        sql.UPDATE("t_shp_shop_invite_code");
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{shopId,jdbcType=BIGINT}");
        }
        
        if (record.getInviteCode() != null) {
            sql.SET("INVITE_CODE = #{inviteCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCodeSts() != null) {
            sql.SET("CODE_STS = #{codeSts,jdbcType=CHAR}");
        }
        
        if (record.getCodeCreateTime() != null) {
            sql.SET("CODE_CREATE_TIME = #{codeCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCodeExpTime() != null) {
            sql.SET("CODE_EXP_TIME = #{codeExpTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getWxQrticket() != null) {
            sql.SET("WX_QRTICKET = #{wxQrticket,jdbcType=VARCHAR}");
        }
        
        if (record.getWxQrcodeUrl() != null) {
            sql.SET("WX_QRCODE_URL = #{wxQrcodeUrl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("INVITE_CODE_ID = #{inviteCodeId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ShpShopInviteCodeExample example, boolean includeExamplePhrase) {
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