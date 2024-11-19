package lang.string.method;

// 문자열 정보 조회 메서드 length, isEmpty, isBlank, charAt
public class StringInfoMain {

    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열이 비어 있는가: " + str.isEmpty()); // "" : 비어있음
        System.out.println("문자열이 비어 있거나 공백인지: " + str.isBlank()); // " ": 공백 존재
        System.out.println("문자열이 비어 있거나 공백인지: " + "     ".isBlank() );

        char c = str.charAt(7); // 지정된 인덱에 있는 문자를 반환 charAt()
        System.out.println("7번 인덱스의 문자 = " + c);
    }
}
