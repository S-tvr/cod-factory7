package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, "GR123", "Nikos", "Eleyueriou", "S123", 1000);


        try {
            account.deposit(900);
            System.out.println("The deposit was succesfull");

            account.withdraw(100, "S123");
            System.out.println("The withdrawal was successful");

            account.getAccountBalance();
            System.out.println("Account balance is: " + account.getAccountBalance());

            System.out.println("Account state: " + account.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
