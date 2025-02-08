package lecture.basicMath.practice.practice1.practice4;

import java.util.HashSet;

public class Practice4 {
    public static boolean solution(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (set.add(n)) {
            /**
             * 1. set.add는 boolean임
             * 즉, set에 특정 값이 없으면 true를 반환하고 set에 추가됨
             * 기존 값이 있다면 set은 해당 요소를 추가하지 않고 false 반환
             */
            int squareSum = 0;

            while (n > 0) {
                int remain = n % 10; // n의 가장 큰 자릿수부터 10과의 나머지 연산을 통해 remain에 저장
                squareSum += remain * remain; // 각 자릿수의 제곱을 누적합
                n /= 10; // 다음 자릿수로 넘어감
            }

            if (squareSum == 1) {
                return true;
            } else {
                n = squareSum; // squareSum이 1이 아니면 1이될때까지 진행
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(19));
        System.out.println(solution(2));
        System.out.println(solution(61));
    }
}
