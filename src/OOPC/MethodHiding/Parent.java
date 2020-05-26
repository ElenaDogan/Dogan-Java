package OOPC.MethodHiding;
/*
    Static methods cannot be overriden.
    When you define a static method with same signature as a static method
    in base class, it is known as method hiding.

 */


class Parent {

    static void m1(){
        System.out.println("Parent static m1()");
    }

    void m2(){                      // Non-static method can be overridden
        System.out.println("Parent non-static (instance) m2()");
    }
}

class Child extends Parent {

    static void m1(){                  // In that case the method of superclass is hidden by the subclass.
        System.out.println("Child static m1()");
    }

    @Override
    public void m2(){
        System.out.println("Child non-static(instance) m2()");
    }
}


class Main {
    public static void main(String[] args){

        Child.m1();                     // Child static m1()

        Child obj1 = new Child();
        obj1.m1();                      // Child static m1()
        obj1.m2();                      // Child non-static(instance) m2()


        Parent obj2 = new Child();
        obj2.m1();                      // Parent static m1
        obj2.m2();                      // Child non-static(instance) m2()



    }
}
