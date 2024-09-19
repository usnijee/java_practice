package casting;
/*
    자동 형변환(묵시적 형변환)
    작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
    예) int long double

    큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다.
    - 소수점 버림
    - 오버플로우

    --> 자바는 작은 범위의 값을 큰 범위의 값을 넣을 수 있다. 다만, 이 과정에서 이를 허용할때 java가 자동으로 형변환을 해주기 때문에
    형변환이 가능한 것이다.
    int intValue = 20;
    long longValue;
    double doubleValue;

    ex. longvalue = intValue
 */

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int-> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}

