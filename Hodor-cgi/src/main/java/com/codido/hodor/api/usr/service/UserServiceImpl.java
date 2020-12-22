package com.codido.hodor.api.usr.service;

import com.alibaba.fastjson.JSON;
import com.codido.hodor.api.weixin.config.WxAppConfig;
import com.codido.hodor.core.common.constans.CommonConstans;
import com.codido.hodor.core.common.dto.MessageXSendRetDto;
import com.codido.hodor.core.common.util.JBDateUtil;
import com.codido.hodor.core.common.util.JBUtil;
import com.codido.hodor.core.common.util.MD5Util;
import com.codido.hodor.core.common.util.MessageXsendUtil;
import com.codido.hodor.core.mapper.*;
import com.codido.hodor.core.model.*;
import com.codido.hodor.core.util.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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
