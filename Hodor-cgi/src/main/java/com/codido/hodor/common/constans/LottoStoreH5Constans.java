package com.codido.hodor.common.constans;

/**
 * H5工程静态常量
 */
public class LottoStoreH5Constans {

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
    public static String RESP_CODE_SAVEOPENID_ERROR = "0113";
    public static String RESP_MSG_SAVEOPENID_ERROR = "已经保存了用户的微信OPENID";
    public static String RESP_CODE_NOBANKCARD_ERROR = "0114";//未找到银行卡
    public static String RESP_CODE_USERREAL_ERROR = "0201";
    public static String RESP_MSG_USERREAL_ERROR = "用户实名失败";
    public static String RESP_CODE_USELOTTOL_ERROR = "0202";
    public static String RESP_MSG_USELOTTOL_ERROR = "用户彩种关注失败";
    public static String RESP_CODE_TOKEN_ERROR = "0203";
    public static String RESP_MSG_TOKEN_ERROR = "无效的token";
    public static String RESP_CODE_USERNORTREAL_ERROR = "0204";
    public static String RESP_MSG_USERNOTREAL_ERROR = "用户未实名";
    public static String RESP_CODE_USERNOSHOP_ERROR = "0205";
    public static String RESP_MSG_USERNOSHOP_ERROR = "该用户不是店主";
    public static String RESP_CODE_UPDATE_SHOP_CONTACT_ERROR = "0206";
    public static String RESP_MSG_UPDATE_SHOP_CONTACT_ERROR = "更新店铺联系失败";
    public static String RESP_CODE_SHOPLOGIN_ERROR = "0361";//店铺登录错误
    public static String RESP_CODE_UPDATE_SHOP_LOTTO_ERROR = "0267";
    public static String RESP_CODE_APPLY_SMSCODE_ERROR = "0268";
    public static String RESP_CODE_LOTTOMATCH_ERROR = "0269";
    public static String RESP_CODE_NOSHOP_ERROR = "0210";
    public static String RESP_MSG_NOSHOP_ERROR = "当前用户未绑定店铺";
    public static String RESP_MSG_UPDATE_SHOP_LOTTO_ERROR = "更新彩种失败";
    //订单相关
    public static String RESP_CODE_ORDER_REJECT_ERROR = "0861";//撤销异常
    public static String RESP_CODE_ORDER_TAKETICKET_ERROR = "0862";//取票异常
    public static String RESP_CODE_ORDER_CANCEL_ERROR = "0863";//取消异常
    public static String RESP_CODE_ORDER_ENSURE_ERROR = "0864";//确认订单
    public static String RESP_CODE_ORDER_SAVE_ERROR = "0865";//提交订单
    public static String RESP_CODE_SAVE_WITHDRAWORDER_ERROR = "0401";
    public static String RESP_MSG_SAVE_WITHDRAWORDER_ERROR = "保存提现申请失败";
    public static String RESP_CODE_PARAM_ERROR = "9000";
    public static String RESP_MSG_PARAM_ERROR = "参数异常!!";
    public static String RESP_CODE_OTHER_ERROR = "9999";
    public static String RESP_MSG_OTHER_ERROR = "服务器开了点小差，攻城狮正在跟它商量......";


    /**
     * token失效周期
     */
    public static int TOKEN_EXP_DAYS = 60;//token失效周期
}
