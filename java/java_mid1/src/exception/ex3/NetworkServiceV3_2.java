package exception.ex3;
/**
 *  예외 계층 구조를 활용하면 상황에 따라 다른 예외 처리와 로직을 구현할 수 있다
 */

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

/**
 * 만약에 처리 해야하는 오류의 종류가 너무 많다면 예외계층에의해 하나하나 전부 만들어 주어야할까>
 * 하나의 중요한 예외처리를 제외하고는 나머지 예외는 일괄로 처리할 수 있도록 만들어보자
 */
public class NetworkServiceV3_2 {

    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        // 구체적인 예외부터 -> 부모 예외 순으로 설계하는게 좋음
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }
        finally {
            // 어떤 경우에도 disconnect()를 통해 서버 해제가 된다.
            client.disconnect();
        }

    }
}
