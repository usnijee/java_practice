package exception.ex2;

/**
 * client에서 넘어온 체크 예외를 throws를 통해 main()으로 넘기는 경우
 */
public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
