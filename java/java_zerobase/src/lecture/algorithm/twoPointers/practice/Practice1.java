package lecture.algorithm.twoPointers.practice;

// Practice
// a, b, c, d 로 이루어진 알파벳 문자열에 대해서
// 다음과 같은 규칙으로 문자열을 정리한 후 남은 문자열을 반환하는 프로그램을 작성하세요.
// 양쪽의 문자를 비교한 후 같으면 삭제하는데, 연속해서 같은 문자가 등장하면 함께 삭제한다.
// 최종적으로 남은 문자열을 반환하세요.

// 입출력 예시
// 입력 s: "ab"
// 출력: "ab"

// 입력 s: "aaabbaa"
// 출력: (없음)

import java.util.stream.IntStream;

public class Practice1 {
    public static String solution(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2 && s.charAt(p1) == s.charAt(p2)) {
            char c = s.charAt(p2);

            while (p1 <= p2 && s.charAt(p1) == c) {
                p1++;
            }

            while (p1 <= p2 && s.charAt(p2) == c) {
                p2--;
            }
        }
        return s.substring(p1, p2 + 1);
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution("ab"));         // ab
        System.out.println(solution("aaabbaa"));    //
        System.out.println(solution("aabcddba"));   // cdd
    }
}
