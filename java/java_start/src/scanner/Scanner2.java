package scanner;

import java.util.Scanner; // java에서 제공하는 입력관련 클래스

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 객체 생성

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 숫자의 합 : " + sum);
    }
}
