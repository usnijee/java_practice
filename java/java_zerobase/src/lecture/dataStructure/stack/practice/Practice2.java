package lecture.dataStructure.stack.practice;
// Practice2
// 괄호 짝 검사

// 입출력 예시)
// 입력: "("
// 출력: Fail

// 입력: ")"
// 출력: Fail

// 입력: "()"
// 출력: Pass

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice2 {

    public static void checkParenthesis(String str) {
        Deque<String> stack = new ArrayDeque<>();
        for (String s : str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else if (s.equals(")")) {
                if (stack.isEmpty()) {
                    System.out.println("FAIL!");
                    return; // 반복문 빠져 나가기
                }
//                System.out.println(stack.pop());
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL!");
        }

    }

    public static void main(String[] args) {
        // Test code
        checkParenthesis("(");          // FAIL!
        checkParenthesis(")");          // FAIL!
        checkParenthesis("()");         // PASS!
        checkParenthesis("()()()");     // PASS!
        checkParenthesis("(())()");     // PASS!
        checkParenthesis("(((()))");    // FAIL!
    }
}
