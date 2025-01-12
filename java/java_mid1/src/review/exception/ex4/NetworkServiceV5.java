package review.exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "https://example.com";

//        NetworkClientV4 client = new NetworkClientV4(address);

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
