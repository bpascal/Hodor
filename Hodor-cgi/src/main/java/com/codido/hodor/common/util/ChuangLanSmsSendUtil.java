package com.codido.hodor.common.util;

import com.alibaba.fastjson.JSON;
import com.codido.hodor.common.util.request.SmsSendRequest;
import com.codido.hodor.common.util.response.SmsSendResponse;

/**
 * 短信验证码
 *
 * @author tianyh
 * @Description:普通短信发送
 */
public class ChuangLanSmsSendUtil {

    private static final String charset = "utf-8";
    // 用户平台API账号(非登录账号,示例:N1234567)
    private static String account = "N7267512";
    // 用户平台API密码(非登录密码)
    private static String pswd = "Clnjce2017";

    /**
     * 发送短信验证码方法
     *
     * @param mblNo
     * @param content
     * @return
     */
    public static SmsSendResponse sendSmsCode(String mblNo, String content) {
        //请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
        String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
        // 短信内容
        //String msg = "【253云通讯】你好,你的验证码是123456";
        String msg = content;
        //手机号码
        String phone = mblNo;
        //状态报告
        String report = "true";

        SmsSendRequest smsSingleRequest = new SmsSendRequest(account, pswd, msg, phone, report);

        String requestJson = JSON.toJSONString(smsSingleRequest);

        System.out.println("before request string is: " + requestJson);

        String response = ChuangLanSmsUtil.sendSmsByPost(smsSingleRequestServerUrl, requestJson);

        System.out.println("response after request result is :" + response);

        SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);

        System.out.println("response  toString is :" + smsSingleResponse);

        return smsSingleResponse;
    }


}