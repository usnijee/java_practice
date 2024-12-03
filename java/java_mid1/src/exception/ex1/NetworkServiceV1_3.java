package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가

        // 에러 발생 후 disconnect()를 통해 서버 연결 해제하도록 리팩토링
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult); // 오류 로그 추가
        }else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult );
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
/*
    NetworkService1_2, NetworkService1_3을 보면 정상과 오류부분의 흐름이 매우 복잡하게 섞여 있음을 알 수 있다.
    그 이유는 '반환값'을 기준으로 예외를 처리하려고 시도했기 때문이다.

    String connectResult = client.connect();
    의 반환값인 connectResult를 기준으로 예외처리를 했기에 정상과 오류의 로직이 섞일 수 밖에 없다.
 */