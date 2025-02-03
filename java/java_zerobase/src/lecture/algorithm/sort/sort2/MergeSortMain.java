package lecture.algorithm.sort.sort2;
// 알고리즘 - 정렬_2
// 합병 정렬
import java.util.Arrays;

public class MergeSortMain {

    public static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        /**
         * arr : sort할 배열
         * tmp : 분할한 대상을 합병할 시 임시로 저장할 저장공간
         * left :
         */
        if (left < right) {
            int mid = (left + right) / 2; // 중앙값
            // 중앙값 기준 분할
            mergeSort(arr, tmp, left, mid); // 중앙값 기준 왼쪽
            mergeSort(arr, tmp, mid + 1, right); // 중앙값 기준 오른쪽
            merge(arr,tmp,left,right,mid);
        }

    }

    public static void merge(int[] arr, int[] tmp, int left, int right, int mid) {
        int p = left; // p: 왼쪽 분할의 시작위치 인덱스
        int q = mid + 1; // q: 오른쪽 분할의 시작위치 인덱스
        int idx = p;

        // 왼쪽 분할 오른쪽 분할 각각의 끝값보다 p,q가 작다면 계속 반복
        while (p <= mid || q <= right) {
            if (p <= mid && q <= right) {
                if (arr[p] <= arr[q]) {
                    tmp[idx++] = arr[p++];
                } else {
                    tmp[idx++] = arr[q++];
                }
            } else if (p <= mid && q > right) {
                tmp[idx++] = arr[p++];
            } else {
                tmp[idx++] = arr[q++];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
        }

    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 5, 2, 7, 1, 4, 6};
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);
        System.out.println("합병 정렬: " + Arrays.toString(arr));
    }
}
