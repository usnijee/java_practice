package practice.practice2.review;

import java.util.Arrays;
import java.util.Map;

public class Practice1 {

    public static void main(String[] args) {

        solution("III");
        solution("IV");
        solution("VI");
        solution("XIII");
        solution("XXVI");
        solution("MCMXCIV");
    }

    private static void solution(String input) {
        Map<String, Integer> romeNums = Map.of("I", 1, "V", 5, "X", 10, "L",
                50, "C", 100, "D", 500, "M", 1000);

        String[] inputArr = input.split("");
        int makeInt = 0;

        for (int i = 0; i < inputArr.length - 1; i++) {
            if (romeNums.get(inputArr[i]) < romeNums.get(inputArr[i + 1])) {
                makeInt -= romeNums.get(inputArr[i]);
            } else {
                makeInt += romeNums.get(inputArr[i]);
            }
        }
        makeInt += romeNums.get(inputArr[inputArr.length - 1]);
        System.out.println(makeInt);
    }
}
