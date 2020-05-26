package Ders_Constructors;

public class Employee {

    String name;
    String jobTitle;
    long id;
    double salary;

    static String companyName = "BOA";

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);         //  this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, long id) {
        this(name, jobTitle);
        //this.name = name;
        //this.jobTitle = jobTitle;
        this.id = id;
    }

    public Employee(String name, String jobTitle, long id, double salary) {
        this(name, jobTitle, id);
        this.salary = salary;
    }

}
