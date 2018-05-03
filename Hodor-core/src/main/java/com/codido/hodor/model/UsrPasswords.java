package com.codido.hodor.model;

public class UsrPasswords {
    private Long usrPwdId;

    private Long userId;

    private String userMblNo;

    private String userLoginName;

    private String userPasswords;

    private String pwdType;

    public UsrPasswords(Long usrPwdId, Long userId, String userMblNo, String userLoginName, String userPasswords, String pwdType) {
        this.usrPwdId = usrPwdId;
        this.userId = userId;
        this.userMblNo = userMblNo;
        this.userLoginName = userLoginName;
        this.userPasswords = userPasswords;
        this.pwdType = pwdType;
    }

    public UsrPasswords() {
        super();
    }

    public Long getUsrPwdId() {
        return usrPwdId;
    }

    public void setUsrPwdId(Long usrPwdId) {
        this.usrPwdId = usrPwdId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserMblNo() {
        return userMblNo;
    }

    public void setUserMblNo(String userMblNo) {
        this.userMblNo = userMblNo == null ? null : userMblNo.trim();
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserPasswords() {
        return userPasswords;
    }

    public void setUserPasswords(String userPasswords) {
        this.userPasswords = userPasswords == null ? null : userPasswords.trim();
    }

    public String getPwdType() {
        return pwdType;
    }

    public void setPwdType(String pwdType) {
        this.pwdType = pwdType == null ? null : pwdType.trim();
    }
}