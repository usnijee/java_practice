package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료 되는 순간 함께 제거됨 (지역 변수는 스택영역에 존재하고 메서드의 호출과 동시에 생성되어 메서드 처리가 끝나면 제거됨)

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
//        printer.print(); 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
         return printer; // 다형적 참조에 의해 Printer 타입으로 구현체인 LocalPrinter의 객체를 생성 가능
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2); // process메서드를 호출하여 반환값의 참조값을 printer변수에 저장하는 순간 process 메서드는 종료됨 -> prcoess()내의 지역변수들은 사라짐 (스택영역 특징)

        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행 즉, process()의 지역변수가 GC에 의해 제거된 이후에 print()를 실행
        printer.print(); // 논리적으로는 print()를 호출했을때 process()의 지역변수인 localVar, paramVar의 값은 출력이 되면안된다. --> 하지만 출력이 됌 어떻게 삭제된 지역변수에 접근이 가능할까? == 지역 변수 캡처

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields(); // 지역 클래스의 인스턴스의 참조값이 갖고 있는 필드를 배열 형태로 반환
        for (Field field : fields) {
            System.out.println("field = " + field); // 캡처된 지역변수 localVar, paramVar를 확인할 수 있다.
        }



    }
}
