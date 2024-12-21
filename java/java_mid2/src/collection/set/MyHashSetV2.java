package collection.set;
/**
 * 모든 타입을 저장할 수 있는 Set
 */

/**
 *  단축키
 *  ctrl + alt + n : Inline variable -> 최대한 축약
 *  ctrl + alt + m : 공통부분 메서드 추출
 */

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBucket();
    }

    // capacity를 사용자 정의 가능하도록 설정
    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    // 생성자 초기화 메서드
    private void initBucket() {
        buckets = new LinkedList[capacity]; // set의 원소를 LinkedList로 구현하여 해시충돌을 방지
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // value 추가 메서드
    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) { // set의 원소인 LinkedList내부에 중복된 원소가 있는지 확인 -> 동일한 원소를 한번더 저장할 이유는 없음 (set의 특징)
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    // value 포함 여부 확인 메서드
    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    // 특정 value 제거 메서드
    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);// 중요 -> List의 remove는 index기준, Object 기준 삭제가 존재 --> Object 타입으로 삭제해야 그 value를 기준으로 바로 삭제됨 따라서, 래퍼타입으로 변경 필요
        if (result) {
            size--;
            return true;
        }else {
            return false;
        }
    }

    // 해시 인덱스 구하는 메서드
    private int hashIndex(Object value) {
        // -1, -10 -> 1, 10
        // hashCode가 음수가 나올 수 있음
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
