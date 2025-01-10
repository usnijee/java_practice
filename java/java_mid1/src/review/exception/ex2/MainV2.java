package review.exception.ex2;

import java.util.Scanner;

/**
 * 결국 main에서까지 NetworkClientExceptionV2를 처리하지 않고 던짐 -> 에러 발생
 * 즉, 예외가 복구가 안됌
 *
 * 또한 disconnect를 통해 외부 연결 해제가 안됌
 */
public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2{
//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
