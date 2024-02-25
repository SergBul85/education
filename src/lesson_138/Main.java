package lesson_138;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "\nУчиться, учиться, учиться!!!\n" +
                     "Вторая строка.";

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Test1.txt", true);


            fileWriter.write(str);
//            for (int i = 0; i < str.length(); i++) {
//                fileWriter.write(str.charAt(i));
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }


        System.out.println("Progamm ends");
    }
}
