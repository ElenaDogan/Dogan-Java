package Interview_Question;

public class String__Reverse {
    public static void main(String[] args) {

        System.out.println(StrReverse("kubilay"));
        System.out.println(Reverse("kubilay"));

    }

    // Solution 1
    public static String StrReverse(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.charAt(i);
        return  reverse;
    }

    // Solution 2
    public  static String Reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
