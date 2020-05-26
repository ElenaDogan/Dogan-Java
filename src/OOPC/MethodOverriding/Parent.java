package OOPC.MethodOverriding;

public class Parent {

    public  void method(){
        System.out.println("Onur");
    }
}

class Child extends Parent {

    public void method(){
        System.out.println("Zarina");
    }

    public static void main(String[] args){
        Parent obj1 = new Parent();
        obj1.method();  // Onur

        Child obj2 = new Child();
        obj2.method(); // Zarina
    }
}
