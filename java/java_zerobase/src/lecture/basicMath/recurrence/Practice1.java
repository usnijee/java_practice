package lecture.basicMath.recurrence;// Practice1
// 팩토리얼을 재귀함수로 구현하시오.

public class Practice1 {
    public static void main(String[] args) {
//      Test code
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

