package com.codido.hodor.job.bean.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * @Author: BigStrong
 * @Date: 2020/3/1 下午8:02
 * 微信推送请求对象
 */
@Data
public class WxPushReq implements Serializable {
    /**
     * 模版编号
     */
    private String tmId;
    /**
     * 用户OPEN_ID
     */
    private String openId;
    /**
     * 跳转H5链接
     */
    private String url;
    /**
     * 必须按顺序存储，依次为first,keyword1...keywordn,remark
     */
    private LinkedList<String> parmList;
    /**
     * 小程序APPID
     */
    private String appid;
    /**
     * 小程序路径
     */
    private String pagepath;
}

