package oops;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Service that stores available {@link PaymentMethod} instances and invokes
 * payments by name. Backed by a concurrent map to be safe for simple concurrent use.
 */
public class PaymentService {

    /** Map of payment method name -> payment implementation */
    Map<String, PaymentMethod> paymentMethod;

    /**
     * Create a PaymentService with an in-memory concurrent map.
     */
    PaymentService() {
        paymentMethod = new ConcurrentHashMap<>();
    }

    /**
     * Add a payment method with an associated name.
     *
     * @param name key to retrieve the payment method
     * @param pm payment method implementation
     */
    public void addPaymentMethod(String name, PaymentMethod pm) {
        paymentMethod.put(name, pm);
    }

    /**
     * Look up a payment method by name and execute its {@link PaymentMethod#pay()}.
     *
     * @param name key of the payment method to invoke
     */
    public void makingPayment(String name) {
        PaymentMethod pm = paymentMethod.get(name);
        pm.pay(); // run time polymorphism

    }
}
