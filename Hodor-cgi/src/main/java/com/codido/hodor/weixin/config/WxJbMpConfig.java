package com.codido.hodor.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 机器爸爸微信公众号参数配置文件
 */
@Configuration
public class WxJbMpConfig extends WxConfig {
  @Value("${wechat.jiqibaba.token}")
  private String token;

  @Value("${wechat.jiqibaba.appId}")
  private String appid;

  @Value("${wechat.jiqibaba.secret}")
  private String appsecret;

  @Value("${wechat.jiqibaba.aesKey}")
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
    return WxAccountEnum.JQBB;
  }

}
