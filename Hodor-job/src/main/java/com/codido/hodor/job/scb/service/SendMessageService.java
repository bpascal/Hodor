package com.codido.hodor.job.scb.service;

import com.codido.hodor.job.job.config.EvnConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 发送微信消息的service
 */
@Slf4j
@Service
public class SendMessageService {

    /**
     * 环境信息
     */
    @Autowired
    private EvnConfig evnConfig;



}
