package review.exception.basic.unchecked;

/**
 * RuntimeException를 상속 -> 언체크 에러 즉, 컴파일 과정에서 잡히지 않는 에러
 */
public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException(String message) {
        super(message);
    }
}
