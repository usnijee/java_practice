package practice.practice2;

import java.util.ArrayList;

public class Practice3 {

    public static void main(String[] args) {
        System.out.println(solution("aba","L B"));
        System.out.println(solution("abcd","P x L P y"));
        System.out.println(solution("abc","L L L P x L B P y"));
        System.out.println(solution("a","B B LL DD P a P b P c"));
    }

    public static String solution(String input, String cmd) {
        StringBuilder sb = new StringBuilder(input); // 문자열 변형이 많기에
        ArrayList<String> cmdArr = new ArrayList<>();

        for (String s : cmd.split(" ")) {
            cmdArr.add(s);
        }

        int curSor = sb.length(); // 초기 커서는 맨 왼쪽에 위치
        int cmdIdx = 0;
        while (cmdIdx != cmdArr.size()) {
            String cur = cmdArr.get(cmdIdx);

            if (cur.equals("L")) {
                curSor = Math.max(0, curSor - 1);
            } else if (cur.equals("D")) {
                curSor = Math.min(sb.length(), curSor + 1);
            } else if (cur.equals("B")) {
                if (curSor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor - 1, curSor);
                curSor = Math.max(0, curSor - 1);
            } else if (cur.equals("P")) {
                sb.insert(curSor , cmdArr.get(cmdIdx + 1));
                curSor++;
            }
            cmdIdx++;
        }
        return sb.toString();
    }
}
