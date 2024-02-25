package lesson_140;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String someText = "Some text. End of text.";

        try (FileWriter fileWriter = new FileWriter("Test2")) {
            fileWriter.write(someText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
