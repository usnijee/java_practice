package practice.practice3;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {
        solution(new int[]{1, 1, 2});
        solution(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    public static void solution(int[] nums) {
//        Set<Integer> numSet = new HashSet<>();
//        for (int num : nums) {
//            numSet.add(num);
//        }
        int idx = 0;
        for (int num : nums) {
            if (idx == 0 || num > nums[idx - 1]) {
                nums[idx++] = num;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
