package collection.iterable;

import java.util.Iterator;

/**
 *  직접 구현하는 iterator1 : ArrayIterator
 *
 *  iterator, 순회자는 특정 자료구조를 '순회'하며 각 요소를 참조 즉, '조회'하는 것임 ,, 삽입하는것이 아니다
 */

/**
 * 전위, 후위 증감자는 단독으로 사용될때는 차이가 없음 다만 증감자와 다른 연산이 같이 발생하는 경우 순서의 차이가 있음
 * int a=0;
 * int b = ++a; // 전위 증감자: 기존의 a의 값이 +1만큼 증가하고 -> 그 값이 b에 대입   // b=1
 * int c = a++; // 후위 증감자: 기존의 a의 값이 b에 대입되고 -> 기존의 a값이 +1만큼 증가 // c=0
 */
public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr; // 순회 대상

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex]; // currentIndex는 -1부터 시작
    }
}
