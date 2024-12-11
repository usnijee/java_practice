package review.enumeration.ex1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountRate() / 100;
    }
}
