package review.string;

/**
 *  문자열 메서드 복습 하기
 */
public class StringInfoMain {

    public static void main(String[] args) {
        /**
         * 문자열 정보 조회
         */
        String str = "hello, java~";
        System.out.println("문자열 길이: " + str.length());
        System.out.println("문자열이 비어 있는지 : " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인지2: " + "  ".isBlank() );

        char c = str.charAt(7);
        System.out.println("7번째 문자: " + c);
    }
}
