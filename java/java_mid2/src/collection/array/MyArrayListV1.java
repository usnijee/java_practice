package collection.array;

import java.util.Arrays;

/**
 * 배열을 활용하여 직접 List 자료구조 만들어보기
 */
public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private  Object[] elementData;
    private int size = 0;

    // 기본 생성자
    public MyArrayListV1() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    // 사용자 정의 생성자(배열의 크기 선택 가능)
    public MyArrayListV1(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    // getter - size 반환
    public int size() {
        return size;
    }

    // 리스트에 데이터 추가
    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    // 특정 인덱스의 value 반환
    public Object get(int index) {
        return elementData[index];
    }

    // 특정 인덱스의 value 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue; // 해당 인덱스의 변경 전 value 반환
    }

    // 특정 value 의 인덱스 반환
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    // size 크기만큼의 elementData를 복사 후 반환
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}
