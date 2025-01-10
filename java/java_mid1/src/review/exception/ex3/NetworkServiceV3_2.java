package review.exception.ex3;
/**
 *  예외 계층의 활용
 *  -> ConnectException : 연결 예외
 *  -> NetworkClientException : 네트워크 예외 , 예외도 객체이기에 자식 예외도 같이 처리 가능 -> SendExceptionV3
 *  -> Exception을 통해 모든 에러 처리 가능
 */

import review.exception.ex3.exception.ConnectExceptionV3;
import review.exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        // catch는 순서대로 예외를 처리함
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
