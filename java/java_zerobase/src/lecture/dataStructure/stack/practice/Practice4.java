package lecture.dataStructure.stack.practice;
// Practice4
// 두 문자열 비교
// 단, #은 backspace 로 바로 이전의 문자를 삭제하는 기능이라고 가정

// 입출력 예시
// 입력: s1 = "tree", s2 = "th#ree"
// 출력: true

// 입력: s1 = "ab#a", s2 = "aab#"
// 출력: true

// 입력: s1 = "wo#w", s2 = "ww#o"
// 출력: false

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice4 {

    public static void main(String[] args) {
        String s1 = "tree";
        String s2 = "th#ree";
        System.out.println(stringCompare(s1, s2));

        s1 = "ab#a";
        s2 = "aab#";
        System.out.println(stringCompare(s1, s2));

        s1 = "wo#w";
        s2 = "ww#o";
        System.out.println(stringCompare(s1, s2));
    }

    public static boolean stringCompare(String s1, String s2) {
        String result1 = makeString(s1);
        String result2 = makeString(s2);

        return result1.equals(result2);
    }

    private static String makeString(String input) {
        Deque<String> stack = new ArrayDeque<>();

        // for(char c : input.toCharArray())로 해도 된다
        for (String str : input.split("")) {
            if (str.equals("#") && !stack.isEmpty()) {
                stack.pop();
                continue;
            }
            stack.push(str);
        }
        return String.valueOf(stack);
    }
}
