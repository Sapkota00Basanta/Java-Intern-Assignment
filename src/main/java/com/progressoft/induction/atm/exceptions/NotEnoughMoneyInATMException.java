package com.progressoft.induction.atm.exceptions;

public class NotEnoughMoneyInATMException extends RuntimeException {
    public static boolean checkAtmBalance(double withdrawAmount) {
        double firstAtmBalance = 10;
        double secondAtmBalance = 20;
        double thirdAtmBalance = 100;
        double fourthAtmBalance = 100;

        if(withdrawAmount <= firstAtmBalance) {
            return true;
        } else if(withdrawAmount <= secondAtmBalance) {
            return true;
        } else if(withdrawAmount <= thirdAtmBalance) {
            return true;
        } else if(withdrawAmount <= fourthAtmBalance) {
            return true;
        } else {
            return false;
        }
    }
}
