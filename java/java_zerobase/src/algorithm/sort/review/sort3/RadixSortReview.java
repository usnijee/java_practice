package algorithm.sort.review.sort3;
/**
 *  기수 정렬(RadixSort)
 *  - 낮은 자리수부터 정렬하는 방식
 *      - 즉, 일의 자리수부터 정렬하고 -> 해당 정렬된 상태에서 십의 자리수를 정렬 -> 반복 -> 0~9사이에 값이 모두 정렬됨
 *  - 각 원소간 비교연산이 아니다
 *  - 기수 테이블 필요
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSortReview {

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 52, 27, 48, 17, 99, 56};
        radixSort(arr);
        System.out.println("기수 정렬: " + Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {

        //기수 테이블 형성
        ArrayList<Queue<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // 0~9
            list.add(new LinkedList<>());
        }

        int idx = 0;
        int div = 1;
        int maxLen = getMaxLen(arr); // 최장길이를 통해 몇자리까지 정렬해야하는지 결정됨

        for (int i = 0; i < maxLen; i++) {
            // (arr[j] / div) % 10을 통해 arr의 각 요소의 자리수(일,십,백,...)에 해당하는 숫자를 구한다
            // 해당 숫자를 위치로하는 queue에 arr[j]의 값을 추가한다
            // ex. 11의 경우 1의 자리는 1이기에 인덱스 1의 queue에 11이 추가됨
            // 반복문을 통해 arr의 모든 숫자가 동일한 방식으로 추가됨
            for (int j = 0; j < arr.length; j++) {
                list.get((arr[j] / div) % 10).offer(arr[j]);
            }

            for (int j = 0; j < 10; j++) {
                Queue<Integer> queue = list.get(j);

                while (!queue.isEmpty()) {
                    arr[idx++] = queue.poll(); // arr을 자리수 정렬 상태로 갱신 -> 반복해서 maxLen자리수까지 정렬된 것을 arr에 갱신하면 최종 정렬이 끝남
                }
            }

            idx = 0;
            div *= 10;
        }
    }

    private static int getMaxLen(int[] arr) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = (int) Math.log10(arr[i]) + 1; // arr의 각 요소들의 자릿수 계산
            // 반복문을 통해 요소들중 최장 길이를 구함
            if (maxLen < len) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
