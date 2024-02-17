package lesson_121;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Element 1");
        list1.add("Elem 2");
        list1.add("El3");
        list1.add("Number 4");
//        for (int i = 0; i < list1.size(); i++) {
//            list1.set(i, String.valueOf(list1.get(i).length()));
//        }
      

        List<Integer> list2 =list1.stream().map(x -> x.length()).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(list2);


    }
}
