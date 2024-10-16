package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a){
//        this(a,0); --> this를 통해 ClassB의 다른 메소드로 이동할 수 있으나 ,, super()는 그 다음에서라도 호출이 되어야함
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=");
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a=" + a + "b=" + b);
    }
}
