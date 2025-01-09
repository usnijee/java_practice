package review.exception.basic.unchecked;

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 언체크 에러는 위의 callCatch()를 통해 예외를 잡지 않으면 자연스럽게 상위로 넘어감
     * 단, MyUnckeckedException을 던지는 것을 강조하고 싶다면 예외 선언을 하는것이 좋다
     */
    public void callThrow() throws MyUncheckedException {
        client.call();
    }
}
