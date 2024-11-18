package lang.object.toString;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1" , 2);
        Dog dog2 = new Dog("멍멍이2" , 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1); // toString()를 명시해서 사용하지 않고 객체를 println을 통해 표현해도 오버라이딩 적용됨
        System.out.println(dog2);

        System.out.println("2. Object 다형성 활용");
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 객체의 참조값 직접 출력하기 - System.identityHashCode()
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);

        // println -> 매개변수로 Object타입을 사용하기에 toString을 내부에서 호출가능 즉, 세상의 모든 객체의 정보를 출력 가능
        System.out.println(dog1);
        System.out.println(car);
    }



}
