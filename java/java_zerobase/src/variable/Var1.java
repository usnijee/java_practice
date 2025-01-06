package variable;

public class Var1 {

    public static void main(String[] args) {

//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");
        int age = 10;
        System.out.println(age);
        String country = "Korea";
        System.out.println(country);

//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");
//      2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;
        System.out.println("$apple = " + $apple);

//      2-2. 숫자로 시작 X
//        int 3 apple = 1000;

//      2-3. 대소문자 구분

//      2-4. 공백 사용 X

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...

//      참고) 한글 사용 가능
        int 사과 = 1000;
        System.out.println("사과 = " + 사과);

//      3. 표기법
//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수, 패키지
        int myAge = 28;

//      3-2. 파스칼 표기법 (PascalCase)
//      클래스
        int MyAge = 10;


//      참고) 스네이크 표기법 (snake_case)
//      사용 X
        int my_age = 10;
        int one_apple_price = 1000;
    }
}
