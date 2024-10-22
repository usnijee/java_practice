package poly.car1;


public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        Car k3car = new K3Car();
        driver.setCar(k3car);
        driver.drive();

        //차량 변경
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
    }
}
