package Ders_DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {

        // **********************************************************************

        LocalTime saat = LocalTime.now();
        System.out.println(saat);                                           // 00:42:07.677

        LocalTime time = LocalTime.of(23, 50, 30);
        System.out.println(time);                                           // 23:50:30

        // **********************************************************************

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime time1 = LocalTime.of(9, 30, 30);
        System.out.println(time1.format(dtf));                              // 09:30:30 AM

        LocalTime time2 = LocalTime.of(12, 0, 30);
        System.out.println(time2.format(dtf));                              // 12:00:30 PM

        boolean result = time1.isAfter(time2);
        System.out.println(result);                                         // false

        // **********************************************************************

        LocalDateTime datetime1 = LocalDateTime.of(2015, 12, 25, 23,30,45);
        System.out.println(datetime1);          // 2015-12-25T23:30:45

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");
        String str = datetime1.format(dtf2)  ;
        System.out.println(str);                // Fri, 12/25 11:30 PM
    }
}
