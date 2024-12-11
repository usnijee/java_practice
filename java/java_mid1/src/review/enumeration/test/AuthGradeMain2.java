package review.enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        String inputGrade = scanner.nextLine();

        AuthGrade grade = AuthGrade.valueOf(inputGrade);
        System.out.println("== 메뉴 목록==");

        if (grade.getLevel() >= 1) {
            System.out.println("- 메인화면");
        }
        if (grade.getLevel() >= 2) {
            System.out.println("- 이메일 관리 화면");
        }
        if (grade.getLevel() >= 3) {
            System.out.println("- 관리자 화면");
        }

    }
}
