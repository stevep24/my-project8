package gr.aueb.cf.bankapp.validation;

import gr.aueb.cf.bankapp.dto.AccountInsertDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    private Validator(){

    }

    public static Map<String , String> validate(AccountInsertDTO dto) {
        Map<String, String> errors = new HashMap<>();

        if (dto.getIban() == null || dto.getIban().trim().length() < 5) {
            errors.put("iban", "Το Iban δεν μπορεί να είναι κάτω απο 5 ψηφία ");
        }

        if (dto.getBalance() == null || dto.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το αρχικό υπόλοιπο δεν μπορεί να είναι αρνητικό");
        }
        return errors;

    }
}
