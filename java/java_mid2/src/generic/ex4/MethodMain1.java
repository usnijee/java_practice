package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);
        Integer integer = (Integer) GenericMethod.objectMethod(i); // 다운 캐스팅을 해야함

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.9);
        
        // 타입 추론 가능
        // 타입 추론이 가능한 이유는 매서드로 입력되는 매개변수의 타입이 이미 특정 타입으로 지정되었기 때문이다
        Integer result2 = GenericMethod.genericMethod(i); // i는 Integer 타입이기에 제너릭메서드는 컴파일러가 타입 추론
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.9);
    }


}
