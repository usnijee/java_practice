package exception.ex3.exception;

/**
 * 데이터 전송 예외 처리
 */
public class SendExceptionV3 extends NetworkClientExceptionV3{

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
