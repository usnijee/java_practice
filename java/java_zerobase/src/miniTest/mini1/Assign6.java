package miniTest.mini1;

import java.util.Scanner;

public class Assign6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int totalVote = scanner.nextInt();

        System.out.println("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int totalCandidate = scanner.nextInt();

        for (int i = 0; i < totalCandidate; i++) {
            System.out.print(i + "번째 후보자이름을 입력해 주세요.");
            String candidateName = scanner.nextLine();
        }
    }
}
