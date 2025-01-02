package review.collection.set;
/**
 * MyHashSetV0에 추가된 사항
 *
 * 1. 제너릭 타입으로 런타임 환경에서 데이터 타입 결정
 * 2. hashIndex 리팩토링 -> HashSet으로 유입되는 모든 데이터 타입은
 *      a. 참조형
 *      b. hashCode() 와 equals()의 오버라이딩을 통한 재정의
 *    이 반드시 적용되어야 함
 *    따라서, hashIndex를 구할때 hashCode()를 사용하여 hashIndex를 구하도록 리팩토링
 */

import java.util.LinkedList;

public class MyHashSetV1<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // 데이터 추가
    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    // 데이터 조회
    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    // 데이터 삭제
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value); // LinkedList는 remove(int index), remove(Object object) 존재 즉, 기본형을 사용하면 값이 아닌 인덱스로 인식
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) % capacity;
    }
}
