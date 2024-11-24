package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND  // 끝
}

/* Enum은 아래와 같다

public class Grade extends Enum {
    public static final Grade BASIC = new Grade();
    public static final Grade GOLD = new Grade();
    public static final Grade DIAMOND = new Grade();

    //private 생성자 추가
    private Grade() {}
}
 */