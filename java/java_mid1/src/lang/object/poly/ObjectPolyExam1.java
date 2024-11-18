package lang.object.poly;

public class ObjectPolyExam1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

//        Object o = dog; // 다형적 참조

        action(dog);
        action(car);

    }

    private static void action(Object obj) {
//        obj.sound();  컴파일 오류 ,, Object는 sound(), move()가 없음 -->
//        obj.move();

        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }

    }
}
