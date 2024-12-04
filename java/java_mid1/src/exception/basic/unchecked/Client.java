package exception.basic.unchecked;
// uncheckedException은 throws를 통해 Exception을 명시할 필요가 없다 자동으로 호출된 곳으로 나간다
public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
