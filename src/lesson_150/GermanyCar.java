package lesson_150;

public class GermanyCar {
    public int id;
    protected String brand;
    double speed;
    private double price;

    public GermanyCar(int id, String brand, double speed) {
        this.id = id;
        this.brand = brand;
        this.speed = speed;
    }

    public GermanyCar() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GermanyCar{" +
               "id=" + id +
               ", brand='" + brand + '\'' +
               ", speed=" + speed +
               ", price=" + price +
               '}';
    }
}
