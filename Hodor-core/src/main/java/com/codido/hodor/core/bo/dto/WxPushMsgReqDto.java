package com.codido.hodor.core.bo.dto;

import lombok.Data;

import java.util.LinkedList;

/**
 * @ProjectName: mall
 * @ClassName: WxPushMsgReqDto
 * @Description:
 * @Author: gongtao
 * @CreateDate: 2020/2/22 16:06
 */
@Data
public class WxPushMsgReqDto {
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
