package exception.ex2;

/**
 * try에 모든 정상 흐름을 넣는다 --> 정상 흐름과 예외 흐름을 명확히 분리 가능
 */
public class NetworkServiceV2_3 {

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
        }

    }
}
