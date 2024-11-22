package enumeration.ref3;
/*
    출력 부분의 중복을 제거하기

    grade.name()을 통해 Enum 상수명을 호출 가능
 */
public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printDiscount(Grade.BASIC,price);
        printDiscount(Grade.GOLD,price);
        printDiscount(Grade.DIAMOND,price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인 금액: " + grade.discount(price));
    }
}
