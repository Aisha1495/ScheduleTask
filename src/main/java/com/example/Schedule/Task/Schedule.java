package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 3: Write a CRON expression that runs a job every day at 2:30 PM.
//  30 14 * * *

@Component
public class Schedule {
    @Scheduled(cron = "0 30 14 * * *")
    public void schedule1() {
        System.out.println("Run every day at 2:30 PM");
    }

}


