package com.progressoft.induction.atm;

import com.progressoft.induction.atm.exceptions.AccountNotFoundException;
import com.progressoft.induction.atm.exceptions.InsufficientFundsException;
import com.progressoft.induction.atm.exceptions.NotEnoughMoneyInATMException;

public interface ATM {

    public static void withdraw(long accountNumber, double withdrawAmount) {
        if(
                (AccountNotFoundException.accountsValidation(accountNumber)) &&
                (InsufficientFundsException.checkAvailableFunds(withdrawAmount))) {
            BankingSystem.getAccountBalance(withdrawAmount);
            if (NotEnoughMoneyInATMException.checkAtmBalance(withdrawAmount)) {
                System.out.println("The Withdraw Amount is " + withdrawAmount);
            }
        }
    }
}
