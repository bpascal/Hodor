package com.codido.hodor.mapper;

import com.codido.hodor.model.UsrUser;
import com.codido.hodor.model.UsrUserExample.Criteria;
import com.codido.hodor.model.UsrUserExample.Criterion;
import com.codido.hodor.model.UsrUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsrUserSqlProvider {

    public String countByExample(UsrUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("t_usr_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsrUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("t_usr_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UsrUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_usr_user");
        
        if (record.getUserNickname() != null) {
            sql.VALUES("USER_NICKNAME", "#{userNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserRealname() != null) {
            sql.VALUES("USER_REALNAME", "#{userRealname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.VALUES("USER_MOBILE", "#{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            sql.VALUES("USER_EMAIL", "#{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIdcard() != null) {
            sql.VALUES("USER_IDCARD", "#{userIdcard,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSts() != null) {
            sql.VALUES("USER_STS", "#{userSts,jdbcType=CHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.VALUES("USER_SEX", "#{userSex,jdbcType=CHAR}");
        }
        
        if (record.getUserHeadimgUrl() != null) {
            sql.VALUES("USER_HEADIMG_URL", "#{userHeadimgUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCountry() != null) {
            sql.VALUES("USER_COUNTRY", "#{userCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getUserProvince() != null) {
            sql.VALUES("USER_PROVINCE", "#{userProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCity() != null) {
            sql.VALUES("USER_CITY", "#{userCity,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCurrentTokenId() != null) {
            sql.VALUES("USER_CURRENT_TOKEN_ID", "#{userCurrentTokenId,jdbcType=BIGINT}");
        }
        
        if (record.getUserWxToken() != null) {
            sql.VALUES("USER_WX_TOKEN", "#{userWxToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxOpenId() != null) {
            sql.VALUES("USER_WX_OPEN_ID", "#{userWxOpenId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxNickname() != null) {
            sql.VALUES("USER_WX_NICKNAME", "#{userWxNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxPrivilege() != null) {
            sql.VALUES("USER_WX_PRIVILEGE", "#{userWxPrivilege,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxUnionid() != null) {
            sql.VALUES("USER_WX_UNIONID", "#{userWxUnionid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserType() != null) {
            sql.VALUES("USER_TYPE", "#{userType,jdbcType=CHAR}");
        }
        
        if (record.getWxAccessToken() != null) {
            sql.VALUES("WX_ACCESS_TOKEN", "#{wxAccessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getWxSesssionKey() != null) {
            sql.VALUES("WX_SESSSION_KEY", "#{wxSesssionKey,jdbcType=VARCHAR}");
        }
        
        if (record.getWxRefreshToken() != null) {
            sql.VALUES("WX_REFRESH_TOKEN", "#{wxRefreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCreateTime() != null) {
            sql.VALUES("USER_CREATE_TIME", "#{userCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserSource() != null) {
            sql.VALUES("USER_SOURCE", "#{userSource,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsrUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER_ID");
        } else {
            sql.SELECT("USER_ID");
        }
        sql.SELECT("USER_NICKNAME");
        sql.SELECT("USER_REALNAME");
        sql.SELECT("USER_MOBILE");
        sql.SELECT("USER_EMAIL");
        sql.SELECT("USER_IDCARD");
        sql.SELECT("USER_STS");
        sql.SELECT("USER_SEX");
        sql.SELECT("USER_HEADIMG_URL");
        sql.SELECT("USER_COUNTRY");
        sql.SELECT("USER_PROVINCE");
        sql.SELECT("USER_CITY");
        sql.SELECT("USER_CURRENT_TOKEN_ID");
        sql.SELECT("USER_WX_TOKEN");
        sql.SELECT("USER_WX_OPEN_ID");
        sql.SELECT("USER_WX_NICKNAME");
        sql.SELECT("USER_WX_PRIVILEGE");
        sql.SELECT("USER_WX_UNIONID");
        sql.SELECT("USER_TYPE");
        sql.SELECT("WX_ACCESS_TOKEN");
        sql.SELECT("WX_SESSSION_KEY");
        sql.SELECT("WX_REFRESH_TOKEN");
        sql.SELECT("USER_CREATE_TIME");
        sql.SELECT("USER_SOURCE");
        sql.FROM("t_usr_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UsrUser record = (UsrUser) parameter.get("record");
        UsrUserExample example = (UsrUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("t_usr_user");
        
        if (record.getUserId() != null) {
            sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserNickname() != null) {
            sql.SET("USER_NICKNAME = #{record.userNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserRealname() != null) {
            sql.SET("USER_REALNAME = #{record.userRealname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.SET("USER_MOBILE = #{record.userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            sql.SET("USER_EMAIL = #{record.userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIdcard() != null) {
            sql.SET("USER_IDCARD = #{record.userIdcard,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSts() != null) {
            sql.SET("USER_STS = #{record.userSts,jdbcType=CHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.SET("USER_SEX = #{record.userSex,jdbcType=CHAR}");
        }
        
        if (record.getUserHeadimgUrl() != null) {
            sql.SET("USER_HEADIMG_URL = #{record.userHeadimgUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCountry() != null) {
            sql.SET("USER_COUNTRY = #{record.userCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getUserProvince() != null) {
            sql.SET("USER_PROVINCE = #{record.userProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCity() != null) {
            sql.SET("USER_CITY = #{record.userCity,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCurrentTokenId() != null) {
            sql.SET("USER_CURRENT_TOKEN_ID = #{record.userCurrentTokenId,jdbcType=BIGINT}");
        }
        
        if (record.getUserWxToken() != null) {
            sql.SET("USER_WX_TOKEN = #{record.userWxToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxOpenId() != null) {
            sql.SET("USER_WX_OPEN_ID = #{record.userWxOpenId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxNickname() != null) {
            sql.SET("USER_WX_NICKNAME = #{record.userWxNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxPrivilege() != null) {
            sql.SET("USER_WX_PRIVILEGE = #{record.userWxPrivilege,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxUnionid() != null) {
            sql.SET("USER_WX_UNIONID = #{record.userWxUnionid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("USER_TYPE = #{record.userType,jdbcType=CHAR}");
        }
        
        if (record.getWxAccessToken() != null) {
            sql.SET("WX_ACCESS_TOKEN = #{record.wxAccessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getWxSesssionKey() != null) {
            sql.SET("WX_SESSSION_KEY = #{record.wxSesssionKey,jdbcType=VARCHAR}");
        }
        
        if (record.getWxRefreshToken() != null) {
            sql.SET("WX_REFRESH_TOKEN = #{record.wxRefreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCreateTime() != null) {
            sql.SET("USER_CREATE_TIME = #{record.userCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserSource() != null) {
            sql.SET("USER_SOURCE = #{record.userSource,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_user");
        
        sql.SET("USER_ID = #{record.userId,jdbcType=BIGINT}");
        sql.SET("USER_NICKNAME = #{record.userNickname,jdbcType=VARCHAR}");
        sql.SET("USER_REALNAME = #{record.userRealname,jdbcType=VARCHAR}");
        sql.SET("USER_MOBILE = #{record.userMobile,jdbcType=VARCHAR}");
        sql.SET("USER_EMAIL = #{record.userEmail,jdbcType=VARCHAR}");
        sql.SET("USER_IDCARD = #{record.userIdcard,jdbcType=VARCHAR}");
        sql.SET("USER_STS = #{record.userSts,jdbcType=CHAR}");
        sql.SET("USER_SEX = #{record.userSex,jdbcType=CHAR}");
        sql.SET("USER_HEADIMG_URL = #{record.userHeadimgUrl,jdbcType=VARCHAR}");
        sql.SET("USER_COUNTRY = #{record.userCountry,jdbcType=VARCHAR}");
        sql.SET("USER_PROVINCE = #{record.userProvince,jdbcType=VARCHAR}");
        sql.SET("USER_CITY = #{record.userCity,jdbcType=VARCHAR}");
        sql.SET("USER_CURRENT_TOKEN_ID = #{record.userCurrentTokenId,jdbcType=BIGINT}");
        sql.SET("USER_WX_TOKEN = #{record.userWxToken,jdbcType=VARCHAR}");
        sql.SET("USER_WX_OPEN_ID = #{record.userWxOpenId,jdbcType=VARCHAR}");
        sql.SET("USER_WX_NICKNAME = #{record.userWxNickname,jdbcType=VARCHAR}");
        sql.SET("USER_WX_PRIVILEGE = #{record.userWxPrivilege,jdbcType=VARCHAR}");
        sql.SET("USER_WX_UNIONID = #{record.userWxUnionid,jdbcType=VARCHAR}");
        sql.SET("USER_TYPE = #{record.userType,jdbcType=CHAR}");
        sql.SET("WX_ACCESS_TOKEN = #{record.wxAccessToken,jdbcType=VARCHAR}");
        sql.SET("WX_SESSSION_KEY = #{record.wxSesssionKey,jdbcType=VARCHAR}");
        sql.SET("WX_REFRESH_TOKEN = #{record.wxRefreshToken,jdbcType=VARCHAR}");
        sql.SET("USER_CREATE_TIME = #{record.userCreateTime,jdbcType=TIMESTAMP}");
        sql.SET("USER_SOURCE = #{record.userSource,jdbcType=VARCHAR}");
        
        UsrUserExample example = (UsrUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsrUser record) {
        SQL sql = new SQL();
        sql.UPDATE("t_usr_user");
        
        if (record.getUserNickname() != null) {
            sql.SET("USER_NICKNAME = #{userNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserRealname() != null) {
            sql.SET("USER_REALNAME = #{userRealname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.SET("USER_MOBILE = #{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            sql.SET("USER_EMAIL = #{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserIdcard() != null) {
            sql.SET("USER_IDCARD = #{userIdcard,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSts() != null) {
            sql.SET("USER_STS = #{userSts,jdbcType=CHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.SET("USER_SEX = #{userSex,jdbcType=CHAR}");
        }
        
        if (record.getUserHeadimgUrl() != null) {
            sql.SET("USER_HEADIMG_URL = #{userHeadimgUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCountry() != null) {
            sql.SET("USER_COUNTRY = #{userCountry,jdbcType=VARCHAR}");
        }
        
        if (record.getUserProvince() != null) {
            sql.SET("USER_PROVINCE = #{userProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCity() != null) {
            sql.SET("USER_CITY = #{userCity,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCurrentTokenId() != null) {
            sql.SET("USER_CURRENT_TOKEN_ID = #{userCurrentTokenId,jdbcType=BIGINT}");
        }
        
        if (record.getUserWxToken() != null) {
            sql.SET("USER_WX_TOKEN = #{userWxToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxOpenId() != null) {
            sql.SET("USER_WX_OPEN_ID = #{userWxOpenId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxNickname() != null) {
            sql.SET("USER_WX_NICKNAME = #{userWxNickname,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxPrivilege() != null) {
            sql.SET("USER_WX_PRIVILEGE = #{userWxPrivilege,jdbcType=VARCHAR}");
        }
        
        if (record.getUserWxUnionid() != null) {
            sql.SET("USER_WX_UNIONID = #{userWxUnionid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("USER_TYPE = #{userType,jdbcType=CHAR}");
        }
        
        if (record.getWxAccessToken() != null) {
            sql.SET("WX_ACCESS_TOKEN = #{wxAccessToken,jdbcType=VARCHAR}");
        }
        
        if (record.getWxSesssionKey() != null) {
            sql.SET("WX_SESSSION_KEY = #{wxSesssionKey,jdbcType=VARCHAR}");
        }
        
        if (record.getWxRefreshToken() != null) {
            sql.SET("WX_REFRESH_TOKEN = #{wxRefreshToken,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCreateTime() != null) {
            sql.SET("USER_CREATE_TIME = #{userCreateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserSource() != null) {
            sql.SET("USER_SOURCE = #{userSource,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("USER_ID = #{userId,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsrUserExample example, boolean includeExamplePhrase) {
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