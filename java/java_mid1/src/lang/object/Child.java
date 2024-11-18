package lang.object;

// 명시적으로 상속 받을 부모 클래스가 있는 경우 --> 해당 클래스가 부모 클래스
public class Child extends Parent{

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
