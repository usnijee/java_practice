package lecture.dataStructure.deque.practice.practice1;
// Practice1
// 데이터 재정렬
// D_0 -> D_1 -> ... -> D_n-1 -> D_n 순으로 되어 있는 데이터를
// D_0 -> D_n -> D_1 -> D_n-1 -> ... 순이 되도록 재정렬 하시오.

// 입력 예시)
// 입력 데이터: 1 -> 2 -> 3 -> 4 -> 5
// 출력 데이터: 1 -> 5 -> 2 -> 4 -> 3

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.stream.IntStream;

public class Practice1_2 {
    public static void reorderData(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        IntStream.of(arr).forEach(x -> deque.offerLast(x)); // IntStream.of를 통해 arr를 스트림형태로 변경 가능
//        System.out.println(deque);

        while (!deque.isEmpty()) {
            result.add(deque.removeFirst());

            if (!deque.isEmpty()) {
                result.add(deque.removeLast());
            }
        }

        System.out.println("== 정렬 전 ==");
        printData(arr);
        System.out.println("== 정렬 후 ==");
        printData(result.stream().mapToInt(x -> x).toArray());

    }

    private static void printData(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 3, 4, 5};
        reorderData(arr);   // 1 -> 5 -> 2 -> 4 -> 3

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        reorderData(arr2);  // 1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4
    }
}
