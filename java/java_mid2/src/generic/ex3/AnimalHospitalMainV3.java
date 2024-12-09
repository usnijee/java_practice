package generic.ex3;
/**
 * Generic 타입 제한을 통해 코드 재사용성 + 타입 안정성 성립
 */

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
        // AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>(); // Animal 하위 이외의 타입 불가능

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
//         dogHospital.set(cat); // 컴파일 오류 발생 --> 타입 안정성 o

        // 문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200)); // 다운 캐스팅 필요
        System.out.println("biggerDog = " + biggerDog);

    }
}
