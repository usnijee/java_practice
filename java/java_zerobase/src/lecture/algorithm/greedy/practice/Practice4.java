package lecture.algorithm.greedy.practice;// Practice
// 원형 루트 상에 n 개의 주유소가 있다.
// 각 주유소의 가스 보유량은 gas 배열에 주어지고,
// 해당 주유소에서 다음 주유소로의 이동 비용은 cost 배열에 주어진다.

// 어떤 위치에서 차량이 가스를 채워 출발하면 모든 주유소를 방문하고 원래의 위치로 돌아올 수 있는지
// 계산하는 프로그램을 작성하세요.

// 입출력 예시
// gas: 1, 2, 3, 4, 5
// cost: 3, 4, 5, 1, 2
// 출력: 3

// gas: 2, 3, 4
// cost: 3, 4, 3
// 출력: -1


public class Practice4 {
    public static int solution(int[] gas, int[] cost) {
        if (gas == null || cost == null) {
            return -1;
        }

        if (gas.length != cost.length) {
            return -1;
        }

        int curGas = 0; // 현재 위치에서의 보유 가스 - 지출 가스
        int totalCas = 0; // 모든 지역을 순회하며
        int starPos = 0; // 시작 위치

        for (int i = 0; i < gas.length; i++) {
            curGas += gas[i] - cost[i];
            totalCas += gas[i] - cost[i];

            if (curGas < 0) {
                // 보유 가스가 지출해야하는 가스보다 적어 출발을 못하는 경우
                starPos = i + 1; // 시작지점은 계속 1씩 증가하다가 출발이 가능한 경우가 시작 지점
                curGas = 0; // 각 지점을 따져봐야하기에 0으로 초기화
            }
        }
        // totslGas 즉, 각 위치의 보유 가스 - 지출 가스의 총합이 0보다 같거나 크다는 것은 어디에서 출발하든 일단 한바퀴는 돌 수 있음을 의미함
        // 다만, 어느 위치중 차이가 양수가 되는 부분이 시작지점이 됨을 의미

        return totalCas >= 0 ? starPos : -1;
    }

    public static void main(String[] args) {
        // Test code
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(solution(gas, cost));

        gas = new int[]{2, 3, 4};
        cost = new int[]{3, 4, 3};
        System.out.println(solution(gas, cost));
    }
}
