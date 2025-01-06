package miniTest.mini1.assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assign3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입장권 계산");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = scanner.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = scanner.nextInt();
        scanner.nextLine();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String patriot = scanner.nextLine();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfare = scanner.nextLine();

        int ticketPrice = ticket(age, time, patriot, welfare);
        System.out.println("입장료: " + ticketPrice );
    }

    private static int ticket(int age, int time, String patriot, String welfare) {
        List<Integer> fees = new ArrayList<>();
        if (age < 3) {
            fees.add(0);
        } else if ((age >= 3) && (age < 13) || time > 17) {
            fees.add(ticketPrice.SPECIAL.getFee());
        } else if (patriot.equals("y") || welfare.equals("y")) {
            fees.add(ticketPrice.ORDINARY.getFee());
        } else {
            fees.add(ticketPrice.BASIC.getFee());
        }
        return Integer.valueOf(Collections.min(fees));
    }
}
