package algorithm.twoPointers;
// 알고리즘 - 투 포인터
// for-loop vs two pointers

import java.util.Arrays;

public class twoPointersMain {

    public static int[] forLoop(int[] arr, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (sum == target) {
                    result[0] = i;
                    result[1] = j - 1;
                    break;
                }
                sum += arr[j];
            }
            if (sum == target) {
                break;
            }
        }
        return result;
    }

    public static int[] twoPointers(int[] arr, int target) {
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int[] result = {-1, -1};

        while (true) {
            if (sum > target) {
                sum -= arr[p2++]; // p2만큼 빼줌
            } else if (p2 == arr.length) {
                break;
            } else {
                sum += arr[p1++]; // p1만큼 더해줌
            }

            if (sum == target) {
                result[0] = p2;
                result[1] = p1 - 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 2, 4, 3, 2};
        System.out.println(Arrays.toString(forLoop(arr, 9)));
        System.out.println(Arrays.toString(forLoop(arr, 14)));
        System.out.println();

        System.out.println(Arrays.toString(twoPointers(arr, 9)));
        System.out.println(Arrays.toString(twoPointers(arr, 14)));
    }
}

