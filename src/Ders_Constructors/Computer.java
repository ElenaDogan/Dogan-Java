package Ders_Constructors;

public class Computer{

    private String brand;

    public Computer(){
        this("Apple");
    }
    public Computer(String brand) {
        this.brand = brand;
    }

    public void sayHi(){
        System.out.println("Hi");
    }


    public static void main(String[] args) {

        Computer a = new Computer("Samsung");
        Computer b = new Computer("Nokia");
        Computer c = new Computer();
    }
}

