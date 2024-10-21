package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        // 자식 인스턴스 생성
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = {dog, cat, caw}; // dog, cat, caw는 Animal의 자식이기에 Animal 타입으로 묶일 수 있고 배열 선언 가능

        // 부모 타입의 배열에 자식 객체들을 저장했기에 for문 사용가능(iter)
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
