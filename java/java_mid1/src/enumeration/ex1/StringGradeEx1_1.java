package enumeration.ex1;
/*
    상수를 사용 --> 근본적인 문제해결이 불가능
    why?
    해당 상수를 사용하지 않고 관련없는 문자열을 사용해도 제약이 발생하지 않음

    즉, DiscountService 클래스의 discount 메서드의 파라미터는 오직 BASIC, GOLD, DIAMOND만 가능하고
    나머지를 입력할 시 제약이 발생해야만 한다.
 */

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC , price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }



}
