package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 6: Write a CRON expression that runs a job every Sunday at 7:30 PM and 10:30 PM.
//  30 19,22 * * 0

@Component
public class Schedule {
    @Scheduled(cron = "0 30 19,22 * * 0")
    public void schedule1() {
        System.out.println("Run every Sunday at 7:30 PM and 10:30 PM");
    }

}


