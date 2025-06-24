package gr.aueb.cf.bankapp.exceptions;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {

      super(message);
    }
}
