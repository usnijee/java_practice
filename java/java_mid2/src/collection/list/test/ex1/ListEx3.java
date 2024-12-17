package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 사용자에게 n 개의 정수를 입력받아서 List 에 보관하고, 보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하자
 *
 */
public class ListEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerList = new ArrayList<>();
        int total = 0;
        double average = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            integerList.add(input);
        }

        for (int i = 0; i < integerList.size(); i++) {
            total += integerList.get(i);
        }
        average = (double) total / integerList.size();

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
