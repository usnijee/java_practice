package extends1.super2;
/*
    1. 생성자의 실행순서 -> 최상위 부모 (ClassA)부터 실행되어 차례대로 실행됨
        왜냐하면, 자식 클래스의 생성자의 가장 첫줄이 부모 클래스의 생성자 호출이기 때문

        물론, this를 통해 부모클래스가 아닌 자식 클래스 내에서의 다른 메소도를 호출하는 것을 먼저 진행할 수
        있으나,, this를 통해 다른 메소드로 이동하더라도 결국 마지막에 한 번은 부모 클래스 생성자를 반드시 호출 해야함
 */
public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC();

    }
}
