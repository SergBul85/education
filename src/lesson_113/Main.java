package lesson_113;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start MAIN");
        System.out.println(method());
        System.out.println("End MAIN");
    }

    private static int method() {

        File file = new File("test9.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            return 1;
        } catch (FileNotFoundException e) {
            System.out.println("Block catch");
            return 2;
        } finally {
            System.out.println("Block finally");
        }


    }
}
