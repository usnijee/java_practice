package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
    ChronoUnit : 다양한 시간 단위를 제공하는 enum , TemporalUnit이라는 인터페이스의 구현체

    --> ChronoUnit을 사용하게 되면 두 날짜 또는 시간 사이의 차이를 해당 단위로 쉽게 계산 가능
 */
public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds()); // 1시간은 3600초
        System.out.println("DAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds()); // 1일은 86400초

        // 차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2); // 두 시간의 차이를 초단위로 반환
        System.out.println("secondsBetween = " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2); // 두 시간의 차이를 분단위로 반환
        System.out.println("minutesBetween = " + minutesBetween);

    }
}
