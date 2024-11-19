package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java"); // String은 불변객체이기에 생성된 "hello java"를 새로운 String 객체를 만들어 반환 해야한다.
        System.out.println("str = " + str);
        System.out.println("str = " + str2);
    }
}
