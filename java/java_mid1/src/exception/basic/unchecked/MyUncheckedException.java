package exception.basic.unchecked;

/**
 * RuntimeException 상속 받은 예외는 언체크 예외가 된다.
 *
 * 언체크 예외 : 컴파일러가 예외를 체크 하지 않는 예외
 */
public class MyUncheckedException extends RuntimeException{

    public MyUncheckedException(String message) {
        super(message);
    }
}
