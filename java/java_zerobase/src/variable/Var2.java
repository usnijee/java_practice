package variable;

public class Var2 {

    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수
        int intNum = 10;
        System.out.println("intNum = " + intNum);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1); // int로 더이상 담을 수 없는 수
        System.out.println((long) Integer.MAX_VALUE + 1); // long으로 형변환하면 최댓값 + 1을 담을수 있다

        long longNum = 1000;
        System.out.println("longNum = " + longNum);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

//      1-2. 실수
        float floatNum = 1.23f; // f를 안붙여주면 double로 인식
        double doubleNum = 1.23;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2); //12
        System.out.println("0b = " + Integer.toBinaryString(numBase2) ); // toBinaryString()을 사용하여 10진수를 2진수로 출력
        int numBase8 = 014; // 8진수를 표현하려면 숫자 앞에 0을 붙여줘야함
        System.out.println("numBase8 = " + numBase8); //12
        System.out.println("0 = " + Integer.toOctalString(numBase8));
        int numBase16 = 0xC; // 16진수를 표현하려면 숫자 앞에 0x를 붙여줘야함
        System.out.println("numBase16 = " + numBase16); //12
        System.out.println("0x = " + Integer.toHexString(numBase16));

//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        boolean isOk = false;

//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);
        System.out.println((int) keyFirst); // ASCII
        System.out.println((int) keyLast);

    }
}
