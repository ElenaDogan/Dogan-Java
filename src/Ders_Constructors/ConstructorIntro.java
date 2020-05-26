package Ders_Constructors;

public class ConstructorIntro {

    int number = 10;

    public ConstructorIntro(){
    }
    // This is an "empty" constructor.
    // If we don't create any constructor, Java use this constructor by default.


    public ConstructorIntro(int a) {
        this.number=a;
    }

    public static void main(String[] args) {

        ConstructorIntro obj1 = new ConstructorIntro();
        ConstructorIntro obj2 = new ConstructorIntro(25);

        System.out.println(obj1.number);            // 10
        System.out.println(obj2.number);            // 25

        obj1.number = 30;
        System.out.println(obj1.number);            // 30

        // staic  int number = 10; DENE

    }
}
