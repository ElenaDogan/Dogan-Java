package OOPC.Inheritance.Example_1;

public class Main {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Hilal", 120005, 456, "QA", 'F' );
        tester1.reporting();

        Developer dev1 = new Developer(120000,"Namik",123,"Software Developer", 'M');
        dev1.fixingBug();

        System.out.println( dev1 );
        System.out.println( tester1 );

    }
}
