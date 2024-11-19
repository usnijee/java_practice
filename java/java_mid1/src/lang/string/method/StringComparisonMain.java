package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        //compareTo() : 두 문자열을 사전 순으로 비교
        //compareToIgnoreCase() : 두 문자열을 대소문자 구분 없이 사전적으로 비교
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); // j와 w의 차이 a~z는 오름차순이기에 j는 w에 비에 -13만큼 떨어져 있다
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Hello': " + str1.endsWith("Java"));


    }
}
