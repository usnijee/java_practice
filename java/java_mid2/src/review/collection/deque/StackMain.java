package review.collection.deque;

import java.util.Stack;

/**
 * 자바에서 제공하는 Stack은 사용하지 말 것
 * Stack은 vector라는 자바 초기에 제공된 자료구조를 사용하는데 더이상 사용하지 않고 하위호환에만 사용됨
 * deque를 사용할것 -> deque를 통해 queue와 stak 모두 구현 가능
 */
public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
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
