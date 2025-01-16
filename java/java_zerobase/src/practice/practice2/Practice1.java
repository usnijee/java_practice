package practice.practice2;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class Practice1 {

    public static void main(String[] args) {
        //Test code
        solution("III");
        solution("IV");
        solution("VI");
        solution("XIII");
        solution("XXVI");
        solution("MCMXCIV");

    }

    public static void solution(String s) {
        Map<Character, Integer> romeNums = Map.of('I', 1, 'V', 5, 'X',
                10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int sum = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            // 작은수가 큰 수보다 먼저 온 경우 (예외)
            if (romeNums.get(arr[i]) < romeNums.get(arr[i + 1])) {
                sum -= romeNums.get(arr[i]);
            } else {
                sum += romeNums.get(arr[i]);
            }
        }
        sum += romeNums.get(arr[arr.length - 1]);

        System.out.println(sum);

    }
}
