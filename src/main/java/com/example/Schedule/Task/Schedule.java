package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 11: Write a CRON expression that runs a job every 30 minutes during business hours (8:00 AM to 5:00 PM) on weekdays.
// */30 8-16 * * 1-5

@Component
public class Schedule {
    @Scheduled(cron = "0 */30 8-16 * * 1-5")
    public void schedule1() {
        System.out.println("Run every 30 minutes during business hours (8:00 AM to 5:00 PM) on weekdays");
    }

}


