

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("LocalDate : "+localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : "+localTime);

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println("LocalDateTime : "+localDateTime);

        ZonedDateTime zonedDateTime= ZonedDateTime.now();
        System.out.println("ZonedDateTime : "+zonedDateTime);

        System.out.println("ZoneID : "+ZoneId.systemDefault());

        Instant instant=Instant.now();
        System.out.println("Instant : "+ instant);

        Duration duration=Duration.ofDays(2);
        System.out.println("Duration : "+duration.toMillis());

        System.out.println("Period : "+Period.between(localDate, LocalDate.now().plusDays(2).plusMonths(3)));

    }

}
