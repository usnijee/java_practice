package lecture.dataStructure.linear.array.practice;

import java.util.Arrays;

/**
 * 2차원 배열 arr을 시계방향 90도 회전시킨 결과를 출력하세요.
 */
public class Practice7 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};

        int[][] result = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                result[i][(arr.length - 1) - j] = arr[j][i];
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}
