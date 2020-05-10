package Ders_CustomClass.Example_3;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Cesur");
        dog1.setColor("White");
        dog1.age= 4;

        System.out.println(dog1.getName());     // getters return a value
        System.out.println(dog1);   // Dog{breed='null', age=4, color='White', name='Cesur'}
    }
}
