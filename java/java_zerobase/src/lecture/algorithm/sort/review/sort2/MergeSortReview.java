package lecture.algorithm.sort.review.sort2;

import java.util.Arrays;

public class MergeSortReview {

    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 5, 2, 7, 1, 4, 6};
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);
        System.out.println("합병 정렬: " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            /**
             * 재귀를 통해 arr을 분할
             */
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, end, mid);
        }

    }

    private static void merge(int[] arr, int[] tmp, int start, int end, int mid) {
        int part1 = start; // 왼쪽 분할의 시작 위치 인덱스,, mid: 왼쪽 분할의 끝 인덱스
        int part2 = mid + 1; // 오른쪽 분할의 시작 위치 인덱스  ,, right: 오른쪽 분할의 끝 인덱스
        int idx = start; // 정렬된 값을 tmp에 넣기위해 필요한 인덱스

        while (part1 <= mid || part2 <= end) {
            if (part1 <= mid && part2 <= end) {
                /**
                 * 분할된 각 part의 숫자들을 순차적으로 비교하여 오름차순으로 tmp에 저장하는 과정
                 */
                if (arr[part1] <= arr[part2]) {
                    //tmp[idx++] = arr[part1++];
                    tmp[idx] = arr[part1];
                    part1++;
                } else {
                    tmp[idx] = arr[part2];
                    part2++;
                }
                idx++;
            } else if (part1 <= mid && part2 > end) {
                /**
                 * part1쪽에 비교할 숫자가 남고 part2 비어있는 경우
                 */
                tmp[idx] = arr[part1];
                part1++;
                idx++;
            } else {
                /**
                 * part2쪽에만 비교할 숫자가 남아 있는 경우
                 */
                tmp[idx] = arr[part2];
                part2++;
                idx++;
            }
        }

        // 정렬된 tmp를 이용하여 arr을 갱신
        for (int i = start; i <= end; i++) {
            arr[i] = tmp[i];
        }

    }
}
