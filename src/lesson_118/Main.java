package lesson_118;

import java.time.*;

public class Main {
    public static void main(String[] args) {

//        Period period = Period.ofDays(10);
//        LocalDate date1 = LocalDate.of(2001, Month.SEPTEMBER, 1);
//        LocalDate date2 = date1.minus(period);
//        System.out.println(date1);
//        System.out.println(date2);

        Duration duration = Duration.ofHours(45);
        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
        LocalTime lt2 = lt1.minus(duration);
        System.out.println(lt2);



    }
}
