package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가

        /**
         * catch를 삭제
         *
         * 1. 체크 예외 처리는 항상 throws를 통해 명시해줘야하기에 번거로움
         * 2. 최상위 부모 타입인 Exception을 통해 throws Exception 하면 되지 않을까?? 안된다. -> 해결할 수 있는 예외도 모두 throw 되기 때문
         * 3. 수많은 예외중 대부분은 개발자가 해결못하는 경우가 많음
         *      -> throw를 통해 계속 넘겨서 발생한 오류의 내용으로 로그로 남길 것
         *      -> 계속 넘긴 에러들은 main()에서 try-catch를 통해 공통처리를 진행한다.
         */
        try { // 해결할 수 없는 에러는 그냥 넘기자
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
