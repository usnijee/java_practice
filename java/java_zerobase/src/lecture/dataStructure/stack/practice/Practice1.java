package lecture.dataStructure.stack.practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

/**
 * 문자열 뒤집기
 */
public class Practice1 {

    public static void main(String[] args) {
        String result = reverseString("Hello");
        System.out.println("result = " + result);

        result = reverseString("1 3 5 7 9");
        System.out.println("result = " + result);
    }

    public static String reverseString(String str) {
        String[] inputArr = str.contains(" ") ? str.split(" ") : str.split("");
        Deque<String> deque = new ArrayDeque<>(Arrays.asList(inputArr));
        for (int i = inputArr.length - 1; i >= 0 ; i--) {
            inputArr[i] = deque.pop();
        }

        return String.join(",", inputArr);
    }
}
