package lesson_145;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Test1.txt");
        File folder = new File("C:\\Users\\Сергей\\Desktop\\Test_A");

//        Lesson_145
        System.out.println("file.getAbsolutePath() - " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() - " + folder.getAbsolutePath());
        System.out.println("-------------------------------------");
//        Lesson_146
        System.out.println("file.isAbsolute() - " + file.isAbsolute());
        System.out.println("folder.isAbsolute() - " + folder.isAbsolute());
        System.out.println("-------------------------------------");
        System.out.println("file.isFile() - " + file.isFile());
        System.out.println("folder.isDirectory() - " + folder.isDirectory());
        System.out.println("-------------------------------------");
        System.out.println("file.exists() - " + file.exists());
        System.out.println("folder.exists() - " + folder.exists());
        System.out.println("-------------------------------------");



    }
}
