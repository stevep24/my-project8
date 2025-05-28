package gr.aueb.cf.ch15.custom_exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;


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

    //public API

    /**
     * Deposits a certain amount of money.
     * @param amount the amount of money to be deposited
     * @throws Exception if the amount is negative.
     */
    public void deposit(double amount) throws NegativeAmountException{

        try{
            if (amount < 0){
                throw new NegativeAmountException("Το ποσό "+ amount + "είναι αρνητικό");
            }
            balance += amount;

        } catch (NegativeAmountException e) {
            System.err.println(LocalDateTime.now() + "Amount= " + amount + " is not valid\n" + e);
            throw e;
        }
    }

    /**
     * Withdraws a specified amount of money from the account if the provided details are valid.
     *
     * @param amount the amount to be withdrawn
     * @param ssn the social security number of the account holder for validation
     * @throws NegativeAmountException if the specified amount is negative
     * @throws InsufficientBalanceException if the account balance is insufficient for the withdrawal
     * @throws SsnNotValidException if the provided SSN does not match the account holder's SSN
     */
    public void withdraw( double amount, String ssn) throws NegativeAmountException,InsufficientBalanceException,SsnNotValidException {
        try{
            if (amount < 0 ){
                throw new NegativeAmountException("Το Ποσό " + amount + "είναι αρνητικό");
            }

            if (amount > balance){
                throw new InsufficientBalanceException("Το υπόλοιπο " + amount + " δεν επαρκεί");
            }

            if (!isSsnValid(ssn)){
                throw new SsnNotValidException("Το ssn " + ssn + "δεν είναι έγκυρο");
            }
            balance -= amount;
        }catch (NegativeAmountException | SsnNotValidException | InsufficientBalanceException e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }

    /**
     * Returns the balance of the account.
     * @param balance
     * @return the {@link Account} balance.
     */
    public double getAccountBalance(double balance){
        return getBalance();

    }

    /**
     * Returns the {@link Account} state in String format.
     * @return the string-representation of the {@link Account}
     */
    public String accountToString(){
        return "(" + id + "," + firstname + "," + lastname + "," + ssn + "," + balance + ")";
    }
}
