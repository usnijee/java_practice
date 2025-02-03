package practice.practice1;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char alphabet = input.charAt(0);

        if (alphabet >= 'A' && alphabet <= 'Z') {
            alphabet = (char) ((int) alphabet + 32);
        } else if (alphabet >= 'a' && alphabet <= 'z') {
            alphabet = (char) ((int) alphabet - 32);
        } else {
            System.out.println("입력한 값이 알파벳이 아입니다");
        }
        System.out.println(alphabet);
    }
}
