package exception.ex2;

/**
 * finally를 통해 마무리 흐름을 추가한다.
 * finally는 try가 호출되면 반드시 호출되기에 예상치 못한 흐름을 처리 할 수 있다.
 */
public class NetworkServiceV2_5 {

    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            // 예외 로그
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        } finally {
            // 어떤 경우에도 disconnect()를 통해 서버 해제가 된다.
            client.disconnect();
        }

    }
}
