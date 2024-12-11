package review.enumeration.ex2;

import java.util.Arrays;

public class EnumMethod1 {

    public static void main(String[] args) {

        // values() : 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values)); // values = [BASIC, GOLD, DIAMOND]

        // name() : ENUM 상수 이름 문자열로 반환
        // ordinal() : ENUM 상수의 선언 순서(0부터 시작)를 반환 ,, 사용하지 않을 것을 권장 --> 상수 사이에 새로운 상수가 추가 될 경우 값이 많이 바뀜
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
            /**
             * name = BASIC, ordinal = 0
             * name = GOLD, ordinal = 1
             * name = DIAMOND, ordinal = 2
             */
        }
        // valueOf(A) : ENUM 상수의 목록 중 A와 일치하는 ENUM 상수 반환 , 반환 타입은 ENUM 타입
        // A가 ENUM 상수에 없는 대상이라면 IllegalArgumentException에러 발생
        String input = "DIAMOND";
        Grade gold = Grade.valueOf(input);
        Grade gold2 = Grade.valueOf("VIP");
        System.out.println("gold = " + gold); // gold = DIAMOND
        System.out.println("gold2 = " + gold2); // 런타임 에러 발생
    }
}
