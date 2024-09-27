package ref.ex;
/*
    상품 주문 시스템 개발 - 리팩토링
    입력까지 받을것!!!!
 */
import java.util.Scanner;
public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderNum = input.nextInt();

        ProductOrder[] orders = new ProductOrder[orderNum]; // 놓친부분...
        for (int i = 0; i < orderNum ; i++){
            input.nextLine();
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = input.nextLine();
            System.out.print("가격 : ");
            int price = input.nextInt();
            System.out.print("수량 : ");
            int quantity = input.nextInt();

            orders[i] = createOrder(productName,price,quantity);
        }

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
