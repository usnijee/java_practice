package practice.practice2.review;

import java.util.ArrayList;

public class Practice3 {

    public static void main(String[] args) {

        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }

    private static String solution(String input, String cmd) {
        ArrayList<String> cmdList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(input); // 문자열의 변화가 많기에 StringBuilder 사용
        int curSor = sb.length(); // cursor는 input 맨뒤로 초기화

        for (String s : cmd.split(" ")) {
            cmdList.add(s);
        }

        for (int i = 0; i < cmdList.size() ; i++) {
            String cmds = cmdList.get(i);

            if (cmds.equals("L")) {
                curSor = Math.max(0, --curSor);
            } else if (cmds.equals("D")) {
                curSor = Math.min(sb.length(), ++curSor);
            } else if (cmds.equals("B")) {
                if (curSor != 0) {
                    sb.delete(curSor - 1, curSor);
                    curSor = Math.max(0, --curSor);
                }
            } else if (cmds.equals("P")) {
                String cmdsNext = cmdList.get(i + 1);
                sb.insert(curSor, cmdsNext);
                curSor = Math.min(sb.length(), ++curSor);
            }
        }
        return sb.toString();
    }
}
