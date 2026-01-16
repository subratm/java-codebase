package DP.factory;

public class MainClient {
    public static void main(String[] args) {
        Payments payments = PaymentFactory.getPayments("A");
        payments.pay(24578.90);
    }
}
