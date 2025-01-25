package miniTest.mini1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Assign5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        int year = scanner.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; // 해당 월의 첫 번째 날의 요일을 enum에서 숫자로 갖고옴

        System.out.printf("[%d년 %02d월]\n",year,month);
        System.out.print("일\t월\t화\t수\t목\t금\t토\t\t\n");


        // 해당 월의 공백 기간 출력
        // 첫 번째 날 이전의 요일은 공백
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("    ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%02d\t", dayIterator.getDayOfMonth());
            // 한 주의 토요일 이후에는 한 줄 넘어가기
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }

    }
}
