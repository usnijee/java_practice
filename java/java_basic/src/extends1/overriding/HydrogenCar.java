package extends1.overriding;
/*
    메소드 오버라이딩
        - 부모 클래스에서 상속 받은 기능을 자식 클래스에 재정의 하는 것
        - @(annotation)을 통해 override를 사용
        - 어노테이션이 없어도 적용이 되나
            - 코드의 명확성
            - 오버라이딩이 반드시 필요한 부분을 놓치는 실수 방지 (코드가 길어지면 더 필요함) --> 어노테이션이 있다면 컴파일 에러가 발생함

    메서드 오버라이딩 vs 메서드 오버로딩

    - 오버로딩
        - 메서드 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것
        - 과하게 물건을 담았다는 의미와 연결짓기

    - 오버라이딩
        - 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정
        - 무언가를 넘어서 타는 것
        - 즉, 자식의 새로운 기능이 부모의 기존 기능을 넘어서 올라타는 것을 의미
 */

public class HydrogenCar extends Car {

    public void fillHydrogen(){
        System.out.println("수소를 충전합니다.  ");
    }

    @Override
    public void move(){
        System.out.println("수소차를 이동합니다. ");
    }
}
