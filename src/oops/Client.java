package oops;

import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        var ps = new PaymentService();

        ps.addPaymentMethod("Ram's credit card", new CreditCard("Ram Nageena", "125478445252", 145));
        ps.addPaymentMethod("Ram's debit card", new CreditCard("Ram Tiwari", "875478445252", 258));
        ps.addPaymentMethod("Ram's UPI", new UPI(UUID.randomUUID().toString()));


        ps.makingPayment("Ram's credit card");
        ps.makingPayment("Ram's debit card");
        ps.makingPayment("Ram's UPI");

    }
}
