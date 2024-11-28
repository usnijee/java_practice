package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 특정날짜.getDayOfWeek() : 해당 날짜의 요일
        LocalDate startDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = startDate.getDayOfWeek();
        DayOfWeek lastDayofWeek = startDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayofWeek);

    }
}
