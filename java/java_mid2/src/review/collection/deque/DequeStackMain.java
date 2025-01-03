package review.collection.deque;
/**
 * 개념으로 deque는 양방향에서 추가 제거가 가능하기에 stack과 queue를 모두 구현이 가능
 * java에서는 deque를 사용하여 push, pop을 사용가능하게 하여 stack으로 사용 가능하게 하였음
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
