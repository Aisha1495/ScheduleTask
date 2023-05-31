package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 1: Write a CRON expression that runs a job at 3:45 PM on weekdays.
       // *|45|15|*|*|*
@Component
public class Schedule {
    @Scheduled(cron = "* 45 15 * * *")
    public void schedule1() {
        System.out.println("Hello World");
    }

}


