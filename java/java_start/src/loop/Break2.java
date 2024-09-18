package loop;
/*

    문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
    1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.

 */
public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ;i++){  // 이렇게 하거나 for(;;) 이런식으로 조건문 없는 for문은 무한반복을 의미한다
            sum += i;
            if (sum > 10){
                System.out.println("합이 10보다 크면 종료,, i = " + i);
                break;
            }
            i++;
        }

    }
}
