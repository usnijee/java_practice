package lecture.algorithm.sort.practice;

// Practice4
// 정수 배열 nums 가 주어졌을 때
// 오름차순으로 정렬하기 위해 배열 내에서 정렬이 필요한 구간의 길이를 출력하는 프로그램을 작성하세요.

// 입출력 예시
// 입력: 2, 6, 4, 8, 5, 3, 9, 10
// 정렬: 2, 3, 4, 5, 6, 8, 9, 10  // 전체길이에서 정렬과 입력이 같은 인덱스의 개수만 빼주면 될듯
// 출력: 5

// 입력: 1, 3, 1
// 출력: 2

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice4 {
    public static int solution(int[] nums) {
        int[] tmpNums = nums.clone(); // 배열도 참조형이기에 clone을 해줘야함
        int start = 0;
        int end = nums.length - 1;
        int result = 0;

        sort(nums);

        while (start < nums.length && nums[start] == tmpNums[start]) {
            start++;
        }

        while (end > start && nums[end] == tmpNums[end]) {
            end--;
        }

        result = end - start + 1;
        return result;
    }

    private static void sort(int[] nums) {
        radixSort(nums);
    }

    private static void radixSort(int[] nums) {

        // 기수 테이블 형성
        ArrayList<Queue<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }

        int idx = 0;
        int div = 1;
        int maxLen = getMaxLen(nums);

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < nums.length; j++) {
                list.get((nums[j] / div) % 10).offer(nums[j]);
            }

            for (int j = 0; j < 10; j++) {
                Queue<Integer> queue = list.get(j);

                while (!queue.isEmpty()) {
                    nums[idx++] = queue.poll();
                }
            }

            idx = 0;
            div *= 10;
        }

    }

    private static int getMaxLen(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int len = (int) Math.log10(nums[i]) + 1;
            if (maxLen < len) {
                maxLen = len;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {2, 6, 4, 8, 5, 3, 9, 10};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 9, 3, 4, 5};
        System.out.println(solution(nums));

        nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(nums));
    }
}
