package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {

    private final String address;
    public boolean connectError; // 기본값 : false
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {

        if (connectError) {
            throw new RuntimeException("ex");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {

        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패:" + data);
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

    // AutoCloseable 인터페이스의 close() 오버라이딩
    // try가 끝나면 바로 close()가 자동 호출되어 자원 연결 해제 --> try가 끝나면 그 뒤의 1순위 작업임
    // 그 이유는 try에서만 자원을 사용하기 때문이다.
    @Override
    public void close() {
        // 자원 연결 해제 내용을 작성
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
