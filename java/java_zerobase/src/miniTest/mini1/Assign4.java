package miniTest.mini1;
/**
 * BE33_이진수
 */

import java.util.Random;
import java.util.Scanner;

public class Assign4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("츨생년도를 입력해 주세요.(yyyy):");
        String year = String.valueOf(scanner.nextInt());

        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = String.valueOf(scanner.nextInt());
        scanner.nextLine();

        System.out.print("출생일을 입력해 주세요.(dd):");
        String days = String.valueOf(scanner.nextInt());
        scanner.nextLine();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scanner.nextLine();

        String rrn = generateRRN(year, month, days, gender);
        System.out.println(rrn);
    }

    private static String generateRRN(String year, String month, String days, String gender) {
        Random random = new Random();
        String temporalNum = String.format("%06d", random.nextInt(0, 99999));
        if (gender.equals("m")) {
            return year.substring(2) + month + days + "-" + "3" + temporalNum;
        } else if (gender.equals("f")) {
            return year.substring(2) + month + days + "-" + "4" + temporalNum;
        } else {
            return "잘못 입력하셨습니다";
        }
    }
}
