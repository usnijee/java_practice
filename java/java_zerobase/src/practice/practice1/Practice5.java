package practice.practice1;

public class Practice5 {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));
        System.out.println(solution2(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));
        System.out.println(solution2(height));
    }

    // 나의 풀이
    // left를 기준으로 면적을 다 계산하고 -> left를 1올려 기준을 바꿔줌 즉, 가능한 모든 경우의 수를 다 계산한것
    private static int solution(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int maxArea = 0;

        while (left < right) {
            for (int i = left + 1; i < height.length ; i++) {
                if (height[left] >= height[i]) {
                    area = height[i] * (i - left);
                } else {
                    area = height[left] * (i - left);
                }
                maxArea = maxArea <= area ? area : maxArea;
            }
            left++;
         }
        return maxArea;
    }

    // 선생님 풀이
    // 밑변이 가장 긴 상황인 인덱스 0과 인덱스 hegith.length - 1부터 시작하여 밑변을 줄여가며 계산
    private static int solution2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int x = (right - left);
            int y = height[left] < height[right] ? height[left] : height[right];
            int curArea = x * y;
            maxArea = maxArea > curArea ? maxArea : curArea;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
