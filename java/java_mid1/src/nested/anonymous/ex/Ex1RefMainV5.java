package nested.anonymous.ex;

import java.util.Random;

/*
    EX1REF는 중첩 정적 클래스를 통해 리팩토링을 해보았다.
    EX2REF는 내부 클래스를 통해 리팩토링 해보았다.
    EX3REF는 익명 클래스를 통해 리팩토링 해보았다.
    EX4REF는 더나아가 메모리 최적화를 해보자 --> 인스턴스 참조값을 변수에 담을 필요가 없다
    EX5REF는 lambda를 사용해보자 --> java8부터는 메서드를 매개변수로 받을 수 있다.
 */

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        //람다를 활용하여 메서드를 매개변수로 바로 받아보자
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
                });

        hello(() -> {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            });

    }
}
