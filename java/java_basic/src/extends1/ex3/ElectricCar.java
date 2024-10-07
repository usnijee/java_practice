package extends1.ex3;

/*
    상속
    - JAVA에서는 자식클래스 extends 부모클래스 형태로 클래스를 만든다
    - 상속 --> 부모 클래스의 기능을 자식 클래스가 사용하기 위함
 */
public class ElectricCar extends Car {

    public void charge(){
        System.out.println("충전합니다.");
    }
}
