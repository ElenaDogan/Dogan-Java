package Interview_Question;
/*
   Write a method that can return the sum of the digits in a string

    SOLUTION
    1 - Convert string to charArray
    2 - Check if every char is a digit
    3 - If digit, convert to int ==> Integer.valueOf()
 */

public class String__Sum_of_Digits_in_a_String {
    public static void main(String[] args) {

        System.out.println(sumOfDigits1("a1b2c3"));          // 6
        System.out.println(sumOfDigits2("Today's date is 04/27/2020"));          // 17      (0+4+2+7+2+0+2+0=17)

    }
    // Solution 1
    public  static int  sumOfDigits1(String s) {
        char[] arr =  s.toCharArray();
        int sum = 0;
        for(char each: arr) {
            if(Character.isDigit(each)) {
                sum += Integer.valueOf(""+each);
            }
        }
        return sum;
    }
    // Solution 2
    public  static int  sumOfDigits2(String s) {
        char[] arr =  s.toCharArray();
        int sum = 0;
        for (char each : arr) {
            if (each >= 48 && each <= 57) {         // HINT: On ascii table, the characters between #48 ~ #57 are digits
                sum += Integer.parseInt("" + each);
            }
        }
        return sum;
    }
    // Solution 3
    public  static int  sumOfDigits3(String s) {
        char[] arr =  s.toCharArray();
        int sum = 0;
        for(char each: arr) {
            if (each >= (int)'0' && each <= (int)'9') {
                sum += Integer.valueOf("" + each);
            }
        }
        return sum;
    }
}
