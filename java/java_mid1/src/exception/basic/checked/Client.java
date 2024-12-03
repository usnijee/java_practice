package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{

        //문제 상황
        // throw를 통해 발생한 MyCheckedException 에러를 Client.call()을 호출한 쪽으로 던진다(throw)
        throw new MyCheckedException("ex");
    }
}
