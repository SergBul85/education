package lesson_142;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {
    public static void main(String[] args) throws IOException {

        List<String> cars = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cars.bin"));) {
            cars = (ArrayList) inputStream.readObject();

//            System.out.println(cars);

            for (var car : cars) {
                System.out.println(car);
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
