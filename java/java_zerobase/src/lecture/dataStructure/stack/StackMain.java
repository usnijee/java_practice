package lecture.dataStructure.stack;

import java.util.Stack;

/**
 * stack은 LIFO 자료구조
 *
 * 데이터가 입력된 순서의 역순으로 처리되어야 할 때 사용
 * -> EX. 함수 콜 스택, 수식 계산, 인터럽트 처리
 */
public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        System.out.println(stack.pop()); // stack의 pop은 단순히 빼는 것 뿐만 아니라 조회기능도 있음
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek()); // peek은 가장 상단의 요소를 조회하는 기능

        System.out.println(stack.pop());
        System.out.println(stack);

        // contains
        System.out.println(stack.contains(1));

        // stack의 현재 요소의 개수
        System.out.println(stack.size());

        // stack의 empty인지 아닌지
        System.out.println(stack.empty());

        // stack 비우기
        stack.clear();
        System.out.println(stack);


    }
}
