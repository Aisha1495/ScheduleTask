package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 25: Write a CRON expression that runs a job at the bottom of every hour (i.e., at :00 and :30 minutes past the hour) between 6:00 PM and midnight on weekdays.
// 0,30 18-23 * * 1-5


@Component
public class Schedule {
    @Scheduled(cron = "0 0,30 18-23 * * 1-5")

    public void schedule1() {
        System.out.println("Run every hour between 6:00 PM and midnight on weekdays");
    }

}


