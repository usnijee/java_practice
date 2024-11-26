package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/*
    OffsetDateTime : LocalDateTime + offset(UTC와의 시간 차)
    ZoneDateTime에서 ZoneId가 제공되지 않는것이 OffsetDateTime
 */
public class OffsetDateTimeMain {

    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030,1,1, 13, 30,50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00")); // ZoneOffset은 +01:00처럼 UTC와의 시간 차이인 오프셋 정보만 보관한다.
        System.out.println("odt = " + odt);

    }
}
