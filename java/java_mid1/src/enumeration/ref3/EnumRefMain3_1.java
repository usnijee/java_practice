package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
/*
    헷갈렸던 부분

    1. Enum 클래스는 내부적으로는 ClassGrade의 원리에 의해 프로세스가 진행됨
    2. ClassGrade 클래스의 특징
        - ClassGrade 타입 즉, 참조형 타입의 '상수'를 사용
            - 상수이기에 static 영역에 생성되고 상수명을 사용하여 접근 가능
        - 상수는 ClassGrade 타입이기에 ClassGrade 클래스를 바라보고 있고 해당 클래스의 메서드를 사용 가능
        - 즉, ClassGrade 클래스 내에 ClassGrade 타입의 상수를 선언
 */