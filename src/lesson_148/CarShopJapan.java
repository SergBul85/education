package lesson_148;

public class CarShopJapan {
    public static void main(String[] args) {
        Car car1 = new Car(JapanCars.LEXUS, 250);
        car1.carInfo();
    }
}

enum JapanCars {
    HONDA, TOYOTA, SUBARU, LEXUS;
}

class Car {
    JapanCars name;
    int speed;

    public Car(JapanCars name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void carInfo() {
        System.out.println("Name - " + name + ", speed - " + speed);
    }
}