package Ders_ArrayList;
import java.util.ArrayList;
/*
    write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
*/
public class D_Reverse_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            list.add(i);
        }

        System.out.println(list);                               //[1, 2, 3, 4, 5]

        ArrayList<Integer> reversedList = new ArrayList<>();
        for( int i = list.size()-1;  i >= 0; i--){
            reversedList.add( list.get(i) );
        }
        System.out.println(reversedList);                       // [5, 4, 3, 2, 1]
    }
}
