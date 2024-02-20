package lesson_131;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 250);
        Car car2 = new Car("AUDI", 350);
        Car car3 = new Car("MERC", 350);
        Car car4 = new Car("ZIL", 200);

        Owner owner1 = new Owner("Jhon Connor");
        Owner owner2 = new Owner("Bruce Willis");

        owner1.addCarToOwner(car1);
        owner1.addCarToOwner(car2);

        owner2.addCarToOwner(car3);
        owner2.addCarToOwner(car4);

        List<Owner> owners = new ArrayList<>();

        owners.add(owner2);
        owners.add(owner1);

        owners.stream().flatMap(owner -> owner.getCarsOfOwner().stream()).forEach(x -> System.out.println(x.getName()));
// Lesson 132
        System.out.println("Lesson 132 ----------------------------------");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Car firstCar = cars.stream().filter(x -> x.getSpeed() == 200).findFirst().get();
        System.out.println("firstCar - " + firstCar);

// Lesson 133
        System.out.println("Lesson 133 ----------------------------------");
        Car minSpeedCar = cars.stream().min((x, y) -> x.getSpeed() - y.getSpeed()).get();
        System.out.println("minSpeedCar - " + minSpeedCar);

        Car maxSpeedCar = cars.stream().max((car_1, car_2) -> car_1.getSpeed() - car_2.getSpeed()).get();
        System.out.println("maxSpeedCar - " + maxSpeedCar);

    }
}

class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
               "name='" + name + '\'' +
               ", speed=" + speed +
               '}';
    }
}

class Owner {
    private String name;
    private List<Car> carsOfOwner;

    public Owner(String name) {
        this.name = name;
        this.carsOfOwner = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCarsOfOwner() {
        return carsOfOwner;
    }

    public void setCarsOfOwner(List<Car> carsOfOwner) {
        this.carsOfOwner = carsOfOwner;
    }

    public void addCarToOwner(Car car) {
        carsOfOwner.add(car);
    }

}
