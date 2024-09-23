package method;
/*
    메서드에 대하여,,

    public static
        - public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻
        - static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻

    int add(int a, int b)
        - int : 반환 타입을 정의. 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정.
        - add : 메서드에 이름을 부여. 이 이름으로 메서드를 호출할 수 있다.
        - (int a, int b) : 메서드를 호출할 때 전달하는 입력 값을 정의한다. 이 변수들은 해당 메서드 안에서만
        사용된다. 이렇게 메서드 선언에 사용되는 변수를 영어로 파라미터(parameter), 한글로 매개변수라 한다
 */
public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(5,10);
        System.out.println("결과1 출력:" + sum1);

        int sum2 = add(15,20);
        System.out.println("결과2 출력:" + sum2);
    }

    public static int add(int a, int b){  // 메소드 생성 방법
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}

/*
    호출: call("hello", 20)
    메서드 정의: int call(String str, int age)

    인수 vs 인자
    1. 인수(Argument)
        여기서 "hello",20처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라고 함

    2. 매개변수(Parameter)
        메서드를 정의할 때 선언한 변수인 String str, int age를 매개변수, 파라미터라 한다.
        메서드를 호출할 때 인수(argument)를 넘기면, 그 인수가 매개변수(parameter)에 대입된다. ---> 이 부분이 중요

    3.


 */
