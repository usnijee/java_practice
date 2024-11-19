package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a; // side effect 발생
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산"); // 해당 메서드만 보면 b의 value만 변경될 것처럼 보임 --> 코드가 길어지면 side effect가 눈에 안들어온다
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
