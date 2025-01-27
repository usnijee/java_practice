package algorithm.twoPointers.practice;

// Practice
// 주어진 nums 배열에서 3 개의 합이 0이 되는 모든 숫자들을 출력하세요.
// 중복된 숫자 셋은 제외하고 출력하세요.

// 입출력 예시
// nums: {-1, 0, 1, 2, -1, -4};
// 출력: [[-1, -1, 2], [-1, 0, 1]]

// nums: {1, -7, 6, 3, 5, 2}
// 출력: [[-7, 1, 6], [-7, 2, 5]]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice4 {
    public static ArrayList<ArrayList<Integer>> solution(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) { // 똑같은 수를 기준으로 삼지 않기 위함
                int p1 = i + 1;
                int p2 = nums.length - 1;
                int sum = 0 - nums[i];

                while (p1 < p2) {
                    if (nums[p1] + nums[p2] == sum) { //합이 0이 되는 경우
                        result.add(new ArrayList<>(List.of(nums[i], nums[p1], nums[p2])));

                        while (p1 < p2 && nums[p1] == nums[p1 + 1]) {
                            // 같은 숫자는 비교를 넘어가기 위함
                            p1++;
                        }

                        while (p1 < p2 && nums[p2] == nums[p2 - 1]) {
                            // 같은 숫자는 비교를 넘어가기 위함
                            p2--;
                        }

                        p1++;
                        p2--;
                    } else if (nums[p1] + nums[p2] < sum) {
                        p1++;
                    } else {
                        p2--;
                    }
                }
            }
        }
//        int idx = 0;
//        int p1 = idx + 1;
//        int p2 = nums.length - 1;
//
//        while (idx < nums.length && p1 < p2) {
//            int cri = nums[idx];
//            if (cri + nums[p1] + nums[p2] < 0) {
//                p1++;
//            } else if (cri + nums[p1] + nums[p2] > 0) {
//                p2--;
//            } else {
//                result.add(new ArrayList<>(List.of(idx, p1, p2)));
//                idx++;
//            }
//        }
        return result;

    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {-1, 0, 1, 2, -1, -4};     // [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(solution(nums));

        nums = new int[]{1, -7, 6, 3, 5, 2};   // [[-7, 1, 6], [-7, 2, 5]]
        System.out.println(solution(nums));
    }
}
