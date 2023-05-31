package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 9: Write a CRON expression that runs a job every day at 3:00 AM.
//  0 3 * * *

@Component
public class Schedule {
    @Scheduled(cron = "0 0 3 * * *")
    public void schedule1() {
        System.out.println("Run every day at 3:00 AM");
    }

}


