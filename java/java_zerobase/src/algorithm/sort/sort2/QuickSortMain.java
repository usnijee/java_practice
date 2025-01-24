package algorithm.sort.sort2;

import java.util.Arrays;

public class QuickSortMain {

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // pivot을 설정하는 알고리즘은 많지만
        int i = left;  // i : pivot보다 최초로 큰 값을 찾는 즉, 우측 방향 진행
        int j = right; // j : pivot보다 최초로 작은 값을 찾는 즉, 좌측 방향 진행

        while (i < j) {
            // pivot보다 arr[j]가 큰 경우 pivot보다 작은 값을 찾기위해 j--(좌측방향 진행)
            while (arr[j] > pivot && i < j) {
                j--;
            }

            // pivot보다 arr[j]가 작은 경우 pivot보다 큰 값을 찾기위해 i--(우측방향 진행)
            while (arr[i] <= pivot && i < j) {
                i++;
            }

            swap(arr, i, j);
        }
        swap(arr, left, i); // 최종적으로 pivot(left)과 엇갈린점 교체

        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 9, 4, 5, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("퀵 정렬: " + Arrays.toString(arr));
    }
}
