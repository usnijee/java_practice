package review.exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            // database, network 관련 예외는 시스템 에러로 예외 처리를 해도 해결이 불가능하기에 throw 한다
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
