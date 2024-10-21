package poly.ex4;
/*
    순수 추상 클래스란?

    추상 클래스의 모든 메서드가 추상 메서드인 클래스를 순수 추상 메서드라고 한다.
    즉, 오직 다형성을 위해 껍데기만 제공하는 격 --> 기능은 자식 클래스 내부에서 구현해야한다

    특징
    1. 인스턴스를 생성 할 수 없다.
    2. 상속시 자식은 모든 메서드를 오버라이딩 해야 한다. --> 컴파일 에러 발생
    3. 주로 다형성을 위해 사용된다.
 */

public abstract class AbstractAnimal {  // 추상 클래스는 abstract 키워드를 붙여주면 됨

    public abstract void sound();
    public abstract void move();


}
