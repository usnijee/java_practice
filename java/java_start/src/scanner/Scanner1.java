package scanner;

import java.util.Scanner; // 사용자의 입력을 받는 클래스

public class Scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 String으로 가져옴
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt(); // 입력을 int로 가져옴
        System.out.println("입력한 정수 : " + intValue );

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble(); //입력을 double로 가져옴
        System.out.print("입력한 실수 : " + doubleValue);

    }
}
/*
    출력문
    1. println : 출력하고 다음 라인으로 넘어감 -> = print("\n")
    2. print : 출력하고 다음 라인으로 안넘어감
 */
