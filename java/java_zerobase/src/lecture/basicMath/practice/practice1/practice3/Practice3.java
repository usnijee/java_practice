package lecture.basicMath.practice.practice1.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Practice3 {
    // # 1 기본 permutation 방법
    public static boolean solution(String s1, String s2) {
        boolean[] visited = new boolean[s1.length()];
        char[] out = new char[s1.length()];
        ArrayList<String> list = new ArrayList<>(); // s1의 순열 경우를 모두 저장하는 공간
        permutation(s1.toCharArray(), 0, s1.length(), s1.length(), visited, out, list);

        for (String s : list) {
            if (s2.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public static void permutation(char[] arr, int depth, int n, int r, boolean[] visited, char[] out, ArrayList<String> list) {
        if (depth == r) {
            list.add(new String(out));
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out, list);
                visited[i] = false;
            }
        }
    }


    // # 2 문제 규칙 찾아 해결
    public static boolean solution2(String s1, String s2) {
//        /**
//         * 잘생각해보면 s1의 순열을 다 구할 필요 없이 어짜피 순열이 되면 순서도 바뀌어서 s2의 부분이 될 수 있음을 의미
//         * 그렇기 때문에 그냥 s1의 요소가 s2에 존재하는지만 보면 됨 (단, 붙어있는 정도는 고려되어야함)
//         *
//         * map을 통해 a~z를 key로 만들고 s1을 순회하며 이를 갱신
//         * 다시 s2를 순회하며 map을 갱신 -> 그후 map의 모든 value가 0으로 되면
//         * true 반환
//         */
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = (int)'a'; i <= (int)'z' ; i++) {
//            map.put((char) i, map.getOrDefault((char) i, 0));
//        }
//
//        for (int i = 0; i < s1.length(); i++) {
//            char tmp =  s1.toCharArray()[i];
//            if (map.containsKey(tmp)) {
//                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
//            }
//        }
//
//        for (int i = 0; i < s2.length(); i++) {
//            char tmp =  s2.toCharArray()[i];
//            if (map.containsKey(tmp)) {
//                map.put(tmp, map.getOrDefault(tmp, 0) - 1);
//            }
//        }
//
//        int sum = map.values().stream().mapToInt(x -> x).sum();
//        System.out.println(sum);
//
//        if (sum == 0) {
//            return true;
//        } else {
//            return false;
//        }
        final int ALPHABET = 26;

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] cnt = new int[ALPHABET];
        for (int i = 0; i < s1.length(); i++) {
            cnt[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            cnt[s2.charAt(i) - 'a']--;

            if (i - s1.length() >= 0) {
                cnt[s2.charAt(i - s1.length()) - 'a']++;
            }

            boolean isZero = true;
            for (int j = 0; j < ALPHABET; j++) {
                if (cnt[j] != 0) {
                    isZero = false;
                    break;
                }
            }

            if (isZero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test code
        String s1 = "ab";
        String s2 = "adbak";
        System.out.println(solution(s1, s2));
        System.out.println(solution2(s1, s2));
        System.out.println();

        s1 = "ac";
        s2 = "car";
        System.out.println(solution(s1, s2));
        System.out.println(solution2(s1, s2));
        System.out.println();

        s1 = "ak";
        s2 = "aabbkk";
        System.out.println(solution(s1, s2));
        System.out.println(solution2(s1, s2));
    }
}
