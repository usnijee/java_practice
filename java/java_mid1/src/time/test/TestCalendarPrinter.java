package time.test;

import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int yearWhen = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int monthWhen = scanner.nextInt();

    }

    private static void printCalender(int year, int month) {
        LocalDate localDate = LocalDate.of(year,month,1);


    }
}
