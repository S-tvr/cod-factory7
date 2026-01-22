package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch13.exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.exceptions.SsnNotValidException;

import javax.security.auth.login.AccountNotFoundException;

/**
 * Defines an {@link Account} class.
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    //default constructor
    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * Public api
     */


    /**
     * java doc γιατι θα το διαβασουν οι εξωτερικοι devs.
     *
     * Deposits a certain amount of money
     *
     * @param amount The amount of money to be deposited.
     * @throws Exception If the amount is negative.
     */
    public void deposit (double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
//                throw new Exception("The amount must not negative");
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            System.out.println("Amount" + amount + "successfully deposited");
        } catch (NegativeAmountException e) {
            System.out.println("Error. The amount " + amount + " can not be negative.");
//            e.printStackTrace();
            throw e;
        }
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Withdraws an amount of money form {@link Account}
     * based on a valid ssn checked  by {@link #isSsnValid(String)}
     * @param amount the amount to be withdrawn.
     * @param ssn the depositors ssn.
     * @throws Exception if the ssn is not valid or
     * the balance is not sufficiont or the amount is negative.
     */
    public void withdraw(double amount, String ssn)
            throws NegativeAmountException, InsufficientBalanceException, SsnNotValidException{
        try {
            if(!isSsnValid(ssn)) {
//                throw new Exception("Ssn" + ssn + "is not valid.");
                throw new SsnNotValidException(ssn);
            }

            if (amount > balance) {
//                throw new Exception("Insufficient balance." + balance);
                throw new InsufficientBalanceException(balance, amount);
            }

            if (amount < 0) {
//                throw new Exception("The amount must not negative");
                throw new NegativeAmountException(amount);
            }

            balance -= amount;
            System.out.println("Amount" + amount + "successfully withdrawn");

        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.err.println();
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the account.
     * @return The account's balance.
     */
    public double getAccountBalance () {
        System.out.println("The acount balanced was returned.");
        return getBalance();
    }

    /**
     * Returns the string of the {@lint Account} state.
     * @return
     */
    public String accountToString() {
        return "(" + id + "," + iban + "," + firstname + "," + lastname + "," + ssn + "," + balance + ")";
    }

}
