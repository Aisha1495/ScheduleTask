package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 21: Write a CRON expression that runs a job at 3:30 AM every day except Saturday and Sunday.
// 30 3 * * 1-5


@Component
public class Schedule {
    @Scheduled(cron = "0 30 3 * * 1-5")

    public void schedule1() {
        System.out.println("Run at 3:30 AM every day except Saturday and Sunday");
    }

}


