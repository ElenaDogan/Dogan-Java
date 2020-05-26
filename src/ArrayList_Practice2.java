import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 45, 67));

        // containsALL

        System.out.println(list1.contains(10));
        System.out.println(list1.contains(20));

        System.out.println(list1.containsAll(Arrays.asList(10,67,30 )));        // true


        // removeAll
        System.out.println(list1.removeAll(Arrays.asList(10,67,30 )));          // true
        System.out.println(list1);          // [20, 45]
        System.out.println(list1.removeAll(Arrays.asList(99,55)));


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("AAA");
        list2.add("AAA");
        list2.add("BBB");
        list2.add("ccc");
        list2.add("AAA");
        list2.add("KKK");
        list2.add("AAA");

        System.out.println(list2);                      // [AAA, AAA, BBB, ccc, AAA, KKK, AAA]
        list2.remove("AAA");
        System.out.println(list2);                      // [AAA, BBB, ccc, AAA, KKK, AAA]
        list2.removeAll(Arrays.asList("AAA"));
        System.out.println(list2);                      // [BBB, ccc, KKK]


     // retainAll

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("AAA");
        list3.add("AAA");
        list3.add("BBB");
        list3.add("ccc");
        list3.add("AAA");
        list3.add("KKK");
        list3.add("AAA");

        list3.retainAll(Arrays.asList("AAA"));
        System.out.println(list3);                      // [AAA, AAA, AAA, AAA]

    }
}
