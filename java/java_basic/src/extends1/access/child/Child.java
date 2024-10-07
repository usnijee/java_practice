package extends1.access.child;

import extends1.access.parent.Parent;

/*
    - 접근제어자 복습

    1. public -> 어디든 접근 가능
    2. default -> 같은 패키지내의 클래스만 접근 가능
    3. protected -> 같은 패키지내의 클래스 + 상속은 다른 패키지도 가능
    4. private -> 다른곳은 전부 제한

    -


 */
public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 다른 패키지의 부모의 prtrotected 변수
//        defaultValue = 1;
//        privateValue = 1;

        publicMethod();
        protectedMethod();
        printParent();
//        defaultMethod();
//        privateMethod();
    }
}
