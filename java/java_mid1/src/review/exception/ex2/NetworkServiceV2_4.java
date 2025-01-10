package review.exception.ex2;

/**
 * 정상로직이 아닌 예외처리의 경우 disconnect()가 호출되지 않음
 * disconnect를 반드시 호출하도록 변경하기
 */
public class NetworkServiceV2_4 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
//            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        client.disconnect();
    }
}
