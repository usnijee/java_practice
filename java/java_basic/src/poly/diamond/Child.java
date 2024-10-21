package poly.diamond;
/*
    인터페이스의 경우 특정 '기능'을 자식이 상속하는 개념보다는 인터페이스의 '틀'을 자식 클래스 내부에서
    '구현'하는 속성이 더 강하기에 인터페이스는 다중상속을 허용한다. 즉, 부모의 고유 기능을 사용하는 것이 아니깅
    단일 상속을 반드시 해야할 이유가 없다
 */
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");

    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
}
