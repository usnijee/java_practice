package enumeration.ref2;
/*
    Enum 열거형은 ref1에서의 타입 안정 열거형 패턴을 많이 축약해놓은 것이라고 보면 된다.
    즉, BASIC, GOLD, DIAMOND는 실제로는 Grade 클래스의 참조값을 저장한 '상수'라고 보면 된다.
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

}

