package generic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // 제너릭 메서드 : 타입 매개변수의 적용 범위가 메서드로 한정됨
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }


}
