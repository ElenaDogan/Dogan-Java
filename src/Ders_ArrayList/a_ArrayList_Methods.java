package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a_ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(30, 20, 40, 50));
        // or
        ArrayList<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Lena");
        list.add("Kubilay");
        list.add(0, "Melisa");
        list.set(1, "Hidayet");         // update/change index 1
        Collections.sort(list);         // [Hidayet, Kubilay, Lena, Melisa]

        String str = list.get(1);
        System.out.println(list.get(2));

        int i1 = list.indexOf("Hidayet");       // 0
        int i2 = list.indexOf("Ayfer");         // -1
        int size = list.size();                 // 4
        boolean b = list.contains("Lena");      // true
        boolean c = list.isEmpty();             // false

        list.remove("Kubilay");             // delete "Kubilay"
        list.remove(1);                  // delete index 1

        // PRINT EACH ELEMENT
        for (String each : list) {
            System.out.println(each);
        }

        list.clear();                           // []

// *********************************************************************************************

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");
        list1.add("C");
        list1.add("B");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1); // list1: {A, B, C, D};
        Collections.sort(list2); // list2: {A. B, C, D};

        boolean k = list1.equals(list2);
        System.out.println(k);          // false ==> Bcos of 2 similar, but different objects

        list1.addAll(list2);            // ==> Adding list2 into list (it will add at the end)
        // list1.addAll(2, list2);         ==> Adding list2 into list starting from index 2

        System.out.println(list1);      // [A, B, C, D, A, B, C, D]

// *********************************************************************************************

        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add("A");
        lst1.add("D");
        lst1.add("C");
        lst1.add("B");

        ArrayList<String> lst2 = (ArrayList<String>) lst1.clone();
        System.out.println(lst1.equals(lst2));                        // true
// *********************************************************************************************

        ArrayList<Integer> liste1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        ArrayList<Integer> liste2 = liste1;
        list1.remove(2);
        System.out.println(liste1);          // [10, 20, 40]
        System.out.println(liste2);          // [10, 20, 40]


    }
}
