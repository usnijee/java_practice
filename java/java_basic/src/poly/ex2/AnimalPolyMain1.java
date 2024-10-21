package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {

        // 자식 인스턴스 생성
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }
    /*
        1. soundAnimal의 매개변수 타입 -> Animal(부모)
        2. 매개변수로 자식 인스턴스의 메모리 참조값이 입력 --> 다형적 참조 --> Animal animal = dog
            2-1. Animal 타입이기에 메모리의 Animal(부모)와 Dog(자식)중 우선 Animal을 참조(같은 타입 우선 참조)
            2-2. anmial.sound()를 진행하면 참조된 Animal 클래스 내의 sound 메서드를 실행 but,, 자식 타입에서 Override를 진행했다면
                Override는 항상 가장 높은 우선순위를 갖기에 자식 클래스의 sound 메서드가 호출됨

        --> 다형성 참조(부모는 자식을 품을 수 있다) + 메서드 오버라이딩을 통해 서로 다른 타입의 객체들의 공통된 부분을 처리 가능
     */
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
