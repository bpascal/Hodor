package com.codido.hodor.core.common.constans;

/**
 * 公共常量
 */
public class CommonConstans {


    /**
     * 公共状态
     */
    public static String COMMON_STS_VALID = "A";//有效
    public static String COMMON_STS_UNVALID = "N";//失效
    public static String COMMON_STS_CUSTOM = "I";//自定义标志
    public static String COMMON_STS_AUTO_PAY = "R";//自动续费状态标志

    /**
     * 处理状态
     */
    public static String COMMON_MSG_HANDLE_STS_SUCCESS = "处理成功";
    public static String COMMON_MSG_HANDLE_STS_FAIL = "处理失败";

    /**
     * 短信验证码用途
     */
    public static String SMS_CODE_USE_TYPE_LOGIN = "LOGIN";//注册/登录
    public static String SMS_CODE_USE_TYPE_BAND = "BAND";//绑定手机号

    /**
     * 用户合并的动作
     */
    public static String USER_MERGE_ACTION_ACC_MERG = "ACC_MERG";//订阅数据以目标用户为准，当前用户合并到目标用户中
    public static String USER_MERGE_ACTION_ACC_CURR = "ACC_CURR";//订阅数据以当前用户为准，将目标用户合并到当前用户

    /**
     * 短信验证码状态
     */
    public static String SMS_CODE_STS_INIT = "I";//初始化
    public static String SMS_CODE_STS_PUSHED = "P";//已下发
    public static String SMS_CODE_STS_CHECKED = "A";//验证通过
    public static String SMS_CODE_STS_ERROR = "E";//验证失败
    public static String SMS_CODE_STS_INVALID = "N";// N:失效

    /**
     * 订阅状态
     */
    public static String SUBINST_STS_EXP = "E";//过期
    public static String SUBINST_STS_AUTOPAY = "R";//自动续费
    public static String SUBINST_STS_NEAREXP = "S";//即将过期
    public static String SUBINST_STS_ING = "P";//正在订阅

    /**
     * 订阅续费状态
     */
    public static String SUBINST_AUTOPAY_FLAG_AUTOPAY = "P";//自动续费
    public static String SUBINST_AUTOPAY_FLAG_NOAUTOPAY = "N";//不自动续费

    /**
     * 周期枚举值
     */
    public static String CYCLE_TYPE_ID_FOREVER = "4";//如果周期为4，代表自动续费

    /**
     * 购买形式 1-单次购买 2-自动续费 3-永久买断
     */
    public static String VIP_INST_BUY_STYLE_SINGLE = "1";//单次购买
    public static String VIP_INST_BUY_STYLE_AUTOPAY = "2";//自动续费
    public static String VIP_INST_BUY_STYLE_FOREVER = "3";//永久买断

    /**
     * 类型的parentId编码
     */
    public static int TYPE_PARENT_ID_RECM = 0;//推荐
    public static int TYPE_PARENT_ID_ALL = -1;//查全部


    /**
     * 订单下单渠道
     */
    public static String COMMON_CHANNEL_LOTTOSTORE_MP = "MICROAPP_YOUSHU";//有数鸟小程

    /**
     * 用户来源标识
     */
    public static String USER_REGIST_SOURCE_MICROAPP_YOUSHU = "MICROAPP_YOUSHU";//微信小程序来源标识：有数
    public static String USER_REGIST_SOURCE_QQMINIAPP_YOUSHU = "QQMINIAPP_YOUSHU";//QQ小程序来源标识：有数
    public static String USER_REGIST_SOURCE_MP_MALL = "MP_MALL";//微信服务号有数商城页面
    public static String USER_REGIST_SOURCE_MP_YOUSHU = "MP_YOUSHU";//微信服务号直接关注
    public static String USER_REGIST_SOURCE_APP = "APP_YOUSHU";//通过APP的来源，包含Android和iOS
    public static String USER_REGIST_SOURCE_APP_ANDROID = "APP_YOUSHU_ANDROID";//通过Android版APP来源
    public static String USER_REGIST_SOURCE_APP_IOS = "APP_YOUSHU_IOS";//通过iOS版APP来源

    /**
     * 公共参数常量
     */
    public static String PUBPARAM_KEY_ANDROID_APP_SHOW_MALL_FLAG = "ANDROID_APP_SHOW_MALL_FLAG";//Android版APP是否显示商城入口的标识
    public static String PUBPARAM_KEY_IOS_APP_SHOW_MALL_FLAG = "IOS_APP_SHOW_MALL_FLAG";//iOS版APP是否显示商城入口的标识

    /**
     * 币种常量
     */
    public static long CURRENCY_TYPE_RMB = 1L;//人民币
    public static long CURRENCY_TYPE_USD = 2L;//美元

    /**
     * 周期常量
     */
    public static long CYCLE_TYPE_DAY = 1L;//日
    public static long CYCLE_TYPE_MONTH = 2L;//月
    public static long CYCLE_TYPE_YEAR = 3L;//年
    public static long CYCLE_TYPE_FOREVER = 4L;//永久

    /**
     * 用户标签常量
     */
    public static String USER_TAG_DEFAULT = "一毛不拔";//默认标签<100
    public static String USER_TAG_MINPAY = "精打细算";//默认标签100≤全年支出<1000元：精打细算
    public static String USER_TAG_LITTLE = "有点小钱";//默认标签1000≤全年支出<5000元：有点小钱
    public static String USER_TAG_RICH = "壕无人性";//默认标签全年支出≥5000元：壕无人性
    /**
     * 用户消费行为tag
     */
    public static String USER_COSTTAG_DEFAULT = "达人";//默认标签

    /**
     * 首页商城入口name
     */
    public static String VIPINST_CONST_MALL_ENTRANCE_NAME = "富贵让我们相遇";//商城入口名称
    public static String VIPINST_CONST_MALL_ENTRANCE_DESC = "有数自营、官方直充、全网低价";//商城入口描述
    public static String VIPINST_CONST_MALL_ENTRANCE_BEGIN_COLOR = "#EBCFA5";//商城入口起始颜色
    public static String VIPINST_CONST_MALL_ENTRANCE_END_COLOR = "#A0754C";//商城入口终止颜色
    public static String VIPINST_CONST_MALL_ENTRANCE_ICON_URL = "有数自营、官方直充、全网低价";//商城入口图标URL
    public static String VIPINST_CONST_MALL_ENTRANCE_INST_ID = "0";//商城入口特定ID--0

    /**
     * 用户账户
     */
    public static long USER_ACCOUNT_TYPE_ID_BAL = 1L;//余额账户
    public static long USER_ACCOUNT_TYPE_ID_WXPAY = 2L;//微信支付账户
    public static long USER_ACCOUNT_TYPE_ID_FRZ = 3L;//冻结余额账户
    public static long USER_ACCOUNT_TYPE_ID_USRBAL = 4L;//可用账户余额

    /**
     * 公众号推送模板
     */
    public static String WX_MSG_TEMPLATE_ID_SUBINST_EXPERID = "kvPWiJHaoCHcqGi2kGSSXycdXyzNp9PfZo8SRJnlVtQ";

    /**
     * 用户openid的用户来源类型标识
     */
    public static String WX_APP_TYPE_JQBB = "WX_MP_JQBB";//机器爸爸微信公众号标识

    /**
     * 常用url后缀
     */
    public static String FEE_NOTIFYPAY_URL = "/fee/getJSSDKCallbackData";//支付回调


    /**
     * 用户消息状态
     */
    public static String USER_MSG_STS_INIT = "I";//初始状态(未阅读)
    public static String USER_MSG_STS_READED = "A";//已阅读状态
    public static String USER_MSG_STS_INVALID = "N";//失效

    /**
     * 用户关注状态
     */
    public static String USER_STS_UNSUB = "0";//未关注
    public static String USER_STS_SUBING = "1";//已关注
    public static String USER_STS_MERGED = "-1";//已失效，合并到其他用户

    /**
     * 订单推送状态
     */
    public static String ORDER_PUSH_STS_INIT = "I";//初始化
    public static String ORDER_PUSH_STS_SUCCESS = "S";//推送成功

    /**
     * 消息类型
     */
    public static String MSG_TYPE_ORDERIN = "O";//接单处理
    public static String MSG_TYPE_ORDERPROCESS = "A";//确认订单处理
    public static String MSG_TYPE_ORDERREJECT = "R";//撤销订单处理
    public static String MSG_TYPE_ORDERBONUS = "B";//中奖通知
    public static String MSG_TYPE_LOTTOBONUS = "L";//开奖通知
    public static String MSG_TYPE_ORDERTAKETICKET = "T";//订单取票处理


    /**
     * 密码类型
     */
    public static String PWD_TYPE_LOGIN = "L";//登录密码


    /**
     * 退款状态
     */
    public static String REFUND_RECORD_STATUS_SUCCESS = "SUCCESS";//退款成功
    public static String REFUND_RECORD_STATUS_FAILD = "FAIL";//退款失败
    public static String REFUND_RECORD_STATUS_PROCESSING = "PROCESSING";//退款处理中
    public static String REFUND_RECORD_STATUS_CHANGE = "CHANGE";//转入代发

    /**
     * 默认图片地址
     */
    public static String DEFAULT_LOGO_IMG_URL = "http://images.jiqibaba.com/icon/";

    /**
     * 默认的关闭了用户隐私设置的用户logo
     */
    public static String DEFAULT_OFFPRCLOGO_IMG_URL = "http://images.jiqibaba.com/newlogo.png";

    /**
     * 错误码
     */
    public static String RESP_CODE_SUCCESS = "0000";
    public static String RESP_MSG_SUCCESS = "响应成功";
    public static String RESP_CODE_NORECORD_ERROR = "0001";
    public static String RESP_MSG_NORECORD_ERROR = "未查询到记录";

}
