package lang.wrapper.test;
/*
    String str` 을 `Integer` 로 변환해서 출력해라.
    `Integer` 를 `int` 로 변환해서 출력해라.
    `int` 를 `Integer` 로 변환해서 출력해라.
    오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.
 */
public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer strToWrapper = Integer.valueOf(str); // Integer 객체 생성 및 valueOf를 통해 기본형 객체에 입력
        System.out.println("String->Integer: " + strToWrapper);

        int wrapperToInt = strToWrapper.intValue(); // Integer 객체 내부의 기본형 반환
        System.out.println("Integer->int: " + wrapperToInt);

        Integer inttoInteger = Integer.valueOf(wrapperToInt); // 새로운 Integer 객체 생성 및 참조값 저장
        System.out.println("int->Integer: " + inttoInteger);
    }
}
