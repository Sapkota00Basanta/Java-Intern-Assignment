package com.progressoft.induction.atm.exceptions;

public class InsufficientFundsException extends RuntimeException{

    public static boolean checkAvailableFunds(double withdrawAmount) {
        if (withdrawAmount <= 1000.0) {
            return true;
        } else {
            return false;
        }
    }
}
