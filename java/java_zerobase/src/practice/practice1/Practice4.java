package practice.practice1;

import java.util.Scanner;

/**
 * 여러 가지 별찍기 연습
 */
public class Practice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rowNum = Integer.parseInt(input[0]);
        int typeNum = Integer.parseInt(input[1]);

        makeStar(rowNum, typeNum);

    }

    private static void makeStar(int rowNum, int typeNum) {
        switch (typeNum) {
            case 1:
                makeStar1(rowNum);
                break;
            case 2:
                makeStar2(rowNum);
                break;
            case 3:
                makeStar3(rowNum);
                break;
            case 4:
                makeStar4(rowNum);
                break;
            default:
                makeStar5(rowNum);
                break;
        }
    }


    private static void makeStar1(int rowNum) {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < rowNum; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void makeStar2(int rowNum) {
//        String star = "*";
//        for (int i = 0; i < rowNum; i++) {
//            System.out.println(star);
//            star += "*";
//        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void makeStar3(int rowNum) {
//        String star = "*";
//        for (int i = 0; i < rowNum; i++) {
//            System.out.printf("%" + rowNum +"s\n",star);
//            star += "*";
//        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < rowNum; j++) {
                if (j < rowNum - i - 1) {
                    System.out.print(" "); // 공백과 별을 분기해서 나타냄
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void makeStar4(int rowNum) {
        for (int i = 0; i < rowNum; i++) {
            // 공백 출력 부분
            for (int j = 0; j < rowNum - i - 1; j++) {
                System.out.print(" ");
            }

            // 별 출력 부분
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            };
            System.out.println();
        }

    }

    private static void makeStar5(int rowNum) {
       // 상단부
        for (int i = 0; i <= rowNum / 2 ; i++) {

            // 공백 부분
            for (int j = 0; j < rowNum / 2 - i; j++) {
                System.out.print(" ");
            }

            // 별 추가 부분
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rowNum / 2; i > 0 ; i--) {

            // 공백 부분
            for (int j = 0; j < rowNum / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
