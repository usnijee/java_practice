package lecture.algorithm.binarySearch.practice;

/**
 * 이차원 배열을 matrix[mid / cols][mid % cols]게 인덱싱한 이유?
 *
 * -> 이차원 배열을 1차원 배열처럼 인덱싱하기 위함 ex. matrix는 이차원 배열이고
 * matrix의 11은 [1][1]의 인덱스를 가짐 -> matrix가 일차원 배열이었다면 11은 인덱스 몇이었을까?
 *
 * 1, 3, 7, 8, 10, 11, 15, 20 ,21, 30, 35 60 순으로 1차원 배열이었을것이므로 11은 인덱스가 5였을것이다.
 *
 * matrix[mid / cols][mid % cols]에 그대로 적용해보자
 *
 * matrix[5/4][5/4] = matrix[1][1]이므로 mid가 5일때 11임을 알 수 있다. 이러한 방식으로 모든 이차원 배열의 요소들을 일차원 배열로 표현이 가능하며
 * 해당 mid를 통해 이진탐색이 가능하다
 */
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
