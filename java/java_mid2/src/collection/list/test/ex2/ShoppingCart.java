package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems() { // displayItems는 목록을 display하는 기능만 제공하도록 하자.
//        int totalPrice = 0;

        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemList.size(); i++) {
            String productName = itemList.get(i).getName();
            int price = itemList.get(i).getTotalPrice();
//            totalPrice += price;
            System.out.println("상품명:" + productName + ", 합계:" + price);
        }
        System.out.println("전체 가격 합:" + calculatePrice());
    }

    private int calculatePrice() {
        int totalPrice = 0;
        for (Item item : itemList) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
