package lesson_112;

public class Main {
    public static void main(String[] args) {
        System.out.println("START programm");
        try {
            test1();
        } catch (NullPointerException e) {
            System.out.println("Исключение в методе MAIN" + e);
        }
        System.out.println("FINISH programm");
    }

    public static void test1() throws NullPointerException {
        System.out.println("START test1");
        String str = null;
        System.out.println(str.length());
        System.out.println("FINISH test1");
    }


}
