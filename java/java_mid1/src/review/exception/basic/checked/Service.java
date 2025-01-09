package review.exception.basic.checked;

/**
 * Checked 예외는 반드시 예외를 던지거나 처리해야한다
 */
public class Service {
    Client client = new Client(); // Client를 호출한 위치

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {

        try {
            // 넘어온 에러를 try로 잡고 catch에서 해결
            client.call(); // client를 호출한 위치
        } catch (MyCheckedException e) {
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 예외를 밖으로 던지는 코드
     */
    public void catchThrow() throws MyCheckedException {

        // 넘어온 error를 다시 catchThrow()를 호출한 곳으로 다시 throw
        // 예외처리를 진행하지 않기에
        client.call();
    }

}
