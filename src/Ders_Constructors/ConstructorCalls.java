package Ders_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        this(10);                   // this() can only be in the first line
        method1();
        System.out.println("3");
        method2();
        System.out.println("6");

    }

    public ConstructorCalls(String str) {
        this();                             // Calling the default constructor
        System.out.println("7");
    }

    public ConstructorCalls(int n) {
        // this(10);                        // A method or constructor cannot be called inside the same method
        System.out.println("1");
    }

    public static void method1() {
        System.out.println("2");
    }

    public void method2() {
        // this(10);                     // this() can be used only in contructors
        System.out.println("5");
    }

    public static void main(String[] args) {

        ConstructorCalls obj = new ConstructorCalls("yeni");

    }
}

