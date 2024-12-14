package collection.array;
/**
 *  배열의 특정 인덱스에 값 추가하기
 *  원리> 기존 배열의 특정 인덱스의 값부터 오른쪽의 값들을 오른쪽으로 한칸씩 대입을 하면 해당 특정 인덱스에 새로운 값을 대입할 수 있게됨
 *
 *  1. 첫번째 인덱스에 추가 -> O(n)
 *  2. 중간에 추가 -> O(n)
 *  3. 마지막에 추가 -> O(1)
 */

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가(중간 삽입)
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        // 배열의 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        int lastValue = 1;
        addLast(arr, lastValue);
        System.out.println(Arrays.toString(arr));

    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length-1; i > index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    private static void addLast(int[] arr, int lastValue) {
        arr[arr.length-1] = lastValue;
    }
}
