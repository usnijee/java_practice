package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

//        //같은 패키지 default 호출 가능  --> default는 import를 해와도 다른 패키지의 멤버변수 및 메서드는 사용 불가능
//        data.defaultField = 2;
//        data.defaultMethod();

//        //private 호출 불가 --> 해당 메소드 내에서만 사용 가능
//        data.privateField = 3;
//        data.privateMethod();
        data.innerAccess();

    }
}
/*
    - 패키지 위치는 package access.a 이다. 패키지 위치를 꼭 맞추어야 한다. 주의하자.
    - public 은 모든 접근을 허용하기 때문에 필드, 메서드 모두 접근 가능하다.
    - default 는 같은 패키지에서 접근할 수 있다. AccessInnerMain 은 AccessData 와 같은 패키지이다.
    따라서 default 접근 제어자에 접근할 수 있다.
    - private 은 AccessData 내부에서만 접근할 수 있다. 따라서 호출 불가다.
    - AccessData.innerAccess() 메서드는 public 이다. 따라서 외부에서 호출할 수 있다.
    - innerAccess() 메서드는 외부에서 호출되었지만 innerAccess() 메서드는 AccessData 에 포함되어
    있다. 이 메서드는 자신의 private 필드와 메서드에 모두 접근할 수 있다.
 */