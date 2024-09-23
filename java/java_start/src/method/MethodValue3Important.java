package method;
/*
    그러면 최종적으로 changeNumber()를 거친 main()의 number의 값이 number = number * 2;에 의해 10이 나오도록 하려면 어떻게 해야할까?
 */

public class MethodValue3Important {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        number = changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);
    }

    public static int changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, num2: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + number);
        return number;
    }
}
/*
    main()과 changeNumber()는 각각 다른 메소드이다. 변수명이 동일하다고해도 각 메소드에 생성된 지역변수는 엄연히 다른 변수이다.
    실제로 각 메소드가 생성되면 각 메소드 영역이 메모리에 생성되고 해당 메모리 영역에 지역변수가 생성되기 때문이다.
 */
