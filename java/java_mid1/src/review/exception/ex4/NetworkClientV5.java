package review.exception.ex4;
/**
 * try with resource
 *
 * 애플리케이션에서 외부 자원을 사용하는 경우 반드시 외부 자원을 해제해야함
 * -> finally를 사용했음
 * -> java7부터 try with resource를 제공
 * -> try with resource는 말그대로 try를 할때 자원을 사용하는 것으로, 여기서 자원은 try가 끝나면 반드시 종료해서 반납해야 하는 외부 자원을 의미
 */

import review.exception.ex4.exception.ConnectExceptionV4;
import review.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    // 언체크 예외이므로 throws를 사용하지 않음
    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패");
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    // close()는 try가 끝나면 자동으로 호출됨
    // 따라서, 자원을 반납하는 방법을 이 메서드에 정의하면 됨
    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
