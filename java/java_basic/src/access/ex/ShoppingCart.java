package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 1;
    private int total;

    public void addItem(Item item){
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득찼습니다");
            return;
        }
        items[itemCount] = item;
        itemCount ++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 1 ; i < itemCount; i++){
//            System.out.println("상품명:" + items[i].productName + ", 합계:" + (items[i].price * items[i].quantity));
//            total += (items[i].price * items[i].quantity);
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.totalPrice());
        }
        System.out.println("전체 가격 합: " + getTotal());
    }

    private int getTotal(){
        for (int i = 1; i < itemCount; i++){
            total += items[i].totalPrice();
        }
        return total;
    }
}
