package lesson_105;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        SportCar sportCar1 = new SportCar();
        Moto moto1 = new Moto();

//        System.out.println(car1 instanceof Car);

        System.out.println(moto1 instanceof HaveEngine);

    }
}

class Car implements HaveEngine{

}

class SportCar extends Car implements HaveEngine{

}

class Moto {

}
interface HaveEngine{

}