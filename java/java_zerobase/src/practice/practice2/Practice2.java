package practice.practice2;

import java.util.Map;

public class Practice2 {

    public static void main(String[] args) {
        //Test code
        solution(3);
        solution(4);
        solution(6);
        solution(13);
        solution(26);
        solution(1994);

    }

    public static void solution(int num) {
        String result = "";

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;
        while (num > 0) {
            while (num >= values[i]) {
                num -= values[i];
                result += roman[i];
            }
            i++;
        }
        System.out.println(result);

    }
}
