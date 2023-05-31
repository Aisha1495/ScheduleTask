package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 1: Write a CRON expression that runs a job every five minutes.
//  */5 * * * *

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 * * * *")
    public void schedule1() {
        System.out.println("Run every five minutes");
    }

}


