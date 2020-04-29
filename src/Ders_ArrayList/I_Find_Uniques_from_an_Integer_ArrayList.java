package Ders_ArrayList;

import java.util.ArrayList;

public class I_Find_Uniques_from_an_Integer_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();               // [1, 2, 1, 3, 4]
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques =  new ArrayList<>();

        for(int i =0; i < list.size(); i++){
            int count = 0;
            for(Integer each  : list ){
                if(each == list.get(i) ){
                    count++;
                }
            }
            if(count == 1){
                uniques.add(list.get(i));
            }
        }

        System.out.println(uniques);                            // [2, 3, 4]

        // count >1 would find the duplicates
    }
}
