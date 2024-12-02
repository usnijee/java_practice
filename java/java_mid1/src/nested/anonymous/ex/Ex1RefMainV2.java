package nested.anonymous.ex;

import java.util.Random;

/*
    EX1REF는 중첩 정적 클래스를 통해 리팩토링을 해보았다.
    이번에는 내부 클래스를 사용해보자
 */
public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // 내부 클래스
        class Dice implements Process {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process {

            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        // 다형적 참조
        Process dice = new Dice();
        Process sum = new Sum();

        // 실행
        hello(dice);
        hello(sum);

    }
}
