import java.util.Scanner;

public class sl_30 {
         public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour24 = totalHours % 24;

        String amPm = (currentHour24 >= 12) ? "PM" : "AM";
        int currentHour12 = (int)(currentHour24 % 12);
        if (currentHour12 == 0) currentHour12 = 12;

        System.out.println("Current time is " + currentHour12 + ":" + currentMinute + ":" + currentSecond + " " + amPm);
    }
}
