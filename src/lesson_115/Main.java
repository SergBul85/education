package lesson_115;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(localDate.getEra());

        LocalDate localDate = LocalDate.of(1996, Month.SEPTEMBER, 15);
        System.out.println(localDate);
        localDate = localDate.minusDays(5);
        System.out.println(localDate);


    }
}
