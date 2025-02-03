package lecture.dataStructure.linear.practice.practice1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {

    public static void solution(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (Integer r : row) {
                matrix[r][i] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (Integer c : col) {
                matrix[i][c] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        // Test code
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution(matrix);

        System.out.println();
        matrix = new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        solution(matrix);
    }
}
