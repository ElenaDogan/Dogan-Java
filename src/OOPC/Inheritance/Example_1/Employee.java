package OOPC.Inheritance.Example_1;

public class Employee {
    public double salary;
    public String name;
    public long id;
    public String jobTitle;
    public char gender;

    public void startWorking(){
        System.out.println("Started to work");
    }

    public String toString(){
        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: $"+salary+", ID: "+id+", Gender: "+gender;
    }
}
