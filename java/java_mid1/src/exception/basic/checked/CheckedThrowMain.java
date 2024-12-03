package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException{ // Exception으로 던져도 됨
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료"); // 정상종료 불가능 main()에서도 예외를 처리하지 않아서 Stack Trace와 예외 정보가 나옴
    }
}
