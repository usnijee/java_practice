package loop;
// break : 반복문을 즉시 종료하고 나간다.
// continue: 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다

/* break문

        while(조건식) {
         코드1;
         break;//즉시 while문 종료로 이동한다.
         코드2;
        }
        //while문 종료
 */
/* continue문

        while(조건식) {
         코드1;
         continue;//즉시 조건식으로 이동한다.
         코드2;
        }
 */
public class Break1 {
    /*
    문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
    1 + 2 + 3 ... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
     */
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (true){
            sum += num;
            if (sum > 10){break;}
            System.out.println("num = " + num  + " sum = " + sum);
            num ++;
        }

    }
}
