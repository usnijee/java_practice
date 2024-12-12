package review.nested.ex1;

/**
 *  NetworkMain을 보면 오직 Network 클래스만 사용하는 것을 알수있다. 즉, NetworkMessage 클래스는
 *  오로지 Network 클래스 내부에서만 사용됨
 *  이렇게 외부에서는 직접 사용할 일이 없고 특정 클래스 내부에서 사용하는 경우 중첩 클래스를 사용한다
 */
public class NetworkMain {

    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
