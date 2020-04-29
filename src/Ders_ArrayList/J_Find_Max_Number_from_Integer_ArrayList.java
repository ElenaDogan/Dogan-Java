package Ders_ArrayList;

import java.util.ArrayList;

public class J_Find_Max_Number_from_Integer_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-100);
        list.add(-20);
        list.add(-300);
        list.add(-400);
        list.add(-50);
        list.add(-700);
        list.add(-800);

        System.out.println(max(list));          // -20
    }


    public static int max(ArrayList<Integer> list){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > maximum ){
                maximum = list.get(i);
            }
        }
        return maximum;
    }
}
