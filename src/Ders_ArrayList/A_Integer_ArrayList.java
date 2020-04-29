package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class A_Integer_ArrayList {
    public static void main(String[] args) {
    // **********************************************************************
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(1, 6);

        System.out.println(list);       // [5, 6, 7, 8]
        list.set(3, 9);
        System.out.println(list);       // [5, 6, 7, 9]
   //   list.remove(9);                 // IndexOutOfBoundsException
        list.remove(3);
        System.out.println(list);       // [5, 6, 7]

    // IF WE WANT TO REMOVE AN INTEGER DIRECTLY, WE SHOULD USE AN INTEGER
        Integer i = 7;
        list.remove(i);
        System.out.println(list);       // [5, 6]
        list.remove(new Integer(6) );
        System.out.println(list);       // [5]

    // ALSO NOTE:
        Integer n = 50;
        Integer m = 5;
        boolean b1 = list.remove(n);    // b1 = false
        boolean b2 = list.remove(m);    // b1 = true        ==> transaction successful
        System.out.println(list);       // []


    // **********************************************************************

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        //{1,1,2,3}

        int num1 = list2.indexOf(1);
        System.out.println(num1);           // 0        ==> The first 1

        int num2 =  list2.indexOf(2);
        System.out.println(num2);           // 2

        int num3 = list2.indexOf(22);
        System.out.println(num3);           // -1       ==> If not exist, answer is -1



    // **********************************************************************

    }
}
