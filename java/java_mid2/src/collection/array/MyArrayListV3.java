package collection.array;

import java.util.Arrays;

/**
 * 배열 기능 추가 : 특정 인덱스의 값 추가 및 삭제
 */
public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    // 기본 생성자
    public MyArrayListV3() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    // 사용자 정의 생성자(배열의 크기 선택 가능)
    public MyArrayListV3(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    // getter - size 반환
    public int size() {
        return size;
    }

    // 리스트에 데이터 추가
    public void add(Object e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가 - 특정 인덱스 위치에 값 추가하기
    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }
        // 코드 추가
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index ; i--) {
            elementData[i] = elementData[i-1];
        }

    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        elementData = newArr; // 최종적으로 참조를 바꾼다
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

    // 코드 추가
    public Object remove(int index) {
        Object oldValue = get(index);
        // 데이터 왼쪽 이동
        shiftLeftFrom(index);

        size --;
        elementData[size] = null;
        return oldValue;
    }

    // 코드 추가 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
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
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}
