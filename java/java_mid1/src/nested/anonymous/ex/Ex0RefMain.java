package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println(str); // str : 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
/*
    프로그래밍에서 중복을 제거하고 좋은 코드를 유지하는 핵심은 "변하는 부분과 변하지 않는 부분을 분리하는 것"이다.

    핵심은 변하는 부분을 메서드 내부가 아닌 외부에서 전달 받는 다는 것이다.
 */