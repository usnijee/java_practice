package final1;
/*
    상수(Constant) :
        - 변하지 않고 항상 일정한 값을 갖는 수
        - static final 키워드 사용
        - (관례) 상수명 --> 대문자를 사용하고 _(언더스코어)로 구분
        - 필드를 직접 접근해서 사용, 상수는 기능이 아니라 고정된 값을 사용하는 것이 목적

        특징
        - public을 자주 사용 ,, 특정 위치에서만 사용하려면 접근 제어자를 바꾸면 됨
        - 상수는 중앙에서 값을 하나로 관리할 수 있다는 장점 존재
        - 상수는 런타임에서 변경 불가능 --> 프로그램을 종료하고 코드를 변경한 후 다시 실행해야함
 */

public class Constant {

    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static int MAX_USERS = 1000;
}
