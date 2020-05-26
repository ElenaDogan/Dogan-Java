import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Practice {
    public static void main(String[] args) {
        // Cat cat1 = new Cat();

        String[] arr = {"AAA", "BBB", "ccc", "KKK"};
        System.out.println(Arrays.toString(arr));               // [AAA, BBB, ccc, KKK]
        System.out.println(arr[2]);
        System.out.println(arr.length);

    // *******************************************************************
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("AAA");
        list1.add("BBB");
        list1.add("ccc");
        list1.add("KKK");
        System.out.println(list1);                   // [AAA, BBB, ccc, KKK]

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);                  // [AAA, BBB, ccc, KKK]

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("AAA", "BBB", "ccc", "KKK"));
        System.out.println(list3);                  // [AAA, BBB, ccc, KKK]

    // *******************************************************************

        list1.add("22");
        list1.add(3, "HHH");            // [AAA, BBB, ccc, HHH, KKK, 22]
        list1.set(3,"JJJ");                           // [AAA, BBB, ccc, JJJ, KKK ,22]
        Collections.sort(list1);                      // [22, AAA, BBB, JJJ, KKK, ccc]    ==> Digits>Uppercase>Lowercase
        System.out.println(list1.get(2));             // BBB

        String str = list1.get(3);

        int n = list1.indexOf("JJJ");                   // 3
        int M = list1.indexOf("ppp");                   // -1
        System.out.println(list1.indexOf("zzz"));       // -1

        int s = list1.size();

        boolean b = list1.contains("LLL");              // false
        boolean c = list1.isEmpty();                    // false

        list1.remove(1);
        list1.remove("22");                            // [BBB, JJJ, KKK, ccc]

        System.out.println(list1);

    // *******************************************************************

        for (String each:list1) {
            System.out.println(each);
        }

        list1.clear();
        System.out.println(list1);          // []

        list2.addAll(list3);                    // en sona ekler
        System.out.println(list2);             // [AAA, BBB, ccc, KKK, AAA, BBB, ccc, KKK]
        list2.addAll(2,list3);             // 2.indekse kopyala


    }
}
