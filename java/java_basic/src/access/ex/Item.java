package access.ex;

public class Item {
    String productName;
    int price;
    int quantity;

    public Item(String productName, int price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return productName;
    }

    public int totalPrice(){
        return (price*quantity);
    }

}
