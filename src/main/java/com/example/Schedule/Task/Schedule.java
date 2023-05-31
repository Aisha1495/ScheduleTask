package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 8: Write a CRON expression that runs a job every hour on weekdays between 9:00 AM and 5:00 PM.
//  0 9-17 * * 1-5

@Component
public class Schedule {
    @Scheduled(cron = "0 0 9-17 * * 1-5")
    public void schedule1() {
        System.out.println("Run every hour on weekdays between 9:00 AM and 5:00 PM");
    }

}


