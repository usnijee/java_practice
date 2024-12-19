package collection.set;
/**
 *  Hash 충돌 -> Capacity의 나머지를 index로 활용하면 겹치는 경우가 발생 ex , 9,19,29,39는 capacity 10입장에서 모두 9를 index로 가짐
 *  이때, 해결하는 방법 -> 배열의 원소를 다른 자료구조로 설정하여 겹치는 경우의 값을 모두 저장
 *  -> Hash 충돌은 자주 발생x -> 만약에 발생한 경우 linkedlist, array와 같은 자료구조로 함께 저장하면 되는데 이때 이를 검색하려면 LinkedList가 더 낫다
 */

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        LinkedList<Integer>[] buckets = new LinkedList[CPACITY];
        for (int i = 0; i < CPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9); // 중복 -> 해시충돌 발생
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " + contains);

    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(n)

//        for (Integer integer : bucket) {
//            if (integer == searchValue) {
//                return true;
//            }
//        }
//        return false;
    }

    static int hashIndex(int value) {
        return value % CPACITY;
    }
}
