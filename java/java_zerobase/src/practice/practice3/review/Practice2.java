package practice.practice3.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }

    private static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> numList = new ArrayList<>();
        int idx = 0;

        Arrays.sort(nums); // nums를 오름 차순 정렬
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                numList.add(nums[i]);
            }
        }
        return numList;
    }

}
