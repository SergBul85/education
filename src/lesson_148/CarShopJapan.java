package lesson_148;

public class CarShopJapan {
    public static void main(String[] args) {
//        Car car1 = new Car(JapanCars.LEXUS, 250);
//        car1.carInfo();

//        System.out.println(JapanCars.LEXUS.getClassOfCar());

        JapanCars[] array = JapanCars.values();
        for (var car : array) {
            System.out.print(car + " - ");
            System.out.println(car.getClassOfCar());

        }

    }
}

enum JapanCars {
    HONDA("middle"),
    TOYOTA("middle"),
    SUBARU("sport"),
    LEXUS("luxary");
    String classOfCar;

    JapanCars(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

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