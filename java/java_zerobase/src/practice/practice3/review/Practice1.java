package practice.practice3.review;

public class Practice1 {

    public static void main(String[] args) {
        solution(new int[]{1, 1, 2});
        solution(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    private static void solution(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (idx == 0 || num > nums[idx - 1]) { // 기본입력대로 오름차순이거나 첫번째 원소의 경우 그 위치에 그대로 저장
                nums[idx++] = num;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.print(nums[i] + " ");
        };
        System.out.println();

    }
}
