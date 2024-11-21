package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int lengthSum = 0;
        for (String string : arr) {
            System.out.println(string + ":" + string.length());
            lengthSum += string.length();
        }
        System.out.println("arr 배열에 들어있는 모든 문자열의 길이 합: " + lengthSum);
    }
}
