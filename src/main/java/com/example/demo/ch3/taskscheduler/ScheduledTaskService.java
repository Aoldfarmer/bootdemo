package com.example.demo.ch3.taskscheduler;

import com.example.demo.BaseLogger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class ScheduledTaskService extends BaseLogger {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        LOG.debug("每隔5s执行一次：{}" , DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 56 20 ? * *")
    public void fixTimeExecution() {
        LOG.debug("在指定时间：{} 执行", DATE_FORMAT.format(new Date()));
    }

}
