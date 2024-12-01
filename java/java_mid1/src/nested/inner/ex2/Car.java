package nested.inner.ex2;

/*
    ex1의 Car 클래스를 내부 클래스를 통해 리팩토링
 */
public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }
    /* 내부 클래스에 의해 getter도 필요 없어짐
    -> 내부 클래스에서 직접 바깥 클래스 멤버 변수에 접근 가능하기 때문

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }
    */

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {

//        private Car car;
//
//        public Engine(Car car) {
//            this.car = car;
//        }

        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
