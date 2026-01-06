package oops;

/**
 * UPI payment method implementation (example).
 * Stores a UPI ID and performs a simulated payment when {@link #pay()} is called.
 */
public class UPI implements PaymentMethod{
    /** UPI identifier */
    private String upiID;

    /**
     * Construct a UPI payment method with the given UPI id.
     *
     * @param upiID the UPI identifier
     */
    public UPI(String upiID) {
        this.upiID = upiID;
    }

    public String getUpiID() {
        return upiID;
    }

    public void setUpiID(String upiID) {
        this.upiID = upiID;
    }

    /**
     * Simulate making a payment with the UPI id.
     */
    @Override
    public void pay() {
        System.out.println("Making payment via 'UPI' "+ upiID);
    }
}
