package oops;

/**
 * CreditCard represents a credit card payment method.
 * Extends {@link Card} and implements the {@link PaymentMethod#pay()} behaviour.
 */
public class CreditCard extends Card{

    /**
     * Create a CreditCard with holder name, number and cvv.
     *
     * @param cardHolderName name on the card
     * @param cardNo card number
     * @param cvv card security code
     */
    public CreditCard(String cardHolderName, String cardNo, int cvv) {
        super(cardHolderName, cardNo, cvv);
    }

    /**
     * Simulate making a payment with a credit card.
     */
    @Override
    public void pay() {
        System.out.println("Making payment via 'CREDIT-CARD'");

    }
}
