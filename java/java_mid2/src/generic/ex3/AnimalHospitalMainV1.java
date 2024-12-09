package generic.ex3;
/**
 * Animal 타입으로 AnimalHospitalV1을 구성하여 중복을 제거해보자 (다형성 시도)
 */

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
         dogHospital.set(cat); // 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음 (부모인 Animal 타입이기 때문)

        // 문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); // 다운 캐스팅 필요
        System.out.println("biggerDog = " + biggerDog);

    }
}
