package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 17: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
// */5 * * * 1-5   // on Weekdays
//*/15 * * * 6,0  // on Weekends

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 * * * 1-5")
    @Scheduled(cron = "0 15 * * * 6,0")

    public void schedule1() {
        System.out.println("Run every 5 minutes on weekdays and every 15 minutes on weekends");
    }

}


