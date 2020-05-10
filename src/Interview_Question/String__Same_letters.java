package Interview_Question;

import java.util.Arrays;
import java.util.TreeSet;

/*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
 */

public class String__Same_letters {
    public static void main(String[] args) {

        same("abc",  "cab");
        same("abc",  "abb");

    }

    // Solution 1:

    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s="", t="";

        for(char each: ch1){
            s +=each;
        }
        for(char each: ch2) {
            t += each;
        }
        return  s.equals(t) ;
    }

}
