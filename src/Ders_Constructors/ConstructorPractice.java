package Ders_Constructors;

public class ConstructorPractice {

    public ConstructorPractice() {
        this(10.0);                          // 1
        System.out.println("A");                // 2
    }

    public ConstructorPractice(int a) {
        this();                                 // this() = ConstructorPractice()
        System.out.println("B");                // 3

    }

    public ConstructorPractice(double a) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorPractice(10);
    //  ConstructorPractice yeni = new ConstructorPractice(10);

    }
}

