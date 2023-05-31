package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 5: Write a CRON expression that runs a job every month on the first day of the month at 3:00 AM.
//  0 3 1 * *

@Component
public class Schedule {
    @Scheduled(cron = "0 0 3 1 * *")
    public void schedule1() {
        System.out.println("Run every month on the first day of the month at 3:00 AM");
    }

}


