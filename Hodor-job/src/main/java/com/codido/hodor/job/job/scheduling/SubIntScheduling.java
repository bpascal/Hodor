package com.codido.hodor.job.job.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 处理用户的订阅实例的定时任务
 * cron表达式格式:
 * 1.Seconds Minutes Hours DayofMonth Month DayofWeek Year
 * 2.Seconds Minutes Hours DayofMonth Month DayofWeek
 * 顺序:
 * 秒（0~59）
 * 分钟（0~59）
 * 小时（0~23）
 * 天（月）（0~31，但是你需要考虑你月的天数）
 * 月（0~11）
 * 天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
 * 年份（1970－2099）
 * <p>
 * 注:其中每个元素可以是一个值(如6),一个连续区间(9-12),一个间隔时间(8-18/4)(/表示每隔4小时),一个列表(1,3,5),通配符。
 * 由于"月份中的日期"和"星期中的日期"这两个元素互斥的,必须要对其中一个设置?.
 */
@Component
public class SubIntScheduling {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(SubIntScheduling.class);



    /**
     * 生成自动续费订单轮训
     * 每天0点0分30秒执行
     */
    @Scheduled(cron = "30 0 0 * * ?")
    public void dealUserSubInstScheduling() {
        logger.info("生成自动续费订单轮训启动");

        logger.info("生成自动续费订单轮训结束");
    }

    /**
     * 用户即将过期推送
     * 推送时间：每天 12 点进行
     * 推送前提：3天后要到期的订阅
     * t_user_openid -> MICROAPP_YOUSHU
     */
    @Scheduled(cron = "0 0 12 * * ?")
    public void experidSubListMpPush() {
        logger.info("用户即将过期推送开始");

        logger.info("用户即将过期推送结束");
    }
}
