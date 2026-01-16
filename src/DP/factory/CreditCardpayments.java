package DP.factory;

public class CreditCardpayments implements Payments {

    @Override
    public void pay(Double amount) {
        System.out.println("CC payments received "+amount);
    }
}

