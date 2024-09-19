package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0,quantity = 0,price = 0,priceAll = 0;
        String name="";

        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = input.nextInt();
            if (option == 1){
                input.nextLine(); // 그냥 한줄 읽어주어 이전에 입력된 개행문자(\n) 제거
                System.out.print("상품명을 입력하세요: ");
                name = input.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                price = input.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                quantity = input.nextInt();
            } else if (option == 2) {
                priceAll = price * quantity;
                System.out.println("상품명:"+name+" 가격:"+price+" 수량"+quantity+" 합계:"+priceAll);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
