package exception.ex1;
/*
    java 단축키

    ctrl + alt + shift + T : 리팩토링

 */
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가

        // 결과가 성공이 아니다 == 오류다
        // 둘중 전자, 후자중 어떤것이 더 이해하기 쉬울까
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult); // 오류 로그 추가
            return; // 연결 실패임에도 데이터 전송 성공 오류 해결
        }
        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult );
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
