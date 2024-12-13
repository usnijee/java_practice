package review.nested.ex2;

public class NestedOuter {

    private static int outClassValue = 3; // 바깥 클래스 클래스 변수
    private int outInstanceValue = 2; // 바깥 클래스 인스턴스 변수

    // 정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1; // 정적 중첩 클래스 인스턴스 변수

        public void print() {
            // 자신의 멤버 변수에 접근 o
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버 접근 x 불가능
//            System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근 o (private도 가능)
            System.out.println(outClassValue);
        }
    }
}
