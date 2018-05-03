package com.codido.hodor.model;

import java.util.Date;

public class UsrUser {
    private Long userId;

    private String userNickname;

    private String userRealname;

    private String userMobile;

    private String userEmail;

    private String userIdcard;

    private String userSts;

    private String userSex;

    private String userHeadimgUrl;

    private String userCountry;

    private String userProvince;

    private String userCity;

    private Long userCurrentTokenId;

    private String userWxToken;

    private String userWxOpenId;

    private String userWxNickname;

    private String userWxPrivilege;

    private String userWxUnionid;

    private String userType;

    private String wxAccessToken;

    private String wxSesssionKey;

    private String wxRefreshToken;

    private Date userCreateTime;

    private String userSource;

    public UsrUser(Long userId, String userNickname, String userRealname, String userMobile, String userEmail, String userIdcard, String userSts, String userSex, String userHeadimgUrl, String userCountry, String userProvince, String userCity, Long userCurrentTokenId, String userWxToken, String userWxOpenId, String userWxNickname, String userWxPrivilege, String userWxUnionid, String userType, String wxAccessToken, String wxSesssionKey, String wxRefreshToken, Date userCreateTime, String userSource) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userRealname = userRealname;
        this.userMobile = userMobile;
        this.userEmail = userEmail;
        this.userIdcard = userIdcard;
        this.userSts = userSts;
        this.userSex = userSex;
        this.userHeadimgUrl = userHeadimgUrl;
        this.userCountry = userCountry;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userCurrentTokenId = userCurrentTokenId;
        this.userWxToken = userWxToken;
        this.userWxOpenId = userWxOpenId;
        this.userWxNickname = userWxNickname;
        this.userWxPrivilege = userWxPrivilege;
        this.userWxUnionid = userWxUnionid;
        this.userType = userType;
        this.wxAccessToken = wxAccessToken;
        this.wxSesssionKey = wxSesssionKey;
        this.wxRefreshToken = wxRefreshToken;
        this.userCreateTime = userCreateTime;
        this.userSource = userSource;
    }

    public UsrUser() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard == null ? null : userIdcard.trim();
    }

    public String getUserSts() {
        return userSts;
    }

    public void setUserSts(String userSts) {
        this.userSts = userSts == null ? null : userSts.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserHeadimgUrl() {
        return userHeadimgUrl;
    }

    public void setUserHeadimgUrl(String userHeadimgUrl) {
        this.userHeadimgUrl = userHeadimgUrl == null ? null : userHeadimgUrl.trim();
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry == null ? null : userCountry.trim();
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public Long getUserCurrentTokenId() {
        return userCurrentTokenId;
    }

    public void setUserCurrentTokenId(Long userCurrentTokenId) {
        this.userCurrentTokenId = userCurrentTokenId;
    }

    public String getUserWxToken() {
        return userWxToken;
    }

    public void setUserWxToken(String userWxToken) {
        this.userWxToken = userWxToken == null ? null : userWxToken.trim();
    }

    public String getUserWxOpenId() {
        return userWxOpenId;
    }

    public void setUserWxOpenId(String userWxOpenId) {
        this.userWxOpenId = userWxOpenId == null ? null : userWxOpenId.trim();
    }

    public String getUserWxNickname() {
        return userWxNickname;
    }

    public void setUserWxNickname(String userWxNickname) {
        this.userWxNickname = userWxNickname == null ? null : userWxNickname.trim();
    }

    public String getUserWxPrivilege() {
        return userWxPrivilege;
    }

    public void setUserWxPrivilege(String userWxPrivilege) {
        this.userWxPrivilege = userWxPrivilege == null ? null : userWxPrivilege.trim();
    }

    public String getUserWxUnionid() {
        return userWxUnionid;
    }

    public void setUserWxUnionid(String userWxUnionid) {
        this.userWxUnionid = userWxUnionid == null ? null : userWxUnionid.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getWxAccessToken() {
        return wxAccessToken;
    }

    public void setWxAccessToken(String wxAccessToken) {
        this.wxAccessToken = wxAccessToken == null ? null : wxAccessToken.trim();
    }

    public String getWxSesssionKey() {
        return wxSesssionKey;
    }

    public void setWxSesssionKey(String wxSesssionKey) {
        this.wxSesssionKey = wxSesssionKey == null ? null : wxSesssionKey.trim();
    }

    public String getWxRefreshToken() {
        return wxRefreshToken;
    }

    public void setWxRefreshToken(String wxRefreshToken) {
        this.wxRefreshToken = wxRefreshToken == null ? null : wxRefreshToken.trim();
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource == null ? null : userSource.trim();
    }
}