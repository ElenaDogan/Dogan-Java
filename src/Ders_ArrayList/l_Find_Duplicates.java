package Ders_ArrayList;

 /*
    write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]

			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]

     */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class l_Find_Duplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "B", "C", "D", "D"));
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
//            int count = 0;
//            for (String each : list) {
//                if (each.equals(list.get(i))) {
//                    count++;
//                }
//            }
            int count = Collections.frequency(list, list.get(i) );
            if (count > 1 && !result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }

        System.out.println(result);         // [B, D]

    }
}
