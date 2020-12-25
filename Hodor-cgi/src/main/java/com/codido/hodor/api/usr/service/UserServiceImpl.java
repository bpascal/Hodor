package com.codido.hodor.api.usr.service;

import com.codido.hodor.api.weixin.config.WxAppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户相关service
 */
@Slf4j
@Service
public class UserServiceImpl {

    /**
     * 微信配置信息
     */
    @Autowired
    private WxAppConfig wxAppConfig;
}
