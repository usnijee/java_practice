package lang.wrapper;
/*
    wrapper class

    - 기본형 (Primitive Type)
        - 객체가 아니기에 객체지향프로그래밍의 이점을 활용할 수 없음 (ex. 유용한 메서드 사용)
        - null 즉, 데이터가 '없음'의 상태를 나타낼 수 없음
    - 래퍼 클래스
        - Wrap : 감싸다
        - 기본형을 감싸서(wrap) 만든 클래스
 */
public class MyInteger {

    private final int value; // int 타입의 기본형 변수를 하나 갖고 있고 클래스화 했기에 유용한 메서드를 만들어서 사용 가능

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
