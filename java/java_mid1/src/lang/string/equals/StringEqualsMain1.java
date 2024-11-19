package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2)); // 동일성(identity)에 의해 다른 참조값이기에 false
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // 동등성(equality)에 의해 true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 " + (str3 == str4) );
        System.out.println("리터럴 equals 비교 " + (str3.equals(str4)));
    }
}

/*
    의문1. equals()는 '==' 기반인데 어떻게 true가 나왔을까?
    -> String 클래스에서 Object 클래스의 equals 메서드를 오버라이딩하였기에 가능

    의문2.
    String str3 = "hello";
    String str4 = "hello";
1
    와 같이 문자열 리터럴을 사용했을 때 동일성(idenetiy)검사에서 왜 true가 나왔을까?
    -> 문자열 풀(Pool)!
    -> 문자열 리터럴을 사용하는 경우 java는 문자열 pool을 사용하여 해당 리터럴에 해당하는 String 객체를 미리 만들어둔다
    -> 예를들어, String str3 = "hello";의 경우 "hello"에 해당하는 String 객체가 문자열 풀에 생성됨
    -> 단, 문자열 풀은 동일한 리터럴에 대해서는 중복하여 객체를 만들지 않는다.
    따라서, "hello"라는 리터럴에 대한 String 객체가 String 풀에 생성되었고 해당 객체에 대한 참조값이 x003이라고 가정하면,
    str3와 str4는 동일한 객체를 가리키고 있기에 동일성 검사에서 true가 반환된다.
    문자열 풀에의해 동일한 리터럴에 대해서 메모리 사용을 줄이고, 문자를 만드는 시간도 줄어들기에 성능이 최적화 됨.
 */
