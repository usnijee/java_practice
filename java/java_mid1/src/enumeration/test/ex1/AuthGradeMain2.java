package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 동급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();
        System.out.println();

    }
}
