package review.collection.iterable;
/**
 * Iterable의 구현체는 뭘 의미할까?
 * Iterable을 상속하면 iterator() 메서드를 오버라이딩 해야하는 데 이는 사용자가 정의한 Iterator를 반환한다
 *
 * 즉, Iterable의 구현체라는 것은 해당 자료구조는 '순회가능한' 자료구조이며 순회자(iterator)를 사용할 수 있음을 나타낸다
 * 또한 Iterable 인터페이스의 iterator() 메서드를 오버라이딩함으로써 해당 자료구조를 해당 자료구조에 맞는 iterator를 사용하여 순회가 가능해진다
 */

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {

    private int[] numbers; // 데이터 저장 공간

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
