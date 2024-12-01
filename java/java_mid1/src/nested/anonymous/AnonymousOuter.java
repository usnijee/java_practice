package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        // 지역 변수
        int localVar = 1;

//        // 지역 클래스도 인터페이스의 구현체가 될수있다.
//        class LocalPrinter implements Printer {
//            int value = 0;
//
//            @Override
//            public void print() {
//                System.out.println("value = " + value); // 지역 클래스 내의 멤버 변수 접근
//                System.out.println("localVar = " + localVar); // process 메서드 내의 지역 변수 접근
//                System.out.println("paramVar = " + paramVar); // 메서드의 파라미터도 접근 가능
//                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스내의 멤버 변수 접근
//            }
//        }
//
//        LocalPrinter printer = new LocalPrinter();

        // 익명 클래스 : 지역 클래스의 선언과 생성을 한번에 한다
        // 형태만 보면 Printer 인터페이스의 객체를 생성하는 것처럼 보이나 인터페이스는 객체를 생성할 수 없다
        // 익명클래스의 암기사항
        /*
            형태 : new 상속or구현대상 {body};
            원리 : 상속 또는 구현 대상을 생성하고 body를 통해 상속 또는 구현 내용을 선언한다 .

            즉, 익명 클래스를 사용하려면 상속받거나 구현하려는 대상이 있어야 한다
         */
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value); // 지역 클래스 내의 멤버 변수 접근
                System.out.println("localVar = " + localVar); // process 메서드 내의 지역 변수 접근
                System.out.println("paramVar = " + paramVar); // 메서드의 파라미터도 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar); // 바깥 클래스내의 멤버 변수 접근
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

}
