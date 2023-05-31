package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 10: Write a CRON expression that runs a job every hour during the month of January.
// 0 * * 1 *

@Component
public class Schedule {
    @Scheduled(cron = "0 0 * * 1 *")
    public void schedule1() {
        System.out.println("Run every hour during the month of January");
    }

}


