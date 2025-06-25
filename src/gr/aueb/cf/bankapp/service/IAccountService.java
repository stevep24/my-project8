package gr.aueb.cf.bankapp.service;

import gr.aueb.cf.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.bankapp.exceptions.AccountNotFoundException;
import gr.aueb.cf.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.bankapp.exceptions.NegativeAmountException;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {

    boolean createNewAccount(AccountInsertDTO dto);
    // update, remove
    void deposit(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException;
    void withdraw(String iban, BigDecimal amount) throws NegativeAmountException, InsufficientBalanceException, AccountNotFoundException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAccounts();
    //more queries

}
