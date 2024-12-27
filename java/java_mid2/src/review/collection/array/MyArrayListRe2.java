package review.collection.array;

import java.util.Arrays;

public class MyArrayListRe2 {

    private static final int DEFAULT_SCALE = 5; // Default 배열 크기
    private Object[] elementArray; //저장공간인 배열
    private int size = 0; // 현재 배열의 크기(현재 배열에 들어있는 원소 개수)

    // default 생성자
    public MyArrayListRe2() {
        this.elementArray = new Object[DEFAULT_SCALE];
    }

    // 배열의 크기를 파라미터로 받는 생성자
    public MyArrayListRe2(int scale) {
        this.elementArray = new Object[scale];
    }

    /**
     * ArrayList 오퍼레이션 직접 구현
     */

    // 데이터 추가
    public void add(Object value) {
        if (size == elementArray.length) {
            grow(); // 배열의 크기를 동적으로
        }
        elementArray[size] = value;
        size++;
    }

    // 특정 인덱스 위치에 데이터 추가
    public void add(int index, Object value) {
        if (size == elementArray.length) {
            grow();
        }
        shiftRightFrom(index); // index이후의 value들을 모두 오른쪽으로 이동시키기
        elementArray[index] = value; // index위치에 value 저장
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementArray[i] = elementArray[i - 1];
        }
    }

    private void grow() {
        int oldScale = elementArray.length;
        int newScale = oldScale * 2;
        elementArray = Arrays.copyOf(elementArray, newScale);
    }

    // 특정 인덱스의 value 갖고오기
    public Object get(int index) {
        return elementArray[index];
    }

    // 특정 인덱스의 value 변경하기
    public Object set(int index, Object value) {
        Object oldValue = get(index);
        elementArray[index] = value;
        return oldValue;
    }

    // 특정 value의 인덱스 반환
    public int indexOf(Object value) {
        for (int i = 0; i < elementArray.length; i++) {
            if (elementArray[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementArray,size));
    }
}
