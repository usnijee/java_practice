package nested.anonymous.ex;
/*
    코드를 설계할 때 "공통 부분"을 처리할 때 유지보수 측면에서 "변하지 않는 부분"과 "변하는 부분"을 나눠서 설계하는 것이 좋다

    설계시 변하지 않는 부분은 고정하고 변하는 부분은 메서드 외부에서 호출시 들어오는 경우가 많다
    이때 변하는 부분이 단일 변수라면 메서드의 매개변수 방식으로 받으면 되지만 하나의 '코드 블록'이라면 어떻게 해야할까?

    1. 하나의 코드 블록을 전달하려면 메서드를 활용해야하는데,, 메서드를 직접 외부에서 클래스 내부로 갖고오는 방식은 없다
    2. 대신에 매개변수로 인스턴스의 참조값이 저장되어 있는 변수는 받을 수 있다. 해당 변수로 인스턴로 접근하여 메서드를 호출하면 되지 않을까?
    3. 이때 다형적 참조를 사용하면 좋다. 인터페이스를 통해 구현체를 만들면 매개변수의 타입을 인터페이스 타입으로 통일할 수 있다.
 */
import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    // 정적 중첩 클래스로 구현하기
    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process {

        @Override
        public void run() {
            for (int i = 0; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }
}
