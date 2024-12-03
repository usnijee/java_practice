package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {

        try {
            // 넘어온 에러를 try로 잡고 catch에서 해결
            client.call();
        } catch (MyCheckedException e) { // Exception e 도 가능하다.
            // 예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다
     */
    public void catchThrow() throws MyCheckedException {

        // 넘어온 error를 다시 catchThrow()를 호출한 곳으로 다시 throw
        // 예외처리를 진행하지 않기에
        client.call();
    }
}
