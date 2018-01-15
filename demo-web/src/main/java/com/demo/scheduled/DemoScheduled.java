package com.demo.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ScheduledFuture;

/**
 * @author Turbo
 * @date 17/5/26.
 */
@Component
public class DemoScheduled {

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    private ScheduledFuture<?> future;

    public void startCron(String cron){
        System.out.println("x0");
        future = threadPoolTaskScheduler.schedule(new Say(),new CronTrigger(cron));
        System.out.println("x1");
    }

    public String stopCron(){
        System.out.println("stop >>>>>");
        if(future != null) {
            future.cancel(true);
        }
        System.out.println("stop <<<<<");
        return "stop cron";
    }

    @PostConstruct
    public void start(){
        startCron("0 0/5 * * * ?");
    }


}
