package miniTest.mini1.assign8;

import java.util.Scanner;

public class Assign8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int annualIncome = scanner.nextInt();

        CITRate.calculateTaxByTaxRate(annualIncome);
        CITRate.calculateTaxByPD(annualIncome);


    }
}
