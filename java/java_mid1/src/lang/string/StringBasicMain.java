package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello"); // String의 첫 글자가 대문자인것도 String이 클래스이기 때문

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
/*
    String str1 = "hello"

    String은 '클래스' 즉, 기본형이 아닌 참조형이기에 str1 변수에는 String 객체의 참조값만 저장 가능하다.
    어떻게 "hello"와 같은 문자열이 저장될까??

    -> String은 매우 자주 사용되기에 java에서 쌍따옴표로 문자열을 감싸면 편의상 new String("hello")와 같이 변경해주기 때문에 가능하다.
 */