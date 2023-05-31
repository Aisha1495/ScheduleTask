package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 2: Write a CRON expression that runs a job every hour.
//  0 * * * *

@Component
public class Schedule {
    @Scheduled(cron = "0 0 * * * *")
    public void schedule1() {
        System.out.println("Run every hour");
    }

}


