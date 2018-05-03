package com.codido.hodor.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 中大奖了微信公众号参数配置文件
 */
@Configuration
public class WxZdjlMpConfig extends WxConfig {

    @Value("${wechat.zdjl.token}")
    private String token;

    @Value("${wechat.zdjl.appId}")
    private String appid;

    @Value("${wechat.zdjl.secret}")
    private String appsecret;

    @Value("${wechat.zdjl.aesKey}")
    private String aesKey;

    @Override
    public String getToken() {
        return this.token;
    }

    @Override
    public String getAppid() {
        return this.appid;
    }

    @Override
    public String getAppsecret() {
        return this.appsecret;
    }

    @Override
    public String getAesKey() {
        return this.aesKey;
    }

    @Override
    public WxAccountEnum getWxAccountEnum() {
        return WxAccountEnum.CSD;
    }

}
