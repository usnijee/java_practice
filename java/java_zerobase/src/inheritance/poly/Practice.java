package inheritance.poly;

// Practice
// 아래의 클래스와 상속 관계에서 다형성을 이용하여
// Car 객체를 통해 아래와 같이 출력될 수 있도록 Test code 부분을 구현해보세요.
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class Car {
    Car(){}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck extends Car {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code

        Car car = new Car();
        Car fireTruck = new FireTruck();
        Car ambulance = new Ambulance();

        car.horn();
        fireTruck.horn();
        ambulance.horn();

        Car[] cars = {new Car(), new FireTruck(), new Ambulance()}; // 다형성의 장점 !
        for (Car car1 : cars) {
            car1.horn();
        }

    }
}