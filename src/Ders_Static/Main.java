package Ders_Static;

public class Main {

    static class NestedClass{
        static int a = 100;
        static int b = 300;
    }

    public static void main(String[] args) {

        System.out.println( Main.NestedClass.a );
    }
}
