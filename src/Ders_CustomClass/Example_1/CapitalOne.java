package Ders_CustomClass.Example_1;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Anna = new BankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        Anna.deposit(100);          // Depositing $100.0
        Anna.withDraw(40);          // Withdrawing $40.0
        Anna.checkingBalance();             // Available Balance: 60.0

        System.out.println(Anna);           // Account Holder: Anna
                                            // Account Number: 123456
                                            // Available Balance: 60.0


    }

}
