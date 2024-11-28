package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate criteriaTime = LocalDate.of(2024, 1, 1);
//        System.out.println("날짜 1: " + criteriaTime);
//
//        for (int i = 0; i < 4; i++) {
//            criteriaTime = criteriaTime.plusDays(14);
//            System.out.println("날짜 " + (i+2) + ": " + criteriaTime);
//        }
        for (int i = 0 ; i < 5; i++) {
            LocalDate nextDate = criteriaTime.plus(2 * i, ChronoUnit.WEEKS); // plus(양, 단위) ex. plus(2,ChronoUmit.WEEKS) : 2주 더하기
            System.out.println("날짜 " + (i + 1) + ": " + nextDate);

        }
    }
}
