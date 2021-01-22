package com.progressoft.induction.atm;

import com.progressoft.induction.atm.exceptions.AccountNotFoundException;

public interface BankingSystem {
    public static boolean getAccountBalance(double withdrawAmount) {
        double firstAccountBalance = 1000.0;
        double secondAccountBalance = 1000.0;
        double thirdAccountBalance = 1000.0;
        double fourthAccountBalance = 1000.0;
        double fifthAccountBalance = 1000.0;

        if (AccountNotFoundException.accountsValidation(123456789)) {
            System.out.println("You have sufficient Funds");
            firstAccountBalance -= withdrawAmount;
            return true;
        } else if (AccountNotFoundException.accountsValidation(111111111)) {
            System.out.println("You have sufficient Funds");
            secondAccountBalance -= withdrawAmount;
            return true;
        } else if (AccountNotFoundException.accountsValidation(222222222)) {
            System.out.println("You have sufficient Funds");
            thirdAccountBalance -= withdrawAmount;
            return true;
        } else if (AccountNotFoundException.accountsValidation(333333333)) {
            System.out.println("You have sufficient Funds");
            fourthAccountBalance -= withdrawAmount;
            return true;
        } else if (AccountNotFoundException.accountsValidation(444444444)) {
            System.out.println("You have sufficient Funds");
            fifthAccountBalance -= withdrawAmount;
            return true;
        } else {
            System.out.println("You have insufficient funds");
            return false;
        }
    }
}
