package Ders_CustomClass;

public class BankAccount {

    public String firstName;
    public String lastName;

    private String accountHolder;

    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName+" "+lastName;            // ****
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    // ...

    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount("Irina", "Li");
        System.out.println( customer1.getAccountHolder() );

    }
}
