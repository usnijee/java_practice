package enumeration.ref3;
/*
   ref2에서 Enum 열거형 내에서 private 생성자를 통해 할인율을
 */
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) { // 생성자
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 리펙토링3. DiscountService -> Grade의 할인율을 꺼내서 사용
    // 객체지향 관점 -> Grade의 데이터를 외부에 노출하여 사용하는 것은 캡슐화와 맞지않음 즉, Grade내에서 관리하는 것이 맞다
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}

