package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 24: Write a CRON expression that runs a job at 10:00 PM every day in the month of December
// 0 22 * 12 *


@Component
public class Schedule {
    @Scheduled(cron = "0 0 22 * 12 *")

    public void schedule1() {
        System.out.println("Run at 10:00 PM every day in the month of December");
    }

}


