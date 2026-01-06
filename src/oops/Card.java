package oops;

public abstract class Card implements PaymentMethod {
    private String cardNo;
    private String cardHolderName;
    private int cvv;

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
