package lecture.dataStructure.stack.practice;
// Practice3
// 후위표기법 연산
// 참고 설명) 전위/중위/후위 표기법

// 입출력 예시)
// 입력: "2 2 +"
// 출력: 4

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// 입력: "2 2 -"
// 출력: 0
public class Practice3 {
    public static double calculate(String string) {
        Stack<String> stack = new Stack<>();

        for (String s : string.split(" ")) {
            int num = 0;

            if (s.equals("+")) {
                for (int i = 0; i < 2; i++) {
                    num += Integer.parseInt(stack.pop());
                }
                stack.push(String.valueOf(num));

            } else if (s.equals("-")) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        num -= Integer.parseInt(stack.pop());
                    } else {
                        num += Integer.parseInt(stack.pop());
                    }
                }
                stack.push(String.valueOf(num));
            } else if (s.equals("*")) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        num += Integer.parseInt(stack.pop());
                    } else {
                        num *= Integer.parseInt(stack.pop());
                    }
                }
                stack.push(String.valueOf(num));
            } else if (s.equals("/")) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        num += Integer.parseInt(stack.pop());
                    } else {
                        num  = Integer.parseInt(stack.pop()) / num;
                    }
                }
                stack.push(String.valueOf(num));
            } else {
                stack.push(s);
            }
        }
        return Double.parseDouble(stack.pop());
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(calculate("2 2 +"));    // 4
        System.out.println(calculate("2 2 -"));    // 0
        System.out.println(calculate("2 2 *"));    // 4
        System.out.println(calculate("2 2 /"));    // 1

        System.out.println(calculate("1 1 + 2 * 3 * 2 / 5 -"));    // 1
        System.out.println(calculate("5 2 * 3 - 8 * 4 /"));        // 14
    }
}
