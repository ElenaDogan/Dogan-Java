package Ders_CustomClass.Example_1;
/*
    create a custom class for bank account
      attributes: accountholder, accountnumber, balance
      actions: checkingBalance(), withDraw(amount), deposit(amount)
     */

public class BankAccount {

    String accountHolder;       // instance variables are object variables, we can call them through the object name
    long accountNumber;
    double balance;


    public void checkingBalance() {
        System.out.println("Available Balance: " + balance);
    }

    public void withDraw(double amount) {
        System.out.println("Withdrawing $" + amount);
        balance -= amount;
    }

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount);
        balance += amount;
    }

    public String toString() {
        String result = "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAvailable Balance: " + balance;
        return result;
    }

    public static void main(String[] args) {
        int a = 100;  // local variable
    }

}
