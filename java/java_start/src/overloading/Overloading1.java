package overloading;

/*
    매서드 오버로딩(Method Overloading)
        - 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 의미

    오버로딩 규칙
        - 메서드의 이름이 같아도 매개변수의 타입 및 순서가 달라야 오버로딩이 가능
        - 메서드 이름 + 매개변수 타입, 순서가 모두 같으면 컴파일 에러 발생
        - 반환타입은 고려 x

    매서드 시그니처(method signature)
        - 메서드를 구별할 수 있는 고유 식별자를 의미
        - 메서드 시그니쳐 = 메서드 이름 + 매개변수 타입(순서)
        - 메서드 시그니쳐에 의해 메서드 이름이 같더라도 매개변수에 의해 오버로딩이 가능함

 */
public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));
    }

    // 첫 번째 add 메서드: 두 정수를 받아 합을 반환
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }
    // 두 번째 add 메서드 : 세 정수를 받아서 합을 반환
    // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다
    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a+b+c;
    }
}
