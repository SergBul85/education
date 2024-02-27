package lesson_143;

import java.io.Serializable;

public class Cat implements Serializable {
    transient private String name;
    private String color;
    transient private double priceIn;
    private double priceOut;

    public Cat(String name, String color, double priceIn, double priceOut) {
        this.name = name;
        this.color = color;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", priceIn=" + priceIn +
               ", priceOut=" + priceOut +
               '}';
    }
}
