package lecture.dataStructure.linear.deque.practice.practice1;
// Practice1
// 데이터 재정렬
// D_0 -> D_1 -> ... -> D_n-1 -> D_n 순으로 되어 있는 데이터를
// D_0 -> D_n -> D_1 -> D_n-1 -> ... 순이 되도록 재정렬 하시오.

// 입력 예시)
// 입력 데이터: 1 -> 2 -> 3 -> 4 -> 5
// 출력 데이터: 1 -> 5 -> 2 -> 4 -> 3

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {
    public static void reorderData(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();

        int idx = 0;

        while (idx <= arr.length / 2) {
            if (idx == arr.length / 2) {
                deque.offerLast(arr[idx]);
                break;
                // continue를 하게 되면 if문을 나감과 동시에 해당 회차 반복문을 나가게됨 ->
            }
            deque.offerLast(arr[idx]);
            deque.offerLast(arr[arr.length - 1 - idx]);
            idx++;
        }

        System.out.println(deque);

    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 3, 4, 5};
        reorderData(arr);   // 1 -> 5 -> 2 -> 4 -> 3

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        reorderData(arr2);  // 1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4
    }
}
