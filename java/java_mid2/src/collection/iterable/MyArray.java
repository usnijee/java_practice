package collection.iterable;
/**
 * MyArray: 간단한 자료구조의 예시
 * Iterable 인터페이스를 상속받음 == MyArray라는 자료구조가 '순회가능한' 자료구조임을 나타내는 것
 * 오버라이딩을 통해서 Iterable 인터페이스가 제공하는 iterator를 재정의하여 MyArrayIterator를 반환하면
 *
 * 최종적으로 MyArray는 순회가능한 자료구조가 되는것임
 */

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
