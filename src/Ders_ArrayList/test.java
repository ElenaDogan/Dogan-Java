package Ders_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Lena");
        list.add("Melisa");
        list.add("Hido");
        list.add("Lena");

        if(list.remove("Lena")){
            list.remove("Kubilay");
        }
        System.out.println(list);


        // *****************************************

        ArrayList<String> list2 = new ArrayList<>();
        Integer a = 1;
        list.remove(a);
        System.out.println( list.remove(a) );           // false ==> remove(Object) return boolean

        // *****************************************

        ArrayList<String> lst = new ArrayList<>();
        lst.add(0, "Lena");
        lst.add(1,"");
        lst.add(2, "Kubi");      // ==> IndexOutOfBoundsException  without add(1,"")

        System.out.println(lst);
    }
}
