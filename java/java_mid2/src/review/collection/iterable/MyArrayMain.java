package review.collection.iterable;
/**
 * 즉, 순회를 사용하기위해서는
 *
 * 1. iterable을 상속한 자료구조내에 iterator() 메서드를 오버라이딩하여 재정의해아한다
 * 2. 해당 자료구조에 맞게 Iterator인터페이스를 상속한 iterator를 구현해야한다
 */

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator(); // myArray 자료구조의 iterator
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }
    }
}
