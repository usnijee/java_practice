package exception.ex2;

/**
 * 체크 예외를 통한 리팩토링
 *
 * 기존 : 메서드 반환값을 통해 성공, 실패 여부를 확인
 * 리팩토링 후 : 체크 예외 처리를 통해 실패시 예외처리를 통해 예외를 처리하거나 확인이 가능하고
 *              메서드가 정상 종료되면 성공
 */
public class NetworkClientV2 {

    private final String address;
    public boolean connectError; // 기본값 : false
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2{
        // 연결 실패
        if (connectError) {
            throw new NetworkClientExceptionV2(" 서버 연결 실패","connectError");
        }
        // 연결성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2{
        //전송 실패
        if (sendError) {
            //throw new NetworkClientExceptionV2("서버에 데이터 전송 실패","sendError");
            // 중간에 다른 예외가 터졌다고 가정
            throw new RuntimeException("ex");
        }
        //전송 성공
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
}
