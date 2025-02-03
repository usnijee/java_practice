package lecture.algorithm.sort.sort3;
// 계수 정렬

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CountingSortMain {

    public static void countingSort(int[] arr) {
//        int max = Arrays.stream(arr).max().getAsInt();
//        int[] cntArr = new int[max + 1];
//
//        for (int i = 0; i < arr.length; i++) {
//            // cntArr에서 arr[i]와 동일한 인덱스 위치의 값을 counting
//            cntArr[arr[i]]++;
//        }
//
//        // cntArr을 반복문을 통해 돌면서 카운팅 숫자를 오름차순으로 arr에 저장
//        int idx = 0;
//        for (int i = 0; i < cntArr.length; i++) {
//            while (cntArr[i] > 0) {
//                arr[idx++] = i; // i가 곧 arr의 값중 하나이므로 arr을 초기화
//                cntArr[i] -= 1;
//            }
//        }

        // ArrayList를 사용하는 것의 단점은 arr의 요소중 가장큰 수의 크기만큼 ArrayList를 형성해야한다는 것이다
        // 즉, 최댓값의 크기가 너무 크면 메모리 낭비가 너무 크다
        // HashMap을 활용하여 요소를 key로 하고 각 요소의 counting 수를 value로 하면 동적으로 추가 가능 !
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int idx2 = 0;
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int cnt = map.get(list.get(i));
            while (cnt > 0) {
                arr[idx2++] = list.get(i);
                cnt--;
            }
        }

    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 10, 27, 32, 17, 99, 56};
        countingSort(arr);
        System.out.println("계수 정렬: " + Arrays.toString(arr));
    }
}
