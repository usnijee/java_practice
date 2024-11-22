package lang.wrapper.test;
/*
    String str` 을 `Integer` 로 변환해서 출력해라.
    `Integer` 를 `int` 로 변환해서 출력해라.
    `int` 를 `Integer` 로 변환해서 출력해라.
    오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.
 */
public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer num1 = Integer.valueOf(str);
        System.out.println("String->Integer: " + num1);

        // Integer -> int by Auto Unboxing (wrapper -> 기본형)
        int num2 = num1;
        System.out.println("Integer->int: " + num2);

        // int -> Integer by Auto boxing (기본형 -> wrapper)
        Integer num3 = num2;
        System.out.println("int->Integer: " + num3);
    }
}
