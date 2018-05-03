package com.codido.hodor.ord.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;

/**
 * 七牛云存储配置地址
 */
@Configuration
@Data
public class QiniuPicConfig {

    @Value("${qiniu.userparams.accesskey}")
    private String accesskey;

    @Value("${qiniu.userparams.secretkey}")
    private String secretkey;

    @Value("${qiniu.userparams.imagebucket}")
    private String imageBucket;

    @Value("${qiniu.userparams.filecontext}")
    private String imgFileContext;
}
