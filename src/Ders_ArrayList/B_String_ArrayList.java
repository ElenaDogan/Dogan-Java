package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class B_String_ArrayList {
    public static void main(String[] args) {

        String[] arr = {"Sunday", "Monday", "Tuesday","Wednesday"};

        ArrayList<String> lst = new ArrayList<>();
        lst.add("Zero");
        lst.add("One");
        lst.add("Two");
        lst.add("Three");
        lst.add("Five");

        // Array vs ArrayList
        System.out.println(lst);                    // [Zero, One, Two, Three, Five]
        System.out.println(Arrays.toString(arr));   // [Sunday, Monday, Tuesday, Wednesday]

        System.out.println(arr[0]);
        System.out.println(lst.get(0));

        // **********************************************************************

        lst.set(4, "Four");
        System.out.println(lst);                    // [Zero, One, Two, Three, Four]
        lst.remove(4);
        System.out.println(lst);                    // [Zero, One, Two, Three]
        lst.remove("Three");
        System.out.println(lst);                    // [Zero, One, Two]

        int size = lst.size();                      // size = 3

        lst.clear();
        System.out.println(lst);                    // []
        System.out.println(lst.size());             // 0
    }
}
