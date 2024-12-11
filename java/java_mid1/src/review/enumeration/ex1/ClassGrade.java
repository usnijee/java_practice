package review.enumeration.ex1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountRate;

    private ClassGrade(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int discount(int price) {
        return price * discountRate / 100;
    }

}
