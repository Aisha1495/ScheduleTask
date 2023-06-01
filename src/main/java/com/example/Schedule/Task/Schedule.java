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
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 0 12 * * 3#3")
//
//    public void schedule1() {
//        System.out.println("Run at 12:00 PM on the 3rd Wednesday of every month");
//    }
//
//}



//Problem 29: Write a CRON expression that runs a job at 10:00 PM every Sunday in the months of July,August, and September.
//0 22 * 7-9 0
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 0 22 * 7-9 0")
//
//    public void schedule1() {
//        System.out.println("Run at 10:00 PM every Sunday in the months of July,August, and September");
//    }
//
//}



//Problem 30: Write a CRON expression that runs a job at 12:00 PM every day except Sunday in the month of July.
//0 12 * 7 1-6
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 0 12 * 7 1-6")
//
//    public void schedule1() {
//        System.out.println("Run at 12:00 PM every day except Sunday in the month of July");
//    }
//
//}



//Problem 31: Write a CRON expression that runs a job at 11:30 PM every Friday.
//30 23 * * 5 --- 5 is Friday wiedlyTime
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 30 23 * * 5")
//
//    public void schedule1() {
//        System.out.println("Run at 11:30 PM every Friday");
//    }
//
//}


//Problem 32: Write a CRON expression that runs a job at 3:15 AM every day.
//15 3 * * *
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 15 3 * * *")
//
//    public void schedule1() {
//        System.out.println("Run at 3:15 AM every day");
//    }
//
//}



//Problem 33: Write a CRON expression that runs a job every hour from 6:00 AM to 8:00 PM on weekdays.
//0 6-20 * * 1-5
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 0 6-20 * * 1-5")
//
//    public void schedule1() {
//        System.out.println("Run every hour from 6:00 AM to 8:00 PM on weekdays");
//    }
//
//}



//Problem 34: Write a CRON expression that runs a job every 30 minutes on the 15th and 30th day of every month.
//*/30 * 15,30 * *
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 */30 * 15,30 * *")
//
//    public void schedule1() {
//        System.out.println("Run every 30 minutes on the 15th and 30th day of every month");
//    }
//}


//Problem 35: Write a CRON expression that runs a job every 5 minutes on the 1st day of every month.
//*/5 * 1 * *
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 */5 * 1 * *")
//
//    public void schedule1() {
//        System.out.println("Run every 5 minutes on the 1st day of every month");
//    }
//}



//Problem 36: Write a CRON expression that runs a job every hour on the hour from 9:00 AM to 5:00 PM on weekdays.
//0 9-17 * * 1-5
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 0 9-17 * * 1-5")
//
//    public void schedule1() {
//        System.out.println("Run every hour on the hour from 9:00 AM to 5:00 PM on weekdays");
//    }
//}



//Problem 37: Write a CRON expression that runs a job every 15 minutes from 2:00 PM to 10:00 PM on weekends.
//*/15 14-22 * * 6-7
//@Component
//public class Schedule {
//    @Scheduled(cron = "0 */15 14-22 * * 6-7")
//
//    public void schedule1() {
//        System.out.println("Run every 15 minutes from 2:00 PM to 10:00 PM on weekends");
//    }
//}


//Problem 38: Write a CRON expression that runs a job every 10 minutes on weekdays between 8:00 AM and 3:00 PM.
//*/10 8-14 * * 1-5
@Component
public class Schedule {
    @Scheduled(cron = "0 */10 8-14 * * 1-5")

    public void schedule1() {
        System.out.println("Run every 10 minutes on weekdays between 8:00 AM and 3:00 PM");
    }
}


//Problem 39: Write a CRON expression that runs a job at 11:00 PM every day of the year.
//
//Problem 40: Write a CRON expression that runs a job every 30 minutes on the 15th and last day of every month.
//