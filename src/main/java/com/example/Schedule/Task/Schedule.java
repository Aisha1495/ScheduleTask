package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 12: Write a CRON expression that runs a job every hour on the 15th day of the month.
// 0 * 15 * *

@Component
public class Schedule {
    @Scheduled(cron = "0 0 * 15 * *")
    public void schedule1() {
        System.out.println("Run every hour on the 15th day of the month");
    }

}


