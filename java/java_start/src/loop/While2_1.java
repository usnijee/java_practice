package loop;
/*
문제: 1부터 하나씩 증가하는 수를 3번 더해라 (1 ~ 3 더하기)
이 문제는 1부터 하나씩 증가하는 수이기 때문에 1 + 2 + 3을 더해야 한다.
우선 while 문을 사용하지 않고 단순 무식하게 풀어보자.
 */
public class While2_1 {
    public static void main(String[] args) {
        int num = 1;
        int endNum = 3;
        int sum = 0;
        while (num <=endNum){
            sum += num;
            System.out.println("num=" + num + " sum=" + sum);
            num++;
        }
        System.out.println(sum);
    }
}
