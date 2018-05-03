package com.codido.hodor.mapper;

import com.codido.hodor.model.ShpShop;
import com.codido.hodor.model.ShpShopExample.Criteria;
import com.codido.hodor.model.ShpShopExample.Criterion;
import com.codido.hodor.model.ShpShopExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ShpShopSqlProvider {

    public String countByExample(ShpShopExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_shp_shop");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ShpShopExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_shp_shop");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ShpShop record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_shp_shop");
        
        if (record.getShopName() != null) {
            sql.VALUES("SHOP_NAME", "#{shopName,jdbcType=VARCHAR}");
        }
        
        if (record.getShopDesc() != null) {
            sql.VALUES("SHOP_DESC", "#{shopDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getShopOwnerId() != null) {
            sql.VALUES("SHOP_OWNER_ID", "#{shopOwnerId,jdbcType=BIGINT}");
        }
        
        if (record.getShopIconUrl() != null) {
            sql.VALUES("SHOP_ICON_URL", "#{shopIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopMblNo() != null) {
            sql.VALUES("SHOP_MBL_NO", "#{shopMblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopWxId() != null) {
            sql.VALUES("SHOP_WX_ID", "#{shopWxId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopAlipayId() != null) {
            sql.VALUES("SHOP_ALIPAY_ID", "#{shopAlipayId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopQrcodeUrl() != null) {
            sql.VALUES("SHOP_QRCODE_URL", "#{shopQrcodeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSlogen1() != null) {
            sql.VALUES("SHOP_SLOGEN1", "#{shopSlogen1,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSlogen2() != null) {
            sql.VALUES("SHOP_SLOGEN2", "#{shopSlogen2,jdbcType=VARCHAR}");
        }
        
        if (record.getShopType() != null) {
            sql.VALUES("SHOP_TYPE", "#{shopType,jdbcType=CHAR}");
        }
        
        if (record.getShopMainLottoId() != null) {
            sql.VALUES("SHOP_MAIN_LOTTO_ID", "#{shopMainLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getShopSubLottoId() != null) {
            sql.VALUES("SHOP_SUB_LOTTO_ID", "#{shopSubLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getShopUserCount() != null) {
            sql.VALUES("SHOP_USER_COUNT", "#{shopUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalOrderCount() != null) {
            sql.VALUES("SHOP_TOTAL_ORDER_COUNT", "#{shopTotalOrderCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalOrderAmt() != null) {
            sql.VALUES("SHOP_TOTAL_ORDER_AMT", "#{shopTotalOrderAmt,jdbcType=BIGINT}");
        }
        
        if (record.getShopTotalBounsCount() != null) {
            sql.VALUES("SHOP_TOTAL_BOUNS_COUNT", "#{shopTotalBounsCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalBounsAmt() != null) {
            sql.VALUES("SHOP_TOTAL_BOUNS_AMT", "#{shopTotalBounsAmt,jdbcType=BIGINT}");
        }
        
        if (record.getShopTotalCommission() != null) {
            sql.VALUES("SHOP_TOTAL_COMMISSION", "#{shopTotalCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getShopAddress() != null) {
            sql.VALUES("SHOP_ADDRESS", "#{shopAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSts() != null) {
            sql.VALUES("SHOP_STS", "#{shopSts,jdbcType=CHAR}");
        }
        
        if (record.getShopTradSts() != null) {
            sql.VALUES("SHOP_TRAD_STS", "#{shopTradSts,jdbcType=CHAR}");
        }
        
        if (record.getShopTradBeginTime() != null) {
            sql.VALUES("SHOP_TRAD_BEGIN_TIME", "#{shopTradBeginTime,jdbcType=TIME}");
        }
        
        if (record.getShopTradEndTime() != null) {
            sql.VALUES("SHOP_TRAD_END_TIME", "#{shopTradEndTime,jdbcType=TIME}");
        }
        
        if (record.getShopTradRate() != null) {
            sql.VALUES("SHOP_TRAD_RATE", "#{shopTradRate,jdbcType=DECIMAL}");
        }
        
        if (record.getShopChannal() != null) {
            sql.VALUES("SHOP_CHANNAL", "#{shopChannal,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ShpShopExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SHOP_ID");
        } else {
            sql.SELECT("SHOP_ID");
        }
        sql.SELECT("SHOP_NAME");
        sql.SELECT("SHOP_DESC");
        sql.SELECT("SHOP_OWNER_ID");
        sql.SELECT("SHOP_ICON_URL");
        sql.SELECT("SHOP_MBL_NO");
        sql.SELECT("SHOP_WX_ID");
        sql.SELECT("SHOP_ALIPAY_ID");
        sql.SELECT("SHOP_QRCODE_URL");
        sql.SELECT("SHOP_SLOGEN1");
        sql.SELECT("SHOP_SLOGEN2");
        sql.SELECT("SHOP_TYPE");
        sql.SELECT("SHOP_MAIN_LOTTO_ID");
        sql.SELECT("SHOP_SUB_LOTTO_ID");
        sql.SELECT("SHOP_USER_COUNT");
        sql.SELECT("SHOP_TOTAL_ORDER_COUNT");
        sql.SELECT("SHOP_TOTAL_ORDER_AMT");
        sql.SELECT("SHOP_TOTAL_BOUNS_COUNT");
        sql.SELECT("SHOP_TOTAL_BOUNS_AMT");
        sql.SELECT("SHOP_TOTAL_COMMISSION");
        sql.SELECT("SHOP_ADDRESS");
        sql.SELECT("SHOP_STS");
        sql.SELECT("SHOP_TRAD_STS");
        sql.SELECT("SHOP_TRAD_BEGIN_TIME");
        sql.SELECT("SHOP_TRAD_END_TIME");
        sql.SELECT("SHOP_TRAD_RATE");
        sql.SELECT("SHOP_CHANNAL");
        sql.FROM("t_shp_shop");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ShpShop record = (ShpShop) parameter.get("record");
        ShpShopExample example = (ShpShopExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_shp_shop");
        
        if (record.getShopId() != null) {
            sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        }
        
        if (record.getShopName() != null) {
            sql.SET("SHOP_NAME = #{record.shopName,jdbcType=VARCHAR}");
        }
        
        if (record.getShopDesc() != null) {
            sql.SET("SHOP_DESC = #{record.shopDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getShopOwnerId() != null) {
            sql.SET("SHOP_OWNER_ID = #{record.shopOwnerId,jdbcType=BIGINT}");
        }
        
        if (record.getShopIconUrl() != null) {
            sql.SET("SHOP_ICON_URL = #{record.shopIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopMblNo() != null) {
            sql.SET("SHOP_MBL_NO = #{record.shopMblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopWxId() != null) {
            sql.SET("SHOP_WX_ID = #{record.shopWxId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopAlipayId() != null) {
            sql.SET("SHOP_ALIPAY_ID = #{record.shopAlipayId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopQrcodeUrl() != null) {
            sql.SET("SHOP_QRCODE_URL = #{record.shopQrcodeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSlogen1() != null) {
            sql.SET("SHOP_SLOGEN1 = #{record.shopSlogen1,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSlogen2() != null) {
            sql.SET("SHOP_SLOGEN2 = #{record.shopSlogen2,jdbcType=VARCHAR}");
        }
        
        if (record.getShopType() != null) {
            sql.SET("SHOP_TYPE = #{record.shopType,jdbcType=CHAR}");
        }
        
        if (record.getShopMainLottoId() != null) {
            sql.SET("SHOP_MAIN_LOTTO_ID = #{record.shopMainLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getShopSubLottoId() != null) {
            sql.SET("SHOP_SUB_LOTTO_ID = #{record.shopSubLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getShopUserCount() != null) {
            sql.SET("SHOP_USER_COUNT = #{record.shopUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalOrderCount() != null) {
            sql.SET("SHOP_TOTAL_ORDER_COUNT = #{record.shopTotalOrderCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalOrderAmt() != null) {
            sql.SET("SHOP_TOTAL_ORDER_AMT = #{record.shopTotalOrderAmt,jdbcType=BIGINT}");
        }
        
        if (record.getShopTotalBounsCount() != null) {
            sql.SET("SHOP_TOTAL_BOUNS_COUNT = #{record.shopTotalBounsCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalBounsAmt() != null) {
            sql.SET("SHOP_TOTAL_BOUNS_AMT = #{record.shopTotalBounsAmt,jdbcType=BIGINT}");
        }
        
        if (record.getShopTotalCommission() != null) {
            sql.SET("SHOP_TOTAL_COMMISSION = #{record.shopTotalCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getShopAddress() != null) {
            sql.SET("SHOP_ADDRESS = #{record.shopAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSts() != null) {
            sql.SET("SHOP_STS = #{record.shopSts,jdbcType=CHAR}");
        }
        
        if (record.getShopTradSts() != null) {
            sql.SET("SHOP_TRAD_STS = #{record.shopTradSts,jdbcType=CHAR}");
        }
        
        if (record.getShopTradBeginTime() != null) {
            sql.SET("SHOP_TRAD_BEGIN_TIME = #{record.shopTradBeginTime,jdbcType=TIME}");
        }
        
        if (record.getShopTradEndTime() != null) {
            sql.SET("SHOP_TRAD_END_TIME = #{record.shopTradEndTime,jdbcType=TIME}");
        }
        
        if (record.getShopTradRate() != null) {
            sql.SET("SHOP_TRAD_RATE = #{record.shopTradRate,jdbcType=DECIMAL}");
        }
        
        if (record.getShopChannal() != null) {
            sql.SET("SHOP_CHANNAL = #{record.shopChannal,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_shp_shop");
        
        sql.SET("SHOP_ID = #{record.shopId,jdbcType=BIGINT}");
        sql.SET("SHOP_NAME = #{record.shopName,jdbcType=VARCHAR}");
        sql.SET("SHOP_DESC = #{record.shopDesc,jdbcType=VARCHAR}");
        sql.SET("SHOP_OWNER_ID = #{record.shopOwnerId,jdbcType=BIGINT}");
        sql.SET("SHOP_ICON_URL = #{record.shopIconUrl,jdbcType=VARCHAR}");
        sql.SET("SHOP_MBL_NO = #{record.shopMblNo,jdbcType=VARCHAR}");
        sql.SET("SHOP_WX_ID = #{record.shopWxId,jdbcType=VARCHAR}");
        sql.SET("SHOP_ALIPAY_ID = #{record.shopAlipayId,jdbcType=VARCHAR}");
        sql.SET("SHOP_QRCODE_URL = #{record.shopQrcodeUrl,jdbcType=VARCHAR}");
        sql.SET("SHOP_SLOGEN1 = #{record.shopSlogen1,jdbcType=VARCHAR}");
        sql.SET("SHOP_SLOGEN2 = #{record.shopSlogen2,jdbcType=VARCHAR}");
        sql.SET("SHOP_TYPE = #{record.shopType,jdbcType=CHAR}");
        sql.SET("SHOP_MAIN_LOTTO_ID = #{record.shopMainLottoId,jdbcType=BIGINT}");
        sql.SET("SHOP_SUB_LOTTO_ID = #{record.shopSubLottoId,jdbcType=BIGINT}");
        sql.SET("SHOP_USER_COUNT = #{record.shopUserCount,jdbcType=INTEGER}");
        sql.SET("SHOP_TOTAL_ORDER_COUNT = #{record.shopTotalOrderCount,jdbcType=INTEGER}");
        sql.SET("SHOP_TOTAL_ORDER_AMT = #{record.shopTotalOrderAmt,jdbcType=BIGINT}");
        sql.SET("SHOP_TOTAL_BOUNS_COUNT = #{record.shopTotalBounsCount,jdbcType=INTEGER}");
        sql.SET("SHOP_TOTAL_BOUNS_AMT = #{record.shopTotalBounsAmt,jdbcType=BIGINT}");
        sql.SET("SHOP_TOTAL_COMMISSION = #{record.shopTotalCommission,jdbcType=DECIMAL}");
        sql.SET("SHOP_ADDRESS = #{record.shopAddress,jdbcType=VARCHAR}");
        sql.SET("SHOP_STS = #{record.shopSts,jdbcType=CHAR}");
        sql.SET("SHOP_TRAD_STS = #{record.shopTradSts,jdbcType=CHAR}");
        sql.SET("SHOP_TRAD_BEGIN_TIME = #{record.shopTradBeginTime,jdbcType=TIME}");
        sql.SET("SHOP_TRAD_END_TIME = #{record.shopTradEndTime,jdbcType=TIME}");
        sql.SET("SHOP_TRAD_RATE = #{record.shopTradRate,jdbcType=DECIMAL}");
        sql.SET("SHOP_CHANNAL = #{record.shopChannal,jdbcType=VARCHAR}");
        
        ShpShopExample example = (ShpShopExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ShpShop record) {
        SQL sql = new SQL();
        sql.UPDATE("t_shp_shop");
        
        if (record.getShopName() != null) {
            sql.SET("SHOP_NAME = #{shopName,jdbcType=VARCHAR}");
        }
        
        if (record.getShopDesc() != null) {
            sql.SET("SHOP_DESC = #{shopDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getShopOwnerId() != null) {
            sql.SET("SHOP_OWNER_ID = #{shopOwnerId,jdbcType=BIGINT}");
        }
        
        if (record.getShopIconUrl() != null) {
            sql.SET("SHOP_ICON_URL = #{shopIconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopMblNo() != null) {
            sql.SET("SHOP_MBL_NO = #{shopMblNo,jdbcType=VARCHAR}");
        }
        
        if (record.getShopWxId() != null) {
            sql.SET("SHOP_WX_ID = #{shopWxId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopAlipayId() != null) {
            sql.SET("SHOP_ALIPAY_ID = #{shopAlipayId,jdbcType=VARCHAR}");
        }
        
        if (record.getShopQrcodeUrl() != null) {
            sql.SET("SHOP_QRCODE_URL = #{shopQrcodeUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSlogen1() != null) {
            sql.SET("SHOP_SLOGEN1 = #{shopSlogen1,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSlogen2() != null) {
            sql.SET("SHOP_SLOGEN2 = #{shopSlogen2,jdbcType=VARCHAR}");
        }
        
        if (record.getShopType() != null) {
            sql.SET("SHOP_TYPE = #{shopType,jdbcType=CHAR}");
        }
        
        if (record.getShopMainLottoId() != null) {
            sql.SET("SHOP_MAIN_LOTTO_ID = #{shopMainLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getShopSubLottoId() != null) {
            sql.SET("SHOP_SUB_LOTTO_ID = #{shopSubLottoId,jdbcType=BIGINT}");
        }
        
        if (record.getShopUserCount() != null) {
            sql.SET("SHOP_USER_COUNT = #{shopUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalOrderCount() != null) {
            sql.SET("SHOP_TOTAL_ORDER_COUNT = #{shopTotalOrderCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalOrderAmt() != null) {
            sql.SET("SHOP_TOTAL_ORDER_AMT = #{shopTotalOrderAmt,jdbcType=BIGINT}");
        }
        
        if (record.getShopTotalBounsCount() != null) {
            sql.SET("SHOP_TOTAL_BOUNS_COUNT = #{shopTotalBounsCount,jdbcType=INTEGER}");
        }
        
        if (record.getShopTotalBounsAmt() != null) {
            sql.SET("SHOP_TOTAL_BOUNS_AMT = #{shopTotalBounsAmt,jdbcType=BIGINT}");
        }
        
        if (record.getShopTotalCommission() != null) {
            sql.SET("SHOP_TOTAL_COMMISSION = #{shopTotalCommission,jdbcType=DECIMAL}");
        }
        
        if (record.getShopAddress() != null) {
            sql.SET("SHOP_ADDRESS = #{shopAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getShopSts() != null) {
            sql.SET("SHOP_STS = #{shopSts,jdbcType=CHAR}");
        }
        
        if (record.getShopTradSts() != null) {
            sql.SET("SHOP_TRAD_STS = #{shopTradSts,jdbcType=CHAR}");
        }
        
        if (record.getShopTradBeginTime() != null) {
            sql.SET("SHOP_TRAD_BEGIN_TIME = #{shopTradBeginTime,jdbcType=TIME}");
        }
        
        if (record.getShopTradEndTime() != null) {
            sql.SET("SHOP_TRAD_END_TIME = #{shopTradEndTime,jdbcType=TIME}");
        }
        
        if (record.getShopTradRate() != null) {
            sql.SET("SHOP_TRAD_RATE = #{shopTradRate,jdbcType=DECIMAL}");
        }
        
        if (record.getShopChannal() != null) {
            sql.SET("SHOP_CHANNAL = #{shopChannal,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("SHOP_ID = #{shopId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ShpShopExample example, boolean includeExamplePhrase) {
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