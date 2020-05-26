package Ders_Static;

public class Blocks_1 {
    static int staticVariable = 300;
    int instancevariable = 400;

    {
        System.out.println("This is an Instance block");
    }

    static {
        System.out.println("This is a static block");
    }
    static {
        System.out.println("This is a static block2");
    }

    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public void instanceMethod() {
        System.out.println("This is an instance method");
    }


    public static void main(String[] args) {
        Blocks_1 obj = new Blocks_1();
        Blocks_1 obj2 = new Blocks_1();
        Blocks_1 obj3 = new Blocks_1();
        System.out.println(obj.instancevariable);
        System.out.println(obj.staticVariable);

        /*
        Output:
            This is a static block
            This is a static block2
            This is an Instance block
            This is an Instance block
            This is an Instance block
            400
            300

         RULE: (1) Whenever an instance is created, instance block will be executed
               (2) Static block will be executed only once, when we the class is loaded (when we run the program)
               (3) You can have more than one static blocks.
               (4) To execute instance block, you need to create an object. But for static block you don't need it.
               (5) Static blocks executed first
         */
    }




}
