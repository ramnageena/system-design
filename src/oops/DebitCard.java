package oops;

public class DebitCard extends Card{


    public DebitCard(String cardHolderName, String cardNo, int cvv) {
      super(cardHolderName,cardNo,cvv);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via 'DEBIT-CARD'");
    }
}
