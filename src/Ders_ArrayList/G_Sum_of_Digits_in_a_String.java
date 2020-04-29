package Ders_ArrayList;

import java.util.Arrays;
/*
    Write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)

            HINT: On ascii table, the characters between #48 ~ #57 are digits
*/

public class G_Sum_of_Digits_in_a_String {
    public static void main(String[] args) {

        String str = "a1b2c3d4";
        char[] arr = str.toCharArray();         // [a, 1, b, 2, c, 3, d, 4]

        // We need to convert char to int and add it to sum

        int sum = 0;

        for (char each : arr) {
            if (each >= 48 && each <= 57) {
                sum += Integer.parseInt("" + each);
            }

            // OR
            if (each >= (int)'0' && each <= (int)'9') {
                sum += Integer.valueOf("" + each);
            }

            // OR       => isDigit(): identifies if the given character is digit    ****
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println(sum);        // 10 + 10 +10 = 30 (we did 3 loops)

    }
}
