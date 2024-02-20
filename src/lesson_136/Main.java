package lesson_136;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 150, 50000.75);
        Car car2 = new Car("AUDI", 175, 75000.33);
        Car car3 = new Car("MERC", 225, 99999.99);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        List<Car> filteredList = cars.stream().filter(x -> x.getSpeed() > 160).collect(Collectors.toList());
        System.out.println(filteredList);

        System.out.println("--------------------------------------");

        List<Integer> speedList = cars.stream().mapToInt(x->x.getSpeed()).boxed().collect(Collectors.toList());
        System.out.println(speedList);

        List<Double> priceList = cars.stream().mapToDouble(x->x.getPrice()).boxed().collect(Collectors.toList());
        System.out.println(priceList);
    }
}

class Car {
    private String name;
    private int speed;
    private double price;

    public Car(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
               "name='" + name + '\'' +
               ", speed=" + speed +
               ", price=" + price +
               '}';
    }
}
