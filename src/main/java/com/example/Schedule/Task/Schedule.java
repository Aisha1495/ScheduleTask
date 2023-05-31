package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 20: Write a CRON expression that runs a job every 5 minutes but only between 9:00 AM and 6:00 PM on weekends
// */5 9-17 * * 6,7 weekends


@Component
public class Schedule {
    @Scheduled(cron = "0 */5 9-17 * * 6,7")

    public void schedule1() {
        System.out.println("Run every 5 minutes but only between 9:00 AM and 6:00 PM on weekends");
    }

}


