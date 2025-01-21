package lecture.dataStructure.array.practice;

import java.util.Arrays;

public class Practice3 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
//        int[] result = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            result[arr.length - 1 - i] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(result));
//    }
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
