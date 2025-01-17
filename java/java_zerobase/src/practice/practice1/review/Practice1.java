package practice.practice1.review;

public class Practice1 {

    public static void main(String[] args) {
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }

    private static void solution(int input) {
        boolean isMinus = false;
        int result = 0;

        if (input < 0) {
            input = Math.abs(input);
            isMinus = true;
        }

        while (input > 0) {
            int remain = input % 10;
            input /= 10;
            result = result * 10 + remain;
        }

        System.out.println(isMinus ? -1 * result : result);
    }
}

/**
 * 입력된 정수를 거꾸로 변환하는 프로그램
 *
 * [접근법 탐구]
 * 1. 10으로 나누었을때 나머지를 순차적으로 result에 더해주면 된다
 * 2. 입력값이 음수인 경우 -> 입력의 절댓값으로 연산 (단, 거꾸로 된 값도 음수여야 하므로 추후 -1을 곱해야함)
 * 3. 입력값이 양수인 경우와 음수인 경우를 분기해야하므로
 *          -> 이렇게 분기를 표현할때
 *             3-1. 조건문 사용
 *             3-2. boolean을 사용하여 음수일때만 true로 바꿔준 후 -> 삼항연산자 or 조건문 사용
 *
 *
 */
