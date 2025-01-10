package review.exception.ex2;

/**
 * 현재 코드에서 만약에 NetworkClientException이 아닌 다른 종류의 exception이 넘어오면 어떡할까?
 * catch에서 해당 예외를 잡지 못하고 (ex. RuntimeException) 그대로 에러가 발생하며 런타임이 종료된다
 * 즉, disconnect() 메서드가 실행되지 못한채로 런타임이 종료되어 외부와의 연결해제가 안된다
 */
public class NetworkServiceV2_5 {

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
        } finally {
            /**
             * finally를 활용하여 어떤 상황에도 특정 로직을 실행시킴
             */
            client.disconnect();
        }

    }
}
