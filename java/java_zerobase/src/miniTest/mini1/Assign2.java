package miniTest.mini1;

import java.util.Scanner;

public class Assign2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int pay = scanner.nextInt();
        int cashBack = cashBackBy(pay);
        System.out.println("결제 금액은 " + pay + "원이고, 캐시백은 " + cashBack + "원 입니다.");
    }

    private static int cashBackBy(int pay) {
        int cashBack = ((int)(pay * 0.1) / 100) * 100;
        if (cashBack > 300) {
            return 300;
        }
        return cashBack;
    }
}
