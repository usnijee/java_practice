package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // player가 선택한 카드를 수집하는 list
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum() {
        int sum = 0;
        for (Card card : hand) {
            sum += card.getCardNum();
        }
        return sum;
    }

    public void showHand() {
        hand.sort(null); // list의 기본정렬 -> 원소인 Card의 toCompare()가 적용됨
        System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
    }

    public String getName() {
        return name;
    }
}
