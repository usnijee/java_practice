package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        LocalDateTime seoulTime = LocalDateTime.of(2024,1,1,9,0,0);
        ZonedDateTime seoulZone = ZonedDateTime.of(seoulTime, ZoneId.of("Asia/Seoul"));
//        ZonedDateTime londonZone = ZonedDateTime.of(seoulTime, ZoneId.of("Europe/London"));
        ZonedDateTime londonZone = seoulZone.withZoneSameInstant(ZoneId.of("Europe/London"));
//        ZonedDateTime newyorkZone = ZonedDateTime.of(seoulTime, ZoneId.of("America/New_York"));
        ZonedDateTime newyorkZone = seoulZone.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulZone);
        System.out.println("런던의 회의 시간: " + londonZone);
        System.out.println("뉴욕의 회의 시간: " + newyorkZone);


    }
}
