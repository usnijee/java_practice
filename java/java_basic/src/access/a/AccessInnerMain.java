package access.a; // 패키지 위치 중요

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

//        //private 호출 불가 --> 해당 메소드 내에서만 사용 가능
//        data.privateField = 3;
//        data.privateMethod();
        data.innerAccess();

    }
}
