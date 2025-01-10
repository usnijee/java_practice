package review.exception.ex2;

/**
 * 단순히 예외를 처리하는 것 뿐만아니라 정상로직과 예외 로직을 분리 해보기
 */
public class NetworkServiceV2_3 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

//        try {
//            client.connect();
//        } catch (NetworkClientExceptionV2 e) {
//            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
//            return;
//        }
//
//        try {
//            client.send(data);
//        } catch (NetworkClientExceptionV2 e) {
//            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
//            return;
//        }

//        client.disconnect();

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
    }
}
