package review.collection.iterable;
/**
 * Iterator의 구현체 MyArrayIterator 구현해보기
 * Iterator의 구현체라는 것은 특정 자료구조를 순회시키는 도구가 됨
 */

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
