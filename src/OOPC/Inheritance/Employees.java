package OOPC.Inheritance;

class Employees {
    public static int base = 10000;
    int salary(){
        return base;
    }
}

class Manager extends Employees{
    @Override
    int salary(){                       // This method overrides salary() of Parent
//        return base+20000;
        return 30000;
    }
}

class Main {

    static void printSalary(Employees e){
        System.out.println(e.salary());
    }

    public static void main(String[] args){
        Employees obj1 = new Manager();
        System.out.print("Manager's salary : ");
        printSalary(obj1);


    }
}
