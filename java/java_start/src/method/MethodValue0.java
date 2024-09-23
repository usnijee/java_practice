package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
/* 매우 중요!!!!

    자바는 항상 변수의 값을 복사해서 대입한다
    즉, 위의 코드는 너무 당연한 것처럼 보일수 있으나
    int num2 = num1;에서 num1이라는 변수가 num2에 대입되는 것이 아닌 num1의 값만 num2변수에 저장되는 것이다.

 */