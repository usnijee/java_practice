package poly.car0;
/*
    역할과 구현을 명확히 구분하지 않고 코드를 만든 경우

 */
public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3car k3car = new K3car();
        driver.setK3car(k3car);
        driver.drive();
    }
}
