package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage((text));
        networkMessage.print();
    }

    private static class NetworkMessage { // 중첩 정적 클래스 사용 --> ex1의 리팩토링 결과

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
