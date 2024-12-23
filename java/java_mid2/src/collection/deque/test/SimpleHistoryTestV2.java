package collection.deque.test;
/**
 * 간단한 히스토리 확인
 * 스택에 push() 를 통해서 다음 데이터를 순서대로 입력해라.
 * "youtube.com"
 * "google.com"
 * "facebook.com"
 * 스택에 pop() 을 통해서 데이터를 꺼내고, 꺼낸 순서대로 출력해라.
 * "facebook.com"
 * "google.com"
 * "youtube.com"
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SimpleHistoryTestV2 {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
