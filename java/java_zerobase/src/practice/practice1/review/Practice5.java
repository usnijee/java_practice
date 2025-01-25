package practice.practice1.review;

public class Practice5 {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }

    private static int solution(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int sumArea = 0;
        int result = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                sumArea = (right - left) * height[left];
                if (sumArea > result) {
                    result = sumArea;
                } else {
                    left++;
                }
            } else {
                sumArea = (right - left) * height[right];
                if (sumArea > result) {
                    result = sumArea;
                } else {
                    right--;
                }
            }
        }
        return result;
    }


}
