package dataStructure.array.practice;

import java.util.ArrayList;

public class Practice4 {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    result.add(arr[i]);
                }
            } else if (i == arr[arr.length - 1]) {
                if (arr[arr.length - 1] > arr[arr.length - 2]) {
                    result.add(arr[arr.length - 1]);
                }
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    result.add(arr[i]);
                }
            }
        }

        System.out.println(result);

    }
}
