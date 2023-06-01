package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 22: Write a CRON expression that runs a job at the top of every hour between 9:00 AM and 5:00 PM on the 15th day of the month.
// 0 9-17 15 * *


@Component
public class Schedule {
    @Scheduled(cron = "0 0 9-17 15 * *")

    public void schedule1() {
        System.out.println("Run every hour between 9:00 AM and 5:00 PM on the 15th day of the month");
    }

}


