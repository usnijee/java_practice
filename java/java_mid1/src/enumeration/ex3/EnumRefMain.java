package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // 열거형의 참조값
        // 참조값을 통해 서로 다른 객체임을 알 수 있다.
        System.out.println("ref BASIC = " + refValue(Grade.BASIC)); //1d81eb93
        System.out.println("ref GOLD = " + refValue(Grade.GOLD)); //7291c18f
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND)); //34a245ab
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade)); // 참조값
    }
}
