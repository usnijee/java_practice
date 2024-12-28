package review.collection.array;

import java.util.Arrays;

public class MyArrayListRe3 {

    private static final int DEFALUT_SIZE = 10;
    private Object[] elementArr;
    private int size = 0;

    public MyArrayListRe3() {
        this.elementArr = new Object[DEFALUT_SIZE];
    }

    public MyArrayListRe3(int initialSize) {
        this.elementArr = new Object[initialSize];
    }

    public void add(Object o) {
        if (size == elementArr.length) {
            makeNewArr();
        }
        elementArr[size] = o;
        size++;
    }

    public void add(int index, Object o) {
        if (size == elementArr.length) {
            makeNewArr();
        }
        shiftRightFrom(index);
        elementArr[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementArr[i] = elementArr[i - 1];
        }
    }

    private void makeNewArr() {
        int arrSize = elementArr.length;
        int newArrSize = arrSize * 2;
        elementArr = Arrays.copyOf(elementArr, newArrSize);
    }

    public Object get(int index) {
        return elementArr[index];
    }

    public void set(int index, Object o) {
        elementArr[index] = o;
    }

    public void remove(int index) {
        shiftLeftFrom(index);
        size--;
    }
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size; i++) {
            elementArr[i] = elementArr[i + 1];
        }
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementArr[i])) {
                return i;
            }
        }
        return -1;
    }

}
