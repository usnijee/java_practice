package poly.basic;

import java.sql.SQLOutput;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴즈 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴즈 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴즈 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 다형적 참조
        poly.parentMethod();
//        poly.childMethod();  poly는 Parent 타입이기 때문에 Parent 클래스의 메소드만 사용 가능 ,, 자식의 기능은 호출 불가능
        // 상속 관점에서 살펴보면 자식은 상속 개념을 통해 부모 클래스까지 접근이 가능하다
        // 하지만 반대로 부모 클래스는 자식으로 접근할 수 없다. (실제로 클래스의 형태를 봐도 부모클래스에 자식 클래스에 대한 정보는 없다,, 자식 클래스는 extends를 통해 본인의 부모를 명시한다)
        // 그렇기 때문에 다형성 참조에서도 부모 타입의 변수에 자식 인스턴스의 참조값을 저장하여 자식 인스턴스에 접근 가능하나 그 와중에 부모 클래스에만 접근 가능한 것이다.

        // 자식은 부모를 담을 수 없다
//        Child poly1 = new Parent();

    }
}
