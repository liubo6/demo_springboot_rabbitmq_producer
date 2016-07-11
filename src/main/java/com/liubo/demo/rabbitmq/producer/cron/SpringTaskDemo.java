package com.liubo.demo.rabbitmq.producer.cron;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by hzlbo on 2016/7/11.
 */
@Configuration
@EnableScheduling
public class SpringTaskDemo {

    @Scheduled(cron = "* 0/30 * * * ?") // 每30分钟执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>> 定时任务<<<<<<<<<<");
    }
}
