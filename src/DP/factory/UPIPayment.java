package DP.factory;

public class UPIPayment implements Payments{
    @Override
    public void pay(Double amount) {
        System.out.println("UPI payment received "+amount);
    }
}
