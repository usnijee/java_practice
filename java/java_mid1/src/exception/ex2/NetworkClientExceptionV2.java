package exception.ex2;

/**
 * 체크 예외 처리를 통해 네트워크 문제 리패토링 하기
 */
public class NetworkClientExceptionV2 extends Exception{

    private String errorCode;

    public NetworkClientExceptionV2(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    
}
