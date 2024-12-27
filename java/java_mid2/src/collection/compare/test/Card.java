package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int cardNum;
    private final Suit suit;

    public Card(int cardNum, Suit suit) {
        this.cardNum = cardNum;
        this.suit = suit;
    }

    public int getCardNum() {
        return cardNum;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card c) {
        if (this.cardNum != c.cardNum) {
            return Integer.compare(this.cardNum, c.cardNum);
        } else {
            return this.suit.compareTo(c.suit); // enum의 compareTo는 ordinal()을 기준으로 비교하여 정렬
        }
    }

    @Override
    public String toString() {
        return cardNum + "(" + suit.getIcon() + ")";
    }
}
