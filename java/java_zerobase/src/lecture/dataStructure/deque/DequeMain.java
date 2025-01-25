package lecture.dataStructure.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// 선형 자료구조 - 데크
// add, remove : 예외를 발생 -> 예외처리 필요
// offer, poll : null 반환 -> 예외처리 필요 없음
public class DequeMain {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();

        // Front 부분 입력
        deque.addFirst(1); // add는 isEmpty에서 예외 발생
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);

        // Rear 부분 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque);

        // Front 부분 출력
        System.out.println(deque.removeFirst());
        System.out.println(deque);

        // Rear 부분 출력
        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);

//        System.out.println(deque.removeLast()); // 예외발생
        System.out.println(deque.pollLast()); // null 반환
    }
}
