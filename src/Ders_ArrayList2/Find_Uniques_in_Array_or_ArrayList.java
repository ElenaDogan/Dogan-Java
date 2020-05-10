package Ders_ArrayList2;

// write a program that can return the unique objects from arraylist of characters

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_Uniques_in_Array_or_ArrayList {
    public static void main(String[] args) {

        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> list = new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character> result = new ArrayList<>();

        for(Character each: list ){
            int count = Collections.frequency(list, each);
            if(count == 1){
                result.add( each );
            }

        }
        System.out.println(result);     // [B, C]

        // ************************************************************

        String[] s = {"A","A","B","C","D","D"};

        ArrayList<String> lst = new ArrayList<>(Arrays.asList(s));
        ArrayList<String> uniques = new ArrayList<>();

        for(String e: lst ){
            int n = (Collections.frequency(lst, e));
            if(n == 1){
                uniques.add( e );
            }
        }
        System.out.println(uniques);    // [B, C]
    }
}
