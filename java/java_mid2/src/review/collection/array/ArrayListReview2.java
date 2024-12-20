package review.collection.array;

import java.util.Arrays;

public class ArrayListReview2<E> {

    private Object[] elementArray;
    private int size = 0; // 현재 value가 채워져있는 정도 ex. 5크기의 배열에 idx = 3까지 채워져있음 size = 3

    public ArrayListReview2(int initialCapacity) {
        this.elementArray = new Object[initialCapacity];
    }

    // size 반환
    public int Size() {
        return size;
    }

    // 데이터 추가
    // 동적 배열을 구현
    public void add(Object o) {
        if (size == elementArray.length) {
            grow();
        }
        elementArray[size] = o;
        size ++;
    }

    // 특정 인덱스 위치에 데이터 추가
    public void add(int index, Object o) {
        if (size == elementArray.length) {
            grow();
        }
        shiftRightFrom(index);
        elementArray[index] = o;
        size ++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementArray[i] = elementArray[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementArray.length;
        int newCapacity = oldCapacity * 2;

        Object[] newArray = Arrays.copyOf(elementArray, newCapacity);
        elementArray = newArray;
    }

    // 특정 인덱스의 value 반환
    public Object get(int index) {
        return elementArray[index];
    }

    // 특정 인덱스의 value 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementArray[index] = element;
        return oldValue;
    }

    // 특정 value의 인덱스 반환
    public int indexOf(Object o) {
        for (int i = 0; i < elementArray.length; i++) {
            if (elementArray[i] == o) {
                return i;
            }
        }
        return -1;
    }

    // 특정 인덱스 value 삭제
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);

        size --;
        elementArray[size] = null; // 자동 안되나?
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i + 1];
        }
    }

    // size 크기만큼의 elementData를 복사 후 반환
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementArray,size)) +
                " size=" + size + ", capacity=" + elementArray.length;
    }
}
