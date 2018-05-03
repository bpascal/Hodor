package com.codido.hodor.job.config;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 环境参数
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Configuration
public class EvnConfig {

    @Value("${spring.profiles.active}")
    private String evn;

    @Value("${basecontext.urlpath.requestpath}")
    private String urlRequestContext;

    @Value("${basecontext.urlpath.zdjlrequestpath}")
    private String zdjlrequestpath;

    @Value("${robotbasecontext.urlpath.transorderpath}")
    private String terminalContext;
}
