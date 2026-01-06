package oops;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PaymentService {

    // storing + making payment
    //for storing using in memory data structure could be Map

    Map<String, PaymentMethod> paymentMethod;

    PaymentService() {
        paymentMethod = new ConcurrentHashMap<>();
    }

    // adding payment method

    public void addPaymentMethod(String name, PaymentMethod pm) {
        paymentMethod.put(name, pm);
    }

    public void makingPayment(String name) {
        PaymentMethod pm = paymentMethod.get(name);
        pm.pay(); // run time polymorphism

    }
}
