package lecture.basicMath.combination;// 기초 수학 - 조합

public class Main {

    public static int getC(int n, int r) {
        // 순열 구하기
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            /*
            nPr = n * (n - 1) * ... * (n - r + 1)
             */
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            /*
            r! 구하기
             */
            rResult *= i;
        }
        return pResult / rResult;
    }
    public static void main(String[] args) {
//      1. 조합
        /**
         * 조합 = 순열 / r!
         */
        System.out.println("== 조합 ==");
        // 서로 다른 4명 중 주번 2명 뽑는 경우의 수
        int n = 4;
        int r = 2;

        // 순열 구하기
        int pResult = 1;
        for (int i = n; i >= n - r + 1; i--) {
            /*
            nPr = n * (n - 1) * ... * (n - r + 1)
             */
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            /*
            r! 구하기
             */
            rResult *= i;
        }
        System.out.println("결과 : " + pResult/rResult);

//      2. 중복 조합
        System.out.println("== 중복 조합 ==");
        n = 2;
        r = 3;
        System.out.println("결과: " + getC(n + r - 1, r)); // nHr = n+r-1Cr
    }
}
