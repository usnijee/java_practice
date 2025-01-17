package practice.practice1.review;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        solution(input);
    }

    private static void solution(String input) {
        char alphabet = input.charAt(0);
        int step = 'a' - 'A';

        if (alphabet >= 'A' && alphabet <= 'Z') {
            alphabet = (char) ((int) alphabet + step);
        } else {
            alphabet = (char) ((int) alphabet);
        }
        System.out.println(alphabet);
    }
}
/**
 * 접근방법
 * 알아야할 점
 *
 * 1. char 형을 int형으로 받거나 논리연산을 진행할때 자동으로 ASCII 코드인 정수로 바뀐다 (암묵적 형변환)
 */
