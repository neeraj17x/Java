// import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeExample1 {
    public static void main(String args[])
    {
        // Date date;//java.util and java.sql
        System.out.println("Local Date\n-----------------------");
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(1994, 10, 17);
        System.out.println(today);
        System.out.println(date);
        System.out.println(Month.OCTOBER);

        System.out.println("\nLocal Time\n--------------------");
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(15, 56, 36, 99);
        LocalTime australiaNow = LocalTime.now(ZoneId.of("Australia/Canberra"));
        System.out.println(now);
        System.out.println(time);
        System.out.println("Australia- "+australiaNow);

        System.out.println("\nLocal Date Time\n--------------------");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // System.out.println("\nTime Zones\n--------------------");
        // for(String s: ZoneId.getAvailableZoneIds()) {
        //     System.out.println(s);
        // }
    }
}
