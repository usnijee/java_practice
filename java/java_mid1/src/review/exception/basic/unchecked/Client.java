package review.exception.basic.unchecked;

/**
 * 언체크 예외는 throws를 통해 예외를 명시할 필요없다. 언체크 에러의 경우 try-catch를 통해
 * 잡지 않으면 자동으로 호출한 위치로 던져진다
 */
public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }
}
