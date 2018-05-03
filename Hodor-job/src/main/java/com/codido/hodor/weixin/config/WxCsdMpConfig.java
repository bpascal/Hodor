package com.codido.hodor.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 机器爸爸微信公众号参数配置文件
 */
@Configuration
public class WxCsdMpConfig extends WxConfig {
  @Value("${wechat.mp.token}")
  private String token;

  @Value("${wechat.mp.appId}")
  private String appid;

  @Value("${wechat.mp.secret}")
  private String appsecret;

  @Value("${wechat.mp.aesKey}")
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
