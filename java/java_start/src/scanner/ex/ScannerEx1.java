package scanner.ex;
/*
사용자로부터 입력받은 이름과 나이를 출력하세요. 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이
어야 합니다.
 */

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner 클래스에 대한 객체를 생성하는것

        System.out.print("당신의 이름을 입력하세요:");
        String name = input.nextLine();

        System.out.print("당신의 나이를 입력하세요:");
        int age = input.nextInt();

        System.out.println("당신의 이름은 : " + name + "이고, 나이는 " + age +"살입니다.");
    }
}
