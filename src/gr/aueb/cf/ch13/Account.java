package gr.aueb.cf.ch13;

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
    public void deposit(double amount) throws Exception{

        try{
            if (amount < 0){
                throw new Exception("negative amount is not valid");
            }
            balance += amount;

        } catch (Exception e) {
            System.err.println("Negative amount = " + amount + " is not valid");
            throw e;
        }
    }
}
