package oops;

/**
 * Represents a payment method that can perform a payment operation.
 * Implementations include cards, UPI, wallets, etc. Use this interface to
 * invoke a payment in a polymorphic way (run-time binding).
 */
public interface PaymentMethod {
    /**
     * Execute the payment operation for this payment method.
     * Implementations should perform the actual payment logic or delegate to
     * a payment gateway/stub.
     */
    void pay();
}
