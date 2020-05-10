package Ders_CustomClass.Example_4;

public class Employee {

    String name;                // Instance variable
    int age;
    public String title;
    static String company;      // class variable  ==> common value for objects

    // The toString() method returns the string representation of the object.
    //If you print any object, java compiler internally invokes the toString()
    //method on the object.

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", title='" + title + '\'' +
                '}';
    }



    // constructor
    public Employee(){
    }

    public Employee(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    public Employee(String isim, int yas) {
        name = isim;
        this.age = yas;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Employee employee_1 = new Employee();
        Employee employee_2 = new Employee();

        // 1.way
        employee_1.name = "John";
        employee_1.age = 30;
        employee_1.title ="QA";

        // 2.way
        employee_2.setName("Kubilay");

        //******
        System.out.println(employee_1.name);
        System.out.println(employee_2.getName());

        System.out.println(employee_1);     // Employee{name='John', age=30, title='QA'}
        System.out.println(employee_2);     // Employee{name='Kubilay', age=0, title='null'}

        // *****************

        // 3th way
        Employee employee_3 = new Employee("Lena", 18 ,"Tester");
        Employee employee_4 = new Employee("Savas", 25);





    }
}
