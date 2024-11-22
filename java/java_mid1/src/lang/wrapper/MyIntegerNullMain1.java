package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    private static MyInteger findValue(MyInteger[] intArr, int target) { // 래퍼 클래스 사용
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null; // 래퍼클래스를 통해 참조형으로 바뀌어 null 사용 가능
    }
}
