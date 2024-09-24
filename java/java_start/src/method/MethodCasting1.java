package method;
/*
메서드를 호출하는데 인자와 매개변수의 타입이 맞지 않다면 어떻게 해야할까?

    명시적 형변환 (큰 -> 작은것)으로 형변환을 하려고 할 때
 */
public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number);        // double을 int형에 대입하므로 컴파일 오류
        printNumber((int) number);  // 명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }
}
