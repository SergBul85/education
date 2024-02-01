package lesson_107;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Black", 225);
        Car car2 = new Car("BMW", "Black", 225);
        Car car3 = car1;
        System.out.println("car1 and car2");
//        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
//        System.out.println("car1 and car3");
//        System.out.println(car1 == car3);
//        System.out.println(car1.equals(car3));

    }
}

class Car {
    String name;
    String color;
    int speed;

    public Car(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car1 = (Car) obj;
            return (name.equals(car1.name) && color.equals(car1.color) && (speed == car1.speed) );
        } else {
            return false;
        }
    }

}