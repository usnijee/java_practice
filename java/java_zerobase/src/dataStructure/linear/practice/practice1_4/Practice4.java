package dataStructure.linear.practice.practice1_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Practice4 {
    public static void main(String[] args) {
        // Test code
        solution("[yyyy]-[mm]-[dd]");               // Pass
        solution("System.out.println(arr[0][1))");  // FAIL
        solution("Support [Java or Python(3.x)]");  // PASS
        solution("([[{}])");                        // FAIL
    }

    public static void solution(String str) {

        Map<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        boolean flag = true;

        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');

        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (map.containsValue(c)) {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    Character cur = stack.pop();
                    if (map.get(cur) != c) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if (flag && stack.isEmpty()) {
            System.out.println("Pass");
        } else {
            System.out.println("FAIL");
        }


    }
}
