package Ders_ArrayList;

/*
    Write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3d4"
                output: 1234  and abcd
*/

public class H_Remove_Digits_in_a_String {
    public static void main(String[] args) {

        String str = "a1b2c3d4";
        char[] arr = str.toCharArray();

        String digits = "";
        String letters = "";

        for (char each : arr) {
            if (Character.isDigit(each)) {
                digits += "" + each;
            }
            if (Character.isAlphabetic(each)) {
                letters += "" + each;
            }
//           else{
//               letters += "" + each;
//           }
        }

        System.out.println(digits);
        System.out.println(letters);

        boolean a = Character.isAlphabetic('A');  // identifies if the character is alphabet


    }
}
