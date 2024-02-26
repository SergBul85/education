package lesson_143;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {
        Cat cat;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cat.bin"));) {

            cat = (Cat) inputStream.readObject();
            System.out.println(cat);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
