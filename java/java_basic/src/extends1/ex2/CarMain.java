package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar =  new ElectricCar();
        electricCar.move(); // 부모 클래스인 Car의 move() 메소드
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
    }
}
