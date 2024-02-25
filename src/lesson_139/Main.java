package lesson_139;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("Test1.txt");
            int temp;
            while ((temp = fileReader.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileReader.close();
        }
    }
}
