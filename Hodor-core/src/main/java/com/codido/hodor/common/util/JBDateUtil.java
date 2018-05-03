package com.codido.hodor.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 日期相关Util
 * Created by bpascal on 2017/4/4.
 */
public class JBDateUtil {

    /**
     * 可能用到的日期格式类型
     */
    public static String dateFormat_yyyy_MM_dd = "yyyy-MM-dd";
    public static String timeFormat_HH_mm_ss = "HH:mm:ss";
    public static String dateFormat_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    public static String dateFormat_yyyyMMddHHmmssSSS="yyyyMMddHHmmssSSS";
    public static String dateFormat_MMddHHmm="MM月dd日 HH:mm";
    /**
     * 时间常量
     */
    private static final long ONE_MINUTE = 60000L;
    private static final long ONE_HOUR = 3600000L;
    private static final long ONE_DAY = 86400000L;
    private static final long ONE_WEEK = 604800000L;

    private static final String ONE_SECOND_AGO = "秒前";
    private static final String ONE_MINUTE_AGO = "分钟前";
    private static final String ONE_HOUR_AGO = "小时前";
    private static final String ONE_DAY_AGO = "天前";
    private static final String ONE_MONTH_AGO = "月前";
    private static final String ONE_YEAR_AGO = "年前";

    /**
     * 将Date转化为String
     *
     * @param srcDate    源日期
     * @param srcFormat  源格式
     * @param destFormat 目标格式
     * @return
     */
    public static String transDate2String(Date srcDate, String srcFormat, String destFormat) {
        if(srcDate != null){
            if (!JBUtil.isStrEmpty(destFormat)) {
                if (destFormat.equals(srcFormat)) {
                    return srcDate.toString();
                } else {
                    SimpleDateFormat formatter = new SimpleDateFormat(destFormat);
                    return formatter.format(srcDate);
                }
            } else {
                return "";
            }
        }else{
            return "";
        }

    }

    /**
     * 增加几个小时的方法
     * @param day
     * @param hour
     * @return
     */
    public static String addDateMinut(String day, int hour,String srcFmt,String desFmt){
        SimpleDateFormat format = new SimpleDateFormat(srcFmt);
        Date date = null;
        try {
            date = format.parse(day);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (date == null)
            return "";
        System.out.println("front:" + format.format(date)); //显示输入的日期
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hour);// 24小时制
        date = cal.getTime();
        System.out.println("after:" + format.format(date));  //显示更新后的日期
        SimpleDateFormat desFormat = new SimpleDateFormat(desFmt);
        return desFormat.format(date);

    }

    /**
     * 转换字符串时间为Date对象
     *
     * @param srcDateStr
     * @param srcFormat
     * @param destFormat
     * @return
     */
    public static Date transString2Date(String srcDateStr, String srcFormat, String destFormat) {
        if (srcDateStr != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(srcFormat);
            try {
                Date retDate = formatter.parse(srcDateStr);
                return retDate;
            } catch (ParseException e) {
                e.printStackTrace();
                return new Date(srcDateStr);
            }
        } else {
            //默认返回当前时间
            return new Date();
        }
    }

    /**
     * 根据格式获取当前时间字符串
     *
     * @param format
     * @return
     */
    public static String getCurrentFormatTimeStr(String format) {
        String time = "";
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            time = dateFormat.format(new Date());
        } catch (Exception e) {
            time = "时间获取出错";
        }
        return time;
    }

    /**
     * 构建当前时间Calendar对象
     *
     * @return
     */
    public static Calendar buildCurrentTime() {
        long time = System.currentTimeMillis();
        Date currentDate = new Date(time);
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        return cal;
    }

    /**
     * 计算时间增加
     *
     * @param days
     * @return
     */
    public static Date addDate(int days) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, days);//计算若干天后的时间
        Date retDate = c.getTime();
        return retDate;
    }


    /**
     * 生成日期时间的间隔
     *
     * @return
     */
    public static String buildDateTimeIntervalStr(Date date) {
        long delta = new Date().getTime() - date.getTime();
        if (delta < 1L * ONE_MINUTE) {
            long seconds = toSeconds(delta);
            return (seconds <= 0 ? 1 : seconds) + ONE_SECOND_AGO;
        }
        if (delta < 45L * ONE_MINUTE) {
            long minutes = toMinutes(delta);
            return (minutes <= 0 ? 1 : minutes) + ONE_MINUTE_AGO;
        }
        if (delta < 24L * ONE_HOUR) {
            long hours = toHours(delta);
            return (hours <= 0 ? 1 : hours) + ONE_HOUR_AGO;
        }
        if (delta < 48L * ONE_HOUR) {
            return "昨天";
        }
        if (delta < 30L * ONE_DAY) {
            long days = toDays(delta);
            return (days <= 0 ? 1 : days) + ONE_DAY_AGO;
        }
        if (delta < 12L * 4L * ONE_WEEK) {
            long months = toMonths(delta);
            return (months <= 0 ? 1 : months) + ONE_MONTH_AGO;
        } else {
            long years = toYears(delta);
            return (years <= 0 ? 1 : years) + ONE_YEAR_AGO;
        }
    }


    private static long toSeconds(long date) {
        return date / 1000L;
    }

    private static long toMinutes(long date) {
        return toSeconds(date) / 60L;
    }

    private static long toHours(long date) {
        return toMinutes(date) / 60L;
    }

    private static long toDays(long date) {
        return toHours(date) / 24L;
    }

    private static long toMonths(long date) {
        return toDays(date) / 30L;
    }

    private static long toYears(long date) {
        return toMonths(date) / 365L;
    }


    /**
     * 获取当前日期是星期几<br>
     *
     * @param dt
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate(Date dt) {
        if(dt!=null){
            String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
            Calendar cal = Calendar.getInstance();
            cal.setTime(dt);
            int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
            if (w < 0)
                w = 0;
            return weekDays[w];
        }else{
            return "周日";
        }

    }

    /**
     *  date转string
     *
     * @param date
     * @param format
     * @return
     */
    public static String convertDateToString(Date date, String format) {
        if (date == null) {
            return null;
        } else {
            if (format == null) {
                format = dateFormat_yyyy_MM_dd;
            }

            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            String result = sdf.format(date);
            return result;
        }
    }

    public static Date convertStringToDate(String srcDate, String srcformat) {
        if(null == srcformat || "".equals(srcformat)) {
            srcformat = dateFormat_yyyy_MM_dd;
        }

        SimpleDateFormat format = new SimpleDateFormat(srcformat);
        Date date = null;

        try {
            date = format.parse(srcDate);
            return date;
        } catch (ParseException var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /**
     * 测试
     */
    public static void main(String[] args){
        String str = "2017-09-19 21:20:20";
        System.out.println(str.substring(0,16));

        String dateTime = "2017-11-20";
        System.out.println(convertStringToDate(dateTime,dateFormat_yyyy_MM_dd));
    }
}
