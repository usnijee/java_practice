package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outIntanceValue = 2;

    // 정적 중첩 클래스
    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근 --> 불가능 --> static은 메서드 영역에 생성되기 때문
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근 할 수 있다. private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
