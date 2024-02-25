package lesson_141;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String urlImage = "C:\\Users\\Сергей\\Desktop\\image.jpg";

        FileInputStream fis = new FileInputStream(urlImage);
        FileOutputStream fos = new FileOutputStream("Test3.jpg");

        int temp;
        while ((temp = fis.read()) != -1) {
            fos.write(temp);
        }

        System.out.println("-----------------");
        System.out.println("Programm ends!");


    }
}
