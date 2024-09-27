package ref.ex;
/*
    상품 주문 시스템 개발 - 리팩토링
 */
public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder product1 = createOrder("두부", 2000,2);
        ProductOrder product2 = createOrder("김치", 5000,1);
        ProductOrder product3 = createOrder("콜라", 1500,2);

        ProductOrder[] orders = {product1,product2,product3};
        printOrders(orders);

        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder products = new ProductOrder();
        products.productName = productName;
        products.price = price;
        products.quantity = quantity;

        return products;
    }

    static void printOrders(ProductOrder[] orders){
        // 향상된 for문
        for (ProductOrder i : orders) {
            System.out.println("상품명: " + i.productName + ", 가격: " + i.price + ", 수량:" + i.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder i : orders){
            total += (i.price)*(i.quantity);
        }
        return total;
    }
}
