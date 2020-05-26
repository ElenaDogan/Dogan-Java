package OOPC.Inheritance.Example_2;

public class Parent {
    String name;
    public Parent(){
        System.out.println("Parent class's constructor");
    }

    public Parent(String name){
        this.name = name;
    }
}

class Child extends Parent {
    public Child(){
        super();                        // super() should be first statement
        System.out.println("Child class's constructor");
    }

    public Child(int n){

    }
    public static void main(String[] args){
        new Child();
        System.out.println("Inside Main");
    }
}
