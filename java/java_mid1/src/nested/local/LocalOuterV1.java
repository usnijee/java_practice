package nested.local;
/*
    지역 클래스는 내부 클래스의 일종이다. 내부 클래스와의 차이점은 지역 클래스는 지역 변수와 동등한 위치에
    생성이 가능하다. 즉, 메서드 내에 생성되는 클래스가 지역 클래스이다. 내부 클래스는 특정 바깥 클래스 내에
    생성된 클래스가 내부 클래스이다.
 */
public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

        // 지역 클래스
        // 지역 변수와 동일하게 접근 제어자 사용 불가능 --> 메서드 내의 변수 또는 클래스이기 때문
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value); // 지역 클래스 내의 멤버 변수 접근
                System.out.println("localVar = " + localVar); // process 메서드 내의 지역 변수 접근
                System.out.println("paramVar = " + paramVar); // 메서드의 파라미터도 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스내의 멤버 변수 접근
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);

    }
}
