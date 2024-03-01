package lesson_145;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Test1.txt");
        File file2 = new File("C:\\Users\\Сергей\\Desktop\\Test_A\\Test147.txt");
        File folder = new File("C:\\Users\\Сергей\\Desktop\\Test_A");
        File folder2 = new File("C:\\Users\\Сергей\\Desktop\\Test_B");

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
//        Lesson_147
        System.out.println("file2.createNewFile() - " + file2.createNewFile());
        System.out.println("folder2.createNewFile() - " + folder2.mkdir());
        System.out.println("-------------------------------------");
        System.out.println("file2.length() - " + file2.length());
        System.out.println("folder2.length() - " + folder2.length());
        System.out.println("-------------------------------------");
//        System.out.println("file2.delete() - " + file2.delete());
//        System.out.println("folder2.delete() - " + folder2.delete());
//        System.out.println("-------------------------------------");

        File[] files = folder2.listFiles();
        System.out.println(Arrays.toString(files));
        for (var x : files) {
            System.out.print("Name of the file - " + x.getName());
            System.out.print(", isHidden - " + x.isHidden());
            System.out.println(", readWrite - " + x.canWrite());
        }

    }
}
