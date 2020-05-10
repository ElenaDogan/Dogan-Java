package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class c_Bulk_methods {
    public static void main(String[] args) {


        // ******* ******* addAll ******* *******\\

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(30);
        list1.add(20);
        list1.add(40);

        Integer[] arr1 = {50, 45, 35};
        list1.addAll(Arrays.asList(arr1));
        list1.addAll(Arrays.asList(70, 80, 90));
        System.out.println(list1);                  // [30, 20, 40, 50, 45, 35, 70, 80, 90]

        //  int[] arr1 = { 30, 20, 40 };  // arraylist does not support primitives

        // ***********************************************************************

        String[] names = {"Murtaza", "Muhtar", "Muhesong", "Sada", "Rustem"};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        // or

        ArrayList<String> nameList2 = new ArrayList<>(Arrays.asList(names));


        // ******* ******* containsAll ******* *******\\

        boolean r1 = list1.contains(10);
        boolean r2 = list1.contains(20);
        boolean r3 = list1.contains(70);
        boolean result1 = r1 == true && r2 == true && r3 == true;
        System.out.println(result1);

        boolean result = list1.containsAll(Arrays.asList(10, 20, 70));               // *** <<===
        System.out.println(result);     // true

        Integer[] data = {10, 30, 40};
        boolean result2 =  list1.containsAll( Arrays.asList(data)  );
        System.out.println(result2);

        // ******* ******* removeAll ******* *******\\

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,3,3,3,3,3,3,3));

        // remove all 1, 3, 5, 8
/*
                Integer a = 1;
                list.remove(a);
                list.remove(a);
                ...
                Integer b = 3;
                list.remove(b);
                list.remove(b);
 */
        //  list.removeAll( Arrays.asList(3,1,5,8)  );
        // or
        Integer[] arr ={1,3,5,8};
        list.removeAll( Arrays.asList(arr) );
        System.out.println(list);                   // [2, 4, 6, 7]


        // remove all Ahmed's
        String[] namess = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameListt = new ArrayList<>( Arrays.asList(namess) );
        nameList.removeAll(  Arrays.asList("Ahmed")  );
        System.out.println(nameListt);                      // [John, Aaron, Daniel]


        // ******* ******* retainAll ******* *******\\

        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll( Arrays.asList(1,2,3,4,5,6,1,2,3) );

        lst.retainAll( Arrays.asList(1,2,3) );
        //{4,5,6}, {1,2,3, 1,2,3}

        System.out.println(lst);       // [1, 2, 3, 1, 2, 3]
    }
}
