package algorithm.sort.review.sort2;

import java.util.Arrays;

public class QuickSortReview {

    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 9, 4, 5, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("퀵 정렬: " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int part1 = start; // pivot 기준 우측 방향으로 진행하며, pivot보다 큰 값을 찾는 로직의 시작 인덱스
        int part2 = end; // pivot 기준 좌측 방향으로 진행하며, pivot보다 작은 값을 찾는 로직의 시작 인덱스

        while (part1 < part2) {

            while (arr[part2] > pivot && part1 < part2) {
                /**
                 * pivot보다 작은 값을 찾기위함
                 * 즉, pivot보다 크거나 같은 값은 part2--을 통해 좌측으로 넘어감 (시작은 끝)
                 */
                part2--;
            }

            while (arr[part1] <= pivot && part1 < part2) {
                /**
                 *  pivot보다 큰 값을 찾기위함
                 *  즉, pivot보다 작거나 같은 값은 part1++을 통해 우측으로 넘어감
                 */
                part1++;
            }

            /**
             * while문의 조건에 위배 되어 최종 저장된 part1과 part2가 의미하는 것
             * 최종 part1 : pivot보다 큰 값의 위치
             * 최종 part2 : pivot보다 작은 값의 위치
             */
            swap(arr, part1, part2);
        }
        /**
         * while(part1 < part2)의 조건 위배
         * -> pivot보다 큰값이 없어서 계속 part1++을 하고 pivot보다 작은 값이 없어서 계속 part2--를 하다가
         * part1과 part2가 엇갈린 지점 즉, part1 == part2된 지점에서 pivot의 위치와 swap
         *
         * 이 과정이 QuickSort의 한 사이클
         *
         * 이렇게 되면 pivot 기준으로 좌측에는 pivot보다 작은 값들, 우측에는 pivot보다 큰 값들로 구성이 되고
         * 각각에 동일한 과정을 거치면 sorting 완료
         */
        swap(arr, start, part1);

        return part1;
    }

    private static void swap(int[] arr, int part1, int part2) {
        int tmp = arr[part1];
        arr[part1] = arr[part2];
        arr[part2] = tmp;
    }
}
