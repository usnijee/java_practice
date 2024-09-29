package oop1;

public class ValueObject {

    int value;

    void add(){
        value ++;
        System.out.println("숫자 증가 value = " + value);
    }

    // static이 없는 이유 -> 메서드는 객체를 생성해야 호출이 가능하나 static이 붙으면 객체없이도 메서드를 호출가능 --> 클래스 내의 메서드이기에 객체 생성이 되어야 호출이 가능하도록 설정
}
/*
    정리

        - 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다.
        - 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
            - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.
 */