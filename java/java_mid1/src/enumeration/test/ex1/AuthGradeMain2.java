package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        long start;
        long end;
        Scanner scanner = new Scanner(System.in);
        AuthGrade[] grades = AuthGrade.values();

        System.out.print("당신의 등급을 입력하세요[GUEST LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();
        start = System.currentTimeMillis();
        for (AuthGrade g : grades) {
            if  (g.name().equals(grade)) {
                System.out.println("당신의 등급은 " + g.getDescription() + " 회원입니다.");
                printMenuList(g);
                break;
            }
        }
        end = System.currentTimeMillis();




    }

    private static void printMenuList(AuthGrade grade) {
        System.out.println("==메뉴 목록==");
        String[] menuList = grade.getMenuList();
        for (String list : menuList) {
            System.out.println("- " + list);
        }
    }

}
