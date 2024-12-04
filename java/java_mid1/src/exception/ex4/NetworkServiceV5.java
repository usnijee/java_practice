package exception.ex4;
/**
 * try with resource
 * 예외처리가 끝나면 자원해제가 되어야 하는데 이를 자동으로 해제하는 구문
 * I/O, 데이터베이스 연결, 파일 처리와 같은 자원을 다룰 때 유용
 */
public class NetworkServiceV5 {

    public void sendMessage(String data)  {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)){ // 해결할 수 없는 에러는 그냥 넘기자
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }

    }
}
