package com.progressoft.induction.atm.exceptions;

public class AccountNotFoundException extends RuntimeException {

    public static boolean accountsValidation(long accountNumber) {
        if(
                (accountNumber != 123456789) ||
                (accountNumber != 111111111) ||
                (accountNumber != 222222222) ||
                (accountNumber != 333333333) ||
                (accountNumber != 444444444)
        )
        {
            System.out.println("You have an invalid account number");
            return false;
        } else {
            System.out.println("You have a valid account number.");
            return true;
        }
    }
}
