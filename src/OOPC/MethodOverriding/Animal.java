package OOPC.MethodOverriding;

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
}
// ***************************************************

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }

    public void bark() {
        System.out.println("I can bark");
    }
}
// ***************************************************
class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.displayInfo();
        dog1.eat();
        dog1.sleep();
        dog1.bark();
    // objects of the Dog class can access the members of both the Dog class and the Animal class.

        Animal dog2 = new Dog();
        dog2.displayInfo();

//        Dog d3 = new Animal();      // ERROR
//        d3.displayInfo();
    }
}
