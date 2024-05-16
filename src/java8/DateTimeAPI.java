package java8;

import java.util.*;
import java.time.*;

public class DateTimeAPI {
    public static void main(String[] args){
        Date d1 = new Date();
        System.out.println(d1);

        LocalDate d2 = LocalDate.now();
        System.out.println(d2);

        LocalDate d3 = LocalDate.of(1999,5,23);
        System.out.println(d3);

        System.out.println(d3.plusMonths(3));
        System.out.println(d3.minusMonths(4));

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        LocalTime t2 = LocalTime.now(ZoneId.of("Singapore"));
        System.out.println(t2);

        Set s = ZoneId.getAvailableZoneIds();
        s.forEach(System.out::println);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
