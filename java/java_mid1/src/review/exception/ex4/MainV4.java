package review.exception.ex4;

import java.util.Scanner;
import review.exception.ex4.exception.SendExceptionV4;

public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // 예외도 객체이고 상속이 가능하기에 다형성에 의해 부모 예외를 잡으면 자식 예외 전부가 처리 가능하다
                exceptionHandler(e);
            }
            System.out.println();
        }
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생하였습니다.");
        System.out.println("==개발자용 디버깅 메세지==");
        e.printStackTrace(System.out);

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
