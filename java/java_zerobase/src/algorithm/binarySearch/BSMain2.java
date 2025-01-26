package algorithm.binarySearch;

import java.util.Arrays;

public class BSMain2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};

        System.out.println("== 데이터가 있는 경우 ==");
        System.out.println(Arrays.binarySearch(arr, 30));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 10));

        System.out.println("== 데이터가 없는 경우 ==");
        /**
         * 데이터가 없는 경우 해당 데이터가 있었을시의 위치 + 1 후 음수화 한 것
         *
         * 위의 결과를 역으로 1을 더하고 양수화 하면 해당 숫자가 현재 arr에서 가져야할 위치를 알 수 있음
         */
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 35));

    }
}
