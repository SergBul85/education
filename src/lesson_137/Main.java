package lesson_137;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(300);
        list1.add(5);
        //295
        list1.add(48);
        list1.add(12);
        //36
        //295-36=259


        int minus = list1.parallelStream().reduce((a, x) -> a - x).get();
        System.out.println(minus);


    }
}
