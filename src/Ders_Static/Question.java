package Ders_Static;

public class Question {

    static String name = "Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel");
    }

    public static void print(String str) {
        System.out.println(str);
    }

    static {
        print(name);
    }


}


/*
Output:
    Aaron       ==> static block comes first
    Daniel
 */