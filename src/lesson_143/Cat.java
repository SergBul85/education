package lesson_143;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               '}';
    }
}
