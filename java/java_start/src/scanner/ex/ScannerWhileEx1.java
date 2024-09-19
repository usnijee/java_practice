package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = input.nextLine();
            if (name.equals("term")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요:");
            int age = input.nextInt();
            input.nextLine(); // 숫자 입력 후의 줄바꿈 처리 --> 왜 해줘야하지 ??????

            System.out.println("입력한 이름 : " + name + " 나이 : " + age);
        }
    }
}
/*
    input.nextLine(); // 숫자 입력 후의 줄바꿈 처리 --> 왜 해줘야하지 ?????? 이 부분에 대한 해답

    1. nextLine()은 input()에 대한 해당 라인을 전부 처리
    2. nextInt()는 input()에 대한 '숫자'만 처리

    예를들어, 나이를 입력하세요: 27
    -->
    1. 여기서 nextInt()는 숫자를 입력받습니다.
    2. 하지만 nextInt()는 입력 후 남은 줄바꿈 문자(\n)를 버리지 않기 때문에,
        while문에 의해 다음 nextLine()이 실행되면 빈 줄(정확히는 \n)을 읽어서 이름을 입력받지 않고 바로 넘어가게 됩니다.

 */
