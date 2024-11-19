package lang.immutable.address;
/*
side effect 해결방안 --> 변수가 서로 다른 객체를 참조하게 하면 된다

즉, 여러 변수가 하나의 객체를 공유하지 않으면 된다.
그러나, java에서 하나의 객체를 여러 변수가 공유하지 않도록 제약을 두는 방법은 없다
 */
public class RefMain1_2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = new Address("서울");;  // 참조형 변수 -> a의 참조값을 복사해서 b에 저장 즉, b도 같은 객체를 가리킴
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // setValue를 통해 b가 가리키는 객체의 value를 부산으로 변경 --> a도 동일한 객체를 가리키고 있음
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
