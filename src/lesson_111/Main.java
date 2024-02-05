package lesson_111;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println("Start programm");
        try {
            System.out.println("Start TRY");
            int c = a / b;
            System.out.println("End TRY");
        } catch (ArithmeticException e) {
            System.out.println("Start CATCH");
            System.out.println("Exeption - " + e);
            System.out.println("End CATCH");
        }finally {
            System.out.println("BLOCK FINALLY");
        }


        System.out.println("End programm");
    }
}
