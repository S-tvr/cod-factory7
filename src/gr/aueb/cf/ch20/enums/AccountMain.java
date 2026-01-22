package gr.aueb.cf.ch20.enums;

public class AccountMain {

    public static void main(String[] args) {
        AccountType accountType = AccountType.CURRENT;

        String strAccountType = accountType.name();                         // name is like toString
        System.out.println(strAccountType);

        AccountType accountType1 = AccountType.valueOf(strAccountType);    // static factory

    for (AccountType accType :AccountType.values()) {
        System.out.print(accType + " ");                        // string
        System.out.println(accType.ordinal());                  // ordinal
    }





    }
}
