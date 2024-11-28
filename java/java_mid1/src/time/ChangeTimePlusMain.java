package time;
/*
    날짜와 시간 조작하기

    -> 어떤 시간 단위(Unit)을 변경할 지 선택해야함
    -> ChronoUnit이 사용됨
 */
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println("dt = " + dt);

        //방법1 ChronoUnit 사용
        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        //방법2. 편의 메서드 사용 (getter)
        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        //방법3. Period를 사용한 조작
        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}
