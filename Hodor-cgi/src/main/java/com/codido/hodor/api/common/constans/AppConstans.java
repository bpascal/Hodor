package com.codido.hodor.api.common.constans;

/**
 * APP工程静态常量
 */
public class AppConstans {

    /**
     * 用户来源标识
     */
    //public static String USER_REGIST_SOURCE_LOTTOSTORE = "WX_LOTTOSTORE";//自有渠道来源标识-->LOTTO_STORE_MP


    /**
     * 错误码
     */
    public static String RESP_CODE_SUCCESS = "0000";
    public static String RESP_MSG_SUCCESS = "响应成功";
    public static String RESP_CODE_WXLOGIN_ERROR = "0101";
    public static String RESP_MSG_WXLOGIN_ERROR = "获取微信参数异常";
    public static String RESP_CODE_WXJSTICKET_ERROR = "0102";
    public static String RESP_MSG_WXJSTICKET_ERROR = "获取微信JSSDK参数异常";
    public static String RESP_CODE_PAYORDER_ERROR = "0112";
    public static String RESP_MSG_PAYORDER_ERROR = "调用微信获取支付参数异常";
    //分类等配置信息相关
    public static String RESP_CODE_NOSERVICETYPES_ERROR = "0201";
    public static String RESP_MSG_NOSERVICETYPES_ERROR = "无分类数据";
    public static String RESP_CODE_DUAL_SERVICE_ERROR = "0204";//重复的服务
    public static String RESP_MSG_DUAL_SERVICE_ERROR = "重复的服务";//重复的服务
    public static String RESP_CODE_NOSHOP_ERROR = "0210";
    public static String RESP_MSG_NOSHOP_ERROR = "当前用户未绑定店铺";
    //登录用户相关
    public static String RESP_CODE_TOKEN_ERROR = "0203";
    public static String RESP_MSG_TOKEN_ERROR = "无效的token";
    public static String RESP_CODE_USERLOGIN_ERROR = "0301";
    public static String RESP_MSG_USERLOGIN_ERROR = "用户登录失败";
    public static String RESP_CODE_USERVIPINST_ERROR = "0302";
    public static String RESP_MSG_USERVIPINST_ERROR = "获取用户已订阅信息列表出错";
    public static String RESP_CODE_OTHERUSERINFO_ERROR = "0303";
    public static String RESP_MSG_OTHERUSERINFO_ERROR = "获取其他用户信息失败";
    public static String RESP_CODE_USERCOSTINFO_ERROR = "0304";
    public static String RESP_MSG_USERCOSTINFO_ERROR = "获取用户消费信息失败";
    public static String RESP_PRIVAVCY_UPDATE_ERROR = "0305";
    public static String RESP_MSG_PRIVAVCY_UPDATE_ERROR = "通知状态或通知时间字段异常，只能输入0-7天";
    public static String RESP_CODE_APPLYSMS_ERROR = "0306";
    public static String RESP_MSG_APPLYSMS_ERROR = "获取短信验证码失败";
    public static String RESP_CODE_BINDLING_WXBINDED_ERROR = "0307";
    public static String RESP_MSG_BINDLING_WXBINDED_ERROR = "微信账号已绑定手机号，不可进行绑定";
    public static String RESP_CODE_BINDLING_WXINUSE_ERROR = "0308";
    public static String RESP_MSG_BINDLING_WXINUSE_ERROR = "微信账号已使用，请选择如何进行合并";
    public static String RESP_CODE_BINDLING_MBLBINDED_ERROR = "0309";
    public static String RESP_MSG_BINDLING_MBLBINDED_ERROR = "手机号已绑定微信号，不可进行绑定";
    public static String RESP_CODE_BINDLING_MBLINUSE_ERROR = "0310";
    public static String RESP_MSG_BINDLING_MBLINUSE_ERROR = "手机号已使用，请选择如何进行合并";
    public static String RESP_CODE_BINDLING_DIST_WX_EMPTY_ERROR = "0311";
    public static String RESP_MSG_BINDLING_DIST_WX_EMPTY_ERROR = "用户微信信息为空，请核实后重新选择";
    public static String RESP_CODE_BINDLING_DIST_MBLNO_EMPTY_ERROR = "0312";
    public static String RESP_MSG_BINDLING_DIST_MBLNO_EMPTY_ERROR = "用户微信信息为空，请核实后重新选择";
    public static String RESP_CODE_MBLNO_PWD_ERROR = "0313";
    public static String RESP_MSG_MBLNO_PWD_ERROR = "手机号不存在或密码错误";

    //订单相关
    public static String RESP_CODE_PARAM_ERROR = "9000";
    public static String RESP_MSG_PARAM_ERROR = "参数异常!!";
    public static String RESP_CODE_OTHER_ERROR = "9999";
    public static String RESP_MSG_OTHER_ERROR = "服务器开了点小差，攻城狮正在跟它商量......";
    public static String RESP_CODE_UNKNOW_ERROR = "9998";
    public static String RESP_MSG_UNKNOW_ERROR = "未知数据错误";


    /**
     * token失效周期
     */
    public static int TOKEN_EXP_DAYS = 60;//token失效周期

    /**
     * 定义常量，万能验证码
     */
    public static String CONST_SMS_CODE ="696988";
    public static String CONST_SMS_MBLNO ="15308408401";

}
