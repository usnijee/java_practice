package nested.anonymous.ex;

import java.util.Random;

/*
    EX1REF는 중첩 정적 클래스를 통해 리팩토링을 해보았다.
    EX2REF는 내부 클래스를 통해 리팩토링 해보았다.
    이번에는 익명 클래스를 통해 리팩토링 해보자
 */
public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 0 ; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        //실행
        hello(dice);
        hello(sum);

    }
}
/*
    코드의 변하는 부분과 변하지 않는 부분에 대한 설계를 할 때
    -> 단일변수면 매개변수
    -> 코드 블록이라면 다형적 참조에 의한 중첩 클래스를 활용해볼 것
    쉽게 말하면,
    1. 코드 블록? 메서드를 활용해야겠다는 생각
    2. 메서드? 매개변수로 못받는데? 클래스의 메서드를 생각하고 인스턴스 참조를 통해 접근해야겠다는 생각
    3. 인스턴스 참조값이 저장된 변수를 매개변수로 받을 것인데 클래스의 타입을 통일해야겠다 -> 다형적 참조 생각 Object타입도 되긴할듯

 */