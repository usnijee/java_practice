package array.ex;
/*
이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
 */
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int ans = input.nextInt();

        System.out.println(ans + "개의 정수를 입력하세요: ");
        int[] numbers = new int[ans];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < ans ; i++){
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        average = (double) sum/ans;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " +average);
    }
}
