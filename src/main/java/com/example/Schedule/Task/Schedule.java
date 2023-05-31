package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 18: Write a CRON expression that runs a job at 11:30 PM every Friday the 13th.
// 30 23 13 * 6 //6 friday


@Component
public class Schedule {
    @Scheduled(cron = "0 30 23 13 * 6")

    public void schedule1() {
        System.out.println("Run at 11:30 PM every Friday the 13th");
    }

}


