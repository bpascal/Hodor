package com.codido.hodor.core.common.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

/**
 * 订单号工具类
 */
public class OrderNoGeneratorUtil {

    /**
     * 订单号统一前缀
     */
    public static String ORDER_PRE_FLAG = "11";//普通订单
    public static String CHASE_PRE_FLAG = "12";//追号订单
    public static String BONUS_PRE_FLAG = "21";//派奖订单
    public static String WITHDRAWORDER_PRE_FLAG = "31";//提现订单
    public static String TXNO_PRE_FLAG = "81";//交易流水
    public static String LOG_PRE_FLAG = "91";//日志订单
    public static String PICNAME_PRE_FLAG = "61";//图片文件名
    public static String REFUND_PRE_FLAG = "71";//退款订单


    /**
     * 生成订单号
     * @param orderNoPre
     * @return
     */
    public static String generatorOrderNo(String orderNoPre) {
        //订单号后缀取时间戳+4随机码
        String orderNo = JBDateUtil.transDate2String(new Date(),"",JBDateUtil.dateFormat_yyyyMMddHHmmssSSS) + RandomStringUtils.randomNumeric(4);
        return orderNoPre+orderNo;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String [] args) {
        System.out.println("生成了订单号:"+generatorOrderNo("12"));
    }
}
