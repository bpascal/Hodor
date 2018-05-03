package com.codido.hodor.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 证通微信公众号参数配置文件
 */
@Configuration
public class WxPlanetMpConfig extends WxConfig {
    
    @Value("${wechat.planet.token}")
    private String token;

    @Value("${wechat.planet.appId}")
    private String appid;

    @Value("${wechat.planet.secret}")
    private String appsecret;

    @Value("${wechat.planet.aesKey}")
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
        return WxAccountEnum.ZDJL;
    }

}
