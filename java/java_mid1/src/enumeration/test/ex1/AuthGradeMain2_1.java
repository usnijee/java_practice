package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2_1 {

    public static void main(String[] args) {
        long start;
        long end;
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();
        start = System.currentTimeMillis();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase()); // 이렇게도 가능하다
        System.out.println("당신의 등급은 " + authGrade.getDescription());

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
        end = System.currentTimeMillis();

        System.out.println("걸린 시간: " + (end-start) + "ms");

    }
}
