package ref;
/*
    NullPointerException
    -> 말 그대로 Null을 가리키는 것을 의미
    -> 주소가 없는 곳을 접근할 때 발생하는 예외
    -> 객체를 참조할 때는 .(dot)을 이용하여 접근
    -> 참조값이 null일때 .(dot)을 통해 접근하려면 NullPointerException이 발생함
 */
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println("data = " + data.value);
    }
}
