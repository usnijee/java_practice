package lecture.basicMath.cases;// Practice
// 약수 구하기, 두 수의 최대공약수와 최소공배수 구하기
// 활용) 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 활용) 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수

import java.util.ArrayList;

public class Practice {
    
//  약수구하기
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();
        /**
         * num의 약수 중 num/2를 넘는 수는 오직 num 자기 자신 밖에 없다
         */
        for (int i = 1; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        result.add(num); // 자기 자신 추가

        return result;
    }

//  최대 공약수
//  GCD: the Greatest Common Denominator
    public int getGCD(int numA, int numB) {
        int gcd = -1;

        // 각 숫자의 약수 구하기
        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        for (int itemA : (ArrayList<Integer>) divisorA) {
            for (int itemB : (ArrayList<Integer>) divisorB) {
                if (itemA == itemB) {
                    /**
                     * A와 B의 약수들을 비교하여 같은 값 찾기 = 공약수
                     */
                    if (itemA > gcd) {
                        gcd = itemA; // 최대공약수 갱신
                    }
                }
            }
        }
        return gcd;
    }

//  최소 공배수
//  LCM: the Lowest Common Multiple
    public int getLCM(int numA, int numB) {
        int lcm = -1;

        int gcd = this.getGCD(numA, numB); // 최대 공약수

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {

//      Test code
        int number1 = 10;
        int number2 = 6;

        Practice p = new Practice();
        ArrayList l1 = p.getDivisor(number1);   // 10: 1, 2, 5, 10
        ArrayList l2 = p.getDivisor(number2);   // 6: 1, 2, 3, 6
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("최대 공약수: " + p.getGCD(number1, number2));
        System.out.println("최대 공배수: " + p.getLCM(number1, number2));
    }
}
