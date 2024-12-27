package review.collection.array;

import java.util.Arrays;

public class MyArrayListRe1 {

    private static final int DEFAULT_SIZE = 5;
    private Object[] elementData;
    private int size = 0; // 현재 elementData에 들어있는 원소 개수 = 크기

    public MyArrayListRe1() {
        this.elementData = new Object[DEFAULT_SIZE];
    }

    public MyArrayListRe1(int initalArraySize) {
        this.elementData = new Object[initalArraySize];
    }

    public int getSize() {
        return size;
    }

    public void add(Object e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }


    public void add(int index, Object e) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public Object indexOf(Object o) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i].equals(o)) {
                return elementData[i];
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
