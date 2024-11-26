package time;
/*
    ZonedDateTime : LocalDateTime + offset(UTC와의 차이) + ZoneId(ex. Seoul/Asia)
 */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul")); // 방법1
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul")); // 방법2
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC")); // withZoneSameInstant로 timezone 바꾸기 --> 이 메서드를 통해 다른 나라의 현재 시각을 알 수 있음
        System.out.println("utcZdt = " + utcZdt);

    }
}
