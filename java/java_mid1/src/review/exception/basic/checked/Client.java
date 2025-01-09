package review.exception.basic.checked;

public class Client {
    // throws는 발생할 예외를 처리하지 않고 넘어오면 바로 던지겠다는 의미
    public void call() throws MyCheckedException {

        // 발생한 MyCheckedException 에러를 throw를 통해 Client.call()을 호출한 쪽으로 던지기
        throw new MyCheckedException("ex");
    }
}
