package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;  // 참조형 변수 -> a의 참조값을 복사해서 b에 저장 즉, b도 같은 객체를 가리킴
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // setValue를 통해 b가 가리키는 객체의 value를 부산으로 변경 --> a도 동일한 객체를 가리키고 있음
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // side effect : 프로그래밍에서 특정 계산이 주된 작업외에 부수 효과를 일으키는 경우를 의미 --> 부정적으로 사용
        System.out.println("b = " + b);
    }
}
