package lesson_118;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Period period = Period.ofDays(10);

        LocalDate date1 = LocalDate.of(2001, Month.SEPTEMBER, 1);
        LocalDate date2 = date1.minus(period);

        System.out.println(date1);
        System.out.println(date2);



    }
}
