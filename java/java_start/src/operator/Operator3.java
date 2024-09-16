package operator;

public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1+2*3; // 1+(2*3)
        int sum2 = (1+2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
/*
    1. 괄호 ()
2. 단항 연산자 (예: ++ , -- , ! , ~ , new , (type) )
3. 산술 연산자 ( * , / , % 우선, 그 다음에 + , - )
4. Shift 연산자 ( << , >> , >>> )
5. 비교 연산자 ( < , <= , > , >= , instanceof )
6. 등식 연산자 ( == , != )
7. 비트 연산자 ( & , ^ , | )
8. 논리 연산자 ( && , || )
9. 삼항 연산자 ( ? : )
10. 대입 연산자 ( = , += , -= , *= , /= , %= 등등)
 */