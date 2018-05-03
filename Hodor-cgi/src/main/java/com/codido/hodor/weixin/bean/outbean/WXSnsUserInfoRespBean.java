package com.codido.hodor.weixin.bean.outbean;

import java.io.Serializable;
import java.util.List;

/**
 * 微信接口返回的用户信息bean
 * Created by bpascal on 2017/4/28.
 */
public class WXSnsUserInfoRespBean implements Serializable {

    /**
     * 用户的标识
     */
    private String openid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别（1是男性，2是女性，0是未知）
     */
    private String sex;

    /**
     * 用户所在国家
     */
    private String country;

    /**
     * 用户所在省份
     */
    private String province;

    /**
     * 用户所在城市
     */
    private String city;

    /**
     * 用户头像
     */
    private String headimgurl;

    /**
     * 用户UNIONID信息
     */
    private String unionid;

    /**
     * 用户特权信息
     */
    private List<String> privilege;

    /**
     * 错误code
     */
    private String errcode;

    /**
     * 错误 msg
     */
    private String errmsg;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public List<String> getPrivilege() {
        return privilege;
    }

    public void setPrivilege(List<String> privilege) {
        this.privilege = privilege;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }


    @Override
    public String toString() {
        return "WXSnsUserInfoRespBean{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", unionid='" + unionid + '\'' +
                ", privilege=" + privilege +
                ", errcode='" + errcode + '\'' +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

}
