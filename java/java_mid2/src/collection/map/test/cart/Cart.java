package collection.map.test.cart;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        if (!cartMap.containsKey(product)) {
            cartMap.put(product, count);
        }else {
            cartMap.put(product, cartMap.get(product) + count);
        }
    }

    public void minus(Product product, int count) {
        if (cartMap.get(product) > count) {
            cartMap.put(product, cartMap.get(product) - count);
        } else if (cartMap.get(product).equals(count)) {
            cartMap.remove(product);
        } else {
            System.out.println("잘못 입력하였습니다");
        }
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력==");
        for (Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }

    }
}
