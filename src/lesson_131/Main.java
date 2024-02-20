package lesson_131;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 150);
        Car car2 = new Car("AUDI", 200);
        Car car3 = new Car("MERC", 250);
        Car car4 = new Car("ZIL", 75);

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
