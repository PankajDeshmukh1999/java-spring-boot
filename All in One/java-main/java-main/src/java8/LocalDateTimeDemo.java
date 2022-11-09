package java8;

import java.time.*;
import java.util.Date;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date obj = new Date(1639737931329L);
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.minusDays(2));
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate from = LocalDate.of(2021,12,17);
        LocalDate to = LocalDate.of(2011,11,11);

        Period period = Period.between(from,to);
        System.out.println(period);

        LocalTime fromTime = LocalTime.of(12,15,30);
        LocalTime toTime = LocalTime.of(11,30,10);

        Duration duration = Duration.between(fromTime,toTime);
        System.out.println(duration);

    }
}
