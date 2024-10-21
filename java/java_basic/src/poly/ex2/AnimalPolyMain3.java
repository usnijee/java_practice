package poly.ex2;
/*
    조금 더 개선해보기
 */
public class AnimalPolyMain3 {

    public static void main(String[] args) {

//        // 자식 인스턴스 생성
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Caw caw = new Caw();

        Animal[] animals = {new Dog(), new Cat(), new Caw()}; // dog, cat, caw는 Animal의 자식이기에 Animal 타입으로 묶일 수 있고 배열 선언 가능
        

        // 부모 타입의 배열에 자식 객체들을 저장했기에 for문 사용가능(iter)
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
/*
    위의 코드의 좋은점 !
    -> AnimalPolyMain1의 경우 새로운 동물이 추가할때 마다 해당 동물 객체 선언, 해당 동물 메서드 호출등의 변경사항이 존재했다면
    -> 위의 코드는 배열에 해당 동물 객체만 추가하면 끝난다.

    즉, 좋은 코드는 --> 새로운 대상이 추가되었을 때 변하는 부분을 최소화하는 코드이며 이를 실현하기 위해서는 코드 내에서 변하는 부분과 변하지 않는 부분을 명확히 구분하는 것이 좋다
 */
