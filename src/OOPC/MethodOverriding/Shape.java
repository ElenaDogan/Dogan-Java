package OOPC.MethodOverriding;

public class Shape {

    public void calculateArea(int length, int width) {
        System.out.println("Area = " + (length * width));
    }

    public void print() {
        System.out.println("This is a shape");
    }
}

 class Rectangle extends Shape {
 //   @Override
    public void calculateArea(int r) {
        System.out.println("Area = " + (3.14*r*r));
    }

    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.calculateArea(5, 6);

        Rectangle obj2 = new Rectangle();
        obj2.calculateArea(4);
        obj2.print();
    }
}

/*
    @Override is an annotation
    The @Override annotation indicates that the child class method is over-writing its base class method.

    The @Override annotation can be useful for two reasons
        (1) It extracts a warning from the compiler if the annotated method doesn't actually override anything.
        (2) It can improve the readability of the source code.

    Overriding
    When a method in a subclass has the same name, same parameters or signature, and same return type
    as a method in its super-class, then the method in the subclass is said to override the method in
    the super-class.

    Method overriding is one of the way by which java achieve Run Time Polymorphism.
    The version of a method that is executed will be determined by the object that is used to invoke it.
    If an object of a parent class is used to invoke the method, then the version in the parent class
    will be executed, but if an object of the subclass is used to invoke the method, then the version in
    the child class will be executed. In other words, it is the type of the object being referred to
    (not the type of the reference variable) that determines which version of an overridden method will
    be executed.

 */