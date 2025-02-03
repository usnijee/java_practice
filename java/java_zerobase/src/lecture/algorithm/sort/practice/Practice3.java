package lecture.algorithm.sort.practice;

// Practice3
// intervals 라는 구간으로 이루어진 배열이 주어졌을 때,
// 오버랩 되는 구간을 합치는 프로그램을 작성하세요.

// 입출력 예시
// 입력: [2, 6], [1, 3], [15, 18], [8, 10]
// 출력: [1, 6] [8, 10] [15, 18]

import java.util.ArrayList;
import java.util.Arrays;

public class Practice3 {

    public static ArrayList<int[]> solution(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return new ArrayList<>();
        }

        sort(intervals);

        ArrayList<int[]> result = new ArrayList<>();
        int[] curInterval = intervals[0]; // 구간의 첫번째 인터벌
        result.add(curInterval);

        for (int i = 1; i < intervals.length; i++) {
            if (curInterval[1] >= intervals[i][0]) {
                /**
                 * curInterval의 열값이 그 다음 intervals의 행보다 크면
                 * 두 구간은 무조건 겹치는 구간이 있다는 것을 의미
                 */
                curInterval[1] = intervals[i][1];
            } else {
                /**
                 * 겹치는 구간이 없다면 curInterval을 그 다음으로 갱신
                 */
                curInterval = intervals[i];
                result.add(curInterval);
            }
        }
        return result;
    }

    public static void sort(int[][] intervals) {
        /**
         * quickSort를 활용하여 2차원배열의 행을 기준으로 2차원 배열을 정렬
         * ex. 정렬된 결과
         * {{1, 3}, {2, 6}, {8, 10], {15, 18}}
         */
        quickSort(intervals, 0, intervals.length - 1);
    }

    public static void quickSort(int[][] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[][] arr, int start, int end) {
        int pivot = arr[start][0];
        int i = start;
        int j = end;

        while (i < j) {
            while (arr[j][0] > pivot && i < j) {
                j--;
            }

            while (arr[i][0] <= pivot && i < j) {
                i++;
            }

            swap(arr, i, j);
        }
        swap(arr, start, i);

        return i;
    }

    private static void swap(int[][] arr, int i, int j) {
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // Test code
        int[][] intervals = {{2, 6}, {1, 3}, {15, 18}, {8, 10}};

        for (int[] item: solution(intervals)) {
            System.out.print(Arrays.toString(item) + " ");
        }
        System.out.println();

    }
}
