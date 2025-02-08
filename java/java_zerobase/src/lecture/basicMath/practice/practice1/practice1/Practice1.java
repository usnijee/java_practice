package lecture.basicMath.practice.practice1.practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }

    public static ArrayList<ArrayList<Integer>> solution(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                /**
                 * 각 행의 요소의 수는 각 행 인덱스 + 1만큼 존재
                 */
                if (j == 0 || j == i) {
                    // 각 행의 양 끝은 반드시 1
                    list.add(1);
                } else {
                    // 이전 행의 j-1과 j번째 요소의 합을 현재 행의 j번째 요소로 설정
                    // 파스칼 삼각형의 원리
                    int x = result.get(i - 1).get(j - 1);
                    int y = result.get(i - 1).get(j);
                    list.add(x + y);
                }
            }
            result.add(list);
        }
        return result;
    }
}
