package review.exception.ex0;

/**
 *  NetworkService : NetworkClient를 통해 외부 주소에 접속(connect)하여
 *  데이터를 전송하고(send) 외부 주소와의 접속을 종료하는(disconnect) 역할을 한다
 *
 */
public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
