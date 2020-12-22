package com.codido.hodor.api.weixin.config;

import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 微信支付相关配置
 * <p>
 * Created by laijj on 2017/5/12.
 */
@Configuration
public class WxPayConfiguration {
	@Value("${wechat.pay.appId}")
	private String appId;

	@Value("${wechat.pay.mchId}")
	private String mchId;

	@Value("${wechat.pay.mchKey}")
	private String mchKey;

//	@Value("#{wxPayProperties.subAppId}")
//	private String subAppId;
//
//	@Value("#{wxPayProperties.subMchId}")
//	private String subMchId;
//
	@Value("${wechat.pay.keyPath}")
	private String keyPath;

	@Bean
	public WxPayConfig payConfig() {
		WxPayConfig payConfig = new WxPayConfig();
		payConfig.setAppId(this.appId);
		payConfig.setMchId(this.mchId);
		payConfig.setMchKey(this.mchKey);
		//payConfig.setSubAppId(this.subAppId);
		//payConfig.setSubMchId(this.subMchId);
		payConfig.setKeyPath(this.keyPath);

		return payConfig;
	}

	@Bean
	public WxPayService payService() {
		WxPayService payService = new WxPayServiceImpl();
		payService.setConfig(payConfig());
		return payService;
	}


}
