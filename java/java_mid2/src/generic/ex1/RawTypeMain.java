package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // Generic의 타입 매개변수 지정을 생략할 수 있는데 이때는 Object 타입으로 고정된다.
//        GenericBox<Object> integerBox = new GenericBox<>(); 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
