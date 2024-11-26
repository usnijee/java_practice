package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now(); //UTC 기준 --> 즉 system default가 seoul이면 UTC와 9시간 차이나기에 9시간 전 시각이 출력 즉, utc 시각이 출력 -> 전 세계 공통이됨
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now(); // ZonedDateTime
        Instant from = Instant.from(zdt);  // from(): 다른 타입의 시간을 기준으로 Instant 시간 생성
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        Instant epochStart2 = Instant.ofEpochSecond(100); // 100초 추가
        System.out.println("epochStart = " + epochStart);
        System.out.println("epochStart2 = " + epochStart2);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
