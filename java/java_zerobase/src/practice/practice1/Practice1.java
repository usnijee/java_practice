package practice.practice1;

import java.util.Scanner;

/**
 * 입력된 정수 자료형의 숫자를 거꾸로 변환하는 프로그램을 작성하시오
 *
 * 12345 -> 54321
 * -12345 -> -54321
 * 100 -> 1
 * 0 -> 0
 */
public class Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMinus = false;
        int num = scanner.nextInt();
        int numReverse = 0;

        if (num < 0) {
            isMinus = true;
            num = Math.abs(num);
        }

        while (num > 0) {
            int remainder = num % 10;
            num /= 10;
            numReverse = numReverse * 10 + remainder;
        }

        System.out.println(isMinus ? (-1 * numReverse) : numReverse);
    }
}
