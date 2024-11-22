package enumeration.ex0;
/*
    String(문자열) 타입 --> 문자열 형태만 맞다면 밑의 예시에서 보여준 예외에도 오류가 발생 하지 않음
    --> String 타입으로는 제약에 관한 문제 해결이 불가능함
 */
public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP" ,price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold",price);
        System.out.println("gold 등급의 할인 금액 = " + gold);

    }



}
