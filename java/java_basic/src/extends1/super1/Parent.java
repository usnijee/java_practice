package extends1.super1;
/*
    자식 클래스와 부모 클래스의 필드명이 같거나 오버라이딩 메서드가 있다면 해당 필드 및 메서드를 사용시
    부모 클래스의 필드나 메서드는 사용이 불가능하다
    -> why? 인스턴스가 생성될 때 해당 참조값의 메모리 내에 자식 클래스와 부모 클래스가 독립적으로 같이 생성되는데 이때 먼저
    자식 클래스를 참조한 뒤 없다면 부모 클래스를 참조하는 순서로 진행되기 때문

    그러면 이러한 상황에서 부모 클래스의 속성을 어떻게 사용할까?
    -> super!
 */
public class Parent {
    public String value = "parent";

    public void hello() {
        System.out.println("Parent.hello");
    }
}