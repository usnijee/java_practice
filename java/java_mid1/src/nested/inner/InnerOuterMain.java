package nested.inner;
/*
    개념적으로는 -> 바깥 클래스의 내부에 내부 클래스가 위치하지만
    메모리상 -> 둘은 다른 참조값을 갖는다. 하지만 내부 클래스는 바깥 클래스의 인스턴스 참조값을 갖고 있어서 바깥 클래스의 멤버에 접근이 가능하다

    내부 클래스 인스턴스를 생성할 때 ,, 바깥클래스 인스턴스 참조값.new 내부 클래스()로 하는 이유이다.
 */
public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // 바깥 클래스 인스턴스
        InnerOuter.Inner inner = outer.new Inner(); // 내부 클래스의 인스턴스는 바깥 클래스의 인스턴스를 통해서 생성되어야 바깥 클래스 인스턴스 멤버에 접근 가능
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
