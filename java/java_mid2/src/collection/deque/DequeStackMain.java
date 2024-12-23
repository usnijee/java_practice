package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  Deque 자료구조를 stack으로 사용할 수 있음 이때 단순히 Deque의 offer와 poll이 아닌
 *  stack의 push pop을 그대로 사용할 수 있음
 */
public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Object> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        // 데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
    }
}
