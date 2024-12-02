package nested;
/*
    같은 이름의 바깥 변수 접근 --> 하지만 애초에 같은 이름의 변수를 만들지 않는것이 나은 방향이다
 */
public class ShadowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value); // go() 내의 지역변수 value
            System.out.println("this.value = " + this.value); // this(= Inner 클래스) 내의 멤버변수
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value); // ShadowingMain(클래스의) 멤버변수
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
