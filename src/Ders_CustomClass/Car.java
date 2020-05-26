package Ders_CustomClass;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return year + " " + brand + " " + model + " $" + price;
    }

//******************************************************************************

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2020, 32000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);


    }
}

