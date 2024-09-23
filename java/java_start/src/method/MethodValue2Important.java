package method;
/*
    같은 문제를 호출자의 변수 이름과 매개변수의 이름을 같게 해서 한번 더 풀어보자
 */

public class MethodValue2Important {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 1. main()의 number는 5로 초기화 -> 5출력
        changeNumber(number); // 2. main()의 변수 number에 저장된 값 5가 복사되어 chaneNumber()에 입력됨 (대원칙)
        System.out.println("4. changeNumber 호출 후, number: " + number); // 이 부분의 최종결과가 뭘까? 5일까 10일까?
    }

    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, num2: " + number); // 3. changeNumber()의 변수 number는 main()의 변수 number의 복사된 값 5가 저장
        number = number * 2;                                           // 4. changeNumber()의 변수 number를 10으로 저장
        System.out.println("3. changeNumber 변경 후, num2: " + number);

    }
}
/*
    main()과 changeNumber()는 각각 다른 메소드이다. 변수명이 동일하다고해도 각 메소드에 생성된 지역변수는 엄연히 다른 변수이다.
    실제로 각 메소드가 생성되면 각 메소드 영역이 메모리에 생성되고 해당 메모리 영역에 지역변수가 생성되기 때문이다.
 */
