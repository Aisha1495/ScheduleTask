package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 4: Write a CRON expression that runs a job every Monday at 8:00 AM.
//  0 8 * * 1

@Component
public class Schedule {
    @Scheduled(cron = "0 0 8 * * 1")
    public void schedule1() {
        System.out.println("Run every Monday at 8:00 AM");
    }

}


