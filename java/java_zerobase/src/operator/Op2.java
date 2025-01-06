package operator;

public class Op2 {

    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        int num1 = 5;
        int num2 = 3;
        int result = 0;

        result = num1 & num2;
        System.out.println("result = " + result); // 비트연산 -> 이진수의 자리수 하나씩 논리 연산 비교
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능

//      1-2. OR 연산자 (|)
        System.out.println("== | ==");

        result = num1 | num2;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능

//      1-3. XOR 연산자 (^)
        System.out.println("== ^ ==");

        result = num1 ^ num2;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // printf를 통해 포맷을 만들어서 4자리수로 출력 가능

//      1-4. 반전 연산자 (~)
        System.out.println("== ~ ==");
        num1 = 5;

        result = ~num1;
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));

//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");


//      2-1. << 연산자
        int numA = 3;

        result = numA << 1; // 왼쪽으로 1비트 이동
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));

//      2-2. >> 연산자

        result = numA >> 1; // 왼쪽으로 1비트 이동
        System.out.println("result = " + result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));

//      2-3. >>> 연산자

        numA = -5;
        result = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));


    }
}
