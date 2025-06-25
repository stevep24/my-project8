package gr.aueb.cf.bankapp.mapper;

import gr.aueb.cf.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.bankapp.model.Account;

public class Mapper {
    /**
     * No instances of this class sould be available
     */
    private Mapper(){

    }

    public static Account mapToModelEntity(AccountInsertDTO dto){
        return new Account(dto.getIban(), dto.getBalance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDto(Account account){
        return new AccountReadOnlyDTO(account.getIban(),account.getBalance());
    }
}
