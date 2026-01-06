package oops;

/**
 * DebitCard represents a debit card payment method.
 */
public class DebitCard extends Card{

    /**
     * Create a DebitCard with holder name, number and cvv.
     *
     * @param cardHolderName name on the card
     * @param cardNo card number
     * @param cvv card security code
     */
    public DebitCard(String cardHolderName, String cardNo, int cvv) {
      super(cardHolderName,cardNo,cvv);
    }

    /**
     * Simulate making a payment with a debit card.
     */
    @Override
    public void pay() {
        System.out.println("Making payment via 'DEBIT-CARD'");
    }
}
