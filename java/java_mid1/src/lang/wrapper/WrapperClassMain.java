package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제예정 , 대신에 valueOf()사용
        Integer integerObj = Integer.valueOf(10); // 일반적으로 자주 사용하는 -128 ~ 127 범위의 Integer 클래스를 미리 생성 -> 해당 범위의 값을 조회시 미리 생성된 Integer객체를 반환 해당 범위의 값이 없다면 new Integer() 호출
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger: " + newInteger);
        System.out.println("integerObj: " + integerObj);
        System.out.println("longObj: " + longObj);
        System.out.println("doubleObj: " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue(); // intValue는 Integer클래스 내부 변수값
        System.out.println("intValue: " + intValue );
        long longValue = longObj.longValue();
        System.out.println("longValue: " + longValue);

        System.out.println("비교해보기");
        System.out.println("==:" + (newInteger == integerObj)); // newInteger은 새로운 Integer객체를 만든것 vs integerObj는 Integer가 미리 만들어 놓은 -128 ~ 127 범위의 Integer 클래스를 호출하여 사용한 것 즉, 메모리 참조값이 다르기에 동일성 부합 x
        System.out.println("equals:" + (newInteger.equals(integerObj))); // 값은 10으로 동일하기에 동등성은 만족
    }
    /*
        결론
        1. Integer newInteger = new Integer(10)와 같이 직접 Integer 객체를 생성하는 것 -> deprecated
        2. Integer 래퍼 클래스의 valueOf를 사용하면 성능 최적화가 가능
            - Integer는 pool과 같은 느낌으로 -127~128(자주 사용하는 값)을 캐싱형태로 미리 클래스를 만들어 놓고 호출 시 바로 값을 반환함, 범위 밖의 값은 new Integer()를 생성하여 반환
        3. 래퍼 클래스 생성을 박싱(boxing)이라고 한다
        4. 래퍼 클래스에 들어 있는 기본형 변수의 값을 다시 꺼내는 것을 언박싱(unboxing)이라고 한다.
        5. 래퍼 클래스는 참조형, '객체'이기에 == 비교시 메모리 참조값을 비교하기에 클래스 내부의 값을 비교하기 위해서는 equals()를 사용해야한다.
     */
}
