package Interview_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Notes {
    public static void main(String[] args) {

        String str = "america";

        // String to Array
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));           // [a, m, e, r, i, c, a]

        // String to Char Array
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));           // [a, m, e, r, i, c, a]

        // Array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        // String to ArrayList
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(str.split("")));

        // String to LinkedHashSet
        LinkedHashSet<String> hset = new LinkedHashSet<>(Arrays.asList(str.split("")));

        // ArrayList to String
        String t = list.toString();             // t = "[a, m, e, r, i, c, a]"

        // LinkedHashSet to String *** Used to get the unique characters
        String v = hset.toString();             // v = "[a, m, e, r, i, c]"
                                                // LinkedHashSet doesn't hold duplicate values

        // String to LinkedHashSet to String *** Used to get the unique characters
        String r = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        r = r.replace(", ","").replace("[","").replace("]","");
        // r ="americ"

        // String to TreeSet to String *** Used to find out if 2 String contains same characters
        String n = "america";
        String m = "ceriamaaaa";
        String str1 = new TreeSet<String>(Arrays.asList(n.split(""))).toString( );      // [a, c, e, i, m, r]
        String str2 = new TreeSet<String>(Arrays.asList(m.split(""))).toString( );      // [a, c, e, i, m, r]
        System.out.println(str1.equals(str2));      // true


        // String to StringBuffer
        StringBuffer sb = new StringBuffer(str);

    }
}
