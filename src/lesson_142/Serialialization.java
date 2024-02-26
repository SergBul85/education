package lesson_142;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialialization {
    public static void main(String[] args) throws IOException {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("FORD");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cars.bin"));) {
            outputStream.writeObject(cars);
        }

        System.out.println("File writen!");

    }
}
