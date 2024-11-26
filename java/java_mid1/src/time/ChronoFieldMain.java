package time;

import java.time.temporal.ChronoField;

/*
    ChronoField : 날짜 및 시간을 나타내는 열거형 --> 이 열거형을 통해 날짜와 시간의 특정 부분을 나타냄

    ChronoUnit과의 차이점

    - ChronoUnit은 독립적인 단위를 의미 즉, Hours는 시간의 단위인데 어떤 시간이든 적용이 가능. 예를들어 1시간(1 Hours), 300시간(300 Hours)
    - ChronoField는 날짜와 시간의 성립이 가능한 범위 내에서의 연도, 월, 일, 시간, 분을 나타냄
        - 예를들어, 2000년 8월 8일에서 8일에 해당하는 '일'은 오로지 1~31만 가능하고 이를 구현하는 것이 ChronoField
        - 실제로 단위의 명칭도 Days가 아닌 DAY_OF_MONTH 이다.
 */
public class ChronoFieldMain {

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println("value = " + value + ", range = " + value.range());
        }
        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());

    }
}
