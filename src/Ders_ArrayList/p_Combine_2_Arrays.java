package Ders_ArrayList;

import java.util.ArrayList;

public class p_Combine_2_Arrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G", "H", "I"};

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i < arr1.length ; i++ ){
            list.add( arr1[i] );
        }

        for(String eachElement : arr2  ){
            list.add(eachElement);
        }

        System.out.println(list);               // [A, B, C, D, E, F, G, H, I]


    }
}
