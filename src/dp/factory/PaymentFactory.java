package dp.factory;

public class PaymentFactory {

    public static Payments getPayments(String type){

        if("UPI".equalsIgnoreCase(type)){
            return new UPIPayment();
        }
        if("CC".equalsIgnoreCase(type)){
            return new CreditCardpayments();
        }
        if("DC".equalsIgnoreCase(type)){
            return new DebitCardPayments();
        }
        throw new IllegalArgumentException("Payment not supported");
    }

}
