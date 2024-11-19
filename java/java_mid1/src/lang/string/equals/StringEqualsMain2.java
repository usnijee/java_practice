package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1,str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3,str4));
    }

    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
    }

}
/*
문자열 비교는 항상 equals()를 사용해야하는 이유

-> isSame() 메서드와 main() 메서드를 담당하는 개발자가 서로 다르다면 isSame() 즉, 문자열 비교 로직을 담당하는 개발자 입장에서는
   매개변수로 문자열 리터럴이 입력될지 String 객체가 입력될지 모르기에 equals로 동등성 비교하는 것이 옳다.
   
-> 동일성 비교는 문자열 리터럴과 String 객체가 서로 다른 결과를 나타내기 때문.
 */
