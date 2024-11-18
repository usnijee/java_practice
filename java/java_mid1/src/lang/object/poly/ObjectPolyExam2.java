package lang.object.poly;

public class ObjectPolyExam2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object}; // Object 타입의 배열 -> 모든 객체를 저장할 수 있는 배열

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }
}
