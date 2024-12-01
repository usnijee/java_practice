package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

        // 지역 클래스도 인터페이스의 구현체가 될수있다.
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 지역 클래스 내의 멤버 변수 접근
                System.out.println("localVar = " + localVar); // process 메서드 내의 지역 변수 접근
                System.out.println("paramVar = " + paramVar); // 메서드의 파라미터도 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스내의 멤버 변수 접근
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);

    }
}
