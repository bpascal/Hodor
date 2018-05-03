package com.codido.hodor.common.constans;

/**
 * 彩士多公共常量
 */
public class CommonConstans {

    /**
     * 用户类型
     */
    public static String USER_TYPE_PLAYER = "U";//彩民
    public static String USER_TYPE_BUSINESS = "B";//商户店主
    public static String USER_TYPE_SHOPMANAGER = "M";//商户管理人员


    /**
     * 用户标签ID
     */
    public static Long USER_TAG_ID_NORMAL = 2L;//星标组
    public static Long USER_TAG_ID_PLAYER = 100L;//彩民
    public static Long USER_TAG_ID_SHOP = 101L;//商户


    /**
     * 彩种ID固定值
     */
    public static String LOTTO_ID_SSQ = "1";//双色球
    public static String LOTTO_ID_DLT = "2";//大乐透
    public static String LOTTO_ID_3D = "3";//福彩3D
    public static String LOTTO_ID_PL3 = "4";//排列3
    public static String LOTTO_ID_PL5 = "5";//排列5
    public static String LOTTO_ID_7X = "6";//七星彩
    public static String LOTTO_ID_7L = "7";//七乐彩
    public static String LOTTO_ID_ZCSF = "8";//足彩胜负
    public static String LOTTO_ID_ZCRJ = "9";//足彩任九
    public static String LOTTO_ID_JCZQ = "10";//竞彩足球
    public static String LOTTO_ID_JCLQ = "11";//竞彩篮球

    /**
     * 彩种实例ID特殊固定值
     */
    public static Long LOTTO_INST_ID_JCZQ = 100181L;//竞彩足球期数ID
    public static Long LOTTO_INST_ID_JCLQ = 100182L;//竞彩篮球期数ID


    /**
     * 彩票类型
     */
    public static String LOTTO_TYPE_FC_NUM = "FC_NUM";//福彩数字类
    public static String LOTTO_TYPE_TC_CT = "TC_CT";//传统足彩
    public static String LOTTO_TYPE_TC_NUM = "TC_NUM";//体彩数字类
    public static String LOTTO_TYPE_TC_JC = "TC_JC";//体彩竞彩类
    public static String LOTTO_TYPE_FC_JK = "FC_JK";//福彩即开型

    /**
     * 公共状态
     */
    public static String COMMON_STS_VALID = "A";//有效
    public static String COMMON_STS_UNVALID = "N";//失效


    /**
     * 中奖状态
     */
    public static String BETTING_INST_BONUS_STS_B = "B";//已中奖
    public static String BETTING_INST_BONUS_STS_N = "N";//未中奖
    public static String BETTING_INST_BONUS_STS_I = "I";//未开奖

    /**
     * 订单状态
     */
    public static String ORDER_STS_I = "I";//发起
    public static String ORDER_STS_P = "P";//已支付
    public static String ORDER_STS_C = "C";//取消
    public static String ORDER_STS_K = "K";//撤销
    public static String ORDER_STS_N = "N";//失效
    public static String ORDER_STS_A = "A";//已确认
    public static String ORDER_STS_W = "W";//预约订单待开奖
    public static String ORDER_STS_B = "B";//已开奖
    public static String ORDER_STS_S = "S";//已兑奖

    /**
     * 订单取票状态
     */
    public static String ORDER_TICKET_STS_TAKED = "A";//已取票
    public static String ORDER_TICKET_STS_NOTAKED = "N";//未取票

    /**
     * 订单来源
     */
    public static String ORDER_SOURCE_MANUAL = "M";//M:手工下单
    public static String ORDER_SOURCE_GETHER = "G";//G:合买
    public static String ORDER_SOURCE_FELLOW = "F";//F:追号
    public static String ORDER_SOURCE_AUTOTAKE = "A";//A:自动出票预约订单

    /**
     * 体彩投注结果
     */
    public static String LOTTO_TC_CHOOSE_RESULT_RIGHT = "R";//正确
    public static String LOTTO_TC_CHOOSE_RESULT_WRONG = "W";//错误
    public static String LOTTO_TC_CHOOSE_RESULT_AVOID = "V";//暂无结果

    /**
     * 比赛结果
     */
    public static String GAME_RESULT_HOME_WIN = "W";//主队胜
    public static String GAME_RESULT_HOME_DRAW = "D";//平
    public static String GAME_RESULT_HOME_LOSE = "L";//主队负

    /**
     * 订单支付状态
     */
    public static String ORDER_PAY_STS_INIT = "I";//初始
    public static String ORDER_PAY_STS_PAIED = "A";//已缴费
    public static String ORDER_PAY_STS_UNPAIED = "N";//已失效

    /**
     * 订单中奖状态
     */
    public static String ORDER_BONUS_STS_I = "I";//未开奖
    public static String ORDER_BONUS_STS_N = "N";//未中奖
    public static String ORDER_BONUS_STS_B = "B";//已中奖未兑奖
    public static String ORDER_BONUS_STS_S = "S";//已中奖已兑奖


    /**
     * 订单下单渠道
     */
    public static String COMMON_CHANNEL_LOTTOSTORE_MP = "LOTTO_STORE_MP";//彩士多公众号
    public static String COMMON_CHANNEL_ZDJL_MP = "ZDJL_MP";//中大奖了公众号
    public static String COMMON_CHANNEL_MICRO_APP = "MICRO_APP";//极速系列小程序


    /**
     * 投注类型
     */
    public static String BETTING_TYPE_N = "N";//普通投注
    public static String BETTING_TYPE_D = "D";//胆拖投注

    /**
     * 号码状态
     */
    public static String BETTING_INST_STS_A = "A";//有效
    public static String BETTING_INST_STS_N = "N";//失效

    /**
     * 出票上传状态
     */
    public static String TICKET_UPLOAD_STS_A = "A";//已上传
    public static String TICKET_UPLOAD_STS_N = "N";//未上传

    /**
     * 微信支付支付类型参数
     */
    public static String WX_PAY_TRADE_TYPE_JSSDK = "JSAPI";//公众号支付
    public static String WX_PAY_TRADE_TYPE_H5 = "MWEB";//H5支付

    /**
     * 提现订单状态
     */
    public static String WITHDRAW_ORDER_STS_INIT = "I";//申请
    public static String WITHDRAW_ORDER_STS_FINISH = "P";//已打款
    public static String WITHDRAW_ORDER_STS_INVALID = "N";//失效

    /**
     * 提现类型
     */
    public static String WITHDRAW_ORDER_TYPE_PLAYER = "U";//用户提现
    public static String WITHDRAW_ORDER_TYPE_SHOP = "S";//商户提现


    /**
     * 短信验证码状态
     */
    public static String SMS_CODE_STS_INIT = "I";//初始化
    public static String SMS_CODE_STS_PUSHED = "P";//已下发
    public static String SMS_CODE_STS_CHECKED = "A";//验证通过
    public static String SMS_CODE_STS_ERROR = "E";//验证失败
    public static String SMS_CODE_STS_INVALID = "N";// N:失效

    /**
     * 账户的所属
     */
    public static String ACCOUNT_OWNER_TYPE_PLAYER ="P";//彩民
    public static String ACCOUNT_OWNER_TYPE_SHOP ="S";//商户,
    public static String ACCOUNT_OWNER_TYPE_BUSINESS ="B";//店主用户

    /**
     * 账户类型
     */
    public static Long ACCOUNT_TYPE_ID_BALANCE = 1L;//用户余额账户
    public static Long ACCOUNT_TYPE_ID_USEFUL = 4L;//用户可用余额
    public static Long ACCOUNT_TYPE_ID_WXPAY = 2L;//微信支付账户
    public static Long ACCOUNT_TYPE_ID_FREZON = 3L;//冻结账户

    /**
     * 交易流水状态常量
     */
    public static String ACDT_STS_INIT ="I";//初始
    public static String ACDT_STS_PROCESS ="P";//进行中
    public static String ACDT_STS_FINISH ="E";//完成
    public static String ACDT_STS_INVALID ="N";//失效

    /**
     * 交易流水类型
     */
    public static String ACDT_TYPE_CHARGE ="Z";//充值
    public static String ACDT_TYPE_WITHDRAW ="W";//提现
    public static String ACDT_TYPE_PAYORDER ="P";//投注
    public static String ACDT_TYPE_BONUSIN ="B";//用户中奖收入
    public static String ACDT_TYPE_PAYBONUS ="S";//商户派奖支出
    public static String ACDT_TYPE_REJET ="R";//撤单退款
    public static String ACDT_TYPE_PAYIN ="G";//商户收用户投注款
    public static String ACDT_TYPE_COMMISSION ="A";//商户佣金扣款
    public static String ACDT_TYPE_COMMISSIONIN ="C";//平台佣金收入

    /**
     * 交易方向
     */
    public static String ACDT_TX_WAY_CR ="CR";//贷记(支出)
    public static String ACDT_TX_WAY_DR ="DR";//借记(收入)

    /**
     * 用户openid的用户来源类型标识
     */
    public static String WX_APP_TYPE_JQBB = "WX_MP_JQBB";//机器爸爸微信公众号标识
    //public static String WX_APP_TYPE_LOTTOSTORE = "WX_LOTTOSTORE";//彩士多微信公众号标识

    /**
     * 彩士多公众号接收消息的模板ID
     */
    public static String WX_MSG_TEMPLATE_ID_ORDERIN="JKTchy0JH42sUzTfboqzo3xLgD93eh8vcD317_dsur8";//新订单通知
    public static String WX_MSG_TEMPLATE_ID_ORDERENSURE="z4mY6R8BWXw_6OVYSCvUO_7hsp9CIZcf377m3ovpnlo";//订单确认出票
    public static String WX_MSG_TEMPLATE_ID_REJECTORDER="LfS3KYsjwI56hfMfTYXgLYKBzvdj5AajZxCnY6aTVWM";//订单撤单
    public static String WX_MSG_TEMPLATE_ID_ORDERBONUS="BTmRHeFLJXSReIx7xrSpQD9x4RoKzFzzcFYpkg_dSLQ";//订单中奖
    public static String WX_MSG_TEMPLATE_ID_LOTTOBONUS="f4HKSyK5JR_YKBwKdP8qlUXqU-mtBkvhQD-v7GrI9I8";//彩种开奖
    public static String WX_MSG_TEMPLATE_ID_TAKETICKET="3npKEI5dtVpPqINCKfpSVHLGtbbYWajupAQGvp27i-g";//取票通知

    /**
     * 中大奖了公众的消息模板ID
     */
    public static String ZDJL_MSG_TEMPLATE_ID_ORDERIN="kop7MWU77UDVe9bno-2fdZrMSCf2Y8boUY7rQEIksek";//新订单通知
    public static String ZDJL_MSG_TEMPLATE_ID_ORDERENSURE="ndyjaB7od9eD7PW0MReHnOFxKM2JzUfbMrRIlA-tfHE";//订单确认出票
    public static String ZDJL_MSG_TEMPLATE_ID_REJECTORDER="AemL56eMTqNh3zPsAQ8QiyPC2wrI7m4WKQYbxVisNxQ";//订单撤单
    public static String ZDJL_MSG_TEMPLATE_ID_ORDERBONUS="vQSV5GGw_VKfzeJUejKy5r7P4pqe4z02V74_XNSwSOc";//订单中奖
    public static String ZDJL_MSG_TEMPLATE_ID_LOTTOBONUS="EMnrrUqSYfUYG5rVWcFf9Ihe95lUO2I_JabjVaoHeSQ";//彩种开奖
    public static String ZDJL_MSG_TEMPLATE_ID_TAKETICKET="QeiFLYo7d3zR4PWN9cBzN7g7ZtDO5UZ7IFEhBB-GIPs";//取票通知
    public static String ZDJL_MSG_TEMPLATE_ID_GENEDTICKET="vGCMZCzZSXSkpodP20sIl-Fmy-fCzUgYn3-a1zS0J0M";//取票码通知

    /**
     * 常用url后缀
     */
    public static String SHOP_ORDERDETAIL_URL = "/pages/merchant.html?#/order_info/";//商户订单详情
    public static String USER_ORDERDETAIL_URL = "/pages/client_order.html?#/order_info/";//用户订单详情
    public static String SHOP_INDEX_URL = "/pages/merchant.html?#/order_info/";//TODO Junjie.Lai 首页
    public static String SHOP_LOTTORESULT_URL = "/pages/client.html?#/lotteryresults";//开奖页面
    public static String FEE_NOTIFYPAY_URL = "/fee/getJSSDKCallbackData";//支付回调


    /**
     * 用户消息状态
     */
    public static String USER_MSG_STS_INIT="I";//初始状态(未阅读)
    public static String USER_MSG_STS_READED="A";//已阅读状态
    public static String USER_MSG_STS_INVALID="N";//失效

    /**
     * 用户状态
     */
    public static String USER_STS_NOREALNAME="E";//未实名
    public static String USER_STS_NOUSER="N";//失效
    public static String USER_STS_REALNAME_VALID="A";//实名已认证
    public static String USER_STS_REALNAME_INVALID="U";//实名未认证

    /**
     * 订单推送状态
     */
    public static String ORDER_PUSH_STS_INIT = "I";//初始化
    public static String ORDER_PUSH_STS_SUCCESS = "S";//推送成功


    /**
     * 彩种规则
     */
    public static int LOTTO_RULE_SSQ_REDCOUNT = 6;//双色球红球数
    public static int LOTTO_RULE_SSQ_BLUECOUNT = 1;//双色球蓝球数
    public static int LOTTO_RULE_DLT_REDCOUNT = 5;//大乐透红球数
    public static int LOTTO_RULE_DLT_BLUECOUNT = 2;//大乐透蓝球数


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
    public static String PWD_TYPE_LOGIN="L";//登录密码

    /**
     * 比赛类型(项目)
     */
    public static String MATCH_TYPE_SOCCER ="SOCCER";//足球
    public static String MATCH_TYPE_BASKETBALL="BASKETBALL";//篮球


    /**
     * 退款状态
     */
    public static String REFUND_RECORD_STATUS_SUCCESS = "SUCCESS";//退款成功
    public static String REFUND_RECORD_STATUS_FAILD = "FAIL";//退款失败
    public static String REFUND_RECORD_STATUS_PROCESSING = "PROCESSING";//退款处理中
    public static String REFUND_RECORD_STATUS_CHANGE = "CHANGE";//转入代发

    /**
     * 彩种实例状态
     */
    public static String LOTTO_INST_STS_RECOMMOND="R";//推荐

    /**
     * 比赛实例状态常量
     */
    public static  String MATCH_INFO_STS_END = "E";//比赛已结束
}
