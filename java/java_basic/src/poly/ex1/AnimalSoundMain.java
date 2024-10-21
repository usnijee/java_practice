package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");

        /*
            System.out.println("동물 소리 테스트 시작");
            caw.sound();
            System.out.println("동물 소리 테스트 종료");

            위의 부분이 반복되는 것을 알 수 있다. --> 중복을 줄일려면 어떻게 해야할까?

            1. 메소드화 하기 --> 매개변수로 생성된 인스턴스의 참조값이 저장된 변수를 받아야하는데 Dog, Cat ,Caw의 타입이 다 다르기에
            결국 메소드도 여러번 생성해야함

            2. for문과 배열을 이용한 방법도 같은 이유로 불가능

            즉, 이를 해결하려면 Dog, Caw, Cat을 모두 같은 타입의 변수에 인스턴스 참조값을 저장할 수 있어야함 !
            --> 다형적 참조
            --> ex2에서 구현할 것

         */
    }
}
