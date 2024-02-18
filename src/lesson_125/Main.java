package lesson_125;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 150);
        Car car2 = new Car("MAZDA", 175);
        Car car3 = new Car("MERCEDES", 200);
        Car car4 = new Car("AUDI", 225);
        Car car5 = new Car("ZIL", 60);

        Stream<Car> stream1 = Stream.of(car1, car2, car3, car4, car5);
        List<Car> list1= stream1.filter(x->x.getSpeed()>199).collect(Collectors.toList());
        System.out.println(list1);
    }
}

class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
               "model='" + model + '\'' +
               ", speed=" + speed +
               '}';
    }
}


