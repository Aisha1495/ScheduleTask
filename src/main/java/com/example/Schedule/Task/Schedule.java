package com.example.Schedule.Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//Problem 25: Write a CRON expression that runs a job at the bottom of every hour (i.e., at :00 and :30 minutes past the hour) between 6:00 PM and midnight on weekdays.
// 0,30 18-23 * * 1-5

//
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 0,30 18-23 * * 1-5")
//
//    public void schedule1() {
//        System.out.println("Run every hour between 6:00 PM and midnight on weekdays");
//    }
//
//}

//Problem 26: Write a CRON expression that runs a job at 4:30 PM on the 1st and 15th days of every month.
// 30 16 1,15 * *
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 30 16 1,15 * *")
//
//    public void schedule1() {
//        System.out.println("Run at 4:30 PM on the 1st and 15th days of every month");
//    }
//
//}

//Problem 27: Write a CRON expression that runs a job every 10 minutes on weekdays between 9:00 AM and 5:00 PM.
// */10 9-17 * * 1-5

//@Component
//public class Schedule {
//    @Scheduled(cron = "0 */10 9-17 * * 1-5")
//
//    public void schedule1() {
//        System.out.println("Run every 10 minutes on weekdays between 9:00 AM and 5:00 PM");
//    }
//
//}


//Problem 28: Write a CRON expression that runs a job at 12:00 PM on the 3rd Wednesday of every month.
//0 12 * * 3#3 --- (3#3) is for the 3rd occurrence of Wednesday in the month...
@Component
public class Schedule {
    @Scheduled(cron = "0 0 12 * * 3#3")

    public void schedule1() {
        System.out.println("Run at 12:00 PM on the 3rd Wednesday of every month");
    }

}

//Problem 29: Write a CRON expression that runs a job at 10:00 PM every Sunday in the months of July,August, and September.
//
//Problem 30: Write a CRON expression that runs a job at 12:00 PM every day except Sunday in the month of July.
