package Ders_CustomClass.Example_2;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.Brand = "BMW";
        car1.model = "X5";
        car1.year = 2020;
        car1.color = "Red";

        Car car2 = new Car();
        car2.Brand = "Mercedes";
        car2.model = "C Class";
        car2.year = 2020;
        car2.color = "Black";

        Car car3 = new Car();
        car3.setCarInfo("Toyota", "Corolla", 2020, "White");
        car3.getCarInfo();

        System.out.println( car3 );         // it will invoke the toString() method

        System.out.println(car1.Brand);
        System.out.println(car2.model);
        System.out.println(car3.year);

        car1.start();
        car1.drive();

        Car[] cars = {car1, car2, car3};         // *******
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

        /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each car info
         */
        for(int i = 0; i < cars.length; i++){
            cars[i].getCarInfo();
        }
        // or
        for(Car eachCar : cars){
            eachCar.getCarInfo();
        }

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2, car3) );

        for(int i = 0; i < carList.size(); i++){
            System.out.println(  carList.get(i)  );
        }
    }
}
