package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 15: Write a CRON expression that runs a job every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays.
// */10 9-17 * * 1-5

@Component
public class Schedule {
    @Scheduled(cron = "0 */10 9-17 * * 1-5")

    public void schedule1() {
        System.out.println("Run every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays");
    }

}


