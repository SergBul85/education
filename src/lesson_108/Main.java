package lesson_108;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("AUDI", "Black");
        Car car2 = new Car("Mazda", "Green");

//        System.out.println("Авто1: марка - " + car1.name + ", цвет - " + car1.color);
//        System.out.println("Авто2: марка - " + car2.name + ", цвет - " + car2.color);

        System.out.println(car1.toString());
        System.out.println(car2.toString2());



    }
}

class Car {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               '}';
    }


    public String toString2() {
        return "Авто: марка - " + name + " , цвет - " + color;
    }


}
