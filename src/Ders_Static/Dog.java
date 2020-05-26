package Ders_Static;

public class Dog {

    String breed;
    static boolean isPet;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet =  true;

        Dog dog2 = new Dog();
        System.out.println( dog2.isPet);            // true

    }
}
