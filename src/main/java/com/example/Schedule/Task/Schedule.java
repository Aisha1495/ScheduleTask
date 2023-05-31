package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 7: Write a CRON expression that runs a job every 15 minutes between 8:00 AM and 10:45 PM every day.
//  */15 8-22 * * *

@Component
public class Schedule {
    @Scheduled(cron = "0 */15 8-22 * * *")
    public void schedule1() {
        System.out.println("Run every 15 minutes between 8:00 AM and 10:45 PM every day");
    }

}


