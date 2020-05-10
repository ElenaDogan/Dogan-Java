package Ders_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

 /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]

			DO NOT USE SORT method, DO NOT decleare  any extra lists
     */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 0, 20, 0, 30, 0, 40, 0, 0, 0));
        int count = 0;
        for (Integer each : list) {
            if (each == 0) {  // finding the frequency of zeros
                count++;
            }
        }
        // or
        // int count =  Collections.frequency(list, 0);
        System.out.println(count);

        list.removeAll(Arrays.asList(0));       // removed all the zeros from the list ==> list = [10, 20, 30, 40]
        System.out.println(list);

        for (int i = 0; i < count; i++) {
            list.add(0);
        }

        System.out.println(list);               // [10, 20, 30, 40, 0, 0, 0, 0, 0, 0]


        // ****************************************************************************************
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Robb", "Bran", "Rick", "Bran"));

        if (names.remove("Bran")) {
            names.remove("John");
        }
        System.out.println(names);      // [Robb, Rick, Bran]

        // ****************************************************************************************
    }
}
