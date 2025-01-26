package algorithm.binarySearch.practice;

// Practice3
// 2차원 행렬에서 이진 탐색으로 데이터 찾기
// row x col 행렬 데이터가 주어졌을 때, target 을 이진 탐색으로 찾는 프로그램을 작성하세요.
// 각 행의 데이터는 오름차순으로 정렬 상태

// 입출력 예시
// 행렬: {{1, 3, 7, 8}, {10, 11, 15, 20}, {21, 30, 35, 60}}

// target: 3
// 출력: true

// target: 13
// 출력: false

public class Practice3 {

    public static void main(String[] args) {
        // Test code
        int[][] matrix = {{1, 3, 7, 8}, {10, 11, 15, 20}, {21, 30, 35, 60}};
        System.out.println(solution(matrix, 3));    // true
        System.out.println(solution(matrix, 13));   // false
        System.out.println(solution(matrix, 35));   // true
    }

    public static boolean solution(int[][] matrix, int target) {
        boolean result = false;

        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;

            int resultIndex = binarySearch(matrix[i], target, left, right);

            if (resultIndex >= 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -left - 1; // target이 arr에 없는경우 -left - 1 반환
    }

}
