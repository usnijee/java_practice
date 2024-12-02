package nested.test;
/*
    문제1. 정적 중첩 클래스를 완성하라
 */
public class OuterClass1 {
    // 정적 중첩 클래스를 구현하라. 그리고 hello() 메서드를 만들어라
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
