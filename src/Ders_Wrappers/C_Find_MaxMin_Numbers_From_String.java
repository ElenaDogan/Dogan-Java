package Ders_Wrappers;

import java.util.Arrays;

public class C_Find_MaxMin_Numbers_From_String {
    public static void main(String[] args) {

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

    // WITHOUT USING SORT METHOD

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for(String each: arr){
            double number = Double.valueOf(each);
            if( number > max)
                max = number;
            if(number<min)
                min = number;
        }

        System.out.println("MIN is: " + min + ", MAX is: "+ max);           // MIN is: 1.0, MAX is: 4.5

    // USING SORT METHOD

        String[] arr2 = {"100", "1","2.5", "3", "3.5", "4.5", "55"};
        double[] numbers = new double[arr2.length];                         // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

        for(int i=0; i < arr2.length; i++){
            numbers[i] = Double.valueOf(arr2[i]);
        }
        Arrays.sort(numbers);
        System.out.println("Min: " + numbers[0]);                           // Min: 1.0
        System.out.println("Max: " + numbers[numbers.length-1]);            // Max: 100.0

// **********************************************************************

        int minNum = Integer.MIN_VALUE;
        int maxNum = Integer.MAX_VALUE;
        byte maxN = Byte.MAX_VALUE;      // 127
        byte minN = Byte.MIN_VALUE;      // -128
    }
}
