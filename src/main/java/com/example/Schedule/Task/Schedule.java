package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 16: Write a CRON expression that runs a job every hour during the first half of the month
// 0 * 1-15 * *  //half month 30/2 = 15  which is the first 15 days of the month

@Component
public class Schedule {
    @Scheduled(cron = "0 0 * 1-15 * *")

    public void schedule1() {
        System.out.println("Run every hour during the first half of the month");
    }

}


