package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue ++;
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue ++;
        instanceMethod();

        staticValue ++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}

/*
정리

-> static 메소드 내부에서는 static 변수 또는 static 메소드만 사용가능하다 즉, static -> static만 가능
-> instance 메소드 내부에서는 instance 변수, instance 메소드, static 변수, static 메소드 모두 사용이 가능하다
 */
