package lecture.algorithm.sort.sort3;
// 알고리즘 - 정렬_3
// 기수 정렬

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSortMain {
    public static void radixSort(int[] arr) {

        // 기수테이블 형성
        ArrayList<Queue<Integer>> list = new ArrayList<>();
        // 10인 이유는 각 자리수는 0~9사이이기 때문
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }

        int idx = 0;
        int div = 1;
        int maxLen = getMaxLen(arr); // 최대 자리수 -> 기수정렬은 낮은 자리수부터 정렬하는 방식이기에 주어진 숫자가 3자리수가 있다면 1,2,3 자리수를 비교해야함

        // 숫자중 최대 자리수만큼 반복문을 통해 각 자리수에 맞는 인덱스에 위치한 queue에 데이터를 저장
        for (int i = 0; i < maxLen; i++) {
            // arr의 요소들을 자리수에 맞는 queue에 데이터를 저장
            for (int j = 0; j < arr.length; j++) {
                list.get((arr[j] / div) % 10).offer(arr[j]); //(arr[j] / div) % 10 : 해당 자리수
            }

            //
            for (int j = 0; j < 10; j++) {
                Queue<Integer> queue = list.get(j);

                while (!queue.isEmpty()) {
                    arr[idx++] = queue.poll(); // 정렬된 숫자를 arr에 정렬된 상태로 저장
                }
            }

            idx = 0;
            div *= 10; // div = 1부터 시작해서 10의자리, 100의자리를 구하기 위함
        }
    }

    public static int getMaxLen(int[] arr) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = (int) Math.log10(arr[i]) + 1; // ex. log(123) = 2.xxx 이므로 123은 2 + 1 = 3자리 수
            if (maxLen < len) {
                maxLen = len;
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 52, 27, 48, 17, 99, 56};
        radixSort(arr);
        System.out.println("기수 정렬: " + Arrays.toString(arr));
    }
}
