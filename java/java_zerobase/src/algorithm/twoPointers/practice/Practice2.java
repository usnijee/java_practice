package algorithm.twoPointers.practice;
// Practice2
// nums1 과 nums2 두 배열이 주어졌을 때
// 두 배열의 공통 원소를 배열로 반환하는 프로그램을 작성하세요.
// 결과 배열의 원소에는 중복 값이 없도록 하며 순서는 상관 없다.

// 입출력 예시
// nums1: 1, 2, 2, 1
// nums2: 2, 2
// 출력: 2

// nums1: 4, 9, 5
// nums2: 9, 4, 9, 8, 4
// 출력: 4, 9 (or 9, 4)

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice2 {
    public static int[] solution(int[] nums1, int[] nums2) {

        Set<Integer> result = new LinkedHashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0;
        int p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                result.add(nums1[p1]);
                p1++;
                p2++;
            }
//            int tmp = nums2[p2];
////
////            while (nums1[p1] != tmp) {
////                p1++;
////                if (p1 == nums1.length && p2 != nums2.length - 1) {
////                    p1 = 0;
////                }
////            }
////            p2++;
////            if (p2 == nums2.length) {
////                break;
////            }
////            result.add(nums1[p1]);
////            p1 = 0;
        }

//        return result.stream().mapToInt(Integer::intValue).toArray();
        return result.stream().mapToInt(x -> x).toArray();

    }

    public static void main(String[] args) {
        // Test code
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(solution(nums1, nums2)));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution(nums1, nums2)));

        nums1 = new int[]{1, 7, 4, 9};
        nums2 = new int[]{7, 9};
        System.out.println(Arrays.toString(solution(nums1, nums2)));
    }
}