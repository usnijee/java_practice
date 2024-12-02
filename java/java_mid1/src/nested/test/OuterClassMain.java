package nested.test;

public class OuterClassMain {

    public static void main(String[] args) {
        // 여기에서 NestedClass의 hello() 메서드를 호출하라.
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
