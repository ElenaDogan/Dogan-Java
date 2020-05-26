package Ders_Static;

public class Blocks_2 {

    public Blocks_2() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }


    public static void main(String[] args) {

        Blocks_2 obj = new Blocks_2();

    }

}

/*
        Static block
        Instance block
        Constructor
 */