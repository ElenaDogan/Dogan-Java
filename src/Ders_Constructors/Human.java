package Ders_Constructors;

public class Human {

    int age;             // instance variable
    String name;         // instance variable

    // Constructor overloading ************************
    public Human(){                 // constructor
        System.out.println("This is a new object");
    }

    public Human(int age){           // constructor
        this("Lena");           // this("Lena) = Human(String name)
        this.age = age;
    }

    public Human(String name){           // constructor
        this();                         // this() = Human()
        this.name = name;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    // *************************************************

    public int Human(){            // custom method

        return 10;
    }

    public static void main(String[] args) {

        Human Safia = new Human();
        Safia.age = 25;
        Safia.name = "Safia";
        System.out.println(Safia.age);


//        Human person = new Human(28);
//        System.out.println(person.name);

        Human employee = new Human("Ali");







    }
}
