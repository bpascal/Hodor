package com.codido.hodor.api.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * APP参数配置文件
 */
@Configuration
public class WxAppConfig extends WxConfig {

    @Value("${wechat.app.appId}")
    private String appid;

    @Value("${wechat.app.secret}")
    private String appsecret;

    @Value("${wechat.app.token}")
    private String token;

    @Value("${wechat.app.aesKey}")
    private String aesKey;

    @Override
    public String getAppid() {
        return this.appid;
    }

    @Override
    public String getAppsecret() {
        return this.appsecret;
    }

    @Override
    public String getToken() {
        return this.token;
    }

    @Override
    public String getAesKey() {
        return this.aesKey;
    }

    @Override
    public WxAccountEnum getWxAccountEnum() {
        return WxAccountEnum.APP;
    }

}
