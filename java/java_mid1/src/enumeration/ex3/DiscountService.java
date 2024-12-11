package enumeration.ex3;

import static enumeration.ex3.Grade.*; // static import

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == BASIC) { // classGrade == x001
            discountPercent = 10;
        } else if (classGrade == GOLD) { // Alt + Enter를 통해 static import를 해주면 BASIC, GOLD, DIAMOND만 사용하여 표현 가능
            discountPercent = 20;
        } else if (classGrade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }
        return price * discountPercent / 100;

    }
}
