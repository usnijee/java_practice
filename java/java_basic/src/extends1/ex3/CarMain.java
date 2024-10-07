package extends1.ex3;
/*
    상속 관계 덕분에 중복은 줄어들고, 새로운 수소차를 편리하게 확장(extend)한 것을 알 수 있다.
 */
public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar =  new ElectricCar();
        electricCar.move(); // 부모 클래스인 Car의 move() 메소드
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.openDoor(); // 부모 Car에 opendoor을 추가
        hydrogenCar.fillHydrogen();
    }
}
