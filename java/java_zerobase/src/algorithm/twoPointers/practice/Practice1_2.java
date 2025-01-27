package algorithm.twoPointers.practice;

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

public class Practice1_2 {
    public static String solution(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        String[] strArr = s.split("");
        int p1 = 0;
        int p2 = strArr.length - 1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (strArr[p1].equals(strArr[p2])) {
                if (p1 >= p2) {
                    break;
                }

                while (strArr[p1].equals(strArr[p1 + 1])) {
                    p1++;
                }

                while (strArr[p2].equals(strArr[p2 - 1])) {
                    p2--;
                }
                p1++;
                p2--;
            } else {
                break;
            }
        }

        IntStream.range(p1, p2 + 1).mapToObj(i -> strArr[i]).forEach(x -> sb.append(x));
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution("ab"));         // ab
        System.out.println(solution("aaabbaa"));    //
        System.out.println(solution("aabcddba"));   // cdd
    }
}
