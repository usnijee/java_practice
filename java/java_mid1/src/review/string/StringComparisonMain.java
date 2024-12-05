package review.string;

/**
 * 문자열 비교 메서드 복습
 */
public class StringComparisonMain {

    public static void main(String[] args) {

        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 " + str1.equalsIgnoreCase(str2)); // 대소문자 상관없이 비교

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // 두 문자열을 사전 순으로 비교 단, A.compreTo(B) 인경우 B->A 순으로 오름차순일때를 기준
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3)); // 공통부분을 제외한 첫번째 문자 사전순 비교
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2)); // 대소문자 상관없이 사전순 비교

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); // Hello로 시작하는지
        System.out.println("str1 ends wiht 'Java!':" + str1.endsWith("Java!")); //
    }
}
