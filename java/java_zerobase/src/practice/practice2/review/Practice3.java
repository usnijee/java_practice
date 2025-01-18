package practice.practice2.review;

import java.util.ArrayList;

public class Practice3 {

    public static void main(String[] args) {

        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x P L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }

    private static String solution(String input, String cmd) {
        int curSor = input.length();
        ArrayList<String> cmdList = new ArrayList<>();

        for (String s : cmd.split(" ")) {
            cmdList.add(s);
        }

}
