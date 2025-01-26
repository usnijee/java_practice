package algorithm.sort.review.sort3;
/**
 * CountingSort(계수 정렬)
 * - 숫자끼리 비교하는 정렬 방법이 아니다
 * - 정렬의 대상중에서 각 숫자의 빈도 즉, 개수를 파악한 후 해당 숫자를 인덱스로 하는 배열에 개수를 value로 저장하는 방식
 *
 * O(n+k)의 성능을 가짐 k는 정렬 대상의 max 값을 의미
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CountingSortReview {

    public static void main(String[] args) {
        // Test code
        int[] arr = {10, 32, 10, 27, 32, 17, 99, 56};
        countingSort(arr);
        System.out.println("계수 정렬: " + Arrays.toString(arr));
    }

    private static void countingSort(int[] arr) {
        // 1. 저장공간을 ArrayList로 하는 계수정렬

//        int max = Arrays.stream(arr).max().getAsInt(); // arr의 최댓값 구하기
//        int[] cntArr = new int[max + 1]; // 카운팅 테이블, arr의 최댓값만큼 크기를 갖는 ArrayList를 카운팅 테이블로 사용
//
//        for (int i = 0; i < arr.length; i++) {
//            // cntArr에서 arr[i]와 동일한 인덱스 위치의 값을 counting
//            cntArr[arr[i]]++; // 반복문을 돌며 arr[i]라면 cntArr의 arr[i]의 인덱스의 값을 +1 하여 카운팅
//        }
//
//        // 카운팅 테이블의 값을 반복문을 통해 확인하며 오름차순으로 arr을 갱신
//        int idx = 0;
//        for (int i = 0; i < cntArr.length; i++) {
//            while (cntArr[i] > 0) {
//                arr[idx++] = i; // arr[idx]에 해당하는 부분을 i로 갱신하고 idx++
//                cntArr[i]--;
//            }
//        }

        // 2. 저장공간을 HashMap을 활용한 계수정렬
        // 1번의 단점 -> 카운팅 테이블을 배열로 하면 arr의 max만큼의 크기로 만들어야하기에 max가 엄청 크다면 메모리 효율이 떨어짐

        HashMap<Integer, Integer> map = new HashMap<>(); // 카운팅 테이블 형성
        for (int item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1); // 카운팅 테이블에 각 item의 개수를 저장
        }

        // 카운팅 테이블에 저장된 values(=item의 갯수들)을 오름차순 정렬하여 ArrayList에 저장
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
}
