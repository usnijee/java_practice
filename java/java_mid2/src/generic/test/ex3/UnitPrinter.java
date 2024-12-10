package generic.test.ex3;
/**
 * UnitPrinter 클래스의 조건은 다음과 같다.
 * UnitPrinter.printV1() 은 제네릭 메서드로 구현해야 한다.
 * UnitPrinter.printV2() 는 와일드카드로 구현해야 한다.
 * 이 두 메서드는 shuttle에 들어있는 유닛의 정보를 출력한다.
 */
public class UnitPrinter {

    public static <T extends Shuttle> void printV1(T shuttle) {
        System.out.println("이름 : " + shuttle.out().getName() + ", HP: " + shuttle.out().getHp());
    }

    // 와일드 카드
    // 이미 형성되어 있는 제너릭 타입의 shuttle 클래스를 매개변수로 받기에 와일드 카드 사용 가능
    public static void printV2(Shuttle<?> shuttle) {
        System.out.println("이름 : " + shuttle.out().getName() + ", HP: " + shuttle.out().getHp());
    }

}
