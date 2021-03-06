package com.itcorey.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: corey
 * @Date: 2020/6/11 18:47
 * @Description: 定时任务
 */
@Component
public class ScheduledTask {

    private static  final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 50000)
    public void reportCurrentTime() throws InterruptedException {
        System.out.println("表示每隔5000ms，Spring scheduling会调用一次该方法，不论该方法的执行时间是多少"+format.format(new Date()));
    }

    @Scheduled(fixedDelay = 50000)
    public void reportCurrentTimeAfterSleep() throws InterruptedException {
        System.out.println("表示当方法执行完毕5000ms后，Spring scheduling会再次调用该方法"+format.format(new Date()));
    }

    @Scheduled(cron = "0 0 2 * * *")
    public void reportCurrentTimeCron() throws InterruptedException {
        System.out.println("提供了一种通用的定时任务表达式，这里表示每隔5秒执行一次，更加详细的信息可以参考cron表达式"+format.format(new Date()));
    }
}
