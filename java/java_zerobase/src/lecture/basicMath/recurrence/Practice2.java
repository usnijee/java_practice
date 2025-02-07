package lecture.basicMath.recurrence;// Practice2
// 최대공약수를 재귀함수로 구현하시오.

public class Practice2 {
    public static void main(String[] args) {
//      Test code
        System.out.println(gcd(3, 5));
        System.out.println(gcd(2, 6));
        System.out.println(gcd(8, 12));
    }

    public static int gcd(int n1, int n2) {
        if (n1 % n2 == 0) {
            return n2;
        }
        return gcd(n2, n1 % n2);
    }
}
