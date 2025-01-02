package review.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 해시의 개념이해 + 나머지 연산을 이용한 해시 인덱스 구현 + 해시 충돌 구현 복습
 */
public class HashStart {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1,2,5,8,14,99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // 저장공간
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); // 해시 충돌 구현을 위해 원소의 형태를 LinkedList형태로 구현
        }

        // 데이터 추가
        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 해시 충돌 예시
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 데이터 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
