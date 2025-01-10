package review.exception.ex2;

public class NetworkServiceV2_1 {
    /**
     * throws를 사용하여 발생한 NetworkClientException을 호출한 쪽으로 던짐을 나타냄
     *
     */
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect(); // throw를 통해 예외가 넘어옴 -> 여기서도 예외 처리를 안했기에 sendMessage() 호출 지점으로 또 넘어감
        client.send(data);
        client.disconnect();
    }
}
