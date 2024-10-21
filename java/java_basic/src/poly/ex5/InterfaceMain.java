package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 -> 순수 추상 클래스이므로 객체 생성 불가능
        // InterfaceAnimal interfaceMain1 = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    // 동물이 추가되어도 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal interfaceAnimal){
        System.out.println("동물 소리 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물 테스트 종료");
    }
}


