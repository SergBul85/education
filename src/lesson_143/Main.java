package lesson_143;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> al;

        Cat cat1 = new Cat("Barsik", "Black", 150.00,200.00);

        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cat.bin"));
        ) {

            outputStream.writeObject(cat1);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
