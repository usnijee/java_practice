package algorithm.binarySearch.practice;

public class Practice3_2 {

    public static void main(String[] args) {
        // Test code
        int[][] matrix = {{1, 3, 7, 8}, {10, 11, 15, 20}, {21, 30, 35, 60}};
        System.out.println(solution(matrix, 3));    // true
        System.out.println(solution(matrix, 13));   // false
        System.out.println(solution(matrix, 35));   // true
    }

    public static boolean solution(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int left = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // 행렬의 가장 끝을 이진탐색의 right로 잡음
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            } else if (matrix[mid / cols][mid % cols] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
