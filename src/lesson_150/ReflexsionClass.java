package lesson_150;

import java.lang.reflect.Field;

public class ReflexsionClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class class1 = Class.forName("lesson_150.GermanyCar");
//        Class class2 = GermanyCar.class;
//        GermanyCar car1 = new GermanyCar();
//        Class class3 = car1.getClass();

//        Field field1 = class1.getField("id");
//        Field field2 = class1.getField("brand");
//        Field field3 = class1.getField("speed");
//
//        System.out.println(field1);
//        System.out.println(field2);
//        System.out.println(field3);

        Field[] fields = class1.getDeclaredFields();
        for (var f : fields) {
            System.out.print(f.getType() + " - ");
            System.out.print(f.getModifiers() + " - ");
            System.out.println(f.getName());

        }

    }
}
