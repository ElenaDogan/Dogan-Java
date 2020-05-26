package Ders_Static.Example1;

import java.util.ArrayList;

public class HumanResources {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();

    static {
        employee1.setInfo("Zuleyha", 1254, 45874641, "QA", 110000, 'F');
        employee2.setInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
    }

    public static void main(String[] args) {
        System.out.println(employee1);      // Name: Zuleyha id: 1254 ssn: 45874641 Job Title: QA salary: 110000.0 gender: F
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

// or
        Employee employee5 = new Employee();
        employee5.setInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');

// create a List of Employees
        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee1 );  // 0
        list.add(HumanResources.employee2);  // 1

        System.out.println(list.get(0));
        System.out.println(list.get(1));


    }
}
