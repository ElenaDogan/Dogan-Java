package Ders_ArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Frequency {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("code");
        list.add("code");
        list.add("quiz");
        list.add("code");

        int n = Collections.frequency(list, "code");
        System.out.println(n);      // 3

    }
}
