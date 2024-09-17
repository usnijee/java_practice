package operator;

public class Comp1 {
    public static void main(String[] args) {
        // 비교 연산자는 아는 문법이기에 생략
        // 문자열 비교 연산자 --> 문자열은 .equal()를 사용해야함

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수
        boolean result3 = str1.equals(str2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
