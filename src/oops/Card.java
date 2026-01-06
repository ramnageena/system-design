package oops;

/**
 * Abstract base class for card-based payment methods (credit/debit).
 * Holds common card details and implements {@link PaymentMethod}.
 */
public abstract class Card implements PaymentMethod {
    /** Card number */
    private String cardNo;
    /** Card-holder's name */
    private String cardHolderName;
    /** Card CVV */
    private int cvv;

    /**
     * Construct a Card with the required details.
     *
     * @param cardHolderName card-holder's full name
     * @param cardNo card number as string
     * @param cvv card CVV/code
     */
    public Card(String cardHolderName, String cardNo, int cvv) {
        this.cardHolderName = cardHolderName;
        this.cardNo = cardNo;
        this.cvv = cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
