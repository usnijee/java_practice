package lecture.basicMath.practice.practice1.practice2;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 2, 1};
        solution(arr);

        arr = new int[]{1, 9, 4, 7, 6};
        solution(arr);

        arr = new int[]{1, 1, 2, 3};
        solution(arr);
    }

    public static void solution(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        int idx = -1; // swap할 인덱스
        for (int i = arr.length - 1; i >= 1; i--) {
            /**
             * 맨앞자리를 제외하고 for문을 돌려
             */
            if (arr[i] < arr[i - 1]) {
                idx = i - 1;
                break;
            }
        }

        if (idx == -1) {
            /*
            idx가 갱신이 안되었다는 것은 -> swap할 대상이 없다는 뜻 = 오름차순정렬이 되어 있다는 뜻
             */
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = arr.length - 1; i > idx; i--) {
            /**
             * 찾은 인덱스 위치와 바꾸기
             */
            if (arr[i] < arr[idx] && arr[i] != arr[i - 1]) {
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
