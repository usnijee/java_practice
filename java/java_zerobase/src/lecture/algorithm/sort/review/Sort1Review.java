package lecture.algorithm.sort.review;

import java.util.Arrays;

public class Sort1Review {

    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 5, 2, 7, 1, 4};
        bubbleSort(arr);
        System.out.println("버블 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        insertionSort(arr);
        System.out.println("삽입 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        selectionSort(arr);
        System.out.println("선택 정렬: " + Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        // 버블 정렬1
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                /**
                 * 버블 정렬은 한 사이클을 돌때마다 (오름차순 정렬의 경우) 최댓값이 맨 우측에 차례대로 정렬이 되어야함
                 * 즉, 한 사이클 정렬을 돌면 그 다음 사이클은 이전 사이클에서 최댓값이 하나 결정되었기에 arr.length - i 만큼 정렬과정을 진행해야 한다
                 */
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        // 버블 정렬2
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
    }

    private static void insertionSort(int[] arr) {
        // 삽입 정렬
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    /**
                     * 이미 정렬이 되어 있는 경우 반복문을 나가 다음 인덱스 기준 정렬을 진행해야한다
                     */
                    break;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        //선택정렬1
        //arr의 0부터 arr.length까지 각각 min의 위치로 두고 이후의 값들 중에서 최솟값을 찾은 후 min위치와 교환하는 방식
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                /**
                 *  i번째 이후에서 최소값을 찾는 과정
                 */
                if (arr[j] < arr[min]) {
                    min = j; // 반복문을 돌며 arr[min]의 값보다 작은 값들의 인덱스를 min으로 계속 갱신하여 가장작은 값을 추출
                }
            }
            // 값 교환
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

}
