package lesson_109;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of programm");
        int[] array = {0, 1, 2, 3, 4};
        try {
            System.out.println("Start block TRY");
//            System.out.println(array[11]);
            int temp = 5 / 0;
            System.out.println("End block TRY");
        } catch (NullPointerException e) {
            System.out.println("Start block CATCH");
            System.out.println("Описание эксепшена " + e);
            System.out.println("End block CATCH");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Второй блок CATCH " + e);
        } catch (ArithmeticException e) {
            System.out.println("Третий блок CATCH " + e);
        } catch (Exception e) {
            System.out.println("Четвёртый блок CATCH " + e);
        }


//        int a = 5;
//        int b = 0;
//        System.out.println(a + b);
//        String str = null; // ""
//        System.out.println(str.length());
        System.out.println("End of programm");
    }
}
