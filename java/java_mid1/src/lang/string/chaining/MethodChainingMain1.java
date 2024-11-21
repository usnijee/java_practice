package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
//        adder.add(1);
//        adder.add(2);
//        adder.add(3);
//        int result = adder.getValue();
//        System.out.println("result = " + result);
        int result = adder.add(1).add(2).add(3).getValue(); // 메서드가 자기자신(객체)의 참조값을 반환하기에 이렇게 사용 가능 -> 메서드 체이닝
        System.out.println("result = " + result);


    }
}
