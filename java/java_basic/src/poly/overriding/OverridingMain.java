package poly.overriding;
/*
    다형성의 중요한 두 번째 이론 -> Overriding

    - Overriding : 자식 클래스에서 부모 클래스의 메서드를 재정의하는 것 (이전에 배운 개념)
    - 다형성 측면에서 Overriding된 메서드는 항상 우선권을 갖는다!
 */

public class OverridingMain {
    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 다형적 참조 , 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);
        poly.method(); // 메서드 오버라이딩 --> parent의 메서드가 호출될까 Child의 메서드가 호출 될까
    }
}
