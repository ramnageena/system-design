package oops;

public class CreditCard extends Card{

    public CreditCard(String cardHolderName, String cardNo, int cvv) {
        super(cardHolderName, cardNo, cvv);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via 'CREDIT-CARD'");

    }
}
