package Interview_Question;

// FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String__FrequencyOfChars {
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars1("AAABBCDD"));
        System.out.println(FrequencyOfChars2("AAABBCDD"));
        System.out.println(FrequencyOfChars3("AAABBCDD"));
        System.out.println(FrequencyOfChars4("AAABBCDD"));


    }

    // solution 1:
    public static String FrequencyOfChars1(String str) {
        String nonDup="", result="";
        for(int i=0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for(int i=0; i < nonDup.length(); i++) {
            int count = Collections.frequency(list,""+nonDup.charAt( i ));
            result += ""+nonDup.charAt(i) + count;
        }
        return result;

    }

    // solution 2:
    public static String FrequencyOfChars2(String str) {

        String nonDup = "";
        for (int i = 0; i < str.length(); i++){
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += ""+str.charAt(i);                 // nonDup = ABCD
        }

        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

    // solution 3:
    public static String FrequencyOfChars3(String str) {

        String expectedResult = "";
        int n=0;
        while( n < str.length()) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(n)) {
                    count++;
                }
            }
            expectedResult +=str.charAt(n)+"" + count;
            str = str.replace(""+str.charAt(n), "");
        }
        return expectedResult;
    }

    // solution 4:
    public  static  String  FrequencyOfChars4(String str) {

        String s = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        s = s.replace(", ","").replace("[","").replace("]","");

        String result="";
        for(int i=0; i<s.length();i++) {
            int count=0;
            for(int j=0; j<str.length(); j++)
                if(str.charAt(i) == str.charAt(j))
                    count++;
            result+=""+str.charAt(i)+count;
        }
        return result;
    }
}
