package lecture.algorithm.binarySearch.practice;

// Practice4
// 정수형 배열 weights 와 정수 days 가 주어졌다.
// weights 에는 각 상품의 무게들의 정보가 들어있고, days 는 운송 납기일이다.
// 상품들은 weights 에 적혀있는 순서대로 실어서 운송해야 하는데,
// days 이내에 운송을 하기 위한 차량의 최소한의 적재량을 계산하는 프로그램을 작성하세요.

// 입출력 예시
// weights: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// days: 5
// 출력: 15

// weights: 3, 2, 2, 4, 1, 4
// days: 3
// 출력: 6


import java.util.Arrays;

public class Practice4 {
    public static int solution(int[] weights, int days) {
        /**
         * 최소적재량의 경우 모든 물건을 한번에 다 실었을때가 최대이고 각각 한개씩 실었을 때가 최소이다 -> 이를 오름차순으로 정렬 후 이진탐색 진행
         */
        int left = Arrays.stream(weights).max().getAsInt(); // stream을 활용하여 배열의 최댓값 구하기
        int right = Arrays.stream(weights).sum(); // stream을 활용하여 배열의 합 구하기

        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1; // 필요 '일' 수
            int cur = 0; // 현재 무게

            for (int w : weights) {
                if (cur + w > mid) {
                    cnt += 1;
                    cur = 0;
                }
                cur += w;
            }

            if (cnt > days) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        // Test code
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(weights, 5));   // 15

        weights = new int[]{3, 2, 2, 4, 1, 4};
        System.out.println(solution(weights, 3));   // 6
    }
}