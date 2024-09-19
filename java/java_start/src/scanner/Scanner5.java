package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 객체는 한 번만 생성하면 되기에 while문 밖에서 생성
        int sum = 0;
        while (true){
            System.out.print("정수를 입력하세요 (0을 입력하면 종료): ");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            sum += num;
        }
        System.out.println("입력한 모든 정수의 합: " + sum);

    }
}
