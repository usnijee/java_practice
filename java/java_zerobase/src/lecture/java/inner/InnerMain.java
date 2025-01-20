package lecture.java.inner;
// Java 프로그래밍 - 내부 클래스

class Outer {
    public void print() {
        System.out.println("Outer.print");
    }

    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    static class InnerStaticClass {
        void innerPrint() {
//            Outer.this.print(); // 정적 중첩 클래스는 static이므로 JVM의 메서드 영역에 호출과 동시에 저장됨 따라서, 외부 클래스를 사용 불가능
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {

    @Override
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class InnerMain {
    public static void main(String[] args) {

//      외부 클래스
        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();

//      내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();

//      익명 클래스
        Person s1 = new Person() { // 익명 클래스는 일회성
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };

    }

}
