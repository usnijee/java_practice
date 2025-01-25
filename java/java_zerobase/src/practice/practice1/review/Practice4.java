package practice.practice1.review;

public class Practice4 {

    public static void main(String[] args) {

        solution(3, 1);
        solution(3, 2);
        solution(3, 3);
        solution(3, 4);
        solution(3, 5);

    }

    private static void solution(int num, int type) {
        switch (type) {
            case 1:
                makeStar1(num);
                break;
            case 2:
                makeStar2(num);
                break;
            case 3:
                makeStar3(num);
                break;
            case 4:
                makeStar4(num);
                break;
            case 5:
                makeStar5(num);
                break;
        }
    }

    private static void makeStar1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void makeStar2(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void makeStar3(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j < num - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void makeStar4(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    private static void makeStar5(int num) {
        // 윗 부분
        for (int i = 0; i < num / 2 + 1; i++) {
            // 각 라인 공백 출력 부분
            for (int j = 0; j < num/2 - i ; j++) {
                System.out.print(" ");
            }
            // 각 라인 * 출력 부분
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num / 2; i > 0; i--) {
            for (int j = 0; j < num / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/**
 * 접근방법
 *
 * -> makeStar3부터 생각을 깊게 해볼 필요가 있다 -> 차근차근 순서에 맞게 생각을 해볼것
 *
 * 1. 일단 num의 수만큼 반복문을 통해 num개의 줄을 만들어야하고 각각의 줄을 구현해야한다
 * 2. makeStar3을 보자 -> 각 줄의 규칙은 공백 2->1->0 으로 공백의 수는 줄어들고 *의 개수는 늘어난다
 * 3. num만큼 반복문을 통해 *을 출력할때 num -i - 1 보다 작을때는 공백을 출력하면 된다 즉,
 *      - 첫번째 줄에서는 첫번째와 두번째는 공백을 출력하려면 어떻게 해야할까를 생각해야한다
 *      - 두번째 줄에서는 첫번째만 공백을
 *      - num번째 줄에서는 공백이 없이
 */
