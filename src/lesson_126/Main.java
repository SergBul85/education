package lesson_126;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(15);
        list1.add(5);

        int temp=list1.stream().reduce(((accumulator, element) -> accumulator - element)).get();
        System.out.println(temp);


    }
}
