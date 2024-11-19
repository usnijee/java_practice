package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;  // String은 클래스이기에 참조형 -> 원래 + 연산은 불가능 --> 자주 사용하기에 허용
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
