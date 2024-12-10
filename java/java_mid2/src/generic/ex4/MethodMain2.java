package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("나옹이", 100);

        AnimalMethod.checkup(dog); // 타입 매개변수 추론
        //AnimalMethod.<Dog>checkup(dog); // 정석 -> 생략 가능
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog); // 타입 매개변수 추론 -> 타입 매개변수 추론이 가능한 이유도 매개변수의 타입을 통해 컴파일 과정에서 알아서 추론이 되기때문
//        Dog bigger = AnimalMethod.bigger(dog, cat); // 불가능 동일한 타입의 두 매개변수가 입력되어야 함
//        Dog bigger2 = AnimalMethod.<Dog>bigger(dog, targetDog); // 정석


    }
}
