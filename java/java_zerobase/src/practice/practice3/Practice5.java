package practice.practice3;

public class Practice5 {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solution(height));

        height = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(solution(height));
    }

    public static int solution(int[] height) {
        int left = 0;
        int leftHeightMax = 0;
        int right = height.length - 1;
        int rightHeightMax = 0;
        int result = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftHeightMax) {
                    leftHeightMax = height[left];
                } else {
                    result += leftHeightMax - height[left];
                }
                left++;
            } else if (height[left] >= height[right]) {
                if (height[right] >= rightHeightMax) {
                    rightHeightMax = height[right];
                } else {
                    result += rightHeightMax - height[right];
                }
                right--;
            }
        }
        return result;
    }


}
