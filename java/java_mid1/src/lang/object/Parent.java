package lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
//Object는 모든 클래스의 최상위 부모 클래스
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
