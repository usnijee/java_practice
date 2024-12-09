package generic.ex1;
/*
    단축키 : shift +F6 --> 변수 수정할 때 사용
 */
public class BoxMain2 {
    /**
     * IntegerBox, StringBox의 단점 : 수많은 타입이 존재하는데 해당 타입도 각각 입출력이 되는 클래스를 만들어줘야하는지?
     *
     *
     */

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
//        Object object = integerBox.get();
//        Integer integer = (Integer) object;
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 캐스팅
        System.out.println("str = " + str);
        
        // 잘못된 타입의 인수 전달한 경우
        // Object이기에 모든 타입을 인수로 받을 수 있기에 잘못된 타입의 인수도 받을 수 있다.
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);;
    }
}
