package com.dmitriz.ipr.emuClientOracleDB;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.FixedRateTask;

@EnableScheduling
public class Scheduler {

    @Scheduled(fixedRate = 100)
    public void print(){
        System.out.println("dmitriz.ipr");
    }
}
