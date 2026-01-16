package DP.factory;

public class DebitCardPayments implements Payments{
    @Override
    public void pay(Double amount) {
        System.out.println("DC payment receive "+amount);
    }
}
