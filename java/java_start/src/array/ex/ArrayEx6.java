package array.ex;
/*
    사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
    그램을 작성하자. 실행 결과 예시를 참고하자.
 */
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = input.nextInt();
        int[] numbers = new int[cnt];
        int max, min;

        System.out.println(cnt+"개의 정수를 입력하세요:");
        for (int i = 0; i < cnt; i++){
            numbers[i] = input.nextInt();
        }
        max = min = numbers[0];  // 이 부분이 키포인트 --> 일단 배열의 임의의 원소를 기준으로 잡고 반복문을 통해 대소 비교할 것
        for (int i = 1; i < cnt; i++){
            if (numbers[i] >= max){
                max = numbers[i];
            }else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
