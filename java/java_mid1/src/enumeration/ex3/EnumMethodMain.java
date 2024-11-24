package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal=" + value.ordinal()); // 열거형의 이름과 순서를 name(), ordinal()을 통해 확인 가능
        }

        //String -> Enum 변환 , 잘못된 문자는 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);      // Grade는 Enum이고 Enum은 클래스의 한 종류이기에 '참조형' -> valueOf()를 통해 객체에
        System.out.println("gold = " + gold);
    }
}
/*
    Enum의 orinal() 메서드는 열거형의 순서를 제공하는 메서드인데 사용하지 않는 것이 좋음

    DB나 파일에 B의 순서가 2로 저장되어 있는 상황에서 A 다음에 C가 추가 된다면 B의 순서는 ordinal() 메서드에 의하면 3으로 변경된다.
    즉, B회원이 갑자기 다른 회원이 되는 큰 버그가 발생함

 */