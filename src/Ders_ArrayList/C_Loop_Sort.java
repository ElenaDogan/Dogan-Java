package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class C_Loop_Sort {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // FOR LOOP         ==> USE size() and get(index)
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // FOR-EACH LOOP
        for (String i : cars) {
            System.out.println(i);
        }

    // **********************************************************************

        Collections.sort(cars);

        System.out.println(cars);       // [BMW, Ford, Mazda, Volvo]

    // **********************************************************************



    }
}
