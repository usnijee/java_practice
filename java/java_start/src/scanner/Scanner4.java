package scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            String ans = scanner.nextLine();
            if (ans.equals("exit")){ // 놓친부분 java에서 string의 ==는 .equals()로 사용
                break;
            }
            System.out.println("사용자가 입력한 값 : " + ans);
        }

    }
}
