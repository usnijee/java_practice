package lecture.algorithm.greedy.practice;// Practice
// 양의 정수 배열 prices 가 주어졌다.
// 각 원소의 의미는 주식 가격을 의미한다.
// 한 번에 한 주만 보유할 수 있다고 할 때 prices 를 보고 사고 팔기를 반복해서
// 얻을 수 있는 최대 수익을 반환하는 프로그램을 작성하세요.

// 입출력 예시
// prices: 5, 1, 6, 4, 3, 5
// 출력: 7

// prices: 1, 2, 3, 4, 5
// 출력: 4

public class Practice2 {
    public static int solution(int[] prices) {
        /**
         * 그리디 알고리즘은 특별한 공식이나 내용이 있는게 아니다
         * 논리적으로 반복문 같은 하나하나 다 접근할 필요 없이
         * 당장의 최적해를 계속해서 구해가며 갱신하는 방법
         *
         * 예를들어, 단순 반복문을 한다고 가정하자
         * 첫번째 요소인 5를 기준으로 나머지 모든 요소를 사고 팔고를 해보며 최고 수익을 찾는다
         * 그다음 첫번째의 사고 팔아서 수익을 난 위치부터 다시 반복문진행 -> 매우 복잡
         *
         * 그리디를 활용하면 -> 당장 첫번째요소와 두번째 요소를 비교해서 수익이 날 수 있는지를 파악하고 가능하다면
         * 이를 저장하고 동일한 방식으로 누적해서 수익을 구하는 방식
         */
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        // Test code
        int[] prices = {5, 1, 6, 4, 3, 5};
        System.out.println(solution(prices));

        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(prices));

        prices = new int[]{5, 4, 3, 2, 1};
        System.out.println(solution(prices));
    }
}
