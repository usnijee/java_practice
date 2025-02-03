package lecture.dataStructure.linear.deque.practice.practice2;
// Practice1
// Palindrome 찾기
// Palindrome 이면 true, 아니면 false 를 반환하세요.
// Palindrome: 앞으로 읽어도 거꾸로 읽어도 같은 문자열

// 입출력 예시)
// 입력: a
// 결과: true

// 입력: madam
// 결과: true

// 입력: abab
// 결과: false


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class Practice2_2 {
    public static boolean checkPalindrome(String str) {
        Deque<String> deque = new ArrayDeque<>();

        for (String s : str.split("")) {
            deque.offerLast(s);
        }
        // str.chars() : str의 문자요소를 int형으로 변환 (IntStream)
        // mapToObj을 통해 다시 int형을 char형으로 변환
        // collect(Collectors.toCollection)을 통해 컬렉션으로 변환
//        deque = str.chars().mapToObj(x -> (char) x).collect(Collectors.toCollection(ArrayDeque::new));
        boolean isPalindrome = true;

        while (!deque.isEmpty()) {
            String s1 = deque.pollFirst();
            String s2 = deque.pollLast();

            if (s1 != null && s2 != null && !s1.equals(s2)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(checkPalindrome("a"));       // true
        System.out.println(checkPalindrome("aba"));     // true
        System.out.println(checkPalindrome("abba"));    // true
        System.out.println(checkPalindrome("abab"));    // false
        System.out.println(checkPalindrome("abcba"));   // true
        System.out.println(checkPalindrome("abccba"));  // true
        System.out.println(checkPalindrome("madam"));  // true
    }

}