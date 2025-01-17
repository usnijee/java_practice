package practice.practice3;

import java.util.ArrayList;

public class Practice4 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(solution(matrix));

        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(solution(matrix));
    }

    public static ArrayList<Integer> solution(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd ; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd ; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return result;
//        while (true) {
//            if ((row == 0) && (col < 2)) {
//                result.add(matrix[row][col]);
//                matrix[row][col] = 0;
//                col++;
//            } else if (row < 2 && col == 2){
//                result.add(matrix[row][col]);
//                matrix[row][col] = 0;
//                row++;
//            } else if ((row == 2) && (col > 0)) {
//                result.add((matrix[row][col]));
//                matrix[row][col] = 0;
//                col--;
//            } else if (row > 0 && col == 0 ) {
//                result.add((matrix[row][col]));
//                matrix[row][col] = 0;
//                row--;
//            } else if (row == 1 && col < 2) {
//                result.add(matrix[row][col]);
//                matrix[row][col] = 0;
//                col++;
//            } else {
//                throw new IllegalArgumentException("잘못 입력함");
//            }
//
//            if ()
//        }
    }
}
