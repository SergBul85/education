package lesson_128;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> st1 = Stream.of("A","B","C");
        Stream<String> st2 = Stream.of("D","E","F");

        Stream<String> st3 = Stream.concat(st1,st2);

        st3.forEach(x->{
            System.out.println(x);
        });

    }
}
