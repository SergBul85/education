package lesson_118;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2000, Month.APRIL,15);
        LocalDateTime ldt = LocalDateTime.of(2010, Month.AUGUST,10,15,30);

        System.out.println(ld.getChronology());
        System.out.println(ldt.getSecond());



    }
}
