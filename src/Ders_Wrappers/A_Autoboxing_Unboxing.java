package Ders_Wrappers;

import java.util.ArrayList;

public class A_Autoboxing_Unboxing {
    public static void main(String[] args) {
/*
        Primitive Data Type             Wrapper Class
                int                         Integer
                char                        Character
                byte                        Byte
                short                       Short
                long                        Long
                double                      Double
                boolean                     Boolean
                        --> autoboxing -->
                        <-- unboxing <----
     Autoboxing: Automatic conversion of primitive types to the object
     of their corresponding wrapper classes is known as autoboxing.

     For example – conversion of int to Integer, long to Long, double to Double etc.
 */

        int a = 100;
        Integer b = a;          // Auotoboxing

        char ch = 'L';
        Character c = ch;       // Auotoboxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);      // ==> autoboxing ==> int to Integer

//  Unboxing: utomatically converting an object of a wrapper class to its
//  corresponding primitive type is known as unboxing.

        Byte byte1 = 98;

        byte b2 = byte1;        // unboxing
        short short1 = byte1;   // unboxing
        int int1 = byte1;       // unboxing

        int num = arrayList.get(0);
        // unboxing because get method returns an Integer object
    }
}
