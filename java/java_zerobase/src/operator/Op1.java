package operator;

public class Op1 {

    public static void main(String[] args) {

//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = 10;
        num = -10;

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println(numZ++); // 후위증감 -> num2는 다음줄에서 증감이 됨 -> 기존의 num2 출력
        System.out.println(numZ); // 1증가 num2 출력
        System.out.println(++numZ); // 전위증감 -> 증감상태를 먼저 진행 후 num2에 대입 -> 1이 바로 증가되어 출력
        System.out.println(numZ);

//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB);
        System.out.println(numA < numB);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((10 > 9) && (1 == 0));
        System.out.println((10 > 9) || (1 == 0));


//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int num1 = 10;
        int num2 = 5;
        num1 += num2;
        System.out.println("num1 = " + num1);

//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "yes" : "no";
        System.out.println(aResult);

    }
}
