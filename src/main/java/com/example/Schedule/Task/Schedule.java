package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 19: Write a CRON expression that runs a job every hour but only on even-numbered days of the month.
// 0 * */2 * *  //*/2 every even-numbered


@Component
public class Schedule {
    @Scheduled(cron = "0 0 * */2 * *")

    public void schedule1() {
        System.out.println("Run every hour but only on even-numbered days of the month");
    }

}


