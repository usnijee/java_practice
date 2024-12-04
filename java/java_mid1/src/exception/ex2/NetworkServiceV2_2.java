package exception.ex2;

/**
 * client에서 넘어온 체크 예외를 catch를 통해 처리하는 경우
 */
public class NetworkServiceV2_2 {

    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            // 예외 로그
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return; // sendMessage() 밖으로 나감 ,, send()로 넘어가는 것 방지 --> 런타임 종료는 아니다
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
