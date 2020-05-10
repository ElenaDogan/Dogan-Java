package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class o_CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);            // 8
        int min = Collections.min(list);            // 1

        Collections.reverse(list);
        System.out.println(list);                   // [8, 7, 6, 5, 4, 3, 2, 1]

        Collections.swap(list, 0, 7);          // [1, 7, 6, 5, 4, 3, 2, 8]
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);                   // [7, 1, 6, 5, 4, 3, 2, 8]     ==> When you run. you get different result everytime

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};       ==> output: 7


            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};         ==> output: 2

         */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));
        Integer maxNum = Collections.max(numbers);          // 8
        numbers.removeAll(Arrays.asList(maxNum));
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);                      // 7

        Integer minNum = Collections.min(list);             // 1

        list.removeAll(Arrays.asList(minNum));
        int secondMin = Collections.min(list);
        System.out.println(secondMin);                      // 2

        System.out.println("==========================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));

        Collections.replaceAll(names, "Omer", "Irina");
        System.out.println(names);                          // [Irina, Irina, Mary, Sha, Fatih, Irina]


    }
}
