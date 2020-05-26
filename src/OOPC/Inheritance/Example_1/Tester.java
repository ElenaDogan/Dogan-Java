package OOPC.Inheritance.Example_1;

public class Tester extends Employee {

    /*
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
     */

    public Tester(String name,double salary, long id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void reporting(){
        System.out.println(name+" is reporting a bug");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }

    public static void main(String[] args) {

        Tester tester1 = new Tester("Hilal", 120005, 456, "QA", 'F' );
        tester1.reporting();
        tester1.startWorking();
        System.out.println(tester1);
    }
}
