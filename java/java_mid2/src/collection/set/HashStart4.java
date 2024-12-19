package collection.set;
/**
 * HashIndex 사용하기 --> capactity가 10이라면 나머지 연산을 사용하면 어떤 수든 0~9안으로 나옴 --> 이를 배열의 인덱스로 활용하자
 */

import java.util.Arrays;

public class HashStart4 {

    static final int CPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        Integer result = inputArray[hashIndex];
        System.out.println(result);

    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CPACITY;
    }
}
