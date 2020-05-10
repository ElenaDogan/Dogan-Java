package Interview_Question;

// removeDup("AAABBBCCC")  ==> ABC

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String__RemoveDuplicates {
    public static void main(String[] args) {
        removeDup1("AAABBBCCC");
        removeDup2("AAABBBCCC");
    }

    // Solution 1:
    public static String removeDup1(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        return result;
    }

    // Solution 2:
    public static String removeDup2(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ","").replace("[","").replace("]","");
        return str;
    }
}
