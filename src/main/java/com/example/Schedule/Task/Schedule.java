package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 13: Write a CRON expression that runs a job every day at 6:00 PM during daylight saving time (DST) in the United States.
// 0 18 * * *

@Component
public class Schedule {
    @Scheduled(cron = "0 0 18 * * *")
    public void schedule1() {
        System.out.println("Run every day at 6:00 PM during daylight saving time (DST) in the United States");
    }

}


